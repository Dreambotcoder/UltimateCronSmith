package org.UltiCronSmith.Smelter.Tasks;

import org.UltiCronSmith.Smelter.Data.Locations;
import org.UltiCronSmith.Smelter.Data.Variables;
import org.UltiCronSmith.Smelter.Wrappers.ScriptContext;
import org.UltiCronSmith.Smelter.abstracts.Tasks;
import org.UltiCronSmith.Smelter.abstracts.smelt;
import org.osbot.script.rs2.model.RS2Object;

/**
 * @author arno
 * @date 9-6-13
 * @time 0:15
 */
public class Banking extends Tasks {

    public Banking(ScriptContext scx, Locations walk, smelt smelt) {
        super(scx,walk,smelt);
    }

    /**
     * @return what we have to do
     * @throws InterruptedException
     */
    @Override
    public int onLoop() throws InterruptedException {
        Variables.STATE = "Banking";
       if (!playerClient.getBank().isOpen()) {
           RS2Object bank = scriptUtil.closestObjectForName("Bank booth");
           if (bank != null && bank.exists()) {
               bank.interact("Bank");
               wait(new Condition() {
                   public boolean valid() { return scriptUtil.client.getBank().isOpen(); }
               }, 1000L);
           } else
               scriptUtil.walk(bank);
       }
        for (int j = 0; j < smelt.getMaterials().length; j++)
            if (scriptUtil.client.getBank().contains(smelt.getMaterials()[j])) {
                scriptUtil.client.getBank().withdraw(smelt.getMaterials()[j], smelt.getAmount()[j]);
            } else {
               scriptUtil.log("All out of ores");
                j = 10000;
                scriptUtil.stop();
            }
        return 0;
    }

    /**
     * @return When we have to execute
     */
    @Override
    public boolean valid() {
        return  myPlayer.isInArea(walk.getBank()) &&
                !playerClient.getInventory().contains(smelt.getMaterials()[0]) &&
                !playerClient.getInventory().contains(smelt.getFinishedProduct());
    }
}

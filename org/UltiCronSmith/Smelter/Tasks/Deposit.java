package org.UltiCronSmith.Smelter.Tasks;

import org.UltiCronSmith.Smelter.Data.Variables;
import org.UltiCronSmith.Smelter.abstracts.smelt;
import org.UltiCronSmith.Smelter.Data.Locations;
import org.UltiCronSmith.Smelter.Wrappers.ScriptContext;
import org.UltiCronSmith.Smelter.abstracts.Tasks;
import org.osbot.script.rs2.model.RS2Object;

/**
 * @author arno
 * @date 9-6-13
 * @time 0:15
 */
public class Deposit extends Tasks{

    public Deposit(ScriptContext scx, Locations walk, smelt smelt) {
        super(scx,walk,smelt);
    }

    /**
     * @return what we have to do
     * @throws InterruptedException
     */
    @Override
    public int onLoop() throws InterruptedException {
        Variables.STATE = "Depositing";
        RS2Object o = scriptUtil.closestObjectForName("Bank booth");
        if (o != null && o.isVisible() && o.exists()) {
            o.interact("Bank");
            wait(new Condition() {
                public boolean valid() {
                    return playerClient.getBank().isOpen();
                }
            },1000L);
        }
       playerClient.getBank().depositAll();
        return 300;
    }

    /**
     * @return When we have to execute
     */
    @Override
    public boolean valid() {
        return myPlayer.isInArea(walk.getBank()) &&
               playerClient.getInventory().contains(smelt.getFinishedProduct());
    }
}

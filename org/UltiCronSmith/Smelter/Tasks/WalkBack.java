package org.UltiCronSmith.Smelter.Tasks;

import org.UltiCronSmith.Smelter.Data.Locations;
import org.UltiCronSmith.Smelter.Data.Variables;
import org.UltiCronSmith.Smelter.abstracts.smelt;
import org.UltiCronSmith.Smelter.Wrappers.ScriptContext;
import org.UltiCronSmith.Smelter.abstracts.Tasks;
import org.osbot.script.rs2.model.RS2Object;

/**
 * @author arno
 * @date 9-6-13
 * @time 0:15
 */
public class WalkBack extends Tasks {

    public WalkBack(ScriptContext scx, Locations walk, smelt smelt) {
        super(scx,walk,smelt);
    }

    /**
     * @return what we have to do
     * @throws InterruptedException
     */
    @Override
    public int onLoop() throws InterruptedException {
        Variables.STATE = "Walking back";
        if (doorClosed(scriptUtil.closestObjectForName("Bank booth"))) {
            scriptUtil.walk(walk.getDoor());
            final RS2Object o = scriptUtil.closestObjectForName("Door");
            if (o != null && o.exists() && o.getId() == 1530) {
                o.interact("Open");
                wait(new Condition() {
                    @Override
                    public boolean valid() {
                        return !o.exists();
                    }
                }, 1000L);
            }
        }
        scriptUtil.walk(walk.getBank());
        return 300;
    }



    /**
     * @return When we have to execute
     */
    @Override
    public boolean valid() {
        return  myPlayer.isInArea(walk.getFurnace()) &&
                playerClient.getInventory().contains(smelt.getFinishedProduct()) &&
               !playerClient.getInventory().contains(smelt.getMaterials()[0]);
    }
}

package org.UltiCronSmith.Smelter.Tasks;

import org.UltiCronSmith.Smelter.Data.Locations;
import org.UltiCronSmith.Smelter.Data.Variables;
import org.UltiCronSmith.Smelter.abstracts.smelt;
import org.UltiCronSmith.Smelter.Wrappers.ScriptContext;
import org.UltiCronSmith.Smelter.abstracts.Tasks;

/**
 * @author arno
 * @date 9-6-13
 * @time 0:15
 */
public class Smelting extends Tasks{

    public Smelting(ScriptContext scx, Locations walk, smelt smelt) {
        super(scx,walk,smelt);
    }

    /**
     * @return what we have to do
     * @throws InterruptedException
     */
    @Override
    public int onLoop() throws InterruptedException {
        Variables.STATE = "Smelting";
        return 0;
    }

    /**
     * @return When we have to execute
     */
    @Override
    public boolean valid() {
        return myPlayer.isInArea(walk.getBank()) && playerClient.getInventory().contains(smelt.getMaterials()[0]);
    }
}

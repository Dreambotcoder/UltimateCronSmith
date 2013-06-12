package org.UltiCronSmith.Smelter.abstracts;

import org.UltiCronSmith.Smelter.Data.Locations;
import org.UltiCronSmith.Smelter.Wrappers.MethodContainer;
import org.UltiCronSmith.Smelter.Wrappers.ScriptContext;

/**
 * @author arno
 * @date 9-6-13
 * @time 0:13
 */
public abstract class Tasks extends MethodContainer {

    public Tasks(ScriptContext scx, Locations walk, smelt smelt) {
        super(scx,walk,smelt);
    }

    /**
     *
     * @return  what we have to do
     * @throws InterruptedException
     */
    public abstract int onLoop() throws InterruptedException;

    /**
     *
     * @return When we have to execute
     */
    public abstract boolean valid();
}

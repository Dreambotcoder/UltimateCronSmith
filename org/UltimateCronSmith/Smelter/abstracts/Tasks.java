package org.UltimateCronSmith.Smelter.abstracts;

/**
 * @author arno
 * @date 9-6-13
 * @time 0:13
 */
public abstract class Tasks {

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

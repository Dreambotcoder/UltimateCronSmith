package org.UltimateCronSmith.Smelter.abstracts;

/**
 * @author arno
 * @date 8-6-13
 * @time 23:47
 */
public abstract class Jewelllery {

    /**
     * Checks if we have the mould
     */
    public abstract boolean hasMould();

    /**
     * Uses the bar on the furnace
     */
    public abstract void barToFurnace();

    /**
     * Retuns the mould ID
     */
    public abstract int getMouldId();
}

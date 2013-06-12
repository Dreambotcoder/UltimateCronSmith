package org.UltiCronSmith.Smelter.abstracts;

/**
 * @author arno
 * @date 8-6-13
 * @time 23:49
 */
public abstract class CannonBalls {

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

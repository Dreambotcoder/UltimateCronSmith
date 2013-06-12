package org.UltiCronSmith.Smelter.abstracts;

/**
 * @author arno
 * @date 12-6-13
 * @time 12:36
 */
public interface smelt {

    /**
     * Id representation
     * @return
     */
    public int getId();

    /**
     * Name of type
     * @return
     */
    public String getName();

    /**
     * Array with items required
     * @return
     */
    public int[] getMaterials();

    /**
     * Array with amounts needed
     * @return
     */
    public int[] getAmount();

    /**
     * Parent interface id
     * @return
     */
    public int getParent();

    /**
     * Child interface id
     * @return
     */
    public int getChild();

    /**
     * Finished item id
     * @return
     */
    public int getFinishedProduct();

}

package org.UltiCronSmith.Smelter.Data;

import org.UltiCronSmith.Smelter.abstracts.smelt;

/**
 * @author arno
 * @date 8-6-13
 * @time 23:50
 */
public enum Jewellery implements smelt {
    ;


    /**
     * Id representation
     *
     * @return
     */
    @Override
    public int getId() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Name of type
     *
     * @return
     */
    @Override
    public String getName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Array with items required
     *
     * @return
     */
    @Override
    public int[] getMaterials() {
        return new int[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Array with amounts needed
     *
     * @return
     */
    @Override
    public int[] getAmount() {
        return new int[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Parent interface id
     *
     * @return
     */
    @Override
    public int getParent() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Child interface id
     *
     * @return
     */
    @Override
    public int getChild() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Finished item id
     *
     * @return
     */
    @Override
    public int getFinishedProduct() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public static Jewellery forId(int id) {
        for (Jewellery jewellery: Jewellery.values()) {
            if (jewellery.getId() == id) {
                return jewellery;
            }
        }
        return null;
    }
}

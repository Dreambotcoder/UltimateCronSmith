package org.UltiCronSmith.Smelter.Data;

import org.UltiCronSmith.Smelter.abstracts.smelt;

/**
 * @author arno
 * @date 8-6-13
 * @time 23:50
 */
public enum Ore  implements smelt {

    BRONZE(0, "Bronze", new int[] {436,438},new int[] {14,14}, 4, 2349),
    IRON(1, "Iron", new int[] {440},new int[] {28}, 6, 2351),
    STEEL(2,"Steel", new int[] {440,453},new int[] {9,19}, 8, 2353),
    GOLD(3,"Gold", new int[] {444},new int[] {28}, 9, 2357),
    MITHRIL(4,"Mithril",new int[] {447,453},new int[] {5,23}, 10, 2359),
    ADAMANTITE(5,"Adamant",new int[] {449,453},new int[] {4,24}, 11, 2361),
    RUNITE(6,"Rune",new int[] {451,453},new int[] {3,24}, 12, 2363);

    private Ore(int id, String name, int[] reqOre, int[] amounts, int child, int product) {
      this.id = id;
      this.name = name;
      this.reqOre = reqOre;
      this.amounts = amounts;
      this.child = child;
      this.product = product;
    }

    private int id;
    private String name;
    private int[] reqOre;
    private int[] amounts;
    private int child;
    private int product;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getMaterials() {
        return reqOre;
    }

    public int[] getAmount() {
        return amounts;
    }

    public int getParent() {
        return 311;
    }

    public int getChild() {
        return child;
    }

    public int getFinishedProduct() {
        return product;
    }

    public static String getIcon() {
        return "http://images1.wikia.nocookie.net/__cb20120122232122/runescape/images/d/df/Smithing-icon.png";
    }

    public static Ore forId(int id) {
        for (Ore ore: Ore.values()) {
              if (ore.getId() == id) {
                  return ore;
              }
        }
        return null;
    }

}

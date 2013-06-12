package org.UltiCronSmith.Smelter.Data;

import org.osbot.script.rs2.map.Position;
import org.osbot.script.rs2.utility.Area;

/**
 * @author arno
 * @date 9-6-13
 * @time 0:29
 */
public enum Locations {

    ALKHARID(0,new Area(3269,3161,3272,3173), new Area(3273,3184,3279,3188), 1530, new Position(3280,3185,0));
   /* FALADOR(),
    PORTPHASMATYS(); */

  private Locations(int id, Area bank, Area furnace, int doorId, Position door) {
      this.bank = bank;
      this.furnace = furnace;
      this.doorId = doorId;
      this.id = id;
      this.door = door;
  }

    private Area bank;
    private Area furnace;
    private int doorId;
    private int id;
    private Position door;

    public Area getBank() {
        return bank;
    }

    public Area getFurnace() {
        return furnace;
    }

    public int getId() {
        return id;
    }

    public Position getDoor() {
        return door;
    }

    public static Locations forId(int id) {
        for (Locations location: Locations.values()) {
            if (location.getId() == id)  {
                return location;
            }
        }
        return null;
    }
}

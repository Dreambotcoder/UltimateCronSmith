package org.UltiCronSmith.Smelter.Wrappers;

import org.UltiCronSmith.Smelter.Data.Locations;
import org.UltiCronSmith.Smelter.Data.Ore;
import org.UltiCronSmith.Smelter.abstracts.smelt;
import org.osbot.script.Script;
import org.osbot.script.rs2.Client;
import org.osbot.script.rs2.model.Entity;
import org.osbot.script.rs2.model.Player;
import org.osbot.script.rs2.model.RS2Object;
import org.osbot.script.rs2.utility.Area;

/**
 * @author arno
 * @date 12-6-13
 * @time 11:23
 */
public abstract class MethodContainer {

    protected ScriptContext methods;
    protected Locations walk;
    protected smelt smelt;
    protected Script scriptUtil;
    protected Entity myPlayer;
    protected Client playerClient;

    public MethodContainer(ScriptContext scx, Locations walk, smelt ore) {
        this.methods = scx;
        this.walk = walk;
        this.smelt = ore = Ore.forId(2);
        this.walk = walk = Locations.forId(0);
        this.scriptUtil = this.methods.core.script;
        this.myPlayer = this.scriptUtil.client.getMyPlayer();
        this.playerClient = this.methods.core.script.client;
    }


    public interface Condition {
        public boolean valid();
    }

    public boolean wait(Condition condition, long timeout)
            throws InterruptedException {
        long startTime = System.currentTimeMillis();
        while (startTime + timeout > System.currentTimeMillis()
                && !condition.valid()) {
            if (methods.core.script.client.getMyPlayer().isMoving()) {
                startTime = System.currentTimeMillis();
            }
            methods.core.script.sleep(methods.core.script.random(10, 20));
        }
        return condition.valid();
    }

    public boolean doorClosed( RS2Object toreach)  {
        return !scriptUtil.canReach(toreach);
    }

}

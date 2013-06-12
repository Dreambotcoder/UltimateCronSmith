package org.UltiCronSmith;

import org.osbot.script.Script;

import java.awt.*;

/**
 * @author arno
 * @date 8-6-13
 * @time 21:32
 */
public abstract class CoreInterpretator  extends Core {

    public Script script;

    public CoreInterpretator(Script script) {
        this.script = script;
    }

    public abstract int onLoop();
    public abstract void onStart();
    public abstract void onPaint(Graphics g);
    public abstract void onExit();
}

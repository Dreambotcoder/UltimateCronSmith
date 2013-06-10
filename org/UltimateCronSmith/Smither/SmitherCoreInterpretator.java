package org.UltimateCronSmith.Smither;

import org.UltimateCronSmith.CoreInterpretator;
import org.osbot.script.Script;

import java.awt.*;

/**
 * @author arno
 * @date 8-6-13
 * @time 21:37
 */
public class SmitherCoreInterpretator extends CoreInterpretator {

    public SmitherCoreInterpretator(Script script) {
        super(script);
    }

    public int onLoop() {
        return 1;
    }

    @Override
    public void onStart() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onPaint(Graphics g) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onExit() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

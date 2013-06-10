package org.UltimateCronSmith.Smelter;

import org.UltimateCronSmith.CoreInterpretator;
import org.osbot.script.Script;

import java.awt.*;

/**
 * @author arno
 * @date 8-6-13
 * @time 21:37
 */
public class SmelterCoreInterpretator extends CoreInterpretator {

    public SmelterCoreInterpretator(Script script) {
        super(script);
    }

    private Color upperBarColor = new Color(217,217,217,140);

    @Override
    public int onLoop() {
        try {
            log("SMELTER ACTIVATED")  ;
            sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onStart() {
       log("HI I AM A SMELTER");
    }

    @Override
    public void onPaint(Graphics g) {
        g.setColor(upperBarColor);
        g.fillRect(0,0,517,33);
        g.fillRect(549,229,735-549,464-229);
        g.setColor(Color.WHITE);
        g.drawRect(0,0,517,33);
        g.drawRect(549,229,735-549,464-229);
        g.drawString("Ultimate CronSmith - CronSmelter",9,9);


    }

    @Override
    public void onExit() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

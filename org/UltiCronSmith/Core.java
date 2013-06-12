package org.UltiCronSmith;

import org.UltiCronSmith.Smelter.SmelterCoreInterpretator;
import org.osbot.script.Script;
import org.osbot.script.ScriptManifest;
import java.awt.*;

/**
 * @author arno
 * @date 8-6-13
 * @time 23:58
 */
@ScriptManifest(name = "Ultimate CronSmith", author = "Articron", version = 0.1D, info = "The most sophisticated smithing training script, by Articron!")
public class Core extends Script {

    CoreInterpretator module;

    public int onLoop() {
       return module.onLoop();
    }

    private void assignScriptModule() {
       module = new SmelterCoreInterpretator(this);
    }

    public void onStart() {
      assignScriptModule();
        module.onStart();
    }

    public void onPaint(Graphics g) {
        module.onPaint(g);
    }

    public void onExit() {
        module.onExit();
    }
}

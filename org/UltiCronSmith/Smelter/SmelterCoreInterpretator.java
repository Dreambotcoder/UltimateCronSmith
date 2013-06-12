package org.UltiCronSmith.Smelter;

import org.UltiCronSmith.CoreInterpretator;
import org.UltiCronSmith.Smelter.Data.Locations;
import org.UltiCronSmith.Smelter.Tasks.*;
import org.UltiCronSmith.Smelter.Wrappers.PaintWrapper;
import org.UltiCronSmith.Smelter.Wrappers.ScriptContext;
import org.UltiCronSmith.Smelter.abstracts.Tasks;
import org.UltiCronSmith.Smelter.abstracts.smelt;
import org.osbot.script.Script;
import java.awt.*;
import java.util.ArrayList;


/**
 * @author arno
 * @date 8-6-13
 * @time 21:37
 */
public class SmelterCoreInterpretator extends CoreInterpretator {

    public SmelterCoreInterpretator(Script script) {
        super(script);
    }

    public smelt data;
    public Locations walk;
    public ScriptContext scx;
    public ArrayList<Tasks> taskList = new ArrayList<Tasks>();

    @Override
    public int onLoop() {
          for (Tasks task : taskList) {
              if (task.valid()) {
                  try {
                      return task.onLoop();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          }
        return 500;
    }

    @Override
    public void onStart() {
       loadSCX();
       tasksToScript();
    }

    @Override
    public void onPaint(Graphics g) {
        PaintWrapper.handlePaint(g);
    }

    private void loadSCX() {
      scx = new ScriptContext(this);
    }

    private void tasksToScript() {
     taskList.add(new Banking(scx,walk,data));
     taskList.add(new Walking(scx,walk,data));
     taskList.add(new WalkBack(scx,walk,data));
     taskList.add(new Deposit(scx,walk,data));
     taskList.add(new Smelting(scx,walk,data));
    }

    @Override
    public void onExit() {
        log("Thanks for using the CronSmelter script from Ultimate CronSmith!");
        log("Oh by the way, I'd like a progress report - Articron");
    }
}

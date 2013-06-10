package org.UltimateCronSmith.Smelter.Tasks;

import org.UltimateCronSmith.Smelter.abstracts.Tasks;

/**
 * @author arno
 * @date 9-6-13
 * @time 0:15
 */
public class WalkBack extends Tasks {
    /**
     * @return what we have to do
     * @throws InterruptedException
     */
    @Override
    public int onLoop() throws InterruptedException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * @return When we have to execute
     */
    @Override
    public boolean valid() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

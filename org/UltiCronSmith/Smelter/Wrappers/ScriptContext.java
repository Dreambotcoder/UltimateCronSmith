package org.UltiCronSmith.Smelter.Wrappers;

import org.UltiCronSmith.CoreInterpretator;
import org.UltiCronSmith.Smelter.SmelterCoreInterpretator;
import org.osbot.script.rs2.Client;

/**
 * @author arno
 * @date 12-6-13
 * @time 11:22
 */
public class ScriptContext {

    public CoreInterpretator core;
    public Client client;

    public ScriptContext(SmelterCoreInterpretator core) {
        this.core = core;
        this.client = this.core.client;
    }
}

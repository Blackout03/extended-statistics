package com.blackout.extendedstatistics.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import org.apache.commons.lang3.tuple.Pair;

public class ESConfig {
    public static class Common {
        public final ConfigValue<Boolean> showUpdateMessage;

        Common(ForgeConfigSpec.Builder builder) {
            builder.push("Update Checker");
            showUpdateMessage = builder.comment("Send messages when there is a new update?").define("Show Update Messages", true);
            builder.pop();
        }
    }

    public static final ForgeConfigSpec COMMON_SPEC;
    public static final Common COMMON;

    static {
        final Pair<Common, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = commonSpecPair.getRight();
        COMMON = commonSpecPair.getLeft();
    }
}

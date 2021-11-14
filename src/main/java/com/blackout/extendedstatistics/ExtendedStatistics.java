package com.blackout.extendedstatistics;

import com.blackout.extendedstatistics.config.ESConfig;
import com.blackout.extendedstatistics.events.ArrowLooseEventHandler;
import com.blackout.extendedstatistics.events.CriticalHitEventHandler;
import com.blackout.extendedstatistics.events.DeathEventHandler;
import com.blackout.extendedstatistics.events.LoginEventHandler;
import com.blackout.extendedstatistics.registry.ESStats;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ExtendedStatistics.MODID)
public class ExtendedStatistics {
    public static final String MODID = "extendedstatistics";
    public static final String MODNAME = "Extended Statistics";
    public static final String VERSION = "1.0.0";

    public static ExtendedStatistics INSTANCE;

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public ExtendedStatistics() {
        INSTANCE = this;

        LOGGER.debug(MODNAME + " Version is:" + VERSION);

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ESStats.STAT_TYPES.register(eventBus);

        MinecraftForge.EVENT_BUS.register(new ArrowLooseEventHandler());
        MinecraftForge.EVENT_BUS.register(new CriticalHitEventHandler());
        MinecraftForge.EVENT_BUS.register(new DeathEventHandler());

        MinecraftForge.EVENT_BUS.register(new LoginEventHandler());
        if (ESConfig.COMMON.showUpdateMessage.get()) UpdateHandler.init();
        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ESConfig.COMMON_SPEC);
    }
}

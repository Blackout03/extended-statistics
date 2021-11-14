package com.blackout.extendedstatistics.registry;

import com.blackout.extendedstatistics.ExtendedStatistics;
import net.minecraft.stats.IStatFormatter;
import net.minecraft.stats.StatType;
import net.minecraft.stats.Stats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ExtendedStatistics.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESStats {
    public static final DeferredRegister<StatType<?>> STAT_TYPES = DeferredRegister.create(ForgeRegistries.STAT_TYPES, ExtendedStatistics.MODID);

    public static final ResourceLocation ARROWS_LOOSE = registerCustom("arrows_loose");
    public static final ResourceLocation CRITICAL_HITS = registerCustom("critical_hits");

    public static final ResourceLocation ANVIL_DEATHS = registerCustom("anvil_deaths");
    public static final ResourceLocation CACTI_DEATHS = registerCustom("cacti_deaths");
    public static final ResourceLocation DROWN_DEATHS = registerCustom("drown_deaths");
    public static final ResourceLocation FALLING_DEATHS = registerCustom("falling_deaths");
    public static final ResourceLocation FIRE_DEATHS = registerCustom("fire_deaths");
    public static final ResourceLocation FLY_INTO_WALL_DEATHS = registerCustom("fly_into_wall_deaths");
    public static final ResourceLocation LIGHTNING_DEATHS = registerCustom("lightning_deaths");
    public static final ResourceLocation MAGIC_DEATHS = registerCustom("magic_deaths");
    public static final ResourceLocation VOID_DEATHS = registerCustom("void_deaths");
    public static final ResourceLocation STARVE_DEATHS = registerCustom("starve_deaths");
    public static final ResourceLocation SUFFOCATION_DEATHS = registerCustom("suffocation_deaths");
    public static final ResourceLocation SWEET_BERRY_BUSH_DEATHS = registerCustom("sweet_berry_bush_deaths");
    public static final ResourceLocation WITHER_DEATHS = registerCustom("wither_deaths");

    private static ResourceLocation registerCustom(String key) {
        ResourceLocation resourcelocation = new ResourceLocation(ExtendedStatistics.MODID, key);
        Registry.register(Registry.CUSTOM_STAT, key, resourcelocation);
        Stats.CUSTOM.get(resourcelocation, IStatFormatter.DEFAULT);
        return resourcelocation;
    }
}

package com.blackout.extendedstatistics.events;

import com.blackout.extendedstatistics.registry.ESStats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class DeathEventHandler {
    @SubscribeEvent
    public void onLivingDeathEvent(LivingDeathEvent event) {
        Entity player = event.getEntity();
        DamageSource source = event.getSource();
        if (player instanceof PlayerEntity) {
            if (source == DamageSource.ANVIL) {
                ((PlayerEntity) player).awardStat(ESStats.ANVIL_DEATHS);
            } else if (source == DamageSource.CACTUS) {
                ((PlayerEntity) player).awardStat(ESStats.CACTI_DEATHS);
            } else if (source == DamageSource.DROWN) {
                ((PlayerEntity) player).awardStat(ESStats.DROWN_DEATHS);
            } else if (source == DamageSource.FALL) {
                ((PlayerEntity) player).awardStat(ESStats.FALLING_DEATHS);
            } else if (source == DamageSource.HOT_FLOOR || source == DamageSource.IN_FIRE || source == DamageSource.LAVA || source == DamageSource.ON_FIRE) {
                ((PlayerEntity) player).awardStat(ESStats.FIRE_DEATHS);
            } else if (source == DamageSource.FLY_INTO_WALL) {
                ((PlayerEntity) player).awardStat(ESStats.FLY_INTO_WALL_DEATHS);
            } else if (source == DamageSource.LIGHTNING_BOLT) {
                ((PlayerEntity) player).awardStat(ESStats.LIGHTNING_DEATHS);
            } else if (source == DamageSource.MAGIC) {
                ((PlayerEntity) player).awardStat(ESStats.MAGIC_DEATHS);
            } else if (source == DamageSource.OUT_OF_WORLD) {
                ((PlayerEntity) player).awardStat(ESStats.VOID_DEATHS);
            } else if (source == DamageSource.STARVE) {
                ((PlayerEntity) player).awardStat(ESStats.STARVE_DEATHS);
            } else if (source == DamageSource.IN_WALL) {
                ((PlayerEntity) player).awardStat(ESStats.SUFFOCATION_DEATHS);
            } else if (source == DamageSource.SWEET_BERRY_BUSH) {
                ((PlayerEntity) player).awardStat(ESStats.SWEET_BERRY_BUSH_DEATHS);
            } else if (source == DamageSource.WITHER) {
                ((PlayerEntity) player).awardStat(ESStats.WITHER_DEATHS);
            }
        }
    }
}

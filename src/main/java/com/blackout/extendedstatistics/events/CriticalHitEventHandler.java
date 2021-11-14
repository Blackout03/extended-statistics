package com.blackout.extendedstatistics.events;

import com.blackout.extendedstatistics.registry.ESStats;
import net.minecraftforge.event.entity.player.CriticalHitEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class CriticalHitEventHandler {
    @SubscribeEvent
    public void onCriticalHitEvent(CriticalHitEvent event) {
        event.getPlayer().awardStat(ESStats.CRITICAL_HITS);
    }
}

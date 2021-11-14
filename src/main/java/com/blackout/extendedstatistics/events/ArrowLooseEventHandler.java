package com.blackout.extendedstatistics.events;

import com.blackout.extendedstatistics.registry.ESStats;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ArrowLooseEventHandler {
    @SubscribeEvent
    public void onArrowLooseEvent(ArrowLooseEvent event) {
        event.getPlayer().awardStat(ESStats.ARROWS_LOOSE);
    }
}

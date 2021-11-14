package com.blackout.extendedstatistics.events;

import com.blackout.extendedstatistics.ExtendedStatistics;
import com.blackout.extendedstatistics.UpdateHandler;
import com.blackout.extendedstatistics.config.ESConfig;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class LoginEventHandler {
    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        PlayerEntity player = event.getPlayer();
        if (UpdateHandler.show && ESConfig.COMMON.showUpdateMessage.get())
            player.sendMessage(new TranslationTextComponent(UpdateHandler.updateStatus), player.getUUID());
        ExtendedStatistics.LOGGER.debug(UpdateHandler.updateStatus);
        ExtendedStatistics.LOGGER.debug(UpdateHandler.show);
    }
}

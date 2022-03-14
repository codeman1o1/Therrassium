package me.codeman1o1.therrassium.mixins;

import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import me.codeman1o1.therrassium.registry.Effects;

@Mixin(ExperienceOrbEntity.class)
public abstract class ExperiencedMixin {
    @Shadow
    private int amount;

    @Inject(at = @At("HEAD"), method = "onPlayerCollision")
    private void therrassiumOnPlayerCollision(PlayerEntity player, CallbackInfo info) {
        if (!player.world.isClient && player.hasStatusEffect((Effects.experienced))) {
            final int AMPLIFIER = player.getStatusEffect(Effects.experienced).getAmplifier();
            final double TEMP_AMOUNT = (double) amount / 4;
            final long NEW_AMOUNT = Math.round((TEMP_AMOUNT * AMPLIFIER));
            player.addExperience((int) NEW_AMOUNT);
        }
    }
}
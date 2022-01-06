package me.codeman1o1.therrassium.interactions;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TherrassiumBlock extends Block {

    public TherrassiumBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
            BlockHitResult hit) {
        if (!world.isClient) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200));
        }
        return ActionResult.SUCCESS;
    }
}

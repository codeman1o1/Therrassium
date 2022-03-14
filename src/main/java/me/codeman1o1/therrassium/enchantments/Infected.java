package me.codeman1o1.therrassium.enchantments;

import java.util.Collection;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;

public class Infected extends Enchantment {
    public Infected() {
        super(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] { EquipmentSlot.MAINHAND });
    }

    @Override
    public int getMinPower(int level) {
        return 15;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.world.isClient && target instanceof LivingEntity livingEntityTarget) {
            final Collection<StatusEffectInstance> active_effects = user.getStatusEffects();
            for (StatusEffectInstance effect : active_effects) {
                livingEntityTarget.addStatusEffect(effect);
            }
        }

        super.onTargetDamaged(user, target, level);
    }
}

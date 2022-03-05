package me.codeman1o1.therrassium.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;

public class Smited extends Enchantment {
    public Smited() {
        super(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] { EquipmentSlot.MAINHAND });
    }

    @Override
    public int getMinPower(int level) {
        return 25;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.getWorld().isClient()) {
            if (target instanceof LivingEntity) {
                LightningEntity lightningEntity = (LightningEntity) EntityType.LIGHTNING_BOLT.create(target.world);
                lightningEntity.refreshPositionAfterTeleport(Vec3d.ofBottomCenter(target.getBlockPos()));
                target.world.spawnEntity(lightningEntity);
            }
        }

        super.onTargetDamaged(user, target, level);
    }
}
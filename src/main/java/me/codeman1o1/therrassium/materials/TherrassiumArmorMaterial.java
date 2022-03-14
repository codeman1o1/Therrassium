package me.codeman1o1.therrassium.materials;

import me.codeman1o1.therrassium.registry.Items;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class TherrassiumArmorMaterial implements ArmorMaterial {

    public static final TherrassiumArmorMaterial INSTANCE = new TherrassiumArmorMaterial();

    private static final int[] DURABILITY = { 814, 1184, 1110, 962 };
    private static final int[] PROTECTION = { 6, 12, 16, 6 };

    @Override
    public int getDurability(EquipmentSlot slot) {
        return DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 7;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.THERRASSIUM_INGOT);
    }

    @Override
    public String getName() {
        return "therrassium";
    }

    @Override
    public float getToughness() {
        return 6;
    }

    @Override
    public float getKnockbackResistance() {
        return 2;
    }
}

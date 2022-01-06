package me.codeman1o1.therrassium.materials;

import me.codeman1o1.therrassium.registry.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TherrassiumToolMaterial implements ToolMaterial {

    public static final TherrassiumToolMaterial INSTANCE = new TherrassiumToolMaterial();

    public int getDurability() {
        return 4062;
    }

    public float getMiningSpeedMultiplier() {
        return 18;
    }

    public float getAttackDamage() {
        return 8;
    }

    public int getMiningLevel() {
        return 8;
    }

    public int getEnchantability() {
        return 7;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.THERRASSIUM_INGOT);
    }
}

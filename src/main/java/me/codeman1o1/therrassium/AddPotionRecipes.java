package me.codeman1o1.therrassium;

import me.codeman1o1.therrassium.mixins.CallRegisterPotionRecipe;
import me.codeman1o1.therrassium.registry.Effects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;

public class AddPotionRecipes {
    public static void registerPotionRecipes() {
        CallRegisterPotionRecipe.callRegisterPotionRecipe(Potions.AWKWARD, Items.EXPERIENCE_BOTTLE,
                Effects.experienced_potion);
        CallRegisterPotionRecipe.callRegisterPotionRecipe(Effects.experienced_potion, Items.GLOWSTONE_DUST,
                Effects.experienced_potion_strong);
        CallRegisterPotionRecipe.callRegisterPotionRecipe(Effects.experienced_potion, Items.REDSTONE,
                Effects.experienced_potion_long);
    }
}
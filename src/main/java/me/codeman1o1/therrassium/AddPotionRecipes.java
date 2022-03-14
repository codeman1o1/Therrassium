package me.codeman1o1.therrassium;

import me.codeman1o1.therrassium.mixins.CallRegisterPotionRecipe;
import me.codeman1o1.therrassium.registry.Effects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;

public class AddPotionRecipes {
        public static void registerPotionRecipes() {
                CallRegisterPotionRecipe.callRegisterPotionRecipe(Potions.AWKWARD, Items.EXPERIENCE_BOTTLE,
                                Effects.experiencedPotion);
                CallRegisterPotionRecipe.callRegisterPotionRecipe(Effects.experiencedPotion, Items.GLOWSTONE_DUST,
                                Effects.experiencedPotionStrong);
                CallRegisterPotionRecipe.callRegisterPotionRecipe(Effects.experiencedPotion, Items.REDSTONE,
                                Effects.experiencedPotionLong);
        }
}
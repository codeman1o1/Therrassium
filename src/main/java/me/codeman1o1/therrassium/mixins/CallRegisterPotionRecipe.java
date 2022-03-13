package me.codeman1o1.therrassium.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.recipe.BrewingRecipeRegistry;

@Mixin(BrewingRecipeRegistry.class)
public interface CallRegisterPotionRecipe {

    @Invoker("registerPotionRecipe")
    public static void callRegisterPotionRecipe(Potion input, Item item, Potion output) {
    }

}
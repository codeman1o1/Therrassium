package me.codeman1o1.therrassium;

import net.fabricmc.api.ModInitializer;
import me.codeman1o1.therrassium.registry.*;

public class Therrassium implements ModInitializer {

    public static final String MOD_ID = "therrassium";

    @Override
    public void onInitialize() {
        Items.registerItems();
        Blocks.registerBlocks();
        Enchantments.registerEnchantments();
        Effects.registerEffects();
        PotionRecipes.registerPotionRecipes();
    }
}

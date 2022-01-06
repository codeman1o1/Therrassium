package me.codeman1o1.therrassium;

import net.fabricmc.api.ModInitializer;

public class Therrassium implements ModInitializer {

    public static final String MOD_ID = "therrassium";

    @Override
    public void onInitialize() {
        me.codeman1o1.therrassium.registry.Items.registerItems();
        me.codeman1o1.therrassium.registry.Blocks.registerBlocks();
        me.codeman1o1.therrassium.registry.Enchantments.registerEnchantments();
    }
}

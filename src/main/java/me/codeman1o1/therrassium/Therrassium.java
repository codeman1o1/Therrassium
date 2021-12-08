package me.codeman1o1.therrassium;

import net.fabricmc.api.ModInitializer;

public class Therrassium implements ModInitializer {

    public static final String MOD_ID = "therrassium";

    @Override
    public void onInitialize() {
        me.codeman1o1.therrassium.registry.ModItems.registerItems();
        me.codeman1o1.therrassium.registry.ModBlocks.registerBlocks();
    }
}

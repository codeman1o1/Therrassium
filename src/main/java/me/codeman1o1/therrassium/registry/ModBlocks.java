package me.codeman1o1.therrassium.registry;

import me.codeman1o1.therrassium.Therrassium;
import me.codeman1o1.therrassium.interactions.TherrassiumBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block THERRASSIUM_BLOCK = new TherrassiumBlock(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(5f, 30f)
            .sounds(BlockSoundGroup.NETHERITE));

    // Registering Blocks
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Therrassium.MOD_ID, "therrassium_block"), THERRASSIUM_BLOCK);
    }
}

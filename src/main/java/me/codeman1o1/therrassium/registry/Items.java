package me.codeman1o1.therrassium.registry;

import me.codeman1o1.therrassium.Therrassium;
import me.codeman1o1.therrassium.items.TherrassiumAxe;
import me.codeman1o1.therrassium.materials.TherrassiumArmorMaterial;
import me.codeman1o1.therrassium.materials.TherrassiumToolMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {
        // Items
        public static final Item THERRASSIUM_INGOT = new Item(
                        new Item.Settings().group(ItemGroup.MATERIALS).fireproof());

        // Tools
        public static final ToolItem THERRASSIUM_SWORD = new SwordItem(TherrassiumToolMaterial.INSTANCE, 16, 3.2f,
                        new Item.Settings().group(ItemGroup.COMBAT).fireproof());
        public static final ToolItem THERRASSIUM_PICKAXE = new me.codeman1o1.therrassium.items.TherrassiumPickaxe(
                        TherrassiumToolMaterial.INSTANCE, 12, 2.4f,
                        new Item.Settings().group(ItemGroup.TOOLS).fireproof());
        public static final ToolItem THERRASSIUM_AXE = new TherrassiumAxe(TherrassiumToolMaterial.INSTANCE, 20, 2,
                        new Item.Settings().group(ItemGroup.TOOLS).fireproof());
        public static final ToolItem THERRASSIUM_SHOVEL = new ShovelItem(TherrassiumToolMaterial.INSTANCE, 13, 2,
                        new Item.Settings().group(ItemGroup.TOOLS).fireproof());
        public static final ToolItem THERRASSIUM_HOE = new me.codeman1o1.therrassium.items.TherrassiumHoe(
                        TherrassiumToolMaterial.INSTANCE, 2, 4, new Item.Settings().group(ItemGroup.TOOLS).fireproof());

        // Armor
        public static final ArmorItem THERRASSIUM_HELMET = new ArmorItem(TherrassiumArmorMaterial.INSTANCE,
                        EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
        public static final ArmorItem THERRASSIUM_CHESTPLATE = new ArmorItem(TherrassiumArmorMaterial.INSTANCE,
                        EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
        public static final ArmorItem THERRASSIUM_LEGGINGS = new ArmorItem(TherrassiumArmorMaterial.INSTANCE,
                        EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
        public static final ArmorItem THERRASSIUM_BOOTS = new ArmorItem(TherrassiumArmorMaterial.INSTANCE,
                        EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).fireproof());

        // Block Items
        public static final BlockItem THERRASSIUM_BLOCK = new BlockItem(Blocks.THERRASSIUM_BLOCK,
                        new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).fireproof());

        // Registering Items
        public static void registerItems() {
                Registry.register(Registry.ITEM, new Identifier(Therrassium.MOD_ID, "therrassium_ingot"),
                                THERRASSIUM_INGOT);
                Registry.register(Registry.ITEM, new Identifier(Therrassium.MOD_ID, "therrassium_block"),
                                THERRASSIUM_BLOCK);

                Registry.register(Registry.ITEM, new Identifier(Therrassium.MOD_ID, "therrassium_sword"),
                                THERRASSIUM_SWORD);
                Registry.register(Registry.ITEM, new Identifier(Therrassium.MOD_ID, "therrassium_pickaxe"),
                                THERRASSIUM_PICKAXE);
                Registry.register(Registry.ITEM, new Identifier(Therrassium.MOD_ID, "therrassium_axe"),
                                THERRASSIUM_AXE);
                Registry.register(Registry.ITEM, new Identifier(Therrassium.MOD_ID, "therrassium_shovel"),
                                THERRASSIUM_SHOVEL);
                Registry.register(Registry.ITEM, new Identifier(Therrassium.MOD_ID, "therrassium_hoe"),
                                THERRASSIUM_HOE);

                Registry.register(Registry.ITEM, new Identifier(Therrassium.MOD_ID, "therrassium_helmet"),
                                THERRASSIUM_HELMET);
                Registry.register(Registry.ITEM, new Identifier(Therrassium.MOD_ID, "therrassium_chestplate"),
                                THERRASSIUM_CHESTPLATE);
                Registry.register(Registry.ITEM, new Identifier(Therrassium.MOD_ID, "therrassium_leggings"),
                                THERRASSIUM_LEGGINGS);
                Registry.register(Registry.ITEM, new Identifier(Therrassium.MOD_ID, "therrassium_boots"),
                                THERRASSIUM_BOOTS);
        }
}

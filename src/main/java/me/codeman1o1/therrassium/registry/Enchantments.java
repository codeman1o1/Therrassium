package me.codeman1o1.therrassium.registry;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import me.codeman1o1.therrassium.Therrassium;
import me.codeman1o1.therrassium.enchantments.Slowing;
import me.codeman1o1.therrassium.enchantments.Smited;
import me.codeman1o1.therrassium.enchantments.Levitating;

public class Enchantments {
    // Registering Enchantments
    public static void registerEnchantments() {
        Registry.register(Registry.ENCHANTMENT, new Identifier(Therrassium.MOD_ID, "slowing"), new Slowing());
        Registry.register(Registry.ENCHANTMENT, new Identifier(Therrassium.MOD_ID, "smited"), new Smited());
        Registry.register(Registry.ENCHANTMENT, new Identifier(Therrassium.MOD_ID, "levitating"), new Levitating());
    }
}

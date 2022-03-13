package me.codeman1o1.therrassium.registry;

import me.codeman1o1.therrassium.Therrassium;
import me.codeman1o1.therrassium.effects.Experienced;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.potion.Potion;

public class Effects {
        public static StatusEffect experienced;
        public static Potion experienced_potion;
        public static Potion experienced_potion_strong;
        public static Potion experienced_potion_long;

        // Registering effects
        public static void registerEffects() {
                experienced = Registry.register(Registry.STATUS_EFFECT,
                                new Identifier(Therrassium.MOD_ID, "experienced"),
                                new Experienced());
                experienced_potion = Registry.register(Registry.POTION,
                                new Identifier(Therrassium.MOD_ID, "experienced"),
                                new Potion(new StatusEffectInstance(experienced, 3600)));
                experienced_potion_strong = Registry.register(Registry.POTION,
                                new Identifier(Therrassium.MOD_ID, "strong_experienced"),
                                new Potion(new StatusEffectInstance(experienced, 1800, 1)));
                experienced_potion_long = Registry.register(Registry.POTION,
                                new Identifier(Therrassium.MOD_ID, "long_experienced"),
                                new Potion(new StatusEffectInstance(experienced, 9600)));
        }
}

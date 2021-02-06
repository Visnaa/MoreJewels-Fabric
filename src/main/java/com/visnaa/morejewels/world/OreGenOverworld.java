package com.visnaa.morejewels.world;

import com.visnaa.morejewels.init.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGenOverworld
{
    public static ConfiguredFeature<?, ?> RUBY_ORE_GEN = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.RUBY_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    64))) // max y level
            .spreadHorizontally()
            .repeat(20); // number of veins per chunk

    public static ConfiguredFeature<?, ?> SAPPHIRE_ORE_GEN = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.SAPPHIRE_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    64))) // max y level
            .spreadHorizontally()
            .repeat(20); // number of veins per chunk

    public static ConfiguredFeature<?, ?> AQUAMARINE_ORE_GEN = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.AQUAMARINE_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    64))) // max y level
            .spreadHorizontally()
            .repeat(20); // number of veins per chunk

    public static ConfiguredFeature<?, ?> JADE_ORE_GEN = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.JADE_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    64))) // max y level
            .spreadHorizontally()
            .repeat(20); // number of veins per chunk

    public static ConfiguredFeature<?, ?> OPAL_ORE_GEN = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.OPAL_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    64))) // max y level
            .spreadHorizontally()
            .repeat(20); // number of veins per chunk

    public static ConfiguredFeature<?, ?> YELLOW_DIAMOND_ORE_GEN = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.YELLOW_DIAMOND_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    64))) // max y level
            .spreadHorizontally()
            .repeat(20); // number of veins per chunk

    public static ConfiguredFeature<?, ?> AMBER_ORE_GEN = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.AMBER_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    64))) // max y level
            .spreadHorizontally()
            .repeat(20); // number of veins per chunk

    public static ConfiguredFeature<?, ?> AMETHYST_ORE_GEN = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.AMETHYST_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    64))) // max y level
            .spreadHorizontally()
            .repeat(20); // number of veins per chunk

    public static ConfiguredFeature<?, ?> TOPAZ_ORE_GEN = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.TOPAZ_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    64))) // max y level
            .spreadHorizontally()
            .repeat(20); // number of veins per chunk

    public static ConfiguredFeature<?, ?> PLATINUM_ORE_GEN = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.PLATINUM_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    64))) // max y level
            .spreadHorizontally()
            .repeat(20); // number of veins per chunk

    public static void registerOres()
    {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("morejewels", "ore_ruby_gen"), RUBY_ORE_GEN);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("morejewels", "ore_sapphire_gen"), SAPPHIRE_ORE_GEN);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("morejewels", "ore_aquamarine_gen"), AQUAMARINE_ORE_GEN);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("morejewels", "ore_jade_gen"), JADE_ORE_GEN);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("morejewels", "ore_opal_gen"), OPAL_ORE_GEN);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("morejewels", "ore_yellow_diamond_gen"), YELLOW_DIAMOND_ORE_GEN);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("morejewels", "ore_amber_gen"), AMBER_ORE_GEN);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("morejewels", "ore_amethyst_gen"), AMETHYST_ORE_GEN);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("morejewels", "ore_topaz_gen"), TOPAZ_ORE_GEN);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("morejewels", "ore_platinum_gen"), PLATINUM_ORE_GEN);
    }
}

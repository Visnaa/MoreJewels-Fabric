package com.visnaa.morejewels.init;

import com.visnaa.morejewels.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block SAPPHIRE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block SAPPHIRE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block AQUAMARINE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block AQUAMARINE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block JADE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block JADE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block OPAL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block OPAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block YELLOW_DIAMOND_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block YELLOW_DIAMOND_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block AMBER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block AMBER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block AMETHYST_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block AMETHYST_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block TOPAZ_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block TOPAZ_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block PLATINUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block PLATINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block BERYLLIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block BERYLLIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block BIXBIT_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block BIXBIT_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block MALACHITE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block MALACHITE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block ONYX_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block ONYX_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block PERIDOT_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block PERIDOT_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block MOON_STONE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block MOON_STONE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block SUN_STONE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block SUN_STONE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
    public static final Block CITRINE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));
    public static final Block CITRINE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));


    public static void registerBlocks()
    {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "aquamarine_block"), AQUAMARINE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "aquamarine_ore"), AQUAMARINE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jade_block"), JADE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jade_ore"), JADE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "opal_block"), OPAL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "opal_ore"), OPAL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_diamond_block"), YELLOW_DIAMOND_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_diamond_ore"), YELLOW_DIAMOND_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "amber_block"), AMBER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "amber_ore"), AMBER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "amethyst_block"), AMETHYST_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "amethyst_ore"), AMETHYST_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "topaz_block"), TOPAZ_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "topaz_ore"), TOPAZ_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "platinum_block"), PLATINUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "platinum_ore"), PLATINUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "beryllium_block"), BERYLLIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "beryllium_ore"), BERYLLIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "bixbit_block"), BIXBIT_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "bixbit_ore"), BIXBIT_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "malachite_block"), MALACHITE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "malachite_ore"), MALACHITE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "onyx_block"), ONYX_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "onyx_ore"), ONYX_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "peridot_block"), PERIDOT_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "peridot_ore"), PERIDOT_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "moon_stone_block"), MOON_STONE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "moon_stone_ore"), MOON_STONE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "sun_stone_block"), SUN_STONE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "sun_stone_ore"), SUN_STONE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "citrine_block"), CITRINE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "citrine_ore"), CITRINE_ORE);
    }
}

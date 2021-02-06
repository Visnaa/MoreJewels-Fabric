package com.visnaa.morejewels.init;

import com.visnaa.morejewels.Main;
import com.visnaa.morejewels.items.armor.ArmorMaterials;
import com.visnaa.morejewels.items.tools.AxeItem;
import com.visnaa.morejewels.items.tools.HoeItem;
import com.visnaa.morejewels.items.tools.PickaxeItem;
import com.visnaa.morejewels.items.tools.ToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    private static final int SWORD_DAMAGE = 5;
    private static final float SHOVEL_DAMAGE = 4.5F;
    private static final int PICKAXE_DAMAGE = 4;
    private static final int AXE_DAMAGE = 7;
    private static final int HOE_DAMAGE = 0;
    private static final float SWORD_SPEED = -2.4F;
    private static final float SHOVEL_SPEED = -3.0F;
    private static final float PICKAXE_SPEED = -2.8F;
    private static final float AXE_SPEED = -3.0F;
    private static final float HOE_SPEED = 0.0F;


    //Items
    public static final Item RUBY = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item ROUGH_RUBY = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item SAPPHIRE = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item ROUGH_SAPPHIRE = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item AQUAMARINE = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item ROUGH_AQUAMARINE = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item JADE = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item ROUGH_JADE = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item OPAL = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item ROUGH_OPAL = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item YELLOW_DIAMOND = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item ROUGH_YELLOW_DIAMOND = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item AMBER = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item ROUGH_AMBER = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item AMETHYST = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item ROUGH_AMETHYST = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item TOPAZ = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item ROUGH_TOPAZ = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item PLATINUM = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item ROUGH_PLATINUM = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));

    //Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem RUBY_ORE = new BlockItem(ModBlocks.RUBY_ORE, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem SAPPHIRE_BLOCK = new BlockItem(ModBlocks.SAPPHIRE_BLOCK, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem SAPPHIRE_ORE = new BlockItem(ModBlocks.SAPPHIRE_ORE, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem AQUAMARINE_BLOCK = new BlockItem(ModBlocks.AQUAMARINE_BLOCK, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem AQUAMARINE_ORE = new BlockItem(ModBlocks.AQUAMARINE_ORE, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem JADE_BLOCK = new BlockItem(ModBlocks.JADE_BLOCK, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem JADE_ORE = new BlockItem(ModBlocks.JADE_ORE, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem OPAL_BLOCK = new BlockItem(ModBlocks.OPAL_BLOCK, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem OPAL_ORE = new BlockItem(ModBlocks.OPAL_ORE, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem POLISHED_OPAL_BLOCK = new BlockItem(ModBlocks.POLISHED_OPAL_BLOCK, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem YELLOW_DIAMOND_BLOCK = new BlockItem(ModBlocks.YELLOW_DIAMOND_BLOCK, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem YELLOW_DIAMOND_ORE = new BlockItem(ModBlocks.YELLOW_DIAMOND_ORE, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem AMBER_BLOCK = new BlockItem(ModBlocks.AMBER_BLOCK, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem AMBER_ORE = new BlockItem(ModBlocks.AMBER_ORE, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem AMETHYST_BLOCK = new BlockItem(ModBlocks.AMETHYST_BLOCK, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem AMETHYST_ORE = new BlockItem(ModBlocks.AMETHYST_ORE, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem TOPAZ_BLOCK = new BlockItem(ModBlocks.TOPAZ_BLOCK, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem TOPAZ_ORE = new BlockItem(ModBlocks.TOPAZ_ORE, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem PLATINUM_BLOCK = new BlockItem(ModBlocks.PLATINUM_BLOCK, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem PLATINUM_ORE = new BlockItem(ModBlocks.PLATINUM_ORE, new Item.Settings().group(Main.ITEM_GROUP));

    //Tools
    public static final SwordItem RUBY_SWORD = new SwordItem(ToolMaterials.RUBY, SWORD_DAMAGE, SWORD_SPEED, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ShovelItem RUBY_SHOVEL = new ShovelItem(ToolMaterials.RUBY, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final PickaxeItem RUBY_PICKAXE = new PickaxeItem(ToolMaterials.RUBY, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final AxeItem RUBY_AXE = new AxeItem(ToolMaterials.RUBY, AXE_DAMAGE, AXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final HoeItem RUBY_HOE = new HoeItem(ToolMaterials.RUBY, HOE_DAMAGE, HOE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));

    public static final SwordItem SAPPHIRE_SWORD = new SwordItem(ToolMaterials.SAPPHIRE, SWORD_DAMAGE, SWORD_SPEED, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ShovelItem SAPPHIRE_SHOVEL = new ShovelItem(ToolMaterials.SAPPHIRE, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final PickaxeItem SAPPHIRE_PICKAXE = new PickaxeItem(ToolMaterials.SAPPHIRE, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final AxeItem SAPPHIRE_AXE = new AxeItem(ToolMaterials.SAPPHIRE, AXE_DAMAGE, AXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final HoeItem SAPPHIRE_HOE = new HoeItem(ToolMaterials.SAPPHIRE, HOE_DAMAGE, HOE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));

    public static final SwordItem AQUAMARINE_SWORD = new SwordItem(ToolMaterials.AQUAMARINE, SWORD_DAMAGE, SWORD_SPEED, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ShovelItem AQUAMARINE_SHOVEL = new ShovelItem(ToolMaterials.AQUAMARINE, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final PickaxeItem AQUAMARINE_PICKAXE = new PickaxeItem(ToolMaterials.AQUAMARINE, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final AxeItem AQUAMARINE_AXE = new AxeItem(ToolMaterials.AQUAMARINE, AXE_DAMAGE, AXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final HoeItem AQUAMARINE_HOE = new HoeItem(ToolMaterials.AQUAMARINE, HOE_DAMAGE, HOE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));

    public static final SwordItem JADE_SWORD = new SwordItem(ToolMaterials.JADE, SWORD_DAMAGE, SWORD_SPEED, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ShovelItem JADE_SHOVEL = new ShovelItem(ToolMaterials.JADE, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final PickaxeItem JADE_PICKAXE = new PickaxeItem(ToolMaterials.JADE, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final AxeItem JADE_AXE = new AxeItem(ToolMaterials.JADE, AXE_DAMAGE, AXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final HoeItem JADE_HOE = new HoeItem(ToolMaterials.JADE, HOE_DAMAGE, HOE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));

    public static final SwordItem OPAL_SWORD = new SwordItem(ToolMaterials.OPAL, SWORD_DAMAGE, SWORD_SPEED, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ShovelItem OPAL_SHOVEL = new ShovelItem(ToolMaterials.OPAL, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final PickaxeItem OPAL_PICKAXE = new PickaxeItem(ToolMaterials.OPAL, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final AxeItem OPAL_AXE = new AxeItem(ToolMaterials.OPAL, AXE_DAMAGE, AXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final HoeItem OPAL_HOE = new HoeItem(ToolMaterials.OPAL, HOE_DAMAGE, HOE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));

    public static final SwordItem YELLOW_DIAMOND_SWORD = new SwordItem(ToolMaterials.YELLOW_DIAMOND, SWORD_DAMAGE, SWORD_SPEED, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ShovelItem YELLOW_DIAMOND_SHOVEL = new ShovelItem(ToolMaterials.YELLOW_DIAMOND, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final PickaxeItem YELLOW_DIAMOND_PICKAXE = new PickaxeItem(ToolMaterials.YELLOW_DIAMOND, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final AxeItem YELLOW_DIAMOND_AXE = new AxeItem(ToolMaterials.YELLOW_DIAMOND, AXE_DAMAGE, AXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final HoeItem YELLOW_DIAMOND_HOE = new HoeItem(ToolMaterials.YELLOW_DIAMOND, HOE_DAMAGE, HOE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));

    public static final SwordItem AMBER_SWORD = new SwordItem(ToolMaterials.AMBER, SWORD_DAMAGE, SWORD_SPEED, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ShovelItem AMBER_SHOVEL = new ShovelItem(ToolMaterials.AMBER, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final PickaxeItem AMBER_PICKAXE = new PickaxeItem(ToolMaterials.AMBER, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final AxeItem AMBER_AXE = new AxeItem(ToolMaterials.AMBER, AXE_DAMAGE, AXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final HoeItem AMBER_HOE = new HoeItem(ToolMaterials.AMBER, HOE_DAMAGE, HOE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));

    public static final SwordItem AMETHYST_SWORD = new SwordItem(ToolMaterials.AMETHYST, SWORD_DAMAGE, SWORD_SPEED, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ShovelItem AMETHYST_SHOVEL = new ShovelItem(ToolMaterials.AMETHYST, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final PickaxeItem AMETHYST_PICKAXE = new PickaxeItem(ToolMaterials.AMETHYST, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final AxeItem AMETHYST_AXE = new AxeItem(ToolMaterials.AMETHYST, AXE_DAMAGE, AXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final HoeItem AMETHYST_HOE = new HoeItem(ToolMaterials.AMETHYST, HOE_DAMAGE, HOE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));

    public static final SwordItem TOPAZ_SWORD = new SwordItem(ToolMaterials.TOPAZ, SWORD_DAMAGE, SWORD_SPEED, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ShovelItem TOPAZ_SHOVEL = new ShovelItem(ToolMaterials.TOPAZ, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final PickaxeItem TOPAZ_PICKAXE = new PickaxeItem(ToolMaterials.TOPAZ, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final AxeItem TOPAZ_AXE = new AxeItem(ToolMaterials.TOPAZ, AXE_DAMAGE, AXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final HoeItem TOPAZ_HOE = new HoeItem(ToolMaterials.TOPAZ, HOE_DAMAGE, HOE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));

    public static final SwordItem PLATINUM_SWORD = new SwordItem(ToolMaterials.PLATINUM, SWORD_DAMAGE, SWORD_SPEED, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ShovelItem PLATINUM_SHOVEL = new ShovelItem(ToolMaterials.PLATINUM, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final PickaxeItem PLATINUM_PICKAXE = new PickaxeItem(ToolMaterials.PLATINUM, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final AxeItem PLATINUM_AXE = new AxeItem(ToolMaterials.PLATINUM, AXE_DAMAGE, AXE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));
    public static final HoeItem PLATINUM_HOE = new HoeItem(ToolMaterials.PLATINUM, HOE_DAMAGE, HOE_SPEED, new Item.Settings().group(ItemGroup.TOOLS));

    //Armor
    public static final ArmorItem RUBY_HELMET = new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem RUBY_CHESTPLATE = new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem RUBY_LEGGINGS = new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem RUBY_BOOTS = new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static final ArmorItem SAPPHIRE_HELMET = new ArmorItem(ArmorMaterials.SAPPHIRE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem SAPPHIRE_CHESTPLATE = new ArmorItem(ArmorMaterials.SAPPHIRE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem SAPPHIRE_LEGGINGS = new ArmorItem(ArmorMaterials.SAPPHIRE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem SAPPHIRE_BOOTS = new ArmorItem(ArmorMaterials.SAPPHIRE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static final ArmorItem AQUAMARINE_HELMET = new ArmorItem(ArmorMaterials.AQUAMARINE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem AQUAMARINE_CHESTPLATE = new ArmorItem(ArmorMaterials.AQUAMARINE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem AQUAMARINE_LEGGINGS = new ArmorItem(ArmorMaterials.AQUAMARINE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem AQUAMARINE_BOOTS = new ArmorItem(ArmorMaterials.AQUAMARINE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static final ArmorItem JADE_HELMET = new ArmorItem(ArmorMaterials.JADE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem JADE_CHESTPLATE = new ArmorItem(ArmorMaterials.JADE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem JADE_LEGGINGS = new ArmorItem(ArmorMaterials.JADE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem JADE_BOOTS = new ArmorItem(ArmorMaterials.JADE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static final ArmorItem OPAL_HELMET = new ArmorItem(ArmorMaterials.OPAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem OPAL_CHESTPLATE = new ArmorItem(ArmorMaterials.OPAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem OPAL_LEGGINGS = new ArmorItem(ArmorMaterials.OPAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem OPAL_BOOTS = new ArmorItem(ArmorMaterials.OPAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static final ArmorItem YELLOW_DIAMOND_HELMET = new ArmorItem(ArmorMaterials.YELLOW_DIAMOND, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem YELLOW_DIAMOND_CHESTPLATE = new ArmorItem(ArmorMaterials.YELLOW_DIAMOND, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem YELLOW_DIAMOND_LEGGINGS = new ArmorItem(ArmorMaterials.YELLOW_DIAMOND, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem YELLOW_DIAMOND_BOOTS = new ArmorItem(ArmorMaterials.YELLOW_DIAMOND, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static final ArmorItem AMBER_HELMET = new ArmorItem(ArmorMaterials.AMBER, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem AMBER_CHESTPLATE = new ArmorItem(ArmorMaterials.AMBER, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem AMBER_LEGGINGS = new ArmorItem(ArmorMaterials.AMBER, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem AMBER_BOOTS = new ArmorItem(ArmorMaterials.AMBER, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static final ArmorItem AMETHYST_HELMET = new ArmorItem(ArmorMaterials.AMETHYST, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem AMETHYST_CHESTPLATE = new ArmorItem(ArmorMaterials.AMETHYST, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem AMETHYST_LEGGINGS = new ArmorItem(ArmorMaterials.AMETHYST, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem AMETHYST_BOOTS = new ArmorItem(ArmorMaterials.AMETHYST, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static final ArmorItem TOPAZ_HELMET = new ArmorItem(ArmorMaterials.TOPAZ, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem TOPAZ_CHESTPLATE = new ArmorItem(ArmorMaterials.TOPAZ, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem TOPAZ_LEGGINGS = new ArmorItem(ArmorMaterials.TOPAZ, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem TOPAZ_BOOTS = new ArmorItem(ArmorMaterials.TOPAZ, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static final ArmorItem PLATINUM_HELMET = new ArmorItem(ArmorMaterials.PLATINUM, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem PLATINUM_CHESTPLATE = new ArmorItem(ArmorMaterials.PLATINUM, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem PLATINUM_LEGGINGS = new ArmorItem(ArmorMaterials.PLATINUM, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem PLATINUM_BOOTS = new ArmorItem(ArmorMaterials.PLATINUM, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static void registerItems()
    {
        //Items
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_ruby"), ROUGH_RUBY);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sapphire"), SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_sapphire"), ROUGH_SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquamarine"), AQUAMARINE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_aquamarine"), ROUGH_AQUAMARINE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jade"), JADE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_jade"), ROUGH_JADE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "opal"), OPAL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_opal"), ROUGH_OPAL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_diamond"), YELLOW_DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_yellow_diamond"), ROUGH_YELLOW_DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amber"), AMBER);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_amber"), ROUGH_AMBER);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst"), AMETHYST);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_amethyst"), ROUGH_AMETHYST);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "topaz"), TOPAZ);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_topaz"), ROUGH_TOPAZ);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "platinum"), PLATINUM);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_platinum"), ROUGH_PLATINUM);

        //Tools
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_sword"), RUBY_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_shovel"), RUBY_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_pickaxe"), RUBY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_axe"), RUBY_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_hoe"), RUBY_HOE);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sapphire_sword"), SAPPHIRE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sapphire_shovel"), SAPPHIRE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sapphire_pickaxe"), SAPPHIRE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sapphire_axe"), SAPPHIRE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sapphire_hoe"), SAPPHIRE_HOE);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquamarine_sword"), AQUAMARINE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquamarine_shovel"), AQUAMARINE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquamarine_pickaxe"), AQUAMARINE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquamarine_axe"), AQUAMARINE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquamarine_hoe"), AQUAMARINE_HOE);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jade_sword"), JADE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jade_shovel"), JADE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jade_pickaxe"), JADE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jade_axe"), JADE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jade_hoe"), JADE_HOE);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "opal_sword"), OPAL_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "opal_shovel"), OPAL_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "opal_pickaxe"), OPAL_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "opal_axe"), OPAL_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "opal_hoe"), OPAL_HOE);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_diamond_sword"), YELLOW_DIAMOND_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_diamond_shovel"), YELLOW_DIAMOND_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_diamond_pickaxe"), YELLOW_DIAMOND_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_diamond_axe"), YELLOW_DIAMOND_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_diamond_hoe"), YELLOW_DIAMOND_HOE);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amber_sword"), AMBER_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amber_shovel"), AMBER_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amber_pickaxe"), AMBER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amber_axe"), AMBER_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amber_hoe"), AMBER_HOE);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst_sword"), AMETHYST_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst_shovel"), AMETHYST_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst_pickaxe"), AMETHYST_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst_axe"), AMETHYST_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst_hoe"), AMETHYST_HOE);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "topaz_sword"), TOPAZ_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "topaz_shovel"), TOPAZ_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "topaz_pickaxe"), TOPAZ_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "topaz_axe"), TOPAZ_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "topaz_hoe"), TOPAZ_HOE);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "platinum_sword"), PLATINUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "platinum_shovel"), PLATINUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "platinum_pickaxe"), PLATINUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "platinum_axe"), PLATINUM_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "platinum_hoe"), PLATINUM_HOE);

        //Armor
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_helmet"), RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_leggings"), RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_boots"), RUBY_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sapphire_helmet"), SAPPHIRE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sapphire_chestplate"), SAPPHIRE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sapphire_leggings"), SAPPHIRE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sapphire_boots"), SAPPHIRE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquamarine_helmet"), AQUAMARINE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquamarine_chestplate"), AQUAMARINE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquamarine_leggings"), AQUAMARINE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquamarine_boots"), AQUAMARINE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jade_helmet"), JADE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jade_chestplate"), JADE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jade_leggings"), JADE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jade_boots"), JADE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "opal_helmet"), OPAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "opal_chestplate"), OPAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "opal_leggings"), OPAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "opal_boots"), OPAL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_diamond_helmet"), YELLOW_DIAMOND_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_diamond_chestplate"), YELLOW_DIAMOND_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_diamond_leggings"), YELLOW_DIAMOND_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_diamond_boots"), YELLOW_DIAMOND_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amber_helmet"), AMBER_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amber_chestplate"), AMBER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amber_leggings"), AMBER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amber_boots"), AMBER_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst_helmet"), AMETHYST_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst_chestplate"), AMETHYST_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst_leggings"), AMETHYST_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst_boots"), AMETHYST_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "topaz_helmet"), TOPAZ_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "topaz_chestplate"), TOPAZ_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "topaz_leggings"), TOPAZ_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "topaz_boots"), TOPAZ_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "platinum_helmet"), PLATINUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "platinum_chestplate"), PLATINUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "platinum_leggings"), PLATINUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "platinum_boots"), PLATINUM_BOOTS);
        
        //Block Items
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquamarine_block"), AQUAMARINE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquamarine_ore"), AQUAMARINE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jade_block"), JADE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jade_ore"), JADE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "opal_block"), OPAL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "opal_ore"), OPAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "polished_opal_block"), POLISHED_OPAL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_diamond_block"), YELLOW_DIAMOND_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_diamond_ore"), YELLOW_DIAMOND_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amber_block"), AMBER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amber_ore"), AMBER_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst_block"), AMETHYST_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst_ore"), AMETHYST_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "topaz_block"), TOPAZ_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "topaz_ore"), TOPAZ_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "platinum_block"), PLATINUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "platinum_ore"), PLATINUM_ORE);
    }
}

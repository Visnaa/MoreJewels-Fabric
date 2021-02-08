package com.visnaa.morejewels.items.tools;

import com.visnaa.morejewels.init.ModItems;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ToolMaterials implements ToolMaterial
{
    RUBY(3, 2048, 9.0F, 3.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.RUBY});
    }),
    SAPPHIRE(3, 2048, 9.0F, 3.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.SAPPHIRE});
    }),
    AQUAMARINE(3, 2048, 9.0F, 3.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.AQUAMARINE});
    }),
    JADE(3, 2048, 9.0F, 3.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.JADE});
    }),
    OPAL(3, 2048, 9.0F, 3.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.OPAL});
    }),
    YELLOW_DIAMOND(3, 2048, 9.0F, 3.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.YELLOW_DIAMOND});
    }),
    AMBER(3, 2048, 9.0F, 3.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.AMBER});
    }),
    AMETHYST(3, 2048, 9.0F, 3.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.AMETHYST});
    }),
    TOPAZ(3, 2048, 9.0F, 3.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.TOPAZ});
    }),
    PLATINUM(3, 2048, 9.0F, 3.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.PLATINUM});
    }),
    BERYLLIUM(3, 2048, 9.0F, 3.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.BERYLLIUM});
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}

package com.visnaa.morejewels.mixins;

import com.visnaa.morejewels.world.OreGenOverworld;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DefaultBiomeFeatures.class)
public class OreGenMixin
{
    @Inject(method = "addDefaultOres(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At("TAIL"))
    private static void addDefaultOres(GenerationSettings.Builder builder, CallbackInfo ci) {
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.RUBY_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.SAPPHIRE_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.AQUAMARINE_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.JADE_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.OPAL_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.YELLOW_DIAMOND_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.AMBER_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.AMETHYST_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.TOPAZ_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.PLATINUM_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.BERYLLIUM_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.BIXBIT_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.MALACHITE_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.ONYX_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.PERIDOT_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.MOON_STONE_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.SUN_STONE_ORE_GEN);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGenOverworld.CITRINE_ORE_GEN);
    }
}

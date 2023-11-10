package net.repook.battlebotanist.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.repook.battlebotanist.world.ModPlacedFeatures;

public class ModFlowerGeneration {
    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SOUL_BUSH_PLACED_KEY);
    }
}

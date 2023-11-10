package net.repook.battlebotanist.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.repook.battlebotanist.BattleBotanistMod;
import net.repook.battlebotanist.block.ModBlocks;
import net.repook.battlebotanist.block.custom.SoulFruitBushBlock;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> SOUL_BUSH_KEY = registerKey("soul_bush");
    public static void bootstrap (Registerable<ConfiguredFeature<?, ?>> context){
    register(context,SOUL_BUSH_KEY,Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(64,6,2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SOUL_FRUIT_BUSH.getDefaultState().with(SoulFruitBushBlock.AGE,1))))));
    }




    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BattleBotanistMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

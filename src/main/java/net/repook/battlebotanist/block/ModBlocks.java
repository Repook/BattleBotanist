package net.repook.battlebotanist.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.BattleBotanistMod;
import net.repook.battlebotanist.block.custom.CactusSentryCropBlock;
import net.repook.battlebotanist.block.custom.MagicStickCropBlock;
import net.repook.battlebotanist.block.custom.SoulFruitBushBlock;

public class ModBlocks {

public static final Block MAGIC_STICK_CROP = registerBlockWithoutBlockItem("magic_stick_crop",
        new MagicStickCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block CACTUS_SENTRY_CROP = registerBlockWithoutBlockItem("cactus_sentry_crop",
            new CactusSentryCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block SOUL_FRUIT_BUSH = registerBlock("soul_fruit_bush",
            new SoulFruitBushBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));




    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(BattleBotanistMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BattleBotanistMod.MOD_ID, name),block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(BattleBotanistMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        BattleBotanistMod.LOGGER.info("Registering Mod Blocks for" + BattleBotanistMod.MOD_ID);
    }
}

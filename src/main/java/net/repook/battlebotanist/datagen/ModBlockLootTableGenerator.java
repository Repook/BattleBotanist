package net.repook.battlebotanist.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.repook.battlebotanist.block.ModBlocks;
import net.repook.battlebotanist.block.custom.MagicStickCropBlock;
import net.repook.battlebotanist.item.ModItems;


public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.MAGIC_STICK_CROP).properties(StatePredicate.Builder.create().exactMatch(MagicStickCropBlock.AGE, 6));
        this.addDrop(ModBlocks.MAGIC_STICK_CROP, this.cropDrops(ModBlocks.MAGIC_STICK_CROP, ModItems.MAGIC_STICK, ModItems.MAGIC_STICK_SEED, builder2));

        //addDrop(ModBlocks.SOUL_FRUIT_BUSH,ModItems.SOUL_FRUIT);
    }
}

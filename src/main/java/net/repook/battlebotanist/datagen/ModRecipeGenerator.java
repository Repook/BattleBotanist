package net.repook.battlebotanist.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.block.ModBlocks;
import net.repook.battlebotanist.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MELON_MALLET)
                .pattern("MSM")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', ModItems.MAGIC_STICK)
                .input('M',Items.MELON)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.MELON), conditionsFromItem(Items.MELON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MELON_MALLET)));
    }
}

package net.repook.battlebotanist.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.BattleBotanistMod;
import net.repook.battlebotanist.item.ModItems;
import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {


    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement rootAdvancement = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.MAGIC_STICK),
                        Text.literal("Battle Botanist!"),Text.literal("Obtain A Magical Stick."),
                        new Identifier(BattleBotanistMod.MOD_ID,"textures/block/dirt.png"), AdvancementFrame.TASK,
                        true,true,false))
                .criterion("has_magic_stick", InventoryChangedCriterion.Conditions.items(ModItems.MAGIC_STICK))
                .build(consumer, BattleBotanistMod.MOD_ID +":battlebotanist");

        Advancement melonMallet = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.MELON_MALLET),
                        Text.literal("Battle Botanist!"),Text.literal("Obtain A Mellon Mallet!"),
                        new Identifier(BattleBotanistMod.MOD_ID,"textures/block/dirt.png"), AdvancementFrame.TASK,
                        true,true,false))
                .criterion("has_mellon_mallet", InventoryChangedCriterion.Conditions.items(ModItems.MELON_MALLET))
                .parent(rootAdvancement)
                .build(consumer, BattleBotanistMod.MOD_ID +":battlebotanist");

        Advancement floralFirearm = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.FLORAL_FIREARM),
                        Text.literal("Battle Botanist!"),Text.literal("Have a Floral Firearm obtained."),
                        new Identifier(BattleBotanistMod.MOD_ID,"textures/block/dirt.png"), AdvancementFrame.TASK,
                        true,true,false))
                .criterion("has_floral_firearm", InventoryChangedCriterion.Conditions.items(ModItems.FLORAL_FIREARM))
                .parent(rootAdvancement)
                .build(consumer, BattleBotanistMod.MOD_ID +":battlebotanist");

        Advancement cactusSentry = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.MAGIC_CACTUS_SEEDLING),
                        Text.literal("Battle Botanist!"),Text.literal("Obtain a Magic Cactus Seedling."),
                        new Identifier(BattleBotanistMod.MOD_ID,"textures/block/dirt.png"), AdvancementFrame.TASK,
                        true,true,false))
                .criterion("has_magic_cactus_seedling", InventoryChangedCriterion.Conditions.items(ModItems.MAGIC_CACTUS_SEEDLING))
                .parent(rootAdvancement)
                .build(consumer, BattleBotanistMod.MOD_ID +":battlebotanist");
    }
}

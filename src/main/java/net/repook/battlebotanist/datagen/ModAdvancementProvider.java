package net.repook.battlebotanist.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.advancement.AdvancementProvider;
import net.minecraft.data.server.advancement.AdvancementTabGenerator;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.BattleBotanistMod;
import net.repook.battlebotanist.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;
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
                        new Identifier(BattleBotanistMod.MOD_ID,"item/magic_stick"), AdvancementFrame.TASK,
                        true,true,false))
                .criterion("has_magic_stick", InventoryChangedCriterion.Conditions.items(ModItems.MAGIC_STICK))
                .build(consumer, BattleBotanistMod.MOD_ID +":battlebotanist");
    }
}

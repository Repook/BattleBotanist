package net.repook.battlebotanist.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.BattleBotanistMod;
import net.repook.battlebotanist.block.ModBlocks;
import net.repook.battlebotanist.potion.ModPotions;

import java.util.Arrays;
import java.util.List;

public class ModItemGroup {
    private static void addPotions(ItemGroup.Entries entries, RegistryWrapper<Potion> registryWrapper, Item item, ItemGroup.StackVisibility visibility) {
        registryWrapper.streamEntries().filter(entry -> !entry.matchesKey(Potions.EMPTY_KEY)).map(entry -> PotionUtil.setPotion(new ItemStack(item), (Potion)entry.value())).forEach(stack -> entries.add((ItemStack)stack, visibility));
    }

    public static final ItemGroup BATTLE_BOTANIST_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BattleBotanistMod.MOD_ID, "battle_botanist_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.battle_botanist_group"))
                    .icon(() -> new ItemStack(ModItems.MELON_MALLET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MELON_MALLET);

                        entries.add(ModItems.MAGIC_STICK_SEED);
                        entries.add(ModItems.MAGIC_STICK);

                        entries.add(ModBlocks.SOUL_FRUIT_BUSH);
                        entries.add(ModItems.SOUL_FRUIT);

                        entries.add(ModItems.FLORAL_FIREARM);


                        entries.add(ModItems.MAGIC_CACTUS_SEEDLING);
                        entries.add(ModItems.CACTUS_SENTRY_SPAWN_EGG);




                    }).build());


    public static void registerItemGroup(){

    }

}

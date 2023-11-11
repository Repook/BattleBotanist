package net.repook.battlebotanist.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.BattleBotanistMod;
import net.repook.battlebotanist.block.ModBlocks;
import net.repook.battlebotanist.entity.ModEntities;
import net.repook.battlebotanist.item.custom.SoulFruitItem;
import net.repook.battlebotanist.item.custom.FloralFirearmItem;
import net.repook.battlebotanist.item.custom.MelonMalletItem;

public class ModItems {
    public static final Item MELON_MALLET = registerItem("melon_mallet",
            new MelonMalletItem(ModToolMaterial.MELON_MALLET, 3,-2f,new FabricItemSettings(),0.5f));

    public static final Item MAGIC_STICK = registerItem("magic_stick",
            new Item(new FabricItemSettings()));

    public static final Item CACTUS_SENTRY_SPAWN_EGG = registerItem("cactus_sentry_spawn_egg",
            new SpawnEggItem(ModEntities.CACTUS_SENTRY,0x649832,0x334f18,new FabricItemSettings()));

    public static final Item SOUL_FRUIT = registerItem("soul_fruit",
            new SoulFruitItem(new FabricItemSettings().maxCount(16)));

    public static final Item FLORAL_FIREARM = registerItem("floral_firearm",
            new FloralFirearmItem(new FabricItemSettings().maxDamage(500)));


    public static final Item MAGIC_STICK_SEED = registerItem("magic_stick_seed",
            new AliasedBlockItem(ModBlocks.MAGIC_STICK_CROP, new FabricItemSettings()));

    public static final Item MAGIC_CACTUS_SEEDLING = registerItem("magic_cactus_seedling",
            new AliasedBlockItem(ModBlocks.CACTUS_SENTRY_CROP, new FabricItemSettings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(BattleBotanistMod.MOD_ID,name),item);
    }

    public static void registerModItems(){
        BattleBotanistMod.LOGGER.info("Registering Mod Items for"+ BattleBotanistMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemToNaturalItemGroup);
        
    }

    private static void addItemToNaturalItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.MAGIC_STICK_SEED);
        entries.add(ModItems.MELON_MALLET);
        entries.add(ModItems.MAGIC_STICK);
    }

}

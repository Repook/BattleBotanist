package net.repook.battlebotanist.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.BattleBotanistMod;

import javax.swing.text.html.HTML;

public class ModTags {

    public static class Blocks{




        private static TagKey<Block> createBlockTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(BattleBotanistMod.MOD_ID, name));
        }
        private static TagKey<Block> createCommonBlockTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }
    }

    public static class Items{

        public static final TagKey<Item> FLORAL_FIREARM_AMMO_ITEMS =
                createItemTag("floral_firearm_ammo_items");
        private static TagKey<Item> createItemTag(String name){
            return TagKey.of(RegistryKeys.ITEM, new Identifier(BattleBotanistMod.MOD_ID, name));
        }
        private static TagKey<Item> createCommonBlockTag(String name){
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
        }
    }
}

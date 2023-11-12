package net.repook.battlebotanist;

import net.fabricmc.api.ModInitializer;

import net.repook.battlebotanist.block.ModBlocks;
import net.repook.battlebotanist.effect.ModEffects;
import net.repook.battlebotanist.entity.ModEntities;
import net.repook.battlebotanist.item.ModItemGroup;
import net.repook.battlebotanist.item.ModItems;
import net.repook.battlebotanist.potion.ModPotions;
import net.repook.battlebotanist.util.ModLootTableModifiers;
import net.repook.battlebotanist.util.ModRegistries;
import net.repook.battlebotanist.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BattleBotanistMod implements ModInitializer {
	public static final String MOD_ID = "battlebotanist";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModEntities.registerModEntities();
		ModRegistries.registerModStuffs();
		ModWorldGeneration.generateModWorldGeneration();
		ModLootTableModifiers.modifyLootTables();
		ModEffects.registerEffects();
		ModPotions.registerPotions();
	}
}
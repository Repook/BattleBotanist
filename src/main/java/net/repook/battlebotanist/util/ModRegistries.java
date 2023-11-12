package net.repook.battlebotanist.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.repook.battlebotanist.entity.ModEntities;
import net.repook.battlebotanist.entity.custom.CactusSentryEntity;
import net.repook.battlebotanist.item.ModItems;
import net.repook.battlebotanist.mixin.BrewingRecipeRegistryMixin;
import net.repook.battlebotanist.potion.ModPotions;

public class ModRegistries {

    public static void registerModStuffs(){
        registerAttributes();
        registerCustomTrades();
        registerPotionRecipes();
    }
    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.CACTUS_SENTRY, CactusSentryEntity.createCactusSentryAttributes());

        FabricDefaultAttributeRegistry.register(ModEntities.NETHER_SENTRY, CactusSentryEntity.createCactusSentryAttributes());
    }

    private static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER,5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 16),
                        new ItemStack(ModItems.MAGIC_STICK_SEED,1),3,2,0.2f
                )));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER,5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 32),
                        new ItemStack(ModItems.MAGIC_CACTUS_SEEDLING,1),3,2,0.2f
                )));
    }

    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.WATER, Items.MELON, ModPotions.MELON_JUICE);
    }
}

package net.repook.battlebotanist;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.repook.battlebotanist.block.ModBlocks;

import net.repook.battlebotanist.client.gui.ModHud;
import net.repook.battlebotanist.entity.ModEntities;
import net.repook.battlebotanist.entity.client.*;
import net.repook.battlebotanist.entity.layer.ModModelLayers;

public class BattleBotanistModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        HudRenderCallback.EVENT.register(new ModHud());

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.SPIKE_PROJECTILE, SpikeProjectileModel::getTexturedModelData);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGIC_STICK_CROP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CACTUS_SENTRY_CROP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SOUL_FRUIT_BUSH, RenderLayer.getCutout());

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.SEED_PROJECTILE, SeedProjectileModel::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.CACTUS_SENTRY, CactusSentryModel::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.NETHER_SENTRY, NetherSentryModel::getTexturedModelData);






        EntityRendererRegistry.register(ModEntities.SEED_PROJECTILE, SeedProjectileRenderer::new);

        EntityRendererRegistry.register(ModEntities.SPIKE_PROJECTILE, SpikeProjectileRenderer::new);

        EntityRendererRegistry.register(ModEntities.CACTUS_SENTRY, CactusSentryRenderer::new);

        EntityRendererRegistry.register(ModEntities.NETHER_SENTRY, NetherSentryRenderer::new);


        EntityRendererRegistry.register(ModEntities.SOUL_FRUIT_PROJECTILE, FlyingItemEntityRenderer::new);





    }
}

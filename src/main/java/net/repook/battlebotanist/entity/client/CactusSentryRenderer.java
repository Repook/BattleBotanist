package net.repook.battlebotanist.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.BattleBotanistMod;
import net.repook.battlebotanist.entity.custom.CactusSentryEntity;
import net.repook.battlebotanist.entity.layer.ModModelLayers;

public class CactusSentryRenderer extends LivingEntityRenderer<CactusSentryEntity,CactusSentryModel<CactusSentryEntity>> {
    private static final Identifier TEXTURE = new Identifier(BattleBotanistMod.MOD_ID,"textures/entity/cactus_sentry.png");

    public CactusSentryRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new CactusSentryModel<>(ctx.getPart(ModModelLayers.CACTUS_SENTRY)), 0.6f);
    }

    @Override
    public Identifier getTexture(CactusSentryEntity entity) {
        return TEXTURE;
    }

    @Override
    protected boolean hasLabel(CactusSentryEntity livingEntity) {
        return false;
    }
}

package net.repook.battlebotanist.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.BattleBotanistMod;
import net.repook.battlebotanist.entity.custom.CactusSentryEntity;
import net.repook.battlebotanist.entity.custom.NetherSentryEntity;
import net.repook.battlebotanist.entity.layer.ModModelLayers;

public class NetherSentryRenderer  extends LivingEntityRenderer<NetherSentryEntity,NetherSentryModel<NetherSentryEntity>> {
    private static final Identifier TEXTURE = new Identifier(BattleBotanistMod.MOD_ID,"textures/entity/nether_sentry.png");
    public NetherSentryRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new NetherSentryModel<>(ctx.getPart(ModModelLayers.NETHER_SENTRY)), 0.6f);
    }

    @Override
    public Identifier getTexture(NetherSentryEntity entity) {
        return TEXTURE;
    }

    @Override
    protected boolean hasLabel(NetherSentryEntity livingEntity) {
        return false;
    }
}

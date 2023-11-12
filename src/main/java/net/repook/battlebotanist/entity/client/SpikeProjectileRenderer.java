package net.repook.battlebotanist.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.BattleBotanistMod;
import net.repook.battlebotanist.entity.custom.SpikeProjectileEntity;
import net.repook.battlebotanist.entity.layer.ModModelLayers;

public class SpikeProjectileRenderer extends EntityRenderer<SpikeProjectileEntity> {
    public static final Identifier TEXTURE = new Identifier(BattleBotanistMod.MOD_ID, "textures/entity/spike_projectile.png");
    protected SpikeProjectileModel model;
    public SpikeProjectileRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        model = new SpikeProjectileModel(ctx.getPart(ModModelLayers.SPIKE_PROJECTILE));
    }

    @Override
    public Identifier getTexture(SpikeProjectileEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(SpikeProjectileEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }
}


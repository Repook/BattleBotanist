package net.repook.battlebotanist.entity.client;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
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
        matrices.push();
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(tickDelta, entity.prevYaw, entity.getYaw()) - 90.0F));
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.lerp(tickDelta, entity.prevPitch, entity.getPitch()) + 90.0F));
        VertexConsumer vertexconsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers, this.model.getLayer(TEXTURE), false, false);
        this.model.render(matrices, vertexconsumer, light, OverlayTexture.DEFAULT_UV, 1, 1, 0.5f, 1.0F);

        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }
}


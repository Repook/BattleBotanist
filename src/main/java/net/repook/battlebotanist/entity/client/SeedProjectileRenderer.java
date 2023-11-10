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
import net.repook.battlebotanist.entity.custom.SeedProjectileEntity;
import net.repook.battlebotanist.entity.layer.ModModelLayers;

public class SeedProjectileRenderer extends EntityRenderer<SeedProjectileEntity> {
    public static final Identifier TEXTURE = new Identifier(BattleBotanistMod.MOD_ID, "textures/entity/magic_projectile.png");
    protected SeedProjectileModel model;

    public SeedProjectileRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        model = new SeedProjectileModel(ctx.getPart(ModModelLayers.SEED_PROJECTILE));
    }

    @Override
    public void render(SeedProjectileEntity entity, float yaw, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(tickDelta, entity.prevYaw, entity.getYaw()) - 90.0F));
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.lerp(tickDelta, entity.prevPitch, entity.getPitch()) + 90.0F));
        VertexConsumer vertexconsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers, this.model.getLayer(TEXTURE), false, false);
        this.model.render(matrices, vertexconsumer, light, OverlayTexture.DEFAULT_UV, 1.0F, 0.0F, 0.0F, 1.0F);

        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(SeedProjectileEntity entity) {
        return TEXTURE;
    }
}

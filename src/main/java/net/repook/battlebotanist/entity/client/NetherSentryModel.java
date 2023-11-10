package net.repook.battlebotanist.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.repook.battlebotanist.entity.animations.ModAnimations;
import net.repook.battlebotanist.entity.custom.NetherSentryEntity;

public class NetherSentryModel<T extends NetherSentryEntity> extends SinglePartEntityModel<T> {
    private final ModelPart nether_sentry;
    public NetherSentryModel(ModelPart root) {
        this.nether_sentry = root.getChild("nether_sentry");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData nether_sentry = modelPartData.addChild("nether_sentry", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData blue_mushroom2 = nether_sentry.addChild("blue_mushroom2", ModelPartBuilder.create().uv(86, 43).cuboid(0.0F, -8.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -11.0F, 7.0F, -0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r1 = blue_mushroom2.addChild("cube_r1", ModelPartBuilder.create().uv(86, 43).cuboid(0.0F, -8.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        ModelPartData blue_mushroom = nether_sentry.addChild("blue_mushroom", ModelPartBuilder.create().uv(86, 43).cuboid(-0.3875F, -16.0529F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(8.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.5672F));

        ModelPartData cube_r2 = blue_mushroom.addChild("cube_r2", ModelPartBuilder.create().uv(86, 43).cuboid(0.0F, -8.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-0.3875F, -8.0529F, 0.0F, 0.0F, -1.5708F, 0.0F));

        ModelPartData red_mushroom2 = nether_sentry.addChild("red_mushroom2", ModelPartBuilder.create().uv(88, -15).cuboid(0.4982F, -16.2311F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 0.0F, -7.0F, 0.0F, 0.0F, -0.3054F));

        ModelPartData cube_r3 = red_mushroom2.addChild("cube_r3", ModelPartBuilder.create().uv(88, -15).cuboid(0.0F, -8.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.4982F, -8.2311F, 0.0F, 0.0F, -1.5708F, 0.0F));

        ModelPartData red_mushroom = nether_sentry.addChild("red_mushroom", ModelPartBuilder.create().uv(88, -15).cuboid(0.349F, -15.9924F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-4.2194F, -18.8861F, -4.0F, 0.0F, 0.0F, -0.0436F));

        ModelPartData cube_r4 = red_mushroom.addChild("cube_r4", ModelPartBuilder.create().uv(88, -15).cuboid(0.0F, -8.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.349F, -7.9924F, 0.0F, 0.0F, -1.5708F, 0.0F));

        ModelPartData right_leg = nether_sentry.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-4.0F, -14.0F, 0.0F));

        ModelPartData right_leg_r1 = right_leg.addChild("right_leg_r1", ModelPartBuilder.create().uv(0, 48).cuboid(-4.5F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 14.0F, 0.0F, -1.5708F, 0.4363F, 0.0F));

        ModelPartData left_leg = nether_sentry.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(-4.0F, -14.0F, 0.0F));

        ModelPartData left_leg_r1 = left_leg.addChild("left_leg_r1", ModelPartBuilder.create().uv(48, 48).cuboid(0.5F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 14.0F, 0.0F, -1.5708F, -0.4363F, 0.0F));

        ModelPartData right_arm = nether_sentry.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-4.0F, -14.0F, 0.0F));

        ModelPartData right_arm_r1 = right_arm.addChild("right_arm_r1", ModelPartBuilder.create().uv(56, 15).cuboid(-4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

        ModelPartData left_arm = nether_sentry.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(4.0F, -14.0F, 0.0F));

        ModelPartData left_arm_r1 = left_arm.addChild("left_arm_r1", ModelPartBuilder.create().uv(60, 31).cuboid(0.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

        ModelPartData body = nether_sentry.addChild("body", ModelPartBuilder.create().uv(36, 32).cuboid(-4.0F, -14.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
                .uv(100, 27).cuboid(-4.0F, -11.0F, -6.0F, 8.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData head = nether_sentry.addChild("head", ModelPartBuilder.create().uv(0, 32).cuboid(-4.9792F, -5.3939F, -1.75F, 10.0F, 8.0F, 8.0F, new Dilation(0.0F))
                .uv(60, 47).cuboid(-1.9792F, -1.3939F, -2.75F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 16).cuboid(2.0208F, 0.6061F, -2.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 16).cuboid(-2.9792F, 0.6061F, -2.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0208F, -14.6061F, -3.25F, 0.3927F, 0.0F, 0.0F));

        ModelPartData right_ear_r1 = head.addChild("right_ear_r1", ModelPartBuilder.create().uv(45, 0).cuboid(-0.5F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.9792F, -3.3939F, 2.25F, 0.0F, 0.0F, 0.5236F));

        ModelPartData left_ear_r1 = head.addChild("left_ear_r1", ModelPartBuilder.create().uv(57, 0).cuboid(-0.5F, -0.25F, -2.0F, 1.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(5.0208F, -3.1439F, 2.25F, 0.0F, 0.0F, -0.5236F));
        return TexturedModelData.of(modelData, 128, 128);
    }



    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        nether_sentry.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return nether_sentry;
    }


    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

        this.updateAnimation(entity.idleAnimationState, ModAnimations.NETHER_SENTRY_IDLE, animationProgress,1f);
    }
}

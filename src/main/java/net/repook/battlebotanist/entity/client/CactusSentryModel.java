package net.repook.battlebotanist.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.repook.battlebotanist.entity.custom.CactusSentryEntity;

public class CactusSentryModel<T extends CactusSentryEntity> extends SinglePartEntityModel<T> {
    private final ModelPart body;

    public CactusSentryModel(ModelPart root) {
        this.body = root.getChild("body");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-7.0F, -15.0F, -7.0F, 14.0F, 14.0F, 14.0F, new Dilation(0.0F))
                .uv(0, 28).cuboid(-6.0F, -1.0F, -6.0F, 12.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData mouth = body.addChild("mouth", ModelPartBuilder.create().uv(36, 34).cuboid(-1.5F, -7.0F, -12.0F, 3.0F, 1.0F, 5.0F, new Dilation(0.0F))
                .uv(0, 28).cuboid(-1.5F, -6.0F, -12.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
                .uv(0, 7).cuboid(0.5F, -6.0F, -12.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
                .uv(36, 28).cuboid(-1.5F, -5.0F, -12.0F, 3.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, 0.0F));

        ModelPartData spikes1 = body.addChild("spikes1", ModelPartBuilder.create().uv(10, 34).cuboid(-8.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 36).cuboid(-8.0F, -3.0F, 5.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(2, 36).cuboid(-8.0F, -8.0F, 5.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(4, 36).cuboid(-8.0F, -13.0F, 5.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(6, 36).cuboid(-8.0F, -8.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(8, 36).cuboid(-8.0F, -13.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(10, 36).cuboid(-8.0F, -13.0F, -3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(36, 28).cuboid(-8.0F, -8.0F, -3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(4, 34).cuboid(-8.0F, -3.0F, -3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -1.0F));

        ModelPartData spikes2 = body.addChild("spikes2", ModelPartBuilder.create().uv(36, 30).cuboid(-8.0F, -13.0F, -3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(36, 34).cuboid(-8.0F, -13.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(36, 36).cuboid(-8.0F, -13.0F, 5.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 38).cuboid(-8.0F, -3.0F, 5.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(2, 38).cuboid(-8.0F, -8.0F, 5.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(4, 38).cuboid(-8.0F, -8.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(8, 34).cuboid(-8.0F, -8.0F, -3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(6, 38).cuboid(-8.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(6, 34).cuboid(-8.0F, -3.0F, -3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(15.0F, -1.0F, -1.0F));

        ModelPartData spikes3 = body.addChild("spikes3", ModelPartBuilder.create().uv(2, 34).cuboid(-8.0F, -13.0F, -3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 34).cuboid(-8.0F, -13.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(9, 30).cuboid(-8.0F, -13.0F, 5.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(7, 30).cuboid(-8.0F, -3.0F, 5.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(2, 30).cuboid(-8.0F, -8.0F, 5.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 30).cuboid(-8.0F, -8.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(9, 28).cuboid(-8.0F, -8.0F, -3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(7, 28).cuboid(-8.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(2, 28).cuboid(-8.0F, -3.0F, -3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData corner_spikes = body.addChild("corner_spikes", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData cube_r1 = corner_spikes.addChild("cube_r1", ModelPartBuilder.create().uv(2, 9).cuboid(-20.75F, -11.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(9, 0).cuboid(-20.75F, -6.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 9).cuboid(-20.75F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(9, 2).cuboid(0.0F, -11.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(7, 9).cuboid(0.0F, -6.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(9, 9).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, -3.0F, -7.0F, 0.0F, 0.7854F, 0.0F));

        ModelPartData cube_r2 = corner_spikes.addChild("cube_r2", ModelPartBuilder.create().uv(11, 7).cuboid(-20.75F, 9.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(11, 2).cuboid(-20.75F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(11, 0).cuboid(-20.75F, 4.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(11, 9).cuboid(0.0F, 9.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(12, 11).cuboid(0.0F, 4.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 28).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, -13.0F, 7.0F, 0.0F, -0.7854F, 0.0F));

        ModelPartData top_spikes = body.addChild("top_spikes", ModelPartBuilder.create().uv(7, 8).cuboid(4.0F, -16.0F, -4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 8).cuboid(4.0F, -16.0F, 0.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 3).cuboid(-1.0F, -16.0F, 4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 4).cuboid(-1.0F, -16.0F, -4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 7).cuboid(-1.0F, -16.0F, 0.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-6.0F, -16.0F, 4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 1).cuboid(-6.0F, -16.0F, -4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 2).cuboid(-6.0F, -16.0F, 0.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(7, 7).cuboid(4.0F, -16.0F, 4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(CactusSentryEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return body;
    }
}

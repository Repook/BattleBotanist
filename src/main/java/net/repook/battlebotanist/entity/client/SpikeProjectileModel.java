package net.repook.battlebotanist.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class SpikeProjectileModel extends EntityModel<Entity> {
    private final ModelPart spike;
    public SpikeProjectileModel(ModelPart root) {
        this.spike = root.getChild("spike");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData spike = modelPartData.addChild("spike", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(3, 7).cuboid(1.0F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(6, 0).cuboid(-2.0F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 3).cuboid(0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
                .uv(4, 3).cuboid(0.0F, -2.0F, -4.0F, 0.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(6, 2).cuboid(0.0F, -1.0F, -5.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
        return TexturedModelData.of(modelData, 16, 16);
    }
    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        spike.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }
}
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
        ModelPartData spike = modelPartData.addChild("spike", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
                .uv(2, 7).cuboid(1.0F, -4.0F, 0.0F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 7).cuboid(-2.0F, -4.0F, 0.0F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData cube_r1 = spike.addChild("cube_r1", ModelPartBuilder.create().uv(0, 6).cuboid(-1.0F, -4.0F, 0.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 5).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -2.2689F, 0.0F));

        ModelPartData cube_r2 = spike.addChild("cube_r2", ModelPartBuilder.create().uv(4, 5).cuboid(-1.0F, -4.0F, 0.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(6, 0).cuboid(-1.0F, -8.0F, 0.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        ModelPartData cube_r3 = spike.addChild("cube_r3", ModelPartBuilder.create().uv(4, 6).cuboid(1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(6, 6).cuboid(-2.0F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
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
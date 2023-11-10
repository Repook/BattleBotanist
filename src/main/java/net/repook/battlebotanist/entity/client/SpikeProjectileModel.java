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
            ModelPartData spike = modelPartData.addChild("spike", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

            ModelPartData spike_1 = spike.addChild("spike_1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -14.0F, 0.0F));

            ModelPartData cube_r1 = spike_1.addChild("cube_r1", ModelPartBuilder.create().uv(2, 7).cuboid(0.0F, -1.0F, 1.5F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
                    .uv(8, 0).cuboid(0.0F, -1.0F, -2.5F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
                    .uv(6, 0).cuboid(0.0F, -3.0F, -1.5F, 0.0F, 5.0F, 1.0F, new Dilation(0.0F))
                    .uv(6, 5).cuboid(0.0F, -3.0F, 0.5F, 0.0F, 5.0F, 1.0F, new Dilation(0.0F))
                    .uv(2, 0).cuboid(0.0F, -5.0F, -0.5F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 11.5F, 0.0F, 1.5708F, 0.0F, 0.0F));

            ModelPartData spike_2 = spike.addChild("spike_2", ModelPartBuilder.create(), ModelTransform.of(0.0F, -14.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

            ModelPartData cube_r2 = spike_2.addChild("cube_r2", ModelPartBuilder.create().uv(0, 7).cuboid(-11.5F, -1.0F, 1.5F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
                    .uv(8, 3).cuboid(-11.5F, -1.0F, -2.5F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
                    .uv(4, 0).cuboid(-11.5F, -3.0F, -1.5F, 0.0F, 5.0F, 1.0F, new Dilation(0.0F))
                    .uv(4, 5).cuboid(-11.5F, -3.0F, 0.5F, 0.0F, 5.0F, 1.0F, new Dilation(0.0F))
                    .uv(0, 0).cuboid(-11.5F, -5.0F, -0.5F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
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

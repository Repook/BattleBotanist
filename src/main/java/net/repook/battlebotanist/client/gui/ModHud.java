package net.repook.battlebotanist.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.effect.ModEffects;

public class ModHud implements HudRenderCallback{
    private int scaledWidth;
    private int scaledHeight;
public static final Identifier MELON_OUTLINE = new Identifier("battlebotanist","textures/gui/melon_overlay.png");
    private PlayerInventory client;


    private void renderOverlay(DrawContext context, Identifier texture) {
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        context.setShaderColor(1.0f, 1.0f, 1.0f, 0.5f);
        context.drawTexture(texture, 0, 0, -90, 0.0f, 0.0f, this.scaledWidth, this.scaledHeight, this.scaledWidth, this.scaledHeight);
        RenderSystem.depthMask(true);
        RenderSystem.enableDepthTest();
        context.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
    }



    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {

        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player != null) {
            // Check if the player has the desired effect
            StatusEffect desiredEffect = ModEffects.MELON; // Replace with your actual effect
            StatusEffectInstance effectInstance = client.player.getStatusEffect(desiredEffect);

            // Render the overlay if the player has the effect
            if (effectInstance != null) {
                this.scaledWidth = drawContext.getScaledWindowWidth();
                this.scaledHeight = drawContext.getScaledWindowHeight();
                this.renderOverlay(drawContext, MELON_OUTLINE);
            }
        }
    }
}

package net.repook.battlebotanist.client.gui;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.util.Identifier;

public class ModHud extends InGameHud {
public static final Identifier MELON_OUTLINE = new Identifier("textures/entity/melon_overlay.png");
    @Override
    public void render(DrawContext context, float tickDelta) {


        super.render(context, tickDelta);
    }

    public ModHud(MinecraftClient client, ItemRenderer itemRenderer) {
        super(client, itemRenderer);
    }
}

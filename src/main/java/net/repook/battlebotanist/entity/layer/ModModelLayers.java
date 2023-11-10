package net.repook.battlebotanist.entity.layer;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.BattleBotanistMod;

public class ModModelLayers {
    public static final EntityModelLayer CACTUS_SENTRY =
            new EntityModelLayer(new Identifier(BattleBotanistMod.MOD_ID,"cactus_sentry"),"main");

    public static final EntityModelLayer NETHER_SENTRY =
            new EntityModelLayer(new Identifier(BattleBotanistMod.MOD_ID,"nether_sentry"),"main");
    public static final EntityModelLayer SEED_PROJECTILE =
            new EntityModelLayer(new Identifier(BattleBotanistMod.MOD_ID,"seed_projectile"),"main");

    public static final EntityModelLayer SPIKE_PROJECTILE =
            new EntityModelLayer(new Identifier(BattleBotanistMod.MOD_ID,"spike_projectile"),"main");
}

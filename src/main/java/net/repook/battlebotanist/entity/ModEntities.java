package net.repook.battlebotanist.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.BattleBotanistMod;
import net.repook.battlebotanist.entity.custom.*;

public class ModEntities {
    public static final EntityType<CactusSentryEntity> CACTUS_SENTRY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(BattleBotanistMod.MOD_ID, "cactus_sentry"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, CactusSentryEntity::new)
                    .dimensions(EntityDimensions.fixed(0.9f, 0.9f)).build());

    public static final EntityType<NetherSentryEntity> NETHER_SENTRY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(BattleBotanistMod.MOD_ID, "nether_sentry"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, NetherSentryEntity::new)
                    .dimensions(EntityDimensions.fixed(0.9f, 0.9f)).build());
    public static final EntityType<SoulFruitProjectileEntity> SOUL_FRUIT_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(BattleBotanistMod.MOD_ID, "soul_fruit_projectile"),
            FabricEntityTypeBuilder.<SoulFruitProjectileEntity>create(SpawnGroup.MISC, SoulFruitProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

    public static final EntityType<SeedProjectileEntity> SEED_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(BattleBotanistMod.MOD_ID, "seed_projectile"),
            FabricEntityTypeBuilder.<SeedProjectileEntity>create(SpawnGroup.MISC, SeedProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

    public static final EntityType<SpikeProjectileEntity> SPIKE_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(BattleBotanistMod.MOD_ID, "spike_projectile"),
            FabricEntityTypeBuilder.<SpikeProjectileEntity>create(SpawnGroup.MISC, SpikeProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());



    public static void registerModEntities(){
        BattleBotanistMod.LOGGER.info("Registering Mod Entities for " + BattleBotanistMod.MOD_ID);
    }
}

package net.repook.battlebotanist.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.repook.battlebotanist.entity.ModEntities;
import net.repook.battlebotanist.entity.custom.CactusSentryEntity;

public class ModRegistries {

    public static void registerModStuffs(){
        registerAttributes();
    }
    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.CACTUS_SENTRY, CactusSentryEntity.createCactusSentryAttributes());

        FabricDefaultAttributeRegistry.register(ModEntities.NETHER_SENTRY, CactusSentryEntity.createCactusSentryAttributes());
    }
}

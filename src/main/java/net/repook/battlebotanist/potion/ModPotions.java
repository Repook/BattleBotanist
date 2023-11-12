package net.repook.battlebotanist.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.BattleBotanistMod;
import net.repook.battlebotanist.effect.ModEffects;

public class ModPotions {


    public static final Potion MELON_JUICE = registerPotion("melon_juice",new Potion
            (new StatusEffectInstance(ModEffects.MELON,200,0)));

    private static Potion registerPotion(String name, Potion potion){
        return Registry.register(Registries.POTION, new Identifier(BattleBotanistMod.MOD_ID, name),potion);
    }

    public static void registerPotions(){
        BattleBotanistMod.LOGGER.info("Registering Potions for" + BattleBotanistMod.MOD_ID);
    }

}

package net.repook.battlebotanist.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.repook.battlebotanist.BattleBotanistMod;

public class ModEffects {


    public static final StatusEffect MELON = registerStatusEffect
            ("melon",new MelonEffect(StatusEffectCategory.NEUTRAL,0xf54260));

    private static StatusEffect registerStatusEffect(String name, StatusEffect statusEffect){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(BattleBotanistMod.MOD_ID, name), statusEffect);
    }



    public static void registerEffects(){
        BattleBotanistMod.LOGGER.info("Register Effects for " + BattleBotanistMod.MOD_ID);
    }
}

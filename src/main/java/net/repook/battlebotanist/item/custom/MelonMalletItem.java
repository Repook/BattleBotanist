package net.repook.battlebotanist.item.custom;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.repook.battlebotanist.effect.ModEffects;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MelonMalletItem extends SwordItem {

    private final float extraKnockback;
    public MelonMalletItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings, float extraKnockback) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.extraKnockback = extraKnockback;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean success = super.postHit(stack, target, attacker);

        target.addStatusEffect(new StatusEffectInstance(ModEffects.MELON,100,0));

            Vec3d attackerPos = attacker.getPos();
            Vec3d targetPos = target.getPos();
            Vec3d knockbackVec = targetPos.subtract(attackerPos).normalize().multiply(extraKnockback);

            double zKnockback = knockbackVec.z / 2;

            target.addVelocity(knockbackVec.x, extraKnockback, zKnockback);

        return success;
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.battlebotanist.melon_mallet.tooltip.shift"));
        } else{
            tooltip.add(Text.translatable("tooltip.battlebotanist.melon_mallet.tooltip"));
        }
    }
}

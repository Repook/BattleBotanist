package net.repook.battlebotanist.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.repook.battlebotanist.entity.custom.SeedProjectileEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class FloralFirearmItem extends Item {
    public FloralFirearmItem(Settings settings) {
        super(settings);
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemToCheck = new ItemStack(Items.GLOW_BERRIES);

        boolean hasItem = hasItemInInventory(user, itemToCheck);

        ItemStack itemstack = user.getStackInHand(hand);
        if (hasItem || user.getAbilities().creativeMode) {
            // Do something if the player has the item in their inventory

            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.NEUTRAL, 0.5f, 1F);
            user.getItemCooldownManager().set(this, 1);

            if (!world.isClient()) {
                SeedProjectileEntity seedProjectile = new SeedProjectileEntity(world, user);
                seedProjectile.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 0.25F);
                world.spawnEntity(seedProjectile);

                user.incrementStat(Stats.USED.getOrCreateStat(this));
                if (!user.getAbilities().creativeMode) {
                    itemstack.damage(1, user, p -> p.sendToolBreakStatus(hand));
                    //itemToCheck.decrement(1);
                    consumeItem(user, itemToCheck);
                }
            } else {
                world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_STONE_BREAK, SoundCategory.NEUTRAL, 1.5F, 1F);
            }


        }
        return TypedActionResult.success(itemstack, world.isClient());
    }

    private boolean hasItemInInventory(PlayerEntity player, ItemStack itemToCheck) {
        return player.getInventory().contains(itemToCheck);
    }
    private void consumeItem(PlayerEntity player, ItemStack itemToConsume) {
        for (int i = 0; i < player.getInventory().size(); ++i) {
            ItemStack itemstack = player.getInventory().getStack(i);
            if (itemstack.getItem() == itemToConsume.getItem()) {
                itemstack.decrement(1);
                break;
            }
}
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.battlebotanist.floral_firearm.tooltip.shift"));
        } else{
            tooltip.add(Text.translatable("tooltip.battlebotanist.floral_firearm.tooltip"));
        }
    }
}

    /*    public static final Predicate<ItemStack> AMMO = stack -> stack.isIn(ModTags.Items.FLORAL_FIREARM_AMMO_ITEMS);

    public FloralFirearmItem(Settings settings) {
        super(settings);
    }

    @Override
    public Predicate<ItemStack> getProjectiles() {
        return AMMO;
    }

    @Override
    public int getRange() {
        return 50;
    }*/




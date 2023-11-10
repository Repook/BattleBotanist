package net.repook.battlebotanist.block.custom;

import com.mojang.brigadier.Message;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.repook.battlebotanist.entity.ModEntities;
import net.repook.battlebotanist.item.ModItems;

public class MagicStickCropBlock extends CropBlock {


    public static final int MAX_AGE = 6;
    public static final IntProperty AGE = IntProperty.of("age", 0, 6);


    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.MAGIC_STICK_SEED;
    }

    public MagicStickCropBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0));
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
@Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        super.grow(world, random, pos, state);
        state = world.getBlockState(pos);
        if (!this.isMature(state)) return;
        MobEntity mobEntity = ModEntities.CACTUS_SENTRY.create(world);
        //System.out.println(mobEntity);
        if (mobEntity == null) return;
        //System.out.println("Working??");
        mobEntity.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 360.0F, 0.0F);
        world.spawnEntity(mobEntity);
        world.setBlockState(pos, Blocks.AIR.getDefaultState());
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.grow(world, random, pos, state);
        state = world.getBlockState(pos);
        if (!this.isMature(state)) return;
        MobEntity mobEntity = ModEntities.CACTUS_SENTRY.create(world);
        //System.out.println(mobEntity);
        if (mobEntity == null) return;
        //System.out.println("Working??");
        mobEntity.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 360.0F, 0.0F);
        world.spawnEntity(mobEntity);
        world.setBlockState(pos, Blocks.AIR.getDefaultState());
    }
}

/*
    @Override
    public void tick(World world, BlockPos pos, BlockState state, BlockEntity blockEntity) {

        int i = state.get(AGE);
    if (i >= 6 && !world.isClient && world.getBlockState(pos.up(2)).isAir()){
        EntityType<CactusSentryEntity> mobType = ModEntities.CACTUS_SENTRY;
        HostileEntity mobEntity = mobType.create(world);
        if (mobEntity != null) {

            mobEntity.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5, 360.0F, 0.0F);

            world.spawnEntity(mobEntity);

        }
}
    }*/




package net.repook.battlebotanist.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.repook.battlebotanist.entity.ModEntities;
import net.repook.battlebotanist.item.ModItems;

public class CactusSentryCropBlock extends CropBlock {

    public static final int MAX_AGE = 4;
    public static final IntProperty AGE = IntProperty.of("age",0,4);
    public CactusSentryCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.MAGIC_CACTUS_SEEDLING;
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
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.grow(world, random, pos, state);
        state = world.getBlockState(pos);
        if (!this.isMature(state)) return;
        MobEntity mobEntity = ModEntities.CACTUS_SENTRY.create(world);
        MobEntity mobEntity2 = ModEntities.CACTUS_SENTRY.create(world);
        MobEntity mobEntity3 = ModEntities.CACTUS_SENTRY.create(world);
        //System.out.println(mobEntity);
        if (mobEntity == null) return;
        //System.out.println("Working??");
        int cactus_size = random.nextInt(3);
        if(cactus_size == 0){
            mobEntity.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 360.0F, 0.0F);
            world.spawnEntity(mobEntity);
            world.setBlockState(pos, Blocks.AIR.getDefaultState());
        }
        if(cactus_size == 1){
            mobEntity.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 360.0F, 0.0F);
            assert mobEntity2 != null;
            mobEntity2.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, 360.0F, 0.0F);
            world.spawnEntity(mobEntity);
            world.spawnEntity(mobEntity2);
            world.setBlockState(pos, Blocks.AIR.getDefaultState());
        }
        if(cactus_size == 2){
            mobEntity.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 360.0F, 0.0F);
            assert mobEntity2 != null;
            mobEntity2.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, 360.0F, 0.0F);
            assert mobEntity3 != null;
            mobEntity3.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5, 360.0F, 0.0F);
            world.spawnEntity(mobEntity);
            world.spawnEntity(mobEntity2);
            world.spawnEntity(mobEntity3);
            world.setBlockState(pos, Blocks.AIR.getDefaultState());
        }

    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        super.grow(world, random, pos, state);
        state = world.getBlockState(pos);
        if (!this.isMature(state)) return;
        MobEntity mobEntity = ModEntities.CACTUS_SENTRY.create(world);
        MobEntity mobEntity2 = ModEntities.CACTUS_SENTRY.create(world);
        MobEntity mobEntity3 = ModEntities.CACTUS_SENTRY.create(world);
        //System.out.println(mobEntity);
        if (mobEntity == null) return;
        //System.out.println("Working??");
        int cactus_size = random.nextInt(3);
        if(cactus_size == 0){
            mobEntity.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 360.0F, 0.0F);
            world.spawnEntity(mobEntity);
            world.setBlockState(pos, Blocks.AIR.getDefaultState());
        }
        if(cactus_size == 1){
            mobEntity.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 360.0F, 0.0F);
            assert mobEntity2 != null;
            mobEntity2.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, 360.0F, 0.0F);
            world.spawnEntity(mobEntity);
            world.spawnEntity(mobEntity2);
            world.setBlockState(pos, Blocks.AIR.getDefaultState());
        }
        if(cactus_size == 2){
            mobEntity.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 360.0F, 0.0F);
            assert mobEntity2 != null;
            mobEntity2.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, 360.0F, 0.0F);
            assert mobEntity3 != null;
            mobEntity3.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5, 360.0F, 0.0F);
            world.spawnEntity(mobEntity);
            world.spawnEntity(mobEntity2);
            world.spawnEntity(mobEntity3);
            world.setBlockState(pos, Blocks.AIR.getDefaultState());
        }

    }
}

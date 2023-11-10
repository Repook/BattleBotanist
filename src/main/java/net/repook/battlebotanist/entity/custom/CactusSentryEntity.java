package net.repook.battlebotanist.entity.custom;



import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.RangedAttackMob;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.passive.LlamaEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;


public class CactusSentryEntity extends MobEntity implements RangedAttackMob {


    //public static final AnimationState idleAnimationState  = new AnimationState();
    //private int idleAnimationTimeout = 0;
    boolean spike;
    public CactusSentryEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public boolean isCollidable() {
        //change back to true when done
        return true;
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        if (source.isOf(DamageTypes.CACTUS)) {
            // Ignore damage from cacti and any other sources that are marked as "out of the world" (void) damage
            return false;
        }
        return super.damage(source, amount);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0,new SwimGoal(this));
        this.goalSelector.add(1,new LookAroundGoal(this));
        this.goalSelector.add(8, new LookAtEntityGoal(this, HostileEntity.class, 4.0F));
        this.targetSelector.add(7, new ActiveTargetGoal<>(this, HostileEntity.class, true));
        this.targetSelector.add(1, new ProjectileAttackGoal(this,1.25,40,20.0f));
        //this.goalSelector.add(3, this.projectileAttackGoal);
    }


    public static DefaultAttributeContainer.Builder createCactusSentryAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 30.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, -1)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,10000);

    }

    private void shootAt(LivingEntity target) {
        SpikeProjectileEntity spikeProjectileEntity = new SpikeProjectileEntity(this.getWorld(), this);
        double d = target.getX() - this.getX();
        double e = target.getBodyY(0.3333333333333333) - spikeProjectileEntity.getY();
        double f = target.getZ() - this.getZ();
        double g = Math.sqrt(d * d + f * f) * 0.20000000298023224;
        spikeProjectileEntity.setVelocity(d, e + g, f, 1.5F, 10.0F);
        if (!this.isSilent()) {
            this.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.ENTITY_LLAMA_SPIT, this.getSoundCategory(), 1.0F, 1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F);
        }

        this.getWorld().spawnEntity(spikeProjectileEntity);
        this.spike = true;
    }
    void setSpike(boolean spike) {
        this.spike = spike;
    }
    @Override
    public void attack(LivingEntity target, float pullProgress) {
        this.shootAt(target);
    }

    }


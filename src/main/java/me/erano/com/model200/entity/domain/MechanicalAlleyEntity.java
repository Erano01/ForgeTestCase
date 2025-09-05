package me.erano.com.model200.entity.domain;

//import net.minecraft.entity.EntityCreature; -> for passive mobs i believe
//import net.minecraft.entity.monster.EntityMob; -> for hostile mobs (can maybe create both types?)
//import net.minecraft.entity.passive.EntityAnimal; -> for animals
//import net.minecraft.entity.passive.EntityVillager; -> for villagers
//import net.minecraft.entity.player.EntityPlayer; -> for player


import net.minecraft.block.Block;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class MechanicalAlleyEntity extends EntityMob {
    public MechanicalAlleyEntity(World worldIn) {
        super(worldIn);
        this.setSize(1.0F, 2.0F);

        //AI Components -> look at net.minecraft.entity.ai.EntityAIBase
        //this.tasks.addTask(1, new EntityItemPickupEvent());
        this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 20.0F));
        this.tasks.addTask(2, new EntityAIMoveIndoors(this));
    }

    //AI Behaviours - the methods

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(35.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);

        //this.getAttributeMap().registerAttribute("some field declerad in this class").setBaseValue(0.0D);
        //double zombieSpawnChance = this.rand.nextDouble() * (ForgeModContainer.zombieSummonBaseChance);
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.getDataWatcher().addObject(12, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(13, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(14, Byte.valueOf((byte)0));
    }

    @Override
    protected String getLivingSound() {
        return "mob.irongolem.say";
    }

    @Override
    protected String getHurtSound() {
        return "mob.irongolem.hurt";
    }

    @Override
    protected String getDeathSound() {
        return "mob.irongolem.death";
    }

    @Override
    protected void playStepSound(BlockPos pos, Block blockIn) {
        super.playStepSound(pos, blockIn);
    }

    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEAD;
    }

    @Override
    public void onLivingUpdate() {
        // Burning in sunlight
        /*if (this.worldObj.isDaytime() && this.worldObj.isRemote) {
            float f = this.getBrightness(1.0F);
            BlockPos blockpos = new BlockPos(this.posX, (double)Math.round(this.posY), this.posZ);
            if (f > 0.5F && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F && this.worldObj.canSeeSky(blockpos)) {
                boolean flag = true;
                ItemStack itemStack = this.getEquipmentInSlot(4);

                if(itemStack != null){
                    if(itemStack.isItemStackDamageable()) {
                        itemStack.setItemDamage(itemStack.getItemDamage() + this.rand.nextInt(2));
                        if(itemStack.getItemDamage() >= itemStack.getMaxDamage()){
                            this.renderBrokenItemStack(itemStack);
                            this.setCurrentItemOrArmor(4, (ItemStack)null);
                        }
                    }
                    flag = false;
                }
                if (flag) {
                    this.setFire(8);
                }
            }
        }*/
        super.onLivingUpdate();
    }

    @Override
    protected Item getDropItem() {
        return Items.iron_ingot;
    }

    @Override
    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
        super.dropFewItems(p_70628_1_, p_70628_2_);
        this.dropItem(Items.iron_ingot, rand.nextInt() * p_70628_2_);
    }



}

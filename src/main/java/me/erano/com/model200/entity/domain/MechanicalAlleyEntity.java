package me.erano.com.model200.entity.domain;

//import net.minecraft.entity.EntityCreature; -> for passive mobs i believe
//import net.minecraft.entity.monster.EntityMob; -> for hostile mobs
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class MechanicalAlleyEntity extends EntityMob {
    public MechanicalAlleyEntity(World worldIn) {
        super(worldIn);
        this.setSize(1.0F, 2.0F); // Genişlik/Yükseklik
    }

    // AI ve davranışlar burada eklenir
}

package me.erano.com.model200.entity.domain;

import net.minecraft.entity.EntityCreature;
import net.minecraft.world.World;

public class MechanicalAlleyEntity extends EntityCreature {
    public MechanicalAlleyEntity(World worldIn) {
        super(worldIn);
        this.setSize(1.0F, 2.0F); // Genişlik/Yükseklik
    }

    // AI ve davranışlar burada eklenir
}

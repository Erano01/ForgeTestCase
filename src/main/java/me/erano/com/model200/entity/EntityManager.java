package me.erano.com.model200.entity;

import me.erano.com.model200.Application;
import me.erano.com.model200.entity.domain.MechanicalAlleyEntity;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.registry.EntityRegistry;


// look at net.minecraftforge.fml.common.registry.EntityRegistry;
public class EntityManager {
    private static int entityId = 0;

    public static void registerEntity(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
        EntityRegistry.registerModEntity(
                entityClass,
                entityName,
                entityId++,
                Application.instance,
                trackingRange,
                updateFrequency,
                sendsVelocityUpdates
        );
    }

    public static void registerEntities(){
        registerEntity(
                MechanicalAlleyEntity.class,
                "mechanical_alley",
                32,
                20,
                true
        );
    }

}

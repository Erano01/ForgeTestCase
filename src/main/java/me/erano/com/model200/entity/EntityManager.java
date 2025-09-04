package me.erano.com.model200.entity;

import me.erano.com.model200.Application;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.registry.EntityRegistry;


// look at net.minecraftforge.fml.common.registry.EntityRegistry;
public class EntityManager {
    private static int entityId = 0;

    public static void registerEntity(Class<? extends Entity> entityClass, String name) {
        EntityRegistry.registerModEntity(
                entityClass,
                name,
                entityId++,
                Application.instance, // modun ana instance'ı
                64,                   // takip mesafesi
                1,                    // update sıklığı
                true                  // velocity gönderilsin mi
        );
    }

}

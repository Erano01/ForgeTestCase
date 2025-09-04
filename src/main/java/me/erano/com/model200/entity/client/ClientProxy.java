package me.erano.com.model200.entity.client;

import me.erano.com.model200.entity.domain.MechanicalAlleyEntity;
import me.erano.com.model200.entity.render.MechanicalAlleyRenderer;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders() {
        RenderingRegistry.registerEntityRenderingHandler(MechanicalAlleyEntity.class, new MechanicalAlleyRenderer(Minecraft.getMinecraft().getRenderManager()));
    }
}

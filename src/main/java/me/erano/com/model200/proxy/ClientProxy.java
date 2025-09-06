package me.erano.com.model200.proxy;

import me.erano.com.model200.entity.domain.MechanicalAlleyEntity;
import me.erano.com.model200.entity.render.MechanicalAlleyRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import scala.collection.parallel.ParIterableLike;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders() {
        //deprecated way:
        //RenderingRegistry.registerEntityRenderingHandler(MechanicalAlleyEntity.class, new MechanicalAlleyRenderer(Minecraft.getMinecraft().getRenderManager()));

        //new way:
        RenderingRegistry.registerEntityRenderingHandler(MechanicalAlleyEntity.class, new IRenderFactory<MechanicalAlleyEntity>() {
            @Override
            public Render<? super MechanicalAlleyEntity> createRenderFor(RenderManager manager) {
                return new MechanicalAlleyRenderer(manager);
            }
        });
    }

    @Override
    public void registerEntityRenderers() {
        super.registerEntityRenderers();
        RenderingRegistry.<MechanicalAlleyEntity>registerEntityRenderingHandler(MechanicalAlleyEntity.class, new MechanicalAlleyRenderer(Minecraft.getMinecraft().getRenderManager()));
    }
}

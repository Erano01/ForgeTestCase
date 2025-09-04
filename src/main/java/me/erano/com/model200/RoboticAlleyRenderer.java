package me.erano.com.model200;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;

public class RoboticAlleyRenderer extends RenderLiving<EntitySheep> {

    public RoboticAlleyRenderer(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySheep entity) {
        return new ResourceLocation("model200:/entity/babysheep.png");
    }




}
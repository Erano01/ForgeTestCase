package me.erano.com.model200;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntitySheep;

public class SheepRenderer extends RenderLiving<EntitySheep> {
    public RenderBabySheep(RenderManager renderManager) {
        super();
        super(renderManager, new OBJModelWrapper("model200:models/entity/babysheep.json"), 0.7F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySheep entity) {
        return new ResourceLocation("model200:textures/entity/babysheep.png");
    }
}
package me.erano.com.model200.entity.render;
import me.erano.com.model200.entity.domain.MechanicalAlleyEntity;
import me.erano.com.model200.entity.model.MechanicalAlleyModel;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MechanicalAlleyRenderer extends RenderLiving<MechanicalAlleyEntity> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("model200:textures/models/entity/mechanical_alley.png");

    public MechanicalAlleyRenderer(RenderManager renderManager) {
        super(renderManager, new MechanicalAlleyModel(), 0.5F);
    }

    @Override
    protected void preRenderCallback(MechanicalAlleyEntity entitylivingbaseIn, float partialTickTime) {
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }

    @Override
    protected ResourceLocation getEntityTexture(MechanicalAlleyEntity entity) {
        return TEXTURE;
    }
}
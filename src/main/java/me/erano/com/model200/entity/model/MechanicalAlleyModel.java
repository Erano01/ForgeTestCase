package me.erano.com.model200.entity.model;// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MechanicalAlleyModel extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public MechanicalAlleyModel() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(8.0F, 24.0F, -8.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -15.0F, -22.0F, 5.0F, 8, 8, 8, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 55, -7.7F, -24.0F, 4.8F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 55, 6, -7.7F, -24.0F, 11.2F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 57, 0, -7.7F, -24.0F, 4.8F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 32, 55, -7.7F, -24.0F, 11.2F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 38, 23, -12.5F, -6.0F, 7.5F, 3, 2, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 51, 49, -12.0F, -27.0F, 8.0F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 27, 50, -11.5F, -26.0F, 8.5F, 1, 4, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 26, 37, -12.5F, -3.0F, 7.5F, 3, 3, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 17, -14.0F, -13.0F, 6.0F, 6, 6, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 38, 59, -8.8F, -20.5F, 6.5F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 59, 38, -8.8F, -20.5F, 10.5F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 25, 23, -12.5F, -12.5F, 1.45F, 3, 3, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 33, 49, -12.0F, -9.5F, 13.85F, 2, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 9, 50, -12.3F, -1.5F, 13.85F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 30, -12.8F, -4.5F, 13.35F, 3, 3, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 25, 23, -12.5F, -12.5F, 13.05F, 3, 3, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 30, -12.8F, -4.5F, 1.65F, 3, 3, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 33, 49, -12.0F, -9.5F, 2.15F, 2, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 9, 50, -12.3F, -1.5F, 2.15F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 25, 17, -13.0F, -17.5F, 7.0F, 4, 1, 4, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-11.0F, -5.2429F, 3.15F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 14, -1.75F, -1.75F, -1.125F, 3, 3, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-11.0F, -15.1173F, 9.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 29, -1.0F, 14.4368F, 0.7303F, 2, 2, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 50, -1.2F, 9.9594F, 11.5397F, 2, 2, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-11.0F, -15.1173F, 9.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3927F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 50, -1.2F, 9.9594F, -13.5397F, 2, 2, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 51, 29, -1.0F, 14.4368F, -2.7303F, 2, 2, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-11.0F, -5.2429F, 14.85F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 14, -1.75F, -1.75F, -1.125F, 3, 3, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-10.6456F, -19.3544F, 14.0F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 51, 53, -1.0F, -1.0F, -0.5F, 2, 2, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-10.7492F, -19.2508F, 4.25F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 46, 0, -2.0F, -1.8535F, -0.25F, 4, 4, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 51, 53, -1.0F, -1.1464F, -0.75F, 2, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-6.0F, -20.1173F, 9.0F);
		bone.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 0, -4.7455F, 2.1173F, 4.0F, 4, 4, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-11.0F, -26.1173F, 9.0F);
		bone.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 55, 3.3F, 2.1173F, -4.2F, 1, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-11.0F, -26.1173F, 9.0F);
		bone.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 55, 3.3F, 2.1173F, 2.2F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
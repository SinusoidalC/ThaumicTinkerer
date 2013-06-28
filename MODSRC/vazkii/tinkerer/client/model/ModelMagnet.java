/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the ThaumicTinkerer Mod.
 *
 * ThaumicTinkerer is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 *
 * ThaumicTinkerer is a Derivative Work on Thaumcraft 3.
 * Thaumcraft 3 � Azanor 2012
 * (http://www.minecraftforum.net/topic/1585216-)
 *
 * File Created @ [28 Jun 2013, 17:35:43 (GMT)]
 */
package vazkii.tinkerer.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import vazkii.tinkerer.lib.LibMisc;

public class ModelMagnet extends ModelBase {

	ModelRenderer panel;
	ModelRenderer magnet;
	ModelRenderer box1;
	ModelRenderer box2;
	ModelRenderer box3;
	ModelRenderer box4;
	ModelRenderer box5;

	public ModelMagnet() {
		textureWidth = 64;
		textureHeight = 64;

		panel = new ModelRenderer(this, 0, 0);
		panel.addBox(0F, 0F, 0F, 14, 2, 14);
		panel.setRotationPoint(-7F, 22F, -7F);
		panel.setTextureSize(64, 64);
		panel.mirror = true;
		setRotation(panel, 0F, 0F, 0F);
		magnet = new ModelRenderer(this, 0, 16);
		magnet.addBox(0F, 0F, 0F, 4, 13, 4);
		magnet.setRotationPoint(-2F, 9F, -2F);
		magnet.setTextureSize(64, 64);
		magnet.mirror = true;
		setRotation(magnet, 0F, 0F, 0F);
		box1.mirror = true;
		box1 = new ModelRenderer(this, 28, 19);
		box1.addBox(0F, -2F, 0F, 6, 14, 0);
		box1.setRotationPoint(3F, 10F, 3F);
		box1.setTextureSize(64, 64);
		box1.mirror = true;
		setRotation(box1, 0F, 1.570796F, 0F);
		box1.mirror = false;
		box2.mirror = true;
		box2 = new ModelRenderer(this, 28, 33);
		box2.addBox(0F, 0F, 0F, 6, 14, 0);
		box2.setRotationPoint(-3F, 8F, -3F);
		box2.setTextureSize(64, 64);
		box2.mirror = true;
		setRotation(box2, 0F, -1.570796F, 0F);
		box2.mirror = false;
		box3.mirror = true;
		box3 = new ModelRenderer(this, 40, 19);
		box3.addBox(0F, 0F, 0F, 6, 14, 0);
		box3.setRotationPoint(-3F, 8F, 3F);
		box3.setTextureSize(64, 64);
		box3.mirror = true;
		setRotation(box3, 0F, 0F, 0F);
		box3.mirror = false;
		box4.mirror = true;
		box4 = new ModelRenderer(this, 40, 33);
		box4.addBox(0F, 0F, 0F, 6, 14, 0);
		box4.setRotationPoint(-3F, 8F, -3F);
		box4.setTextureSize(64, 64);
		box4.mirror = true;
		setRotation(box4, 0F, 0F, 0F);
		box4.mirror = false;
		box5.mirror = true;
		box5 = new ModelRenderer(this, 28, 49);
		box5.addBox(0F, 0F, 0F, 6, 0, 6);
		box5.setRotationPoint(-3F, 8F, -3F);
		box5.setTextureSize(64, 64);
		box5.mirror = true;
		setRotation(box5, 0F, 0F, 0F);
		box5.mirror = false;
	}

	public void render() {
		panel.render(LibMisc.MODEL_DEFAULT_RENDER_SCALE);
		magnet.render(LibMisc.MODEL_DEFAULT_RENDER_SCALE);
		box1.render(LibMisc.MODEL_DEFAULT_RENDER_SCALE);
		box2.render(LibMisc.MODEL_DEFAULT_RENDER_SCALE);
		box3.render(LibMisc.MODEL_DEFAULT_RENDER_SCALE);
		box4.render(LibMisc.MODEL_DEFAULT_RENDER_SCALE);
		box5.render(LibMisc.MODEL_DEFAULT_RENDER_SCALE);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
// Date: 2/4/2013 2:38:10 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.entities.pixelmon.EntityPixelmon;
import pixelmon.client.models.animations.Bird.SkeletonBird;

public class ModelAerodactyl extends PixelmonModelBase {
	// fields
	ModelRenderer Body;
	ModelRenderer LeftWing;
	ModelRenderer RightWing;

	public ModelAerodactyl() {
		textureWidth = 512;
		textureHeight = 64;

		Body = new ModelRenderer(this, "Body");
		Body.setRotationPoint(0, 0, 0);
		ModelRenderer Torso = new ModelRenderer(this, 124, 0);
		Torso.addBox(-5F, 0F, 0F, 10, 19, 9);
		Torso.setTextureSize(512, 64);
		Torso.mirror = true;
		setRotation(Torso, 1.22173F, 0F, 0F);
		Body.addChild(Torso);
		ModelRenderer Back_Spike = new ModelRenderer(this, 162, 0);
		Back_Spike.addBox(-2F, 4F, 10F, 4, 6, 3);
		Back_Spike.setTextureSize(512, 64);
		Back_Spike.mirror = true;
		setRotation(Back_Spike, 0.9599311F, 0F, 0F);
		Body.addChild(Back_Spike);
		ModelRenderer Back_Spike_2 = new ModelRenderer(this, 165, 9);
		Back_Spike_2.addBox(-1F, 1F, 13F, 2, 1, 2);
		Back_Spike_2.setTextureSize(512, 64);
		Back_Spike_2.mirror = true;
		setRotation(Back_Spike_2, 0.7853982F, 0F, 0F);
		Body.addChild(Back_Spike_2);
		ModelRenderer Back_Spike_3 = new ModelRenderer(this, 162, 12);
		Back_Spike_3.addBox(-2F, 8F, 3F, 4, 6, 2);
		Back_Spike_3.setTextureSize(512, 64);
		Back_Spike_3.mirror = true;
		setRotation(Back_Spike_3, 1.919862F, 0F, 0F);
		Body.addChild(Back_Spike_3);
		ModelRenderer Stomach_Helper_2 = new ModelRenderer(this, 124, 28);
		Stomach_Helper_2.addBox(-4F, 14F, -8F, 8, 2, 1);
		Stomach_Helper_2.setTextureSize(512, 64);
		Stomach_Helper_2.mirror = true;
		setRotation(Stomach_Helper_2, 1.745329F, 0F, 0F);
		Body.addChild(Stomach_Helper_2);
		ModelRenderer Stomach_Rounder = new ModelRenderer(this, 124, 31);
		Stomach_Rounder.addBox(-4F, 5F, 0F, 8, 12, 1);
		Stomach_Rounder.setTextureSize(512, 64);
		Stomach_Rounder.mirror = true;
		setRotation(Stomach_Rounder, 1.22173F, 0F, 0F);
		Body.addChild(Stomach_Rounder);
		ModelRenderer Stomach_Helper = new ModelRenderer(this, 124, 44);
		Stomach_Helper.addBox(-4F, 3F, 2F, 8, 2, 1);
		Stomach_Helper.setTextureSize(512, 64);
		Stomach_Helper.mirror = true;
		setRotation(Stomach_Helper, 0.8203047F, 0F, 0F);
		Body.addChild(Stomach_Helper);
		ModelRenderer Side_Rounder = new ModelRenderer(this, 142, 28);
		Side_Rounder.addBox(-6F, 3F, 4F, 12, 13, 3);
		Side_Rounder.setTextureSize(512, 64);
		Side_Rounder.mirror = true;
		setRotation(Side_Rounder, 1.22173F, 0F, 0F);
		Body.addChild(Side_Rounder);

		ModelRenderer Head = new ModelRenderer(this, "Head");
		Head.setRotationPoint(0, -6, 3);
		ModelRenderer Lower_Lip = new ModelRenderer(this, 50, 61);
		Lower_Lip.addBox(-3F, -5F, -16F, 6, 2, 1);
		Lower_Lip.setTextureSize(512, 64);
		Lower_Lip.mirror = true;
		setRotation(Lower_Lip, 0.5235988F, 0F, 0F);
		Head.addChild(Lower_Lip);
		ModelRenderer Bottom_Mouth = new ModelRenderer(this, 40, 48);
		Bottom_Mouth.addBox(-3F, -4F, -16F, 6, 2, 11);
		Bottom_Mouth.setTextureSize(512, 64);
		Bottom_Mouth.mirror = true;
		setRotation(Bottom_Mouth, 0.4886922F, 0F, 0F);
		Head.addChild(Bottom_Mouth);
		ModelRenderer Chin = new ModelRenderer(this, 48, 40);
		Chin.addBox(-2F, -2F, -11F, 4, 2, 6);
		Chin.setTextureSize(512, 64);
		Chin.mirror = true;
		setRotation(Chin, 0.3316126F, 0F, 0F);
		Head.addChild(Chin);
		ModelRenderer Mouth_Back = new ModelRenderer(this, 52, 34);
		Mouth_Back.addBox(-2F, -2F, -9F, 4, 5, 1);
		Mouth_Back.setTextureSize(512, 64);
		Mouth_Back.mirror = true;
		setRotation(Mouth_Back, -0.0872665F, 0F, 0F);
		Head.addChild(Mouth_Back);
		ModelRenderer Side_Lip = new ModelRenderer(this, 24, 40);
		Side_Lip.addBox(5F, -3F, 2F, 11, 2, 1);
		Side_Lip.setTextureSize(512, 64);
		Side_Lip.mirror = true;
		setRotation(Side_Lip, 0F, 1.570796F, 0.418879F);
		Head.addChild(Side_Lip);
		ModelRenderer Side_Lip_2 = new ModelRenderer(this, 68, 40);
		Side_Lip_2.addBox(5F, -3F, -3F, 11, 2, 1);
		Side_Lip_2.setTextureSize(512, 64);
		Side_Lip_2.mirror = true;
		setRotation(Side_Lip_2, 0F, 1.58825F, 0.4014257F);
		Head.addChild(Side_Lip_2);
		ModelRenderer Tongue = new ModelRenderer(this, 6, 0);
		Tongue.addBox(-1F, -4.2F, -14F, 2, 1, 6);
		Tongue.setTextureSize(512, 64);
		Tongue.mirror = true;
		setRotation(Tongue, 0.4886922F, 0F, 0F);
		Head.addChild(Tongue);
		ModelRenderer Tongue2 = new ModelRenderer(this, 6, 0);
		Tongue2.addBox(-0.5F, -4.2F, -14.46667F, 1, 1, 2);
		Tongue2.setTextureSize(512, 64);
		Tongue2.mirror = true;
		setRotation(Tongue2, 0.4886922F, 0F, 0F);
		Head.addChild(Tongue2);
		ModelRenderer Tooth_L1 = new ModelRenderer(this, 46, 43);
		Tooth_L1.addBox(-2F, 1F, -11F, 0, 1, 1);
		Tooth_L1.setTextureSize(512, 64);
		Tooth_L1.mirror = true;
		setRotation(Tooth_L1, -0.0174533F, 0F, 0F);
		Head.addChild(Tooth_L1);
		ModelRenderer Tooth_L2 = new ModelRenderer(this, 44, 43);
		Tooth_L2.addBox(-2F, 2F, -11F, 0, 1, 1);
		Tooth_L2.setTextureSize(512, 64);
		Tooth_L2.mirror = true;
		setRotation(Tooth_L2, -0.0698132F, 0F, 0F);
		Head.addChild(Tooth_L2);
		ModelRenderer Tooth_L3 = new ModelRenderer(this, 42, 43);
		Tooth_L3.addBox(-2F, 4F, -12F, 0, 1, 1);
		Tooth_L3.setTextureSize(512, 64);
		Tooth_L3.mirror = true;
		setRotation(Tooth_L3, -0.1919862F, 0F, 0F);
		Head.addChild(Tooth_L3);
		ModelRenderer Tooth_L4 = new ModelRenderer(this, 40, 43);
		Tooth_L4.addBox(-2F, 0.5F, -12F, 0, 1, 1);
		Tooth_L4.setTextureSize(512, 64);
		Tooth_L4.mirror = true;
		setRotation(Tooth_L4, 0.0698132F, 0F, 0F);
		Head.addChild(Tooth_L4);
		ModelRenderer Tooth_L5 = new ModelRenderer(this, 38, 43);
		Tooth_L5.addBox(-2F, 3.5F, -13F, 0, 1, 1);
		Tooth_L5.setTextureSize(512, 64);
		Tooth_L5.mirror = true;
		setRotation(Tooth_L5, -0.122173F, -0.0174533F, 0F);
		Head.addChild(Tooth_L5);
		ModelRenderer Tooth_L6 = new ModelRenderer(this, 36, 43);
		Tooth_L6.addBox(-2F, 5F, -14F, 0, 1, 1);
		Tooth_L6.setTextureSize(512, 64);
		Tooth_L6.mirror = true;
		setRotation(Tooth_L6, -0.1745329F, -0.0174533F, 0F);
		Head.addChild(Tooth_L6);
		ModelRenderer Tooth_L7 = new ModelRenderer(this, 34, 43);
		Tooth_L7.addBox(-2F, 4.5F, -15F, 0, 1, 1);
		Tooth_L7.setTextureSize(512, 64);
		Tooth_L7.mirror = true;
		setRotation(Tooth_L7, -0.1047198F, -0.0523599F, 0F);
		Head.addChild(Tooth_L7);
		ModelRenderer Tooth_R1 = new ModelRenderer(this, 68, 43);
		Tooth_R1.addBox(2F, 1F, -11F, 0, 1, 1);
		Tooth_R1.setTextureSize(512, 64);
		Tooth_R1.mirror = true;
		setRotation(Tooth_R1, -0.0174533F, 0F, 0F);
		Head.addChild(Tooth_R1);
		ModelRenderer Tooth_R4 = new ModelRenderer(this, 70, 43);
		Tooth_R4.addBox(2F, 1F, -13F, 0, 1, 1);
		Tooth_R4.setTextureSize(512, 64);
		Tooth_R4.mirror = true;
		setRotation(Tooth_R4, 0.0698132F, 0F, 0F);
		Head.addChild(Tooth_R4);
		ModelRenderer Tooth_R2 = new ModelRenderer(this, 72, 43);
		Tooth_R2.addBox(2F, 2F, -12F, 0, 1, 1);
		Tooth_R2.setTextureSize(512, 64);
		Tooth_R2.mirror = true;
		setRotation(Tooth_R2, -0.0698132F, 0F, 0F);
		Head.addChild(Tooth_R2);
		ModelRenderer Tooth_R3 = new ModelRenderer(this, 74, 43);
		Tooth_R3.addBox(2F, 4F, -12F, 0, 1, 1);
		Tooth_R3.setTextureSize(512, 64);
		Tooth_R3.mirror = true;
		setRotation(Tooth_R3, -0.1919862F, 0F, 0F);
		Head.addChild(Tooth_R3);
		ModelRenderer Tooth_R5 = new ModelRenderer(this, 76, 43);
		Tooth_R5.addBox(2F, 3.7F, -13.2F, 0, 1, 1);
		Tooth_R5.setTextureSize(512, 64);
		Tooth_R5.mirror = true;
		setRotation(Tooth_R5, -0.122173F, 0.0174533F, 0F);
		Head.addChild(Tooth_R5);
		ModelRenderer Tooth_R6 = new ModelRenderer(this, 78, 43);
		Tooth_R6.addBox(2F, 5F, -14F, 0, 1, 1);
		Tooth_R6.setTextureSize(512, 64);
		Tooth_R6.mirror = true;
		setRotation(Tooth_R6, -0.1745329F, 0.0174533F, 0F);
		Head.addChild(Tooth_R6);
		ModelRenderer Tooth_R7 = new ModelRenderer(this, 80, 43);
		Tooth_R7.addBox(2F, 4.5F, -15F, 0, 1, 1);
		Tooth_R7.setTextureSize(512, 64);
		Tooth_R7.mirror = true;
		setRotation(Tooth_R7, -0.1047198F, 0.0523599F, 0F);
		Head.addChild(Tooth_R7);
		ModelRenderer Horn_1 = new ModelRenderer(this, 64, 0);
		Horn_1.addBox(-5F, -5F, -8F, 1, 6, 1);
		Horn_1.setTextureSize(512, 64);
		Horn_1.mirror = true;
		setRotation(Horn_1, -0.9599311F, -0.4363323F, 0F);
		Head.addChild(Horn_1);
		ModelRenderer Horn_2 = new ModelRenderer(this, 46, 0);
		Horn_2.addBox(4F, -5F, -8F, 1, 6, 1);
		Horn_2.setTextureSize(512, 64);
		Horn_2.mirror = true;
		setRotation(Horn_2, -0.9599311F, 0.4363323F, 0F);
		Head.addChild(Horn_2);
		ModelRenderer Lower_Skull = new ModelRenderer(this, 47, 10);
		Lower_Skull.addBox(-3F, 3F, -4F, 6, 7, 4);
		Lower_Skull.setTextureSize(512, 64);
		Lower_Skull.mirror = true;
		setRotation(Lower_Skull, -1.832596F, 0F, 0F);
		Head.addChild(Lower_Skull);
		ModelRenderer Upper_Skull = new ModelRenderer(this, 50, 0);
		Upper_Skull.addBox(-2F, 3F, -6F, 4, 7, 3);
		Upper_Skull.setTextureSize(512, 64);
		Upper_Skull.mirror = true;
		setRotation(Upper_Skull, -1.53589F, 0F, 0F);
		Head.addChild(Upper_Skull);
		ModelRenderer Eyebrow_R = new ModelRenderer(this, 0, 0);
		Eyebrow_R.addBox(-3.1F, -6F, -8F, 1, 1, 2);
		Eyebrow_R.setTextureSize(512, 64);
		Eyebrow_R.mirror = true;
		setRotation(Eyebrow_R, 0.0523599F, 0F, 0F);
		Head.addChild(Eyebrow_R);
		ModelRenderer Eyebrow_L = new ModelRenderer(this, 0, 0);
		Eyebrow_L.addBox(2.1F, -6F, -8F, 1, 1, 2);
		Eyebrow_L.setTextureSize(512, 64);
		Eyebrow_L.mirror = true;
		setRotation(Eyebrow_L, 0.0523599F, 0F, 0F);
		Head.addChild(Eyebrow_L);
		ModelRenderer Upper_Lip = new ModelRenderer(this, 42, 21);
		Upper_Lip.addBox(-2F, 1F, -17F, 4, 2, 11);
		Upper_Lip.setTextureSize(512, 64);
		Upper_Lip.mirror = true;
		setRotation(Upper_Lip, -0.4014257F, 0F, 0F);
		Head.addChild(Upper_Lip);
		ModelRenderer Snout = new ModelRenderer(this, 30, 30);
		Snout.addBox(-2F, 1F, -18F, 4, 2, 2);
		Snout.setTextureSize(512, 64);
		Snout.mirror = true;
		setRotation(Snout, -0.3665191F, 0F, 0F);
		Head.addChild(Snout);
		ModelRenderer Nose_Bridge = new ModelRenderer(this, 72, 22);
		Nose_Bridge.addBox(-1F, 0.5F, -17F, 2, 1, 11);
		Nose_Bridge.setTextureSize(512, 64);
		Nose_Bridge.mirror = true;
		setRotation(Nose_Bridge, -0.3839724F, 0F, 0F);
		Head.addChild(Nose_Bridge);
		ModelRenderer Lower_Neck = new ModelRenderer(this, 0, 14);
		Lower_Neck.addBox(-2F, 0F, -8F, 4, 3, 10);
		Lower_Neck.setTextureSize(512, 64);
		Lower_Neck.mirror = true;
		setRotation(Lower_Neck, -0.6806784F, 0F, 0F);
		Head.addChild(Lower_Neck);
		ModelRenderer Upper_Neck = new ModelRenderer(this, 0, 27);
		Upper_Neck.addBox(-2F, -1F, -8F, 4, 3, 10);
		Upper_Neck.setTextureSize(512, 64);
		Upper_Neck.mirror = true;
		setRotation(Upper_Neck, -0.296706F, 0F, 0F);
		Head.addChild(Upper_Neck);
		Body.addChild(Head);

		LeftWing = new ModelRenderer(this, "Left Wing");
		LeftWing.setRotationPoint(4, -8, 4);
		ModelRenderer First_Left_Wing_Bone = new ModelRenderer(this, 219, 23);
		First_Left_Wing_Bone.addBox(-1F, 0F, 0F, 1, 10, 1);
		First_Left_Wing_Bone.setTextureSize(512, 64);
		First_Left_Wing_Bone.mirror = true;
		setRotation(First_Left_Wing_Bone, 0.0349066F, 0F, -1.570796F);
		LeftWing.addChild(First_Left_Wing_Bone);
		ModelRenderer First_Left_Folds = new ModelRenderer(this, 178, 33);
		First_Left_Folds.addBox(-8F, 1F, 1F, 7, 0, 12);
		First_Left_Folds.setTextureSize(512, 64);
		First_Left_Folds.mirror = true;
		setRotation(First_Left_Folds, 0F, 1.570796F, 0F);
		LeftWing.addChild(First_Left_Folds);
		ModelRenderer Second_Left_Wing_Bone = new ModelRenderer(this, 224, 24);
		Second_Left_Wing_Bone.addBox(6.5F, 0F, -15.5F, 1, 1, 9);
		Second_Left_Wing_Bone.setTextureSize(512, 64);
		Second_Left_Wing_Bone.mirror = true;
		setRotation(Second_Left_Wing_Bone, 0F, -0.8726646F, 0F);
		LeftWing.addChild(Second_Left_Wing_Bone);
		ModelRenderer Second_Left_Folds = new ModelRenderer(this, 216, 34);
		Second_Left_Folds.addBox(7F, 1F, -16F, 7, 0, 11);
		Second_Left_Folds.setTextureSize(512, 64);
		Second_Left_Folds.mirror = true;
		setRotation(Second_Left_Folds, 0F, -0.8726646F, 0F);
		LeftWing.addChild(Second_Left_Folds);
		ModelRenderer _Left_Palm = new ModelRenderer(this, 187, 45);
		_Left_Palm.addBox(7F, 0F, -16F, 1, 1, 1);
		_Left_Palm.setTextureSize(512, 64);
		_Left_Palm.mirror = true;
		setRotation(_Left_Palm, 0F, -0.837758F, 0F);
		LeftWing.addChild(_Left_Palm);
		ModelRenderer _Left_Finger = new ModelRenderer(this, 183, 45);
		_Left_Finger.addBox(6F, 0F, -16F, 1, 2, 1);
		_Left_Finger.setTextureSize(512, 64);
		_Left_Finger.mirror = true;
		setRotation(_Left_Finger, 0F, -0.8726646F, -0.0349066F);
		LeftWing.addChild(_Left_Finger);
		ModelRenderer _Left_Finger_2 = new ModelRenderer(this, 191, 45);
		_Left_Finger_2.addBox(6F, 1F, -17F, 1, 2, 1);
		_Left_Finger_2.setTextureSize(512, 64);
		_Left_Finger_2.mirror = true;
		setRotation(_Left_Finger_2, -0.0174533F, -0.8726646F, -0.1047198F);
		LeftWing.addChild(_Left_Finger_2);
		ModelRenderer _Left_Finger_3 = new ModelRenderer(this, 187, 47);
		_Left_Finger_3.addBox(7F, 2F, -17F, 1, 2, 1);
		_Left_Finger_3.setTextureSize(512, 64);
		_Left_Finger_3.mirror = true;
		setRotation(_Left_Finger_3, 0F, -0.8552113F, -0.296706F);
		LeftWing.addChild(_Left_Finger_3);
		ModelRenderer Third_Left_Wing_Bone = new ModelRenderer(this, 243, 23);
		Third_Left_Wing_Bone.addBox(8F, 0F, 15F, 1, 1, 10);
		Third_Left_Wing_Bone.setTextureSize(512, 64);
		Third_Left_Wing_Bone.mirror = true;
		setRotation(Third_Left_Wing_Bone, 0F, 1.308997F, 0F);
		LeftWing.addChild(Third_Left_Wing_Bone);
		ModelRenderer Third_Left_Folds = new ModelRenderer(this, 252, 34);
		Third_Left_Folds.addBox(3F, 1F, 15F, 6, 0, 11);
		Third_Left_Folds.setTextureSize(512, 64);
		Third_Left_Folds.mirror = true;
		setRotation(Third_Left_Folds, 0F, 1.308997F, 0F);
		LeftWing.addChild(Third_Left_Folds);
		ModelRenderer Third_Left_Upper_Folds = new ModelRenderer(this, 252, 45);
		Third_Left_Upper_Folds.addBox(3F, 0.9F, 15F, 6, 0, 11);
		Third_Left_Upper_Folds.setTextureSize(512, 64);
		Third_Left_Upper_Folds.mirror = true;
		setRotation(Third_Left_Upper_Folds, 0F, 1.308997F, 0F);
		LeftWing.addChild(Third_Left_Upper_Folds);
		Body.addChild(LeftWing);

		RightWing = new ModelRenderer(this, "Right Wing");
		RightWing.setRotationPoint(-4, -8, 4);
		ModelRenderer First_Right_Folds = new ModelRenderer(this, 178, 0);
		First_Right_Folds.addBox(1F, 1F, 1F, 7, 0, 12);
		First_Right_Folds.setTextureSize(512, 64);
		First_Right_Folds.mirror = true;
		setRotation(First_Right_Folds, 0F, -1.570796F, 0F);
		RightWing.addChild(First_Right_Folds);
		ModelRenderer First_Right_Wing_Bone = new ModelRenderer(this, 176, 12);
		First_Right_Wing_Bone.addBox(0F, 0F, 0F, 1, 10, 1);
		First_Right_Wing_Bone.setTextureSize(512, 64);
		First_Right_Wing_Bone.mirror = true;
		setRotation(First_Right_Wing_Bone, 0.0349066F, 0F, 1.570796F);
		RightWing.addChild(First_Right_Wing_Bone);
		ModelRenderer Second_Right_Wing_Bone = new ModelRenderer(this, 180, 12);
		Second_Right_Wing_Bone.addBox(-7.5F, 0F, -15.5F, 1, 1, 9);
		Second_Right_Wing_Bone.setTextureSize(512, 64);
		Second_Right_Wing_Bone.mirror = true;
		setRotation(Second_Right_Wing_Bone, 0F, 0.8726646F, 0F);
		RightWing.addChild(Second_Right_Wing_Bone);
		ModelRenderer Second_Right_Folds = new ModelRenderer(this, 216, 0);
		Second_Right_Folds.addBox(-13.5F, 1F, -15.5F, 7, 0, 11);
		Second_Right_Folds.setTextureSize(512, 64);
		Second_Right_Folds.mirror = true;
		setRotation(Second_Right_Folds, 0F, 0.8726646F, 0F);
		RightWing.addChild(Second_Right_Folds);
		ModelRenderer Right_Palm = new ModelRenderer(this, 188, 22);
		Right_Palm.addBox(-8F, 0F, -16F, 1, 1, 1);
		Right_Palm.setTextureSize(512, 64);
		Right_Palm.mirror = true;
		setRotation(Right_Palm, 0F, 0.837758F, 0F);
		RightWing.addChild(Right_Palm);
		ModelRenderer Right_Finger = new ModelRenderer(this, 184, 22);
		Right_Finger.addBox(-7F, 0.5F, -16F, 1, 2, 1);
		Right_Finger.setTextureSize(512, 64);
		Right_Finger.mirror = true;
		setRotation(Right_Finger, 0F, 0.8726646F, 0.0349066F);
		RightWing.addChild(Right_Finger);
		ModelRenderer Right_Finger_2 = new ModelRenderer(this, 188, 24);
		Right_Finger_2.addBox(-7F, 1.5F, -17F, 1, 2, 1);
		Right_Finger_2.setTextureSize(512, 64);
		Right_Finger_2.mirror = true;
		setRotation(Right_Finger_2, 0F, 0.8726646F, 0.1570796F);
		RightWing.addChild(Right_Finger_2);
		ModelRenderer Right_Finger_3 = new ModelRenderer(this, 192, 22);
		Right_Finger_3.addBox(-7.5F, 2F, -17F, 1, 2, 1);
		Right_Finger_3.setTextureSize(512, 64);
		Right_Finger_3.mirror = true;
		setRotation(Right_Finger_3, 0F, 0.8726646F, 0.296706F);
		RightWing.addChild(Right_Finger_3);
		ModelRenderer Third_Right_Wing_Bone = new ModelRenderer(this, 200, 12);
		Third_Right_Wing_Bone.addBox(-9F, 0F, 14F, 1, 1, 10);
		Third_Right_Wing_Bone.setTextureSize(512, 64);
		Third_Right_Wing_Bone.mirror = true;
		setRotation(Third_Right_Wing_Bone, 0F, -1.308997F, 0F);
		RightWing.addChild(Third_Right_Wing_Bone);
		ModelRenderer Third_Right_Folds = new ModelRenderer(this, 252, 34);
		Third_Right_Folds.addBox(-9F, 1F, 14F, 6, 0, 11);
		Third_Right_Folds.setTextureSize(512, 64);
		Third_Right_Folds.mirror = true;
		setRotation(Third_Right_Folds, 0F, -1.308997F, 0F);
		RightWing.addChild(Third_Right_Folds);
		ModelRenderer Third_Right_Upper_Folds = new ModelRenderer(this, 252, 45);
		Third_Right_Upper_Folds.addBox(-9F, 0.9F, 14F, 6, 0, 11);
		Third_Right_Upper_Folds.setTextureSize(512, 64);
		Third_Right_Upper_Folds.mirror = true;
		setRotation(Third_Right_Upper_Folds, 0F, -1.308997F, 0F);
		RightWing.addChild(Third_Right_Upper_Folds);
		Body.addChild(RightWing);

		ModelRenderer RightLeg = new ModelRenderer(this, "Right Leg");
		RightLeg.setRotationPoint(-4, 3, 17);
		ModelRenderer Right_Claw_3 = new ModelRenderer(this, 365, 18);
		Right_Claw_3.addBox(-1.5F, 7F, 3F, 1, 3, 1);
		Right_Claw_3.setTextureSize(512, 64);
		Right_Claw_3.mirror = true;
		setRotation(Right_Claw_3, -0.6108652F, 0.0872665F, 0.6632251F);
		RightLeg.addChild(Right_Claw_3);
		ModelRenderer Right_Thigh = new ModelRenderer(this, 353, 0);
		Right_Thigh.addBox(-1F, 0F, -2F, 2, 7, 3);
		Right_Thigh.setTextureSize(512, 64);
		Right_Thigh.mirror = true;
		setRotation(Right_Thigh, -0.6108652F, 0F, 0.6981317F);
		RightLeg.addChild(Right_Thigh);
		ModelRenderer Right_Lower_Leg = new ModelRenderer(this, 353, 10);
		Right_Lower_Leg.addBox(-1F, 6F, -2F, 2, 2, 6);
		Right_Lower_Leg.setTextureSize(512, 64);
		Right_Lower_Leg.mirror = true;
		setRotation(Right_Lower_Leg, -0.6108652F, 0F, 0.6981317F);
		RightLeg.addChild(Right_Lower_Leg);
		ModelRenderer Right_Claw_2 = new ModelRenderer(this, 359, 18);
		Right_Claw_2.addBox(0.5F, 7F, 3F, 1, 3, 1);
		Right_Claw_2.setTextureSize(512, 64);
		Right_Claw_2.mirror = true;
		setRotation(Right_Claw_2, -0.6108652F, 0.0872665F, 0.7330383F);
		RightLeg.addChild(Right_Claw_2);
		ModelRenderer Right_Claw_1 = new ModelRenderer(this, 353, 18);
		Right_Claw_1.addBox(-0.5F, 4F, 3F, 1, 3, 1);
		Right_Claw_1.setTextureSize(512, 64);
		Right_Claw_1.mirror = true;
		setRotation(Right_Claw_1, -0.6108652F, 0.0872665F, 0.6981317F);
		RightLeg.addChild(Right_Claw_1);
		Body.addChild(RightLeg);

		ModelRenderer LeftLeg = new ModelRenderer(this, "Left Leg");
		LeftLeg.setRotationPoint(4, 3, 17);
		ModelRenderer Left_Thigh = new ModelRenderer(this, 316, 0);
		Left_Thigh.addBox(-1F, 0F, -2F, 2, 7, 3);
		Left_Thigh.setTextureSize(512, 64);
		Left_Thigh.mirror = true;
		setRotation(Left_Thigh, -0.6108652F, 0F, -0.6981317F);
		LeftLeg.addChild(Left_Thigh);
		ModelRenderer Left_Lower_Leg = new ModelRenderer(this, 316, 10);
		Left_Lower_Leg.addBox(-1F, 6F, -2F, 2, 2, 6);
		Left_Lower_Leg.setTextureSize(512, 64);
		Left_Lower_Leg.mirror = true;
		setRotation(Left_Lower_Leg, -0.6108652F, 0F, -0.6981317F);
		LeftLeg.addChild(Left_Lower_Leg);
		ModelRenderer Left_Claw_1 = new ModelRenderer(this, 316, 18);
		Left_Claw_1.addBox(-0.5F, 4F, 3F, 1, 3, 1);
		Left_Claw_1.setTextureSize(512, 64);
		Left_Claw_1.mirror = true;
		setRotation(Left_Claw_1, -0.6108652F, -0.0872665F, -0.6981317F);
		LeftLeg.addChild(Left_Claw_1);
		ModelRenderer Left_Claw_2 = new ModelRenderer(this, 322, 18);
		Left_Claw_2.addBox(0.5F, 7F, 3F, 1, 3, 1);
		Left_Claw_2.setTextureSize(512, 64);
		Left_Claw_2.mirror = true;
		setRotation(Left_Claw_2, -0.6108652F, -0.0872665F, -0.6632251F);
		LeftLeg.addChild(Left_Claw_2);
		ModelRenderer Left_Claw_3 = new ModelRenderer(this, 327, 18);
		Left_Claw_3.addBox(-1.5F, 7F, 3F, 1, 3, 1);
		Left_Claw_3.setTextureSize(512, 64);
		Left_Claw_3.mirror = true;
		setRotation(Left_Claw_3, -0.6108652F, -0.0872665F, -0.7330383F);
		LeftLeg.addChild(Left_Claw_3);
		Body.addChild(LeftLeg);

		ModelRenderer Tail = new ModelRenderer(this, "Tail");
		Tail.setRotationPoint(0, 2, 18);
		ModelRenderer Segment_1 = new ModelRenderer(this, 100, 0);
		Segment_1.addBox(-3F, 0F, -3F, 6, 2, 6);
		Segment_1.setTextureSize(512, 64);
		Segment_1.mirror = true;
		setRotation(Segment_1, 1.22173F, 0F, 0F);
		Tail.addChild(Segment_1);
		ModelRenderer Segment_2 = new ModelRenderer(this, 104, 8);
		Segment_2.addBox(-2F, -1F, -2F, 4, 5, 4);
		Segment_2.setRotationPoint(0F, 2F, 5F);
		Segment_2.setTextureSize(512, 64);
		Segment_2.mirror = true;
		setRotation(Segment_2, 1.169371F, 0F, 0F);
		Tail.addChild(Segment_2);
		ModelRenderer Segment_3 = new ModelRenderer(this, 104, 17);
		Segment_3.addBox(-2F, 1F, -2F, 4, 5, 4);
		Segment_3.setTextureSize(512, 64);
		Segment_3.mirror = true;
		setRotation(Segment_3, 1.22173F, 0F, 0F);
		Tail.addChild(Segment_3);
		ModelRenderer Segment_4 = new ModelRenderer(this, 108, 26);
		Segment_4.addBox(-1F, 0F, -1F, 2, 6, 2);
		Segment_4.setRotationPoint(0F, 3F, 8F);
		Segment_4.setTextureSize(512, 64);
		Segment_4.mirror = true;
		setRotation(Segment_4, 1.22173F, 0F, 0F);
		Tail.addChild(Segment_4);
		ModelRenderer Segment_5 = new ModelRenderer(this, 108, 34);
		Segment_5.addBox(-1F, -1F, -1F, 2, 6, 2);
		Segment_5.setRotationPoint(0F, 5F, 14F);
		Segment_5.setTextureSize(512, 64);
		Segment_5.mirror = true;
		setRotation(Segment_5, 1.396263F, 0F, 0F);
		Tail.addChild(Segment_5);
		ModelRenderer Segment_6 = new ModelRenderer(this, 109, 42);
		Segment_6.addBox(-1F, -1F, -1F, 2, 9, 1);
		Segment_6.setRotationPoint(0F, 6F, 19F);
		Segment_6.setTextureSize(512, 64);
		Segment_6.mirror = true;
		setRotation(Segment_6, 1.396263F, 0F, 0F);
		Tail.addChild(Segment_6);
		ModelRenderer Segment_7 = new ModelRenderer(this, 106, 52);
		Segment_7.addBox(-3F, 6F, -1F, 6, 6, 0);
		Segment_7.setRotationPoint(0F, 6F, 19F);
		Segment_7.setTextureSize(512, 64);
		Segment_7.mirror = true;
		setRotation(Segment_7, 1.396263F, 0F, 0F);
		Tail.addChild(Segment_7);
		Body.addChild(Tail);
		
		ModuleHead headModule = new ModuleHead(Head);
		skeleton = new SkeletonBird(Body, headModule, LeftWing, RightWing, LeftLeg, RightLeg);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		
		if (((EntityPixelmon)entity).animationCounter2 * 3 - 180 < 0) { 
			LeftWing.rotateAngleZ = 2F + (((EntityPixelmon)entity).animationCounter2 + 90) * 0.034906585F;
			}
			
		else if (((EntityPixelmon)entity).animationCounter2 * 3 >= 0) {
			LeftWing.rotateAngleZ = 0F + -((((EntityPixelmon)entity).animationCounter2 - 90) * 0.034906585F);
			}
		
		
		if (((EntityPixelmon)entity).animationCounter2 * 3 - 180 < 0) { 
			RightWing.rotateAngleZ = -2F + -(((EntityPixelmon)entity).animationCounter2 + 90) * 0.034906585F;
			}
			
		else if (((EntityPixelmon)entity).animationCounter2 * 3 >= 0) {
			RightWing.rotateAngleZ = 0F + ((((EntityPixelmon)entity).animationCounter2 - 90) * 0.034906585F);
			}
		
		if (((EntityPixelmon)entity).animationCounter2 * 3 -180 < 0) { 
			Body.rotationPointY = 20 -(((EntityPixelmon)entity).animationCounter2 + 180) * 0.174532925F;
		}
		
		else if (((EntityPixelmon)entity).animationCounter2 * 3 >= 0) {
			Body.rotationPointY = 0 + (((EntityPixelmon)entity).animationCounter2 - 180) * 0.174532925F;
		}
		
		
		if (((EntityPixelmon)entity).animationCounter2 >= 120){
			((EntityPixelmon)entity).animationCounter2 = 0;}
		
	}
}

// Date: 27/06/2012 5:26:41 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.Pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelMagneton extends ModelBase
{
  //fields
    ModelRenderer Body1;
    ModelRenderer Body2;
    ModelRenderer Body3;
    ModelRenderer Screw3;
    ModelRenderer Screw4;
    ModelRenderer Screw5;
    ModelRenderer Screw6;
    ModelRenderer Magnet1;
    ModelRenderer Magnet2;
    ModelRenderer Magnet3;
    ModelRenderer Magnet4;
    ModelRenderer Magnet5;
    ModelRenderer Magnet6;
    ModelRenderer TopScrew;
    ModelRenderer Magnet7;
    ModelRenderer Magnet8;
    ModelRenderer Magnet9;
    ModelRenderer Magnet10;
    ModelRenderer Magnet11;
    ModelRenderer Magnet12;
    ModelRenderer Magnet13;
    ModelRenderer Magnet14;
    ModelRenderer Magnet15;
    ModelRenderer Magnet20;
    ModelRenderer Magnet19;
    ModelRenderer Magnet18;
    ModelRenderer Magnet17;
    ModelRenderer Magnet16;
    ModelRenderer Screw1;
    ModelRenderer Screw2;
    ModelRenderer Magnet21;
    ModelRenderer Magnet22;
    ModelRenderer Magnet23;
    ModelRenderer Magnet24;
    ModelRenderer Magnet25;
    ModelRenderer Magnet26;
    ModelRenderer Magnet27;
    ModelRenderer Magnet28;
    ModelRenderer Magnet29;
    
  public ModelMagneton()
  {
    textureWidth = 64;
    textureHeight = 32;
    setTextureOffset("1Magnet.Folder1", 0, 0);
    setTextureOffset("2Magnet.Folder2", 0, 0);
    setTextureOffset("3Magnet.Folder3", 0, 0);
    setTextureOffset("4Magnet.Folder4", 0, 0);
    setTextureOffset("5Magnet.Folder5", 0, 0);
    setTextureOffset("6Magnet.Folder6", 0, 0);
    setTextureOffset("TopScrew.Folder7", 0, 0);
    
      Body1 = new ModelRenderer(this, 44, 0);
      Body1.addBox(-2.5F, 0F, 0F, 5, 5, 5);
      Body1.setRotationPoint(0F, -1F, 0F);
      Body1.setTextureSize(64, 32);
      Body1.mirror = true;
      setRotation(Body1, 0F, 0F, 0F);
      Body2 = new ModelRenderer(this, 44, 10);
      Body2.addBox(-3.5F, 0F, 0F, 5, 5, 5);
      Body2.setRotationPoint(-3F, 3.8F, 0F);
      Body2.setTextureSize(64, 32);
      Body2.mirror = true;
      setRotation(Body2, 0F, 0F, -0.0698132F);
      Body3 = new ModelRenderer(this, 24, 0);
      Body3.addBox(-1.5F, 0F, 0F, 5, 5, 5);
      Body3.setRotationPoint(3F, 3.8F, 0F);
      Body3.setTextureSize(64, 32);
      Body3.mirror = true;
      setRotation(Body3, 0F, 0F, 0.0698132F);
      Screw3 = new ModelRenderer(this, 50, 28);
      Screw3.addBox(0F, 0F, 0F, 1, 3, 1);
      Screw3.setRotationPoint(-6F, 8F, 2F);
      Screw3.setTextureSize(64, 32);
      Screw3.mirror = true;
      setRotation(Screw3, 0F, 0F, 0.6108652F);
      Screw4 = new ModelRenderer(this, 32, 28);
      Screw4.addBox(0F, 0F, 0F, 3, 1, 3);
      Screw4.setRotationPoint(-8.2F, 9.3F, 1F);
      Screw4.setTextureSize(64, 32);
      Screw4.mirror = true;
      setRotation(Screw4, 0F, 0F, 0.6108652F);
      Screw5 = new ModelRenderer(this, 50, 28);
      Screw5.addBox(0F, 0F, 0F, 1, 3, 1);
      Screw5.setRotationPoint(5F, 8.4F, 2F);
      Screw5.setTextureSize(64, 32);
      Screw5.mirror = true;
      setRotation(Screw5, 0F, 0F, -0.6108652F);
      Screw6 = new ModelRenderer(this, 32, 28);
      Screw6.addBox(0F, 0F, 0F, 3, 1, 3);
      Screw6.setRotationPoint(5.6F, 11F, 1F);
      Screw6.setTextureSize(64, 32);
      Screw6.mirror = true;
      setRotation(Screw6, 0F, 0F, -0.6108652F);
    Magnet1 = new ModelRenderer(this, "1Magnet");
    Magnet1.setRotationPoint(0F, 2F, 2F);
    setRotation(Magnet1, 0F, 0F, 0F);
    Magnet1.mirror = true;
      Magnet5 = new ModelRenderer(this, 0, 10);
      Magnet5.addBox(0F, 0F, 0F, 3, 1, 1);
      Magnet5.setRotationPoint(-7.5F, 1F, 0.5333334F);
      Magnet5.setTextureSize(64, 32);
      Magnet5.mirror = true;
      setRotation(Magnet5, 0F, 0F, 0F);
      Magnet4 = new ModelRenderer(this, 0, 5);
      Magnet4.addBox(0F, 0F, 0F, 3, 1, 1);
      Magnet4.setRotationPoint(-7.5F, -3F, 0F);
      Magnet4.setTextureSize(64, 32);
      Magnet4.mirror = true;
      setRotation(Magnet4, 0F, 0F, 0F);
      Magnet3 = new ModelRenderer(this, 0, 0);
      Magnet3.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet3.setRotationPoint(-4.5F, 0F, 0F);
      Magnet3.setTextureSize(64, 32);
      Magnet3.mirror = true;
      setRotation(Magnet3, 0F, 0F, 0F);
      Magnet2 = new ModelRenderer(this, 0, 0);
      Magnet2.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet2.setRotationPoint(-4.5F, -2F, 0F);
      Magnet2.setTextureSize(64, 32);
      Magnet2.mirror = true;
      setRotation(Magnet2, 0F, 0F, 0F);
      Magnet1 = new ModelRenderer(this, 0, 0);
      Magnet1.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet1.setRotationPoint(-3.5F, -1F, 0F);
      Magnet1.setTextureSize(64, 32);
      Magnet1.mirror = true;
      setRotation(Magnet1, 0F, 0F, 0F);
      Magnet2 = new ModelRenderer(this, "2Magnet");
      Magnet2.setRotationPoint(0F, 2F, 2F);
    setRotation(Magnet2, 0F, 0F, 0F);
    Magnet2.mirror = true;
      Magnet7 = new ModelRenderer(this, 0, 0);
      Magnet7.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet7.setRotationPoint(3.5F, -2F, 0F);
      Magnet7.setTextureSize(64, 32);
      Magnet7.mirror = true;
      setRotation(Magnet7, 0F, 0F, 0F);
      Magnet6 = new ModelRenderer(this, 0, 0);
      Magnet6.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet6.setRotationPoint(2.5F, -1F, 0F);
      Magnet6.setTextureSize(64, 32);
      Magnet6.mirror = true;
      setRotation(Magnet6, 0F, 0F, 0F);
      Magnet9 = new ModelRenderer(this, 0, 15);
      Magnet9.addBox(0F, 0F, 0F, 3, 1, 1);
      Magnet9.setRotationPoint(4.5F, -3F, 0F);
      Magnet9.setTextureSize(64, 32);
      Magnet9.mirror = true;
      setRotation(Magnet9, 0F, 0F, 0F);
      Magnet10 = new ModelRenderer(this, 0, 20);
      Magnet10.addBox(0F, 0F, 0F, 3, 1, 1);
      Magnet10.setRotationPoint(4.5F, 1F, 0F);
      Magnet10.setTextureSize(64, 32);
      Magnet10.mirror = true;
      setRotation(Magnet10, 0F, 0F, 0F);
      Magnet8 = new ModelRenderer(this, 0, 0);
      Magnet8.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet8.setRotationPoint(3.5F, 0F, 0F);
      Magnet8.setTextureSize(64, 32);
      Magnet8.mirror = true;
      setRotation(Magnet8, 0F, 0F, 0F);
    Magnet3 = new ModelRenderer(this, "3Magnet");
    Magnet3.setRotationPoint(-4F, 6F, 2F);
    setRotation(Magnet3, 0F, 0F, 0F);
    Magnet3.mirror = true;
      Magnet15 = new ModelRenderer(this, 0, 10);
      Magnet15.addBox(0F, 0F, 0F, 3, 1, 1);
      Magnet15.setRotationPoint(-7.2F, 2.2F, 0F);
      Magnet15.setTextureSize(64, 32);
      Magnet15.mirror = true;
      setRotation(Magnet15, 0F, 0F, -0.0698132F);
      Magnet14 = new ModelRenderer(this, 0, 5);
      Magnet14.addBox(0F, 0F, 0F, 3, 1, 1);
      Magnet14.setRotationPoint(-7.4F, -1.7F, 0F);
      Magnet14.setTextureSize(64, 32);
      Magnet14.mirror = true;
      setRotation(Magnet14, 0F, 0F, -0.0698132F);
      Magnet13 = new ModelRenderer(this, 0, 0);
      Magnet13.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet13.setRotationPoint(-4.3F, 1F, 0F);
      Magnet13.setTextureSize(64, 32);
      Magnet13.mirror = true;
      setRotation(Magnet13, 0F, 0F, -0.0698132F);
      Magnet12 = new ModelRenderer(this, 0, 0);
      Magnet12.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet12.setRotationPoint(-4.4F, -0.9F, 0F);
      Magnet12.setTextureSize(64, 32);
      Magnet12.mirror = true;
      setRotation(Magnet12, 0F, 0F, -0.0698132F);
      Magnet11 = new ModelRenderer(this, 0, 0);
      Magnet11.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet11.setRotationPoint(-3.4F, 0F, 0F);
      Magnet11.setTextureSize(64, 32);
      Magnet11.mirror = true;
      setRotation(Magnet11, 0F, 0F, -0.0698132F);
    Magnet4 = new ModelRenderer(this, "4Magnet");
    Magnet4.setRotationPoint(3F, 6F, 2F);
    setRotation(Magnet4, 0F, 0F, 0F);
    Magnet4.mirror = true;
      Magnet20 = new ModelRenderer(this, 0, 20);
      Magnet20.addBox(0F, 0F, 0F, 3, 1, 1);
      Magnet20.setRotationPoint(5.1F, 2F, 0F);
      Magnet20.setTextureSize(64, 32);
      Magnet20.mirror = true;
      setRotation(Magnet20, 0F, 0F, 0.0698132F);
      Magnet19 = new ModelRenderer(this, 0, 15);
      Magnet19.addBox(0F, 0F, 0F, 3, 1, 1);
      Magnet19.setRotationPoint(5.3F, -1.8F, 0F);
      Magnet19.setTextureSize(64, 32);
      Magnet19.mirror = true;
      setRotation(Magnet19, 0F, 0F, 0.0698132F);
      Magnet18 = new ModelRenderer(this, 0, 0);
      Magnet18.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet18.setRotationPoint(4.2F, 1F, 0F);
      Magnet18.setTextureSize(64, 32);
      Magnet18.mirror = true;
      setRotation(Magnet18, 0F, 0F, 0.0698132F);
      Magnet17 = new ModelRenderer(this, 0, 0);
      Magnet17.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet17.setRotationPoint(4.3F, -0.9F, 0F);
      Magnet17.setTextureSize(64, 32);
      Magnet17.mirror = true;
      setRotation(Magnet17, 0F, 0F, 0.0698132F);
      Magnet16 = new ModelRenderer(this, 0, 0);
      Magnet16.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet16.setRotationPoint(3.3F, 0F, 0F);
      Magnet16.setTextureSize(64, 32);
      Magnet16.mirror = true;
      setRotation(Magnet16, 0F, 0F, 0.0698132F);
    Magnet5 = new ModelRenderer(this, "5Magnet");
    Magnet5.setRotationPoint(-4F, 6F, 2F);
    setRotation(Magnet5, 0F, 0F, 0F);
    Magnet5.mirror = true;
      Magnet25 = new ModelRenderer(this, 5, 25);
      Magnet25.addBox(0F, 0F, 0F, 1, 3, 1);
      Magnet25.setRotationPoint(-2.3F, 4.6F, 0F);
      Magnet25.setTextureSize(64, 32);
      Magnet25.mirror = true;
      setRotation(Magnet25, 0F, 0F, -0.0698132F);
      Magnet24 = new ModelRenderer(this, 0, 25);
      Magnet24.addBox(0F, 0F, 0F, 1, 3, 1);
      Magnet24.setRotationPoint(1.5F, 4.4F, 0F);
      Magnet24.setTextureSize(64, 32);
      Magnet24.mirror = true;
      setRotation(Magnet24, 0F, 0F, -0.0698132F);
      Magnet23 = new ModelRenderer(this, 0, 0);
      Magnet23.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet23.setRotationPoint(-1.4F, 3.6F, 0F);
      Magnet23.setTextureSize(64, 32);
      Magnet23.mirror = true;
      setRotation(Magnet23, 0F, 0F, -0.0698132F);
      Magnet22 = new ModelRenderer(this, 0, 0);
      Magnet22.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet22.setRotationPoint(0.5F, 3.5F, 0F);
      Magnet22.setTextureSize(64, 32);
      Magnet22.mirror = true;
      setRotation(Magnet22, 0F, 0F, -0.0698132F);
      Magnet21 = new ModelRenderer(this, 0, 0);
      Magnet21.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet21.setRotationPoint(-0.5F, 2.6F, 0F);
      Magnet21.setTextureSize(64, 32);
      Magnet21.mirror = true;
      setRotation(Magnet21, 0F, 0F, -0.0698132F);
    Magnet6 = new ModelRenderer(this, "6Magnet");
    Magnet6.setRotationPoint(4F, 6F, 2F);
    setRotation(Magnet6, 0F, 0F, 0F);
    Magnet6.mirror = true;
      Magnet20 = new ModelRenderer(this, 5, 25);
      Magnet20.addBox(0F, 0F, 0F, 1, 3, 1);
      Magnet20.setRotationPoint(1.3F, 4.5F, 0F);
      Magnet20.setTextureSize(64, 32);
      Magnet20.mirror = true;
      setRotation(Magnet20, 0F, 0F, 0.0698132F);
      Magnet29 = new ModelRenderer(this, 0, 25);
      Magnet29.addBox(0F, 0F, 0F, 1, 3, 1);
      Magnet29.setRotationPoint(-2.5F, 4.2F, 0F);
      Magnet29.setTextureSize(64, 32);
      Magnet29.mirror = true;
      setRotation(Magnet29, 0F, 0F, 0.0698132F);
      Magnet28 = new ModelRenderer(this, 0, 0);
      Magnet28.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet28.setRotationPoint(0.4F, 3.5F, 0F);
      Magnet28.setTextureSize(64, 32);
      Magnet28.mirror = true;
      setRotation(Magnet28, 0F, 0F, 0.0698132F);
      Magnet27 = new ModelRenderer(this, 0, 0);
      Magnet27.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet27.setRotationPoint(-1.5F, 3.4F, 0F);
      Magnet27.setTextureSize(64, 32);
      Magnet27.mirror = true;
      setRotation(Magnet27, 0F, 0F, 0.0698132F);
      Magnet26 = new ModelRenderer(this, 0, 0);
      Magnet26.addBox(0F, 0F, 0F, 1, 1, 1);
      Magnet26.setRotationPoint(-0.5F, 2.5F, 0F);
      Magnet26.setTextureSize(64, 32);
      Magnet26.mirror = true;
      setRotation(Magnet26, 0F, 0F, 0.0698132F);
    TopScrew = new ModelRenderer(this, "TopScrew");
    TopScrew.setRotationPoint(0F, 0F, 2F);
    setRotation(TopScrew, 0F, 0F, 0F);
    TopScrew.mirror = true;
      Screw2 = new ModelRenderer(this, 32, 28);
      Screw2.addBox(0F, 0F, 0F, 3, 1, 3);
      Screw2.setRotationPoint(-1.5F, -4F, -1F);
      Screw2.setTextureSize(64, 32);
      Screw2.mirror = true;
      setRotation(Screw2, 0F, 0F, 0F);
      Screw1 = new ModelRenderer(this, 45, 29);
      Screw1.addBox(0F, 0F, 0F, 1, 2, 1);
      Screw1.setRotationPoint(-0.5F, -3F, 0F);
      Screw1.setTextureSize(64, 32);
      Screw1.mirror = true;
      setRotation(Screw1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body1.render(f5);
    Body2.render(f5);
    Body3.render(f5);
    Screw3.render(f5);
    Screw4.render(f5);
    Screw5.render(f5);
    Screw6.render(f5);
    Magnet1.render(f5);
    Magnet2.render(f5);
    Magnet3.render(f5);
    Magnet4.render(f5);
    Magnet5.render(f5);
    Magnet6.render(f5);
    TopScrew.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
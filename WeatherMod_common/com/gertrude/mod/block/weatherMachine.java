





package com.gertrude.mod.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class weatherMachine extends ModelBase
{
  //fields
    ModelRenderer base;
    ModelRenderer column1;
    ModelRenderer column2;
    ModelRenderer column3;
    ModelRenderer column4;
    ModelRenderer midcol1;
    ModelRenderer midcol2;
    ModelRenderer midcol3;
    ModelRenderer midcol4;
    ModelRenderer botbotbotbotsphere11;
    ModelRenderer botbotbotbotsphere2;
    ModelRenderer botbotbotbotsphere4;
    ModelRenderer botbotbotmidsphere11;
    ModelRenderer botbotbotmidsphere2;
    ModelRenderer botbotbotmidsphere31;
    ModelRenderer botbotmidsphere1;
    ModelRenderer botbotmidsphere2;
    ModelRenderer botbotmidsphere41;
    ModelRenderer botmidsphere11;
    ModelRenderer botmidsphere3;
    ModelRenderer botmidsphere4;
    ModelRenderer midsphere2;
    ModelRenderer midsphere3;
    ModelRenderer midsphere41;
    ModelRenderer topmidsphere11;
    ModelRenderer topmidsphere2;
    ModelRenderer topmidsphere4;
    ModelRenderer toptopmidsphere2;
    ModelRenderer toptopmidsphere31;
    ModelRenderer toptopmidsphere4;
    ModelRenderer toptoptopmidsphere2;
    ModelRenderer toptoptopmidsphere31;
    ModelRenderer toptoptopmidsphere311;
    ModelRenderer toptoptoptopsphere2;
    ModelRenderer toptoptoptopsphere31;
    ModelRenderer toptoptoptopsphere4;
    ModelRenderer Shape1;
    ModelRenderer botbotbotbotsphere31;
    ModelRenderer botbotbotmidsphere311;
    ModelRenderer botmidsphere21;
    ModelRenderer midsphere11;
    ModelRenderer topmidsphere31;
    ModelRenderer toptopmidsphere11;
    ModelRenderer toptoptopmidsphere11;
    ModelRenderer toptoptoptopsphere11;
    ModelRenderer botbotmidsphere31;
    ModelRenderer botbotbotbotsphere3;
    ModelRenderer botbotbotmidsphere3;
    ModelRenderer botmidsphere2;
    ModelRenderer midsphere1;
    ModelRenderer topmidsphere3;
    ModelRenderer toptopmidsphere1;
    ModelRenderer toptoptopmidsphere1;
    ModelRenderer toptoptoptopsphere1;
    ModelRenderer botbotmidsphere3;
    ModelRenderer botbotbotbotsphere1;
    ModelRenderer botbotbotmidsphere1;
    ModelRenderer botbotmidsphere4;
    ModelRenderer botmidsphere1;
    ModelRenderer midsphere4;
    ModelRenderer topmidsphere1;
    ModelRenderer toptopmidsphere3;
    ModelRenderer toptoptopmidsphere3;
    ModelRenderer toptoptoptopsphere3;
  
  public weatherMachine()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      base = new ModelRenderer(this, 60, 0);
      base.addBox(0F, 0F, 0F, 48, 8, 48);
      base.setRotationPoint(-24F, 16F, -24F);
      base.setTextureSize(64, 32);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      column1 = new ModelRenderer(this, 0, 150);
      column1.addBox(0F, 0F, 0F, 16, 32, 16);
      column1.setRotationPoint(-24F, -16F, 8F);
      column1.setTextureSize(64, 32);
      column1.mirror = true;
      setRotation(column1, 0F, 0F, 0F);
      column2 = new ModelRenderer(this, 0, 150);
      column2.addBox(0F, 0F, 0F, 16, 32, 16);
      column2.setRotationPoint(-24F, -16F, -24F);
      column2.setTextureSize(64, 32);
      column2.mirror = true;
      setRotation(column2, 0F, 0F, 0F);
      column3 = new ModelRenderer(this, 0, 150);
      column3.addBox(0F, 0F, 0F, 16, 32, 16);
      column3.setRotationPoint(8F, -16F, -24F);
      column3.setTextureSize(64, 32);
      column3.mirror = true;
      setRotation(column3, 0F, 0F, 0F);
      column4 = new ModelRenderer(this, 0, 150);
      column4.addBox(0F, 0F, 0F, 16, 32, 16);
      column4.setRotationPoint(8F, -16F, 8F);
      column4.setTextureSize(64, 32);
      column4.mirror = true;
      setRotation(column4, 0F, 0F, 0F);
      midcol1 = new ModelRenderer(this, 0, 100);
      midcol1.addBox(0F, 0F, 0F, 8, 16, 8);
      midcol1.setRotationPoint(-20F, 0F, -4F);
      midcol1.setTextureSize(64, 32);
      midcol1.mirror = true;
      setRotation(midcol1, 0F, 0F, 0F);
      midcol2 = new ModelRenderer(this, 0, 100);
      midcol2.addBox(0F, 0F, 0F, 8, 16, 8);
      midcol2.setRotationPoint(-4F, 0F, -20F);
      midcol2.setTextureSize(64, 32);
      midcol2.mirror = true;
      setRotation(midcol2, 0F, 0F, 0F);
      midcol3 = new ModelRenderer(this, 0, 100);
      midcol3.addBox(0F, 0F, 0F, 8, 16, 8);
      midcol3.setRotationPoint(-4F, 0F, 12F);
      midcol3.setTextureSize(64, 32);
      midcol3.mirror = true;
      setRotation(midcol3, 0F, 0F, 0F);
      midcol4 = new ModelRenderer(this, 0, 100);
      midcol4.addBox(0F, 0F, 0F, 8, 16, 8);
      midcol4.setRotationPoint(12F, 0F, -4F);
      midcol4.setTextureSize(64, 32);
      midcol4.mirror = true;
      setRotation(midcol4, 0F, 0F, 0F);
      botbotbotbotsphere11 = new ModelRenderer(this, 0, 0);
      botbotbotbotsphere11.addBox(0F, 0F, 0F, 2, 1, 2);
      botbotbotbotsphere11.setRotationPoint(15F, -3F, -1F);
      botbotbotbotsphere11.setTextureSize(64, 32);
      botbotbotbotsphere11.mirror = true;
      setRotation(botbotbotbotsphere11, 0F, 0F, 0F);
      botbotbotbotsphere2 = new ModelRenderer(this, 0, 0);
      botbotbotbotsphere2.addBox(0F, 0F, 0F, 2, 1, 2);
      botbotbotbotsphere2.setRotationPoint(-1F, -25F, -1F);
      botbotbotbotsphere2.setTextureSize(64, 32);
      botbotbotbotsphere2.mirror = true;
      setRotation(botbotbotbotsphere2, 0F, 0F, 0F);
      botbotbotbotsphere4 = new ModelRenderer(this, 0, 0);
      botbotbotbotsphere4.addBox(0F, 0F, 0F, 2, 1, 2);
      botbotbotbotsphere4.setRotationPoint(-1F, -3F, 15F);
      botbotbotbotsphere4.setTextureSize(64, 32);
      botbotbotbotsphere4.mirror = true;
      setRotation(botbotbotbotsphere4, 0F, 0F, 0F);
      botbotbotmidsphere11 = new ModelRenderer(this, 0, 0);
      botbotbotmidsphere11.addBox(0F, 0F, 0F, 4, 1, 4);
      botbotbotmidsphere11.setRotationPoint(14F, -4F, -2F);
      botbotbotmidsphere11.setTextureSize(64, 32);
      botbotbotmidsphere11.mirror = true;
      setRotation(botbotbotmidsphere11, 0F, 0F, 0F);
      botbotbotmidsphere2 = new ModelRenderer(this, 0, 0);
      botbotbotmidsphere2.addBox(0F, 0F, 0F, 4, 1, 4);
      botbotbotmidsphere2.setRotationPoint(-2F, -26F, -2F);
      botbotbotmidsphere2.setTextureSize(64, 32);
      botbotbotmidsphere2.mirror = true;
      setRotation(botbotbotmidsphere2, 0F, 0F, 0F);
      botbotbotmidsphere31 = new ModelRenderer(this, 0, 0);
      botbotbotmidsphere31.addBox(0F, 0F, 0F, 4, 1, 4);
      botbotbotmidsphere31.setRotationPoint(-2F, -4F, 14F);
      botbotbotmidsphere31.setTextureSize(64, 32);
      botbotbotmidsphere31.mirror = true;
      setRotation(botbotbotmidsphere31, 0F, 0F, 0F);
      botbotmidsphere1 = new ModelRenderer(this, 0, 0);
      botbotmidsphere1.addBox(0F, 0F, 0F, 6, 1, 6);
      botbotmidsphere1.setRotationPoint(-3F, -5F, 13F);
      botbotmidsphere1.setTextureSize(64, 32);
      botbotmidsphere1.mirror = true;
      setRotation(botbotmidsphere1, 0F, 0F, 0F);
      botbotmidsphere2 = new ModelRenderer(this, 0, 0);
      botbotmidsphere2.addBox(0F, 0F, 0F, 6, 1, 6);
      botbotmidsphere2.setRotationPoint(-3F, -27F, -3F);
      botbotmidsphere2.setTextureSize(64, 32);
      botbotmidsphere2.mirror = true;
      setRotation(botbotmidsphere2, 0F, 0F, 0F);
      botbotmidsphere41 = new ModelRenderer(this, 0, 0);
      botbotmidsphere41.addBox(0F, 0F, 0F, 6, 1, 6);
      botbotmidsphere41.setRotationPoint(13F, -5F, -3F);
      botbotmidsphere41.setTextureSize(64, 32);
      botbotmidsphere41.mirror = true;
      setRotation(botbotmidsphere41, 0F, 0F, 0F);
      botmidsphere11 = new ModelRenderer(this, 0, 0);
      botmidsphere11.addBox(0F, 0F, 0F, 8, 1, 8);
      botmidsphere11.setRotationPoint(12F, -6F, -4F);
      botmidsphere11.setTextureSize(64, 32);
      botmidsphere11.mirror = true;
      setRotation(botmidsphere11, 0F, 0F, 0F);
      botmidsphere3 = new ModelRenderer(this, 0, 0);
      botmidsphere3.addBox(0F, 0F, 0F, 8, 1, 8);
      botmidsphere3.setRotationPoint(-4F, -28F, -4F);
      botmidsphere3.setTextureSize(64, 32);
      botmidsphere3.mirror = true;
      setRotation(botmidsphere3, 0F, 0F, 0F);
      botmidsphere4 = new ModelRenderer(this, 0, 0);
      botmidsphere4.addBox(0F, 0F, 0F, 8, 1, 8);
      botmidsphere4.setRotationPoint(-4F, -6F, 12F);
      botmidsphere4.setTextureSize(64, 32);
      botmidsphere4.mirror = true;
      setRotation(botmidsphere4, 0F, 0F, 0F);
      midsphere2 = new ModelRenderer(this, 0, 0);
      midsphere2.addBox(0F, 0F, 0F, 10, 4, 10);
      midsphere2.setRotationPoint(-5F, -10F, 11F);
      midsphere2.setTextureSize(64, 32);
      midsphere2.mirror = true;
      setRotation(midsphere2, 0F, 0F, 0F);
      midsphere3 = new ModelRenderer(this, 0, 0);
      midsphere3.addBox(0F, 0F, 0F, 10, 4, 10);
      midsphere3.setRotationPoint(-5F, -32F, -5F);
      midsphere3.setTextureSize(64, 32);
      midsphere3.mirror = true;
      setRotation(midsphere3, 0F, 0F, 0F);
      midsphere41 = new ModelRenderer(this, 0, 0);
      midsphere41.addBox(0F, 0F, 0F, 10, 4, 10);
      midsphere41.setRotationPoint(11F, -10F, -5F);
      midsphere41.setTextureSize(64, 32);
      midsphere41.mirror = true;
      setRotation(midsphere41, 0F, 0F, 0F);
      topmidsphere11 = new ModelRenderer(this, 0, 0);
      topmidsphere11.addBox(0F, 0F, 0F, 8, 1, 8);
      topmidsphere11.setRotationPoint(12F, -11F, -4F);
      topmidsphere11.setTextureSize(64, 32);
      topmidsphere11.mirror = true;
      setRotation(topmidsphere11, 0F, 0F, 0F);
      topmidsphere2 = new ModelRenderer(this, 0, 0);
      topmidsphere2.addBox(0F, 0F, 0F, 8, 1, 8);
      topmidsphere2.setRotationPoint(-4F, -11F, 12F);
      topmidsphere2.setTextureSize(64, 32);
      topmidsphere2.mirror = true;
      setRotation(topmidsphere2, 0F, 0F, 0F);
      topmidsphere4 = new ModelRenderer(this, 0, 0);
      topmidsphere4.addBox(0F, 0F, 0F, 8, 1, 8);
      topmidsphere4.setRotationPoint(-4F, -33F, -4F);
      topmidsphere4.setTextureSize(64, 32);
      topmidsphere4.mirror = true;
      setRotation(topmidsphere4, 0F, 0F, 0F);
      toptopmidsphere2 = new ModelRenderer(this, 0, 0);
      toptopmidsphere2.addBox(0F, 0F, 0F, 6, 1, 6);
      toptopmidsphere2.setRotationPoint(-3F, -12F, 13F);
      toptopmidsphere2.setTextureSize(64, 32);
      toptopmidsphere2.mirror = true;
      setRotation(toptopmidsphere2, 0F, 0F, 0F);
      toptopmidsphere31 = new ModelRenderer(this, 0, 0);
      toptopmidsphere31.addBox(0F, 0F, 0F, 6, 1, 6);
      toptopmidsphere31.setRotationPoint(13F, -12F, -3F);
      toptopmidsphere31.setTextureSize(64, 32);
      toptopmidsphere31.mirror = true;
      setRotation(toptopmidsphere31, 0F, 0F, 0F);
      toptopmidsphere4 = new ModelRenderer(this, 0, 0);
      toptopmidsphere4.addBox(0F, 0F, 0F, 6, 1, 6);
      toptopmidsphere4.setRotationPoint(-3F, -34F, -3F);
      toptopmidsphere4.setTextureSize(64, 32);
      toptopmidsphere4.mirror = true;
      setRotation(toptopmidsphere4, 0F, 0F, 0F);
      toptoptopmidsphere2 = new ModelRenderer(this, 0, 0);
      toptoptopmidsphere2.addBox(0F, 0F, 0F, 4, 1, 4);
      toptoptopmidsphere2.setRotationPoint(-2F, -13F, 14F);
      toptoptopmidsphere2.setTextureSize(64, 32);
      toptoptopmidsphere2.mirror = true;
      setRotation(toptoptopmidsphere2, 0F, 0F, 0F);
      toptoptopmidsphere31 = new ModelRenderer(this, 0, 0);
      toptoptopmidsphere31.addBox(0F, 0F, 0F, 4, 1, 4);
      toptoptopmidsphere31.setRotationPoint(14F, -13F, -2F);
      toptoptopmidsphere31.setTextureSize(64, 32);
      toptoptopmidsphere31.mirror = true;
      setRotation(toptoptopmidsphere31, 0F, 0F, 0F);
      toptoptopmidsphere31 = new ModelRenderer(this, 0, 0);
      toptoptopmidsphere31.addBox(0F, 0F, 0F, 4, 1, 4);
      toptoptopmidsphere31.setRotationPoint(-2F, -35F, -2F);
      toptoptopmidsphere31.setTextureSize(64, 32);
      toptoptopmidsphere31.mirror = true;
      setRotation(toptoptopmidsphere31, 0F, 0F, 0F);
      toptoptoptopsphere2 = new ModelRenderer(this, 0, 0);
      toptoptoptopsphere2.addBox(0F, 0F, 0F, 2, 1, 2);
      toptoptoptopsphere2.setRotationPoint(-1F, -14F, 15F);
      toptoptoptopsphere2.setTextureSize(64, 32);
      toptoptoptopsphere2.mirror = true;
      setRotation(toptoptoptopsphere2, 0F, 0F, 0F);
      toptoptoptopsphere31 = new ModelRenderer(this, 0, 0);
      toptoptoptopsphere31.addBox(0F, 0F, 0F, 2, 1, 2);
      toptoptoptopsphere31.setRotationPoint(15F, -14F, -1F);
      toptoptoptopsphere31.setTextureSize(64, 32);
      toptoptoptopsphere31.mirror = true;
      setRotation(toptoptoptopsphere31, 0F, 0F, 0F);
      toptoptoptopsphere4 = new ModelRenderer(this, 0, 0);
      toptoptoptopsphere4.addBox(0F, 0F, 0F, 2, 1, 2);
      toptoptoptopsphere4.setRotationPoint(-1F, -36F, -1F);
      toptoptoptopsphere4.setTextureSize(64, 32);
      toptoptoptopsphere4.mirror = true;
      setRotation(toptoptoptopsphere4, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 41);
      Shape1.addBox(0F, 0F, 0F, 8, 35, 8);
      Shape1.setRotationPoint(-4F, -19F, -4F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      botbotbotbotsphere31 = new ModelRenderer(this, 0, 0);
      botbotbotbotsphere31.addBox(0F, 0F, 0F, 2, 1, 2);
      botbotbotbotsphere31.setRotationPoint(-1F, -3F, -17F);
      botbotbotbotsphere31.setTextureSize(64, 32);
      botbotbotbotsphere31.mirror = true;
      setRotation(botbotbotbotsphere31, 0F, 0F, 0F);
      botbotbotmidsphere31 = new ModelRenderer(this, 0, 0);
      botbotbotmidsphere31.addBox(0F, 0F, 0F, 4, 1, 4);
      botbotbotmidsphere31.setRotationPoint(-2F, -4F, -18F);
      botbotbotmidsphere31.setTextureSize(64, 32);
      botbotbotmidsphere31.mirror = true;
      setRotation(botbotbotmidsphere31, 0F, 0F, 0F);
      botmidsphere21 = new ModelRenderer(this, 0, 0);
      botmidsphere21.addBox(0F, 0F, 0F, 8, 1, 8);
      botmidsphere21.setRotationPoint(-4F, -6F, -20F);
      botmidsphere21.setTextureSize(64, 32);
      botmidsphere21.mirror = true;
      setRotation(botmidsphere21, 0F, 0F, 0F);
      midsphere11 = new ModelRenderer(this, 0, 0);
      midsphere11.addBox(0F, 0F, 0F, 10, 4, 10);
      midsphere11.setRotationPoint(-5F, -10F, -21F);
      midsphere11.setTextureSize(64, 32);
      midsphere11.mirror = true;
      setRotation(midsphere11, 0F, 0F, 0F);
      topmidsphere31 = new ModelRenderer(this, 0, 0);
      topmidsphere31.addBox(0F, 0F, 0F, 8, 1, 8);
      topmidsphere31.setRotationPoint(-4F, -11F, -20F);
      topmidsphere31.setTextureSize(64, 32);
      topmidsphere31.mirror = true;
      setRotation(topmidsphere31, 0F, 0F, 0F);
      toptopmidsphere11 = new ModelRenderer(this, 0, 0);
      toptopmidsphere11.addBox(0F, 0F, 0F, 6, 1, 6);
      toptopmidsphere11.setRotationPoint(-3F, -12F, -19F);
      toptopmidsphere11.setTextureSize(64, 32);
      toptopmidsphere11.mirror = true;
      setRotation(toptopmidsphere11, 0F, 0F, 0F);
      toptoptopmidsphere11 = new ModelRenderer(this, 0, 0);
      toptoptopmidsphere11.addBox(0F, 0F, 0F, 4, 1, 4);
      toptoptopmidsphere11.setRotationPoint(-2F, -13F, -18F);
      toptoptopmidsphere11.setTextureSize(64, 32);
      toptoptopmidsphere11.mirror = true;
      setRotation(toptoptopmidsphere11, 0F, 0F, 0F);
      toptoptoptopsphere11 = new ModelRenderer(this, 0, 0);
      toptoptoptopsphere11.addBox(0F, 0F, 0F, 2, 1, 2);
      toptoptoptopsphere11.setRotationPoint(-1F, -14F, -17F);
      toptoptoptopsphere11.setTextureSize(64, 32);
      toptoptoptopsphere11.mirror = true;
      setRotation(toptoptoptopsphere11, 0F, 0F, 0F);
      botbotmidsphere31 = new ModelRenderer(this, 0, 0);
      botbotmidsphere31.addBox(0F, 0F, 0F, 6, 1, 6);
      botbotmidsphere31.setRotationPoint(-3F, -5F, -19F);
      botbotmidsphere31.setTextureSize(64, 32);
      botbotmidsphere31.mirror = true;
      setRotation(botbotmidsphere31, 0F, 0F, 0F);
      botbotbotbotsphere31 = new ModelRenderer(this, 0, 0);
      botbotbotbotsphere31.addBox(0F, 0F, 0F, 2, 1, 2);
      botbotbotbotsphere31.setRotationPoint(-1F, -3F, -17F);
      botbotbotbotsphere31.setTextureSize(64, 32);
      botbotbotbotsphere31.mirror = true;
      setRotation(botbotbotbotsphere31, 0F, 0F, 0F);
      botbotbotmidsphere31 = new ModelRenderer(this, 0, 0);
      botbotbotmidsphere31.addBox(0F, 0F, 0F, 4, 1, 4);
      botbotbotmidsphere31.setRotationPoint(-2F, -4F, -18F);
      botbotbotmidsphere31.setTextureSize(64, 32);
      botbotbotmidsphere31.mirror = true;
      setRotation(botbotbotmidsphere31, 0F, 0F, 0F);
      botmidsphere21 = new ModelRenderer(this, 0, 0);
      botmidsphere21.addBox(0F, 0F, 0F, 8, 1, 8);
      botmidsphere21.setRotationPoint(-4F, -6F, -20F);
      botmidsphere21.setTextureSize(64, 32);
      botmidsphere21.mirror = true;
      setRotation(botmidsphere21, 0F, 0F, 0F);
      midsphere11 = new ModelRenderer(this, 0, 0);
      midsphere11.addBox(0F, 0F, 0F, 10, 4, 10);
      midsphere11.setRotationPoint(-5F, -10F, -21F);
      midsphere11.setTextureSize(64, 32);
      midsphere11.mirror = true;
      setRotation(midsphere11, 0F, 0F, 0F);
      topmidsphere31 = new ModelRenderer(this, 0, 0);
      topmidsphere31.addBox(0F, 0F, 0F, 8, 1, 8);
      topmidsphere31.setRotationPoint(-4F, -11F, -20F);
      topmidsphere31.setTextureSize(64, 32);
      topmidsphere31.mirror = true;
      setRotation(topmidsphere31, 0F, 0F, 0F);
      toptopmidsphere11 = new ModelRenderer(this, 0, 0);
      toptopmidsphere11.addBox(0F, 0F, 0F, 6, 1, 6);
      toptopmidsphere11.setRotationPoint(-3F, -12F, -19F);
      toptopmidsphere11.setTextureSize(64, 32);
      toptopmidsphere11.mirror = true;
      setRotation(toptopmidsphere11, 0F, 0F, 0F);
      toptoptopmidsphere11 = new ModelRenderer(this, 0, 0);
      toptoptopmidsphere11.addBox(0F, 0F, 0F, 4, 1, 4);
      toptoptopmidsphere11.setRotationPoint(-2F, -13F, -18F);
      toptoptopmidsphere11.setTextureSize(64, 32);
      toptoptopmidsphere11.mirror = true;
      setRotation(toptoptopmidsphere11, 0F, 0F, 0F);
      toptoptoptopsphere11 = new ModelRenderer(this, 0, 0);
      toptoptoptopsphere11.addBox(0F, 0F, 0F, 2, 1, 2);
      toptoptoptopsphere11.setRotationPoint(-1F, -14F, -17F);
      toptoptoptopsphere11.setTextureSize(64, 32);
      toptoptoptopsphere11.mirror = true;
      setRotation(toptoptoptopsphere11, 0F, 0F, 0F);
      botbotmidsphere31 = new ModelRenderer(this, 0, 0);
      botbotmidsphere31.addBox(0F, 0F, 0F, 6, 1, 6);
      botbotmidsphere31.setRotationPoint(-3F, -5F, -19F);
      botbotmidsphere31.setTextureSize(64, 32);
      botbotmidsphere31.mirror = true;
      setRotation(botbotmidsphere31, 0F, 0F, 0F);
      botbotbotbotsphere11 = new ModelRenderer(this, 0, 0);
      botbotbotbotsphere11.addBox(0F, 0F, 0F, 2, 1, 2);
      botbotbotbotsphere11.setRotationPoint(-17F, -3F, -1F);
      botbotbotbotsphere11.setTextureSize(64, 32);
      botbotbotbotsphere11.mirror = true;
      setRotation(botbotbotbotsphere11, 0F, 0F, 0F);
      botbotbotmidsphere11 = new ModelRenderer(this, 0, 0);
      botbotbotmidsphere11.addBox(0F, 0F, 0F, 4, 1, 4);
      botbotbotmidsphere11.setRotationPoint(-18F, -4F, -2F);
      botbotbotmidsphere11.setTextureSize(64, 32);
      botbotbotmidsphere11.mirror = true;
      setRotation(botbotbotmidsphere11, 0F, 0F, 0F);
      botbotmidsphere41 = new ModelRenderer(this, 0, 0);
      botbotmidsphere41.addBox(0F, 0F, 0F, 6, 1, 6);
      botbotmidsphere41.setRotationPoint(-19F, -5F, -3F);
      botbotmidsphere41.setTextureSize(64, 32);
      botbotmidsphere41.mirror = true;
      setRotation(botbotmidsphere41, 0F, 0F, 0F);
      botmidsphere11 = new ModelRenderer(this, 0, 0);
      botmidsphere11.addBox(0F, 0F, 0F, 8, 1, 8);
      botmidsphere11.setRotationPoint(-20F, -6F, -4F);
      botmidsphere11.setTextureSize(64, 32);
      botmidsphere11.mirror = true;
      setRotation(botmidsphere11, 0F, 0F, 0F);
      midsphere41 = new ModelRenderer(this, 0, 0);
      midsphere41.addBox(0F, 0F, 0F, 10, 4, 10);
      midsphere41.setRotationPoint(-21F, -10F, -5F);
      midsphere41.setTextureSize(64, 32);
      midsphere41.mirror = true;
      setRotation(midsphere41, 0F, 0F, 0F);
      topmidsphere11 = new ModelRenderer(this, 0, 0);
      topmidsphere11.addBox(0F, 0F, 0F, 8, 1, 8);
      topmidsphere11.setRotationPoint(-20F, -11F, -4F);
      topmidsphere11.setTextureSize(64, 32);
      topmidsphere11.mirror = true;
      setRotation(topmidsphere11, 0F, 0F, 0F);
      toptopmidsphere31 = new ModelRenderer(this, 0, 0);
      toptopmidsphere31.addBox(0F, 0F, 0F, 6, 1, 6);
      toptopmidsphere31.setRotationPoint(-19F, -12F, -3F);
      toptopmidsphere31.setTextureSize(64, 32);
      toptopmidsphere31.mirror = true;
      setRotation(toptopmidsphere31, 0F, 0F, 0F);
      toptoptopmidsphere31 = new ModelRenderer(this, 0, 0);
      toptoptopmidsphere31.addBox(0F, 0F, 0F, 4, 1, 4);
      toptoptopmidsphere31.setRotationPoint(-18F, -13F, -2F);
      toptoptopmidsphere31.setTextureSize(64, 32);
      toptoptopmidsphere31.mirror = true;
      setRotation(toptoptopmidsphere31, 0F, 0F, 0F);
      toptoptoptopsphere31 = new ModelRenderer(this, 0, 0);
      toptoptoptopsphere31.addBox(0F, 0F, 0F, 2, 1, 2);
      toptoptoptopsphere31.setRotationPoint(-17F, -14F, -1F);
      toptoptoptopsphere31.setTextureSize(64, 32);
      toptoptoptopsphere31.mirror = true;
      setRotation(toptoptoptopsphere31, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    base.render(f5);
    column1.render(f5);
    column2.render(f5);
    column3.render(f5);
    column4.render(f5);
    midcol1.render(f5);
    midcol2.render(f5);
    midcol3.render(f5);
    midcol4.render(f5);
    botbotbotbotsphere11.render(f5);
    botbotbotbotsphere2.render(f5);
    botbotbotbotsphere4.render(f5);
    botbotbotmidsphere11.render(f5);
    botbotbotmidsphere2.render(f5);
    botbotbotmidsphere31.render(f5);
    botbotmidsphere1.render(f5);
    botbotmidsphere2.render(f5);
    botbotmidsphere41.render(f5);
    botmidsphere11.render(f5);
    botmidsphere3.render(f5);
    botmidsphere4.render(f5);
    midsphere2.render(f5);
    midsphere3.render(f5);
    midsphere41.render(f5);
    topmidsphere11.render(f5);
    topmidsphere2.render(f5);
    topmidsphere4.render(f5);
    toptopmidsphere2.render(f5);
    toptopmidsphere31.render(f5);
    toptopmidsphere4.render(f5);
    toptoptopmidsphere2.render(f5);
    toptoptopmidsphere31.render(f5);
    toptoptopmidsphere31.render(f5);
    toptoptoptopsphere2.render(f5);
    toptoptoptopsphere31.render(f5);
    toptoptoptopsphere4.render(f5);
    Shape1.render(f5);
    botbotbotbotsphere31.render(f5);
    botbotbotmidsphere31.render(f5);
    botmidsphere21.render(f5);
    midsphere11.render(f5);
    topmidsphere31.render(f5);
    toptopmidsphere11.render(f5);
    toptoptopmidsphere11.render(f5);
    toptoptoptopsphere11.render(f5);
    botbotmidsphere31.render(f5);
    botbotbotbotsphere31.render(f5);
    botbotbotmidsphere31.render(f5);
    botmidsphere21.render(f5);
    midsphere11.render(f5);
    topmidsphere31.render(f5);
    toptopmidsphere11.render(f5);
    toptoptopmidsphere11.render(f5);
    toptoptoptopsphere11.render(f5);
    botbotmidsphere31.render(f5);
    botbotbotbotsphere11.render(f5);
    botbotbotmidsphere11.render(f5);
    botbotmidsphere41.render(f5);
    botmidsphere11.render(f5);
    midsphere41.render(f5);
    topmidsphere11.render(f5);
    toptopmidsphere31.render(f5);
    toptoptopmidsphere31.render(f5);
    toptoptoptopsphere31.render(f5);
  }
  
  public void renderModel(float f)
  {
	    base.render(f);
	    column1.render(f);
	    column2.render(f);
	    column3.render(f);
	    column4.render(f);
	    midcol1.render(f);
	    midcol2.render(f);
	    midcol3.render(f);
	    midcol4.render(f);
	    botbotbotbotsphere11.render(f);
	    botbotbotbotsphere2.render(f);
	    botbotbotbotsphere4.render(f);
	    botbotbotmidsphere11.render(f);
	    botbotbotmidsphere2.render(f);
	    botbotbotmidsphere31.render(f);
	    botbotmidsphere1.render(f);
	    botbotmidsphere2.render(f);
	    botbotmidsphere41.render(f);
	    botmidsphere11.render(f);
	    botmidsphere3.render(f);
	    botmidsphere4.render(f);
	    midsphere2.render(f);
	    midsphere3.render(f);
	    midsphere41.render(f);
	    topmidsphere11.render(f);
	    topmidsphere2.render(f);
	    topmidsphere4.render(f);
	    toptopmidsphere2.render(f);
	    toptopmidsphere31.render(f);
	    toptopmidsphere4.render(f);
	    toptoptopmidsphere2.render(f);
	    toptoptopmidsphere31.render(f);
	    toptoptopmidsphere31.render(f);
	    toptoptoptopsphere2.render(f);
	    toptoptoptopsphere31.render(f);
	    toptoptoptopsphere4.render(f);
	    Shape1.render(f);
	    botbotbotbotsphere31.render(f);
	    botbotbotmidsphere31.render(f);
	    botmidsphere21.render(f);
	    midsphere11.render(f);
	    topmidsphere31.render(f);
	    toptopmidsphere11.render(f);
	    toptoptopmidsphere11.render(f);
	    toptoptoptopsphere11.render(f);
	    botbotmidsphere31.render(f);
	    botbotbotbotsphere31.render(f);
	    botbotbotmidsphere31.render(f);
	    botmidsphere21.render(f);
	    midsphere11.render(f);
	    topmidsphere31.render(f);
	    toptopmidsphere11.render(f);
	    toptoptopmidsphere11.render(f);
	    toptoptoptopsphere11.render(f);
	    botbotmidsphere31.render(f);
	    botbotbotbotsphere11.render(f);
	    botbotbotmidsphere11.render(f);
	    botbotmidsphere41.render(f);
	    botmidsphere11.render(f);
	    midsphere41.render(f);
	    topmidsphere11.render(f);
	    toptopmidsphere31.render(f);
	    toptoptopmidsphere31.render(f);
	    toptoptoptopsphere31.render(f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}

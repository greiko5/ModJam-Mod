package com.gertrude.mod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

import com.gertrude.mod.WeatherMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWeatherCapa extends Block{

	public BlockWeatherCapa(int id, Material material) {
		super(id, material);
		
		
		this.setHardness(2.0F);
		this.setResistance(10F);
		this.setStepSound(Block.soundMetalFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	@SideOnly(Side.CLIENT)
	public static Icon bottomIcon;
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	
	
    @Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.topIcon = par1IconRegister.registerIcon(WeatherMod.modid + ":" + this.getUnlocalizedName().substring(5)+"_top");
		this.bottomIcon = par1IconRegister.registerIcon(WeatherMod.modid + ":" + this.getUnlocalizedName().substring(5)+"_bottom");
		this.sideIcon = par1IconRegister.registerIcon(WeatherMod.modid + ":" + this.getUnlocalizedName().substring(5)+"_side");
		
	}
    
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int metadata) {
    	
    	if(side == 0) {
    		return bottomIcon;
    		} else if(side == 1) {
    		return topIcon;
    		} else {
    		return sideIcon;
    	

    }
    }
}

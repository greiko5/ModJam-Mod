package com.gertrude.mod.block;

import com.gertrude.mod.WeatherMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWeatherCore extends Block{

	public BlockWeatherCore(int id, Material material) {
		super(id, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
    
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(WeatherMod.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}

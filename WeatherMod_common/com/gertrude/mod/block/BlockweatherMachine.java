package com.gertrude.mod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.gertrude.mod.WeatherMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockweatherMachine extends Block{

	public BlockweatherMachine(int id, Material material) {
		super(id, material);
		
		
		this.setHardness(3.0F);
		this.setResistance(20F);
		this.setStepSound(Block.soundMetalFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	
	
	public int getRenderType()
	{
		return -1;
	}

	
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon)
	{
		this.blockIcon = icon.registerIcon(WeatherMod.modid + ":" + "weatherMachine");
	}
	
	
	
	
	public TileEntity createNewTileEntity(World world)
	{
	   return new TileEntityWeatherMachine();
	}
	
	
	
	
	
}

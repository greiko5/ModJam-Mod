package com.gertrude.mod;

import com.gertrude.mod.block.BlockWeatherBase;
import com.gertrude.mod.block.BlockWeatherCapa;
import com.gertrude.mod.block.BlockWeatherCore;
import com.gertrude.mod.block.BlockWeatherCrystal;
import com.gertrude.mod.block.BlockWeatherFrame;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = WeatherMod.modid, name = "Weather Mod", version ="Pre-Alpha v0.1.1")//Gertrude<3
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class WeatherMod {
	
		
		public static final String modid = "WeatherMod";
		
		public static Block blockWeatherCore;
		public static Block blockWeatherFrame;
		public static Block blockWeatherBase;
		public static Block blockWeatherCapa;
		public static Block blockWeatherCrystal;
		
		@Init
		public void load(FMLInitializationEvent event){
			//////////////////////////////////////Blocks/////////////////////////////////////////////////////
			blockWeatherCore = new BlockWeatherCore(3713, Material.iron).setUnlocalizedName("weatherBlockCore");
			registerBlock(blockWeatherCore, blockWeatherCore.getUnlocalizedName(), "Weather Machine Core");
		
			
			blockWeatherFrame = new BlockWeatherFrame(3714, Material.iron).setUnlocalizedName("weatherBlockFrame");
			registerBlock(blockWeatherFrame, blockWeatherFrame.getUnlocalizedName(), "Weather Machine Frame");
			
			
			blockWeatherBase = new BlockWeatherBase(3715, Material.iron).setUnlocalizedName("weatherBlockBase");
			registerBlock(blockWeatherBase, blockWeatherBase.getUnlocalizedName(), "Weather Machine Base");
		
			
			blockWeatherCapa = new BlockWeatherCapa(3716, Material.iron).setUnlocalizedName("weatherBlockCapa");
			registerBlock(blockWeatherCapa, blockWeatherCapa.getUnlocalizedName(), "Weather Machine Capacitor");
			
			
			blockWeatherCrystal = new BlockWeatherCrystal(3717, Material.iron).setUnlocalizedName("weatherBlockCrystal");
			registerBlock(blockWeatherCrystal, blockWeatherCrystal.getUnlocalizedName(), "Weather Machine Projection Crystal");
			
			
			/////////////////////////////////////////Recipe/////////////////////////////////////////////////////
				
				GameRegistry.addRecipe(new ItemStack(blockWeatherCore, 1), new Object[]{
				"XEX",
				"WNL",
				"XBX",
				'X', blockWeatherFrame, 'E', blockWeatherCrystal , 'B', Block.blockDiamond, 'W', Item.bucketWater, 'L', Item.bucketLava, 'N', Item.netherStar});
				
				
				GameRegistry.addRecipe(new ItemStack(blockWeatherBase, 4), new Object[]{
					"XYX",
					"YLY",
					"XYX",
					'X', Item.ingotIron, 'Y', Block.stone, 'L', Block.blockLapis});
				
				GameRegistry.addRecipe(new ItemStack(blockWeatherFrame, 2), new Object[]{
					"XRX",
					"GDG",
					"XRX",
					'X', blockWeatherBase, 'D', Item.diamond, 'G', Item.ingotGold, 'R', Item.redstone});
				
				
				GameRegistry.addRecipe(new ItemStack(blockWeatherCapa, 2), new Object[]{
					"XYX",
					"XWX",
					"XYX",
					'X', blockWeatherBase, 'Y', Item.redstone, 'W', Block.blockRedstone});
				
				GameRegistry.addRecipe(new ItemStack(blockWeatherCrystal, 2), new Object[]{
					"XYX",
					"GEG",
					"DYD",
					'X', Block.daylightSensor, 'Y', Block.glass, 'G', Block.glowStone, 'D', Item.diamond, 'E', Item.enderPearl});
				
			
			
			
		}
		
		public void registerBlock(Block block, String string, String name){
			GameRegistry.registerBlock(block, string);
			LanguageRegistry.addName(block, name);
		}
		
		public void registerItem(Item item, String string, String name){
			GameRegistry.registerItem(item, string);
			LanguageRegistry.addName(item, name);
		}

}


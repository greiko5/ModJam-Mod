package com.gertrude.mod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class WeatherMod {
	

	
	@Mod(modid = HologramMod.modid, name = "Weather Mod", version ="Pre-Alpha v0.0.1")
	@NetworkMod(clientSideRequired = true, serverSideRequired = false)
	public class HologramMod {
		
		public static final String modid = "WeatherMod";
		
		@Init
		public void load(FMLInitializationEvent event){
			
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
}

package com.triphion.ancient.proxy;

import com.triphion.ancient.worldgen.OreGen;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit() {
		
	}
	
	public void init() {
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
	}
	
	public void postInit() {
		
	}
	
	public void registerRenders() {
		
	}

}

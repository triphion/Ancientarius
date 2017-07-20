package com.triphion.ancient.proxy;

import com.triphion.ancient.AncientMod;
import com.triphion.ancient.Reference;
import com.triphion.ancient.init.DevModArmour;
import com.triphion.ancient.init.ModArmour;
import com.triphion.ancient.init.ModBlocks;
import com.triphion.ancient.init.ModDevItems;
import com.triphion.ancient.init.ModItems;
import com.triphion.ancient.init.ModSpecialItems;
import com.triphion.ancient.init.ModTools;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModTools.registerRenders();
		ModBlocks.registerRenders();
		ModArmour.registerRenders();
		ModDevItems.registerRenders();
		ModSpecialItems.registerRenders();
		DevModArmour.registerRenders();
	}

}

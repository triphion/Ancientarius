package com.triphion.ancient;

import com.sun.jna.platform.mac.Carbon.EventHandlerProcPtr;
import com.triphion.ancient.creativetabs.TabAncientBlocks;
import com.triphion.ancient.creativetabs.TabAncientItems;
import com.triphion.ancient.creativetabs.TabAncientTools;
import com.triphion.ancient.creativetabs.TabAncientWands;
import com.triphion.ancient.handlers.AchievementHandler;
import com.triphion.ancient.handlers.RecipeHandler;
import com.triphion.ancient.init.DevModArmour;
import com.triphion.ancient.init.ModArmour;
import com.triphion.ancient.init.ModBlocks;
import com.triphion.ancient.init.ModDevItems;
import com.triphion.ancient.init.ModItems;
import com.triphion.ancient.init.ModSpecialItems;
import com.triphion.ancient.init.ModTools;
import com.triphion.ancient.proxy.CommonProxy;
import com.triphion.ancient.util.Utils;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
    public class AncientMod {
	
	public static final CreativeTabs items = new TabAncientItems();
	public static final CreativeTabs blocks = new TabAncientBlocks();
	public static final CreativeTabs tools = new TabAncientTools();
	public static final CreativeTabs wands = new TabAncientWands();
	
	@Mod.Instance(Reference.MODID)
	public static AncientMod instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ModItems.init();
		ModTools.init();
		ModArmour.init();
		ModDevItems.init();
		ModSpecialItems.init();
		DevModArmour.init();
		ModBlocks.register();
		ModItems.register();
		ModTools.register();
		ModArmour.register();
		ModDevItems.register();
		ModSpecialItems.register();
		DevModArmour.register();
		
		proxy.preInit();
		OBJLoader.INSTANCE.addDomain(Reference.MODID.toLowerCase());
		
		proxy.registerRenders();
		
		AchievementHandler.registerAchievements();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerFurnaceRecipes();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
	
}

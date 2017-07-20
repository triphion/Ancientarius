package com.triphion.ancient.init;

import com.triphion.ancient.AncientMod;
import com.triphion.ancient.Reference;
import com.triphion.ancient.blocks.BlockAnemoneOre;
import com.triphion.ancient.blocks.BlockAradoxiteOre;
import com.triphion.ancient.blocks.BlockBeeBox;
import com.triphion.ancient.blocks.BlockFlorumCrop;
import com.triphion.ancient.blocks.BlockFlorumOre;
import com.triphion.ancient.blocks.BlockGalactiumOreBlue;
import com.triphion.ancient.blocks.BlockGalactiumOreOrange;
import com.triphion.ancient.blocks.BlockGalactiumOrePurple;
import com.triphion.ancient.blocks.BlockLantinumLamp;
import com.triphion.ancient.blocks.BlockLantinumOre;
import com.triphion.ancient.blocks.BlockLeadBlock;
import com.triphion.ancient.blocks.BlockLeadOre;
import com.triphion.ancient.blocks.BlockLeadStairs;
import com.triphion.ancient.blocks.BlockLeadBlock;
import com.triphion.ancient.blocks.BlockLuniteOre;
import com.triphion.ancient.blocks.BlockMoltenOre;
import com.triphion.ancient.blocks.BlockPurpuriumOre;
import com.triphion.ancient.blocks.BlockSpectoniumOre;
import com.triphion.ancient.blocks.BlockStoneBlock;
import com.triphion.ancient.blocks.BlockStoneStairs;
import com.triphion.ancient.util.Utils;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block purpuriumore;
	public static Block luniteore;
	public static Block leadore;
	public static Block leadblock;
	public static Block spectoniumOre;
	public static Block florumOre;
	public static Block lantinumOre;
	public static Block lantinumLamp;
	public static Block FlorumCrop;
	public static Block stoneBlock;
	public static BlockLeadStairs leadStairs;
	public static BlockStoneStairs stoneStairs;
	public static Block moltenOre;
	public static Block aradoxiteOre;
	public static Block galactiumOrepurple;
	public static Block galactiumOreblue;
	public static Block galactiumOreorange;
	public static Block anemoneOre;
	public static Block beeBox;
	
	public static void init() {
		purpuriumore = new BlockPurpuriumOre("purpuriumore", "purpuriumore");
		luniteore = new BlockLuniteOre("luniteore", "luniteore");
		leadore = new BlockLeadOre("leadore", "leadore");
		leadblock = new BlockLeadBlock("leadblock", "leadblock");
		spectoniumOre = new BlockSpectoniumOre("spectonium_ore", "spectonium_ore");
		florumOre = new BlockFlorumOre("florum_ore", "florum_ore");
		lantinumOre = new BlockLantinumOre("lantinum_ore", "lantinum_ore");
		lantinumLamp = new BlockLantinumLamp("lantinum_lamp", "lantinum_lamp");
		FlorumCrop = new BlockFlorumCrop("florumcrop");
		stoneBlock = new BlockStoneBlock("stone_block", "stone_block");
		leadStairs = new BlockLeadStairs("lead_stairs", leadblock.getDefaultState());
		stoneStairs = new BlockStoneStairs("stone_stairs", stoneBlock.getDefaultState());
		moltenOre = new BlockMoltenOre("molten_ore", "molten_ore");
		aradoxiteOre = new BlockAradoxiteOre("aradoxite_ore", "aradoxite_ore");
		galactiumOrepurple = new BlockGalactiumOrePurple("galactium_ore_purple", "galactium_ore_purple");
		galactiumOreblue = new BlockGalactiumOreBlue("galactium_ore_blue", "galactium_ore_blue");
		galactiumOreorange = new BlockGalactiumOreOrange("galactium_ore_orange", "galactium_ore_orange");
		anemoneOre = new BlockAnemoneOre("anemone_ore", "anemone_ore");
		beeBox = new BlockBeeBox("bee_box", "bee_box");
	}
	
	public static void register() {
		registerBlock(purpuriumore);
		registerBlock(luniteore);
		registerBlock(leadore);
		registerBlock(leadblock);
		registerBlock(spectoniumOre);
		registerBlock(florumOre);
		registerBlock(lantinumOre);
		registerBlock(lantinumLamp);
		GameRegistry.register(FlorumCrop);
		registerBlock(stoneBlock);
		registerBlock(leadStairs);
		registerBlock(stoneStairs);
		registerBlock(moltenOre);
		registerBlock(aradoxiteOre);
		registerBlock(galactiumOrepurple);
		registerBlock(galactiumOreblue);
		registerBlock(galactiumOreorange);
		registerBlock(anemoneOre);
		registerBlock(beeBox);
	}
	
	public static void registerRenders() {
		registerRender(purpuriumore);
		registerRender(luniteore);
		registerRender(leadore);
		registerRender(leadblock);
		registerRender(spectoniumOre);
		registerRender(florumOre);
		registerRender(lantinumOre);
		registerRender(lantinumLamp);
		registerRender(stoneBlock);
		registerRender(leadStairs);
		registerRender(stoneStairs);
		registerRender(moltenOre);
		registerRender(aradoxiteOre);
		registerRender(galactiumOrepurple);
		registerRender(galactiumOreblue);
		registerRender(galactiumOreorange);
		registerRender(anemoneOre);
		registerRender(beeBox);
	}
	
	public static void registerBlock(Block block) {
		block.setCreativeTab(AncientMod.blocks);
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "Inventory"));
		Utils.getLogger().info("Registered render for" + block.getUnlocalizedName().substring(5));
	}

}

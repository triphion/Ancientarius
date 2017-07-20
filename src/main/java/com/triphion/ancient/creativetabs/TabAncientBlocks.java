package com.triphion.ancient.creativetabs;

import com.triphion.ancient.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabAncientBlocks extends CreativeTabs {

	public TabAncientBlocks() {
		super("ancientblocks");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.lantinumLamp);
	}

}

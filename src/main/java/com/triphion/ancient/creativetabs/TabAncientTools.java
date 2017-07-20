package com.triphion.ancient.creativetabs;

import com.triphion.ancient.init.ModTools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabAncientTools extends CreativeTabs {

	public TabAncientTools() {
		super("ancienttools");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModTools.elementalPickaxe);
	}
	
	
}

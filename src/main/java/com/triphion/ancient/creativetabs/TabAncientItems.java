package com.triphion.ancient.creativetabs;

import com.triphion.ancient.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabAncientItems extends CreativeTabs {

	public TabAncientItems() {
		super("ancientitems");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.elementalfragment);
	}

}

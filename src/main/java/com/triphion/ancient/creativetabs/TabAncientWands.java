package com.triphion.ancient.creativetabs;

import com.triphion.ancient.init.ModSpecialItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabAncientWands extends CreativeTabs {

	public TabAncientWands() {
		super("ancientwands");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModSpecialItems.moltenStaff);
	}

}

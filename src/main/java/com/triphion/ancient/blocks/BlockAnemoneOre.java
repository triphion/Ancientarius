package com.triphion.ancient.blocks;

import java.util.Random;

import com.triphion.ancient.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockAnemoneOre extends Block {

	public BlockAnemoneOre(String unlocalizedName, String registryName) {
		super(Material.ROCK);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(registryName);
		this.setHardness(4);
		this.setResistance(10);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.7F);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}
	
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return random.nextInt(1) + 1;
		
	}

}

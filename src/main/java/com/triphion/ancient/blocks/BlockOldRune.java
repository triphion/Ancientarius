package com.triphion.ancient.blocks;

import java.util.Random;

import com.triphion.ancient.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOldRune extends Block{

	public BlockOldRune(String unlocalizedName, String registryName) {
		super(Material.ROCK);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
		this.setHardness(3);
		this.setResistance(3);
		this.setHarvestLevel("pickaxe", 1);
	}
	
	@SideOnly(Side.CLIENT) 
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
		return false;
	}
	
	@Override
	public boolean isBlockNormalCube(IBlockState blockState) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState blockState) {
		return false;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return null;
	}

}

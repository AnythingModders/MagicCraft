package com.bwfcwalshy.MagicCraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlackEssence extends Item {

	public BlackEssence(int id) {
		super(id);
	
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("BlackEssence");
	}
}

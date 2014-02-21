package com.bwfcwalshy.MagicCraft.items;

import com.bwfcwalshy.MagicCraft.BasicInfo;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WhiteEssence extends Item {

	public WhiteEssence(int id) {
		super(id);
		
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("WhiteEssence");
		
		setTextureName("WhiteEssence");
	}
}

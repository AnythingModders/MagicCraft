package com.bwfcwalshy.MagicCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

import com.bwfcwalshy.MagicCraft.blocks.WhiteEssenceBlock;
import com.bwfcwalshy.MagicCraft.items.BlackEssence;
import com.bwfcwalshy.MagicCraft.items.WhiteEssence;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
@Mod(modid=BasicInfo.ID, name=BasicInfo.NAME, version=BasicInfo.VERS)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MagicCraft {
	
	public final static Block WhiteEssenceBlock = new WhiteEssenceBlock(4000, Material.ground).setHardness(1.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("WhiteEssenceBlock").setCreativeTab(CreativeTabs.tabBlock).setResistance(1000).setTextureName(BasicInfo.ID + ":" + "WhiteEssenceBlock");
	public final static Block BlackEssenceBlock = new WhiteEssenceBlock(4001, Material.ground).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlackEssenceBlock").setCreativeTab(CreativeTabs.tabBlock).setResistance(1000);
	
	public final static Item WhiteEssence = new WhiteEssence(5000).setUnlocalizedName("WhiteEssence").setTextureName("MagicCraft:WhiteEssence");
	public final static Item BlackEssence = new BlackEssence(5001).setUnlocalizedName("BlackEssence");
	
        // The instance of your mod that Forge uses.
        @Instance("MagicCraft")
        public static MagicCraft instance;
       
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="com.bwfcwalshy.MagicCraft.client.ClientProxy", serverSide="com.bwfcwalshy.MagicCraft.CommonProxy")
        public static CommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                //Blocks
                GameRegistry.registerBlock(WhiteEssenceBlock, "WhiteEssenceBlock");
                LanguageRegistry.addName(WhiteEssenceBlock, "White Essence Block");
                
                GameRegistry.registerBlock(BlackEssenceBlock, "BlackEssenceBlock");
                LanguageRegistry.addName(BlackEssenceBlock, "Black Essence Block");
                //Items
                GameRegistry.registerItem(WhiteEssence, "WhiteEssence");
                LanguageRegistry.addName(WhiteEssence, "White Essence");
                
                GameRegistry.registerItem(BlackEssence, "BlackEssence");
                LanguageRegistry.addName(BlackEssence, "Black Essence");
                //Recipe
                GameRegistry.addRecipe(new ItemStack(WhiteEssenceBlock, 1), new Object[] { "ww", "ww", Character.valueOf('w'), WhiteEssence});
                GameRegistry.addRecipe(new ItemStack(BlackEssenceBlock, 1), new Object[] { "bb", "bb", Character.valueOf('b'), BlackEssence});
                //Brewing
        }

        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
       
}

package com.natura.minestuckarsenal;

import com.mraof.minestuck.item.MinestuckItems;
import com.mraof.minestuck.util.CombinationRegistry;
import com.mraof.minestuck.util.GristRegistry;
import com.mraof.minestuck.util.GristSet;
import com.mraof.minestuck.util.GristType;
import com.natura.minestuckarsenal.item.MinestuckArsenalItems;
import static com.natura.minestuckarsenal.item.MinestuckArsenalItems.*;
import static com.natura.minestuckarsenal.block.MinestuckArsenalBlocks.*;

import com.ibm.icu.text.Normalizer.Mode;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class AlchemyRecipes {

	public static void registerMinestuckRecipes() {
		//Grist Registries
		
		//Minestuck Items
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.caledfwlch), false, new GristSet(new GristType[] {GristType.Build, GristType.Gold, GristType.Diamond}, new int[] {14000, 8000, 4000}));
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.royalDeringer), false, new GristSet(new GristType[] {GristType.Build, GristType.Gold, GristType.Diamond}, new int[] {6000, 1000, 1300}));
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.scarletRibbitar), false, new GristSet(new GristType[] {GristType.Build, GristType.Ruby, GristType.Quartz}, new int[] {100000, 40000, 20000}));
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.fearNoAnvil), false, new GristSet(new GristType[] {GristType.Build, GristType.Garnet, GristType.Diamond, GristType.Gold, GristType.Quartz}, new int[] {500000, 500000, 500000, 500000, 1}));
		GristRegistry.addGristConversion(new ItemStack(MinestuckItems.zillyhooHammer), false, new GristSet(GristType.Zillium, 1000000000));
		//Minestuck Arsenal Items
		GristRegistry.addGristConversion(new ItemStack(MinestuckArsenalItems.paperSword), false, new GristSet(GristType.Build, 12));	
		GristRegistry.addGristConversion(new ItemStack(brokenCaledfwlch), new GristSet(new GristType[] {GristType.Build, GristType.Gold, GristType.Diamond}, new int[] {7000, 4000, 2000}));
		GristRegistry.addGristConversion(new ItemStack(brokenRoyalDeringer), new GristSet(new GristType[] {GristType.Build, GristType.Gold, GristType.Diamond}, new int[] {3000, 500, 650}));
		GristRegistry.addGristConversion(new ItemStack(brokenNinjaSword), new GristSet(new GristType[] {GristType.Chalk, GristType.Quartz, GristType.Rust}, new int[] {6, 5, 3}));
		GristRegistry.addGristConversion(new ItemStack(brokenScarletRibbitar), new GristSet(new GristType[] {GristType.Build, GristType.Ruby, GristType.Quartz}, new int[] {50000, 200000, 10000}));
		
		GristRegistry.addGristConversion(new ItemStack(wrinklefucker), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Tar}, new int[] {55, 44, 66}));
	
		GristRegistry.addGristConversion(new ItemStack(babysFirstThresher), false, new GristSet(new GristType[] {GristType.Rust, GristType.Garnet, GristType.Caulk}, new int[] {34, 21, 15}));
		GristRegistry.addGristConversion(new ItemStack(hemeoreaper), false, new GristSet(new GristType[] {GristType.Build, GristType.Rust, GristType.Garnet, GristType.Iodine}, new int[] {250, 85, 75, 24}));
		GristRegistry.addGristConversion(new ItemStack(prospitReaper), false, new GristSet(new GristType[] {GristType.Build, GristType.Amber, GristType.Diamond}, new int[] {18, 22, 1}));
		GristRegistry.addGristConversion(new ItemStack(derseReaper), false, new GristSet(new GristType[] {GristType.Build, GristType.Tar, GristType.Diamond}, new int[] {18, 22, 1}));
		GristRegistry.addGristConversion(new ItemStack(owTheEdge), false, new GristSet(GristType.Artifact, -25));
		
		GristRegistry.addGristConversion(new ItemStack(knittingNeedles), false, new GristSet(GristType.Build, 8));
		GristRegistry.addGristConversion(new ItemStack(needleWands), false, new GristSet(new GristType[] {GristType.Diamond, GristType.Chalk, GristType.Garnet, GristType.Gold}, new int[] {1000, 2000, 3000, 500}));
		GristRegistry.addGristConversion(new ItemStack(thornsOfOglogoth), false, new GristSet(new GristType[] {GristType.Iodine, GristType.Chalk, GristType.Amethyst, GristType.Gold, GristType.Tar}, new int[] {6000, 5000, 4000, 3000, 666}));
		GristRegistry.addGristConversion(new ItemStack(quillsOfEchidna), false, new GristSet(new GristType[] {GristType.Build, GristType.Chalk, GristType.Amethyst, GristType.Gold, GristType.Diamond}, new int[] {5000000, 600000, 80000, 70500, 1}));
		
		GristRegistry.addGristConversion(new ItemStack(joustingLance), false, new GristSet(GristType.Build, 15));
		GristRegistry.addGristConversion(new ItemStack(fiduspawnLance), false, new GristSet(new GristType[] {GristType.Build, GristType.Tar, GristType.Shale}, new int[] {30, 22, 16}));
		
		GristRegistry.addGristConversion(new ItemStack(leatherWhip), false, new GristSet(GristType.Build, 12));
		
		GristRegistry.addGristConversion(new ItemStack(hostPlush), false, new GristSet(GristType.Build, 5));
		GristRegistry.addGristConversion(new ItemStack(barbasol), false, new GristSet(GristType.Build, 1));
		GristRegistry.addGristConversion(new ItemStack(barbasolBomb), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale}, new int[] {1, 1}));
		GristRegistry.addGristConversion(new ItemStack(trollHeadband), false, new GristSet(new GristType[] {GristType.Build, GristType.Shale, GristType.Ruby, GristType.Marble}, new int[] {25, 12, 19, 20}));
		
		GristRegistry.addGristConversion(new ItemStack(uniqueObject), false, new GristSet(new GristType[] {GristType.Amber, GristType.Amethyst, GristType.Artifact, GristType.Build, GristType.Caulk, GristType.Chalk, GristType.Cobalt, GristType.Diamond, GristType.Garnet, GristType.Gold, GristType.Iodine, GristType.Marble, GristType.Mercury, GristType.Quartz, GristType.Ruby, GristType.Rust, GristType.Shale, GristType.Sulfur, GristType.Tar, GristType.Uranium, GristType.Zillium}, new int[] {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
		
		//Alchemy Recipes MODE_OR
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.katana), new ItemStack(Items.PAPER), CombinationRegistry.MODE_OR, new ItemStack(paperSword));
		CombinationRegistry.addCombination(new ItemStack(brokenRoyalDeringer), new ItemStack(magicCueball), CombinationRegistry.MODE_OR, new ItemStack(MinestuckItems.caledfwlch));
		CombinationRegistry.addCombination(new ItemStack(hemeoreaper), new ItemStack(MinestuckItems.sbahjPoster), CombinationRegistry.MODE_OR, new ItemStack(owTheEdge));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.homesSmellYaLater), new ItemStack(MinestuckItems.minestuckBucket, 1, 1), CombinationRegistry.MODE_OR, new ItemStack(hemeoreaper));

		//Alchemy Recipes MODE_AND
		CombinationRegistry.addCombination(new ItemStack(Items.LEATHER), new ItemStack(Items.STRING), CombinationRegistry.MODE_AND, new ItemStack(MinestuckArsenalItems.leatherWhip));
		CombinationRegistry.addCombination(new ItemStack(hostPlush), new ItemStack(joustingLance), CombinationRegistry.MODE_AND, new ItemStack(fiduspawnLance));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.candy, 1, 4), new ItemStack(barbasol), CombinationRegistry.MODE_AND, new ItemStack(barbasolBomb));
		CombinationRegistry.addCombination(new ItemStack(MinestuckItems.threshDvd), new ItemStack(MinestuckItems.candy, 1, 0), CombinationRegistry.MODE_AND, new ItemStack(trollHeadband));
	}
	
	public static void registerVanillaRecipes() 
	{
		
	}
	public static void registerModRecipes() 
	{
		
	}
}

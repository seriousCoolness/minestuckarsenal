package com.natura.minestuckarsenal;

import com.mraof.minestuck.util.AlchemyRecipeHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryTable;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootTableEventHandler {

public LootTableEventHandler() {
	LootTableList.register(new ResourceLocation("minestuckarsenal", "inject/medium_addon"));
	}
	
	@SubscribeEvent
	public void onLootTableLoad(LootTableLoadEvent event) {
		if (event.getName().equals(AlchemyRecipeHandler.BASIC_MEDIUM_CHEST)) {
			LootEntry entry = new LootEntryTable(new ResourceLocation("minestuckarsenal", "inject/medium_addon"), 1, 1, new LootCondition[0], "medium_addon"); // weight doesn't matter since it's the only entry in the pool. Other params set as you wish.

			
			LootPool pool = new LootPool(new LootEntry[] {entry}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 2), "medium_addon"); // Other params set as you wish.

			
			event.getTable().addPool(pool);

	    }
		
		else if(event.getName().equals(LootTableList.GAMEPLAY_FISHING_FISH)) {
			
			LootEntry fishingEntry = new LootEntryTable(new ResourceLocation("minestuckarsenal", "inject/fishing_addon"), 1, 1, new LootCondition[0], "fishing_addon"); // weight doesn't matter since it's the only entry in the pool. Other params set as you wish.
			
			LootPool poolFish = new LootPool(new LootEntry[] {fishingEntry}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 2), "fishing_addon"); // Other params set as you wish.

			event.getTable().addPool(poolFish);
		}
	}
	
}

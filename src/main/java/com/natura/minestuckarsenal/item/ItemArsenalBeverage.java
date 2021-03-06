package com.natura.minestuckarsenal.item;

import com.mraof.minestuck.item.MinestuckItems;
import com.natura.minestuckarsenal.TabArsenal;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemArsenalBeverage extends ItemFood {

	public ItemArsenalBeverage(String unlocalizedName) {
		super(1, 0, false);
		setUnlocalizedName(unlocalizedName);
		
		setAlwaysEdible();
		setMaxStackSize(16);
	}

	@Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }
}

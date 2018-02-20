package com.natura.minestuckarsenal.client;

import com.mraof.minestuck.client.gui.captchalouge.SylladexGuiHandler;
import com.mraof.minestuck.inventory.captchalouge.Modus;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class WalletGuiHandler extends SylladexGuiHandler
{
	
	private Modus modus;
	private GuiButton polish;
	
	public WalletGuiHandler(Modus modus)
	{
		super();
		this.modus = modus;
		this.textureIndex = 2;
	}
	
	@Override
	public void initGui() {
		polish = new GuiButton(2, (width - GUI_WIDTH)/2 + 15, (height - GUI_HEIGHT)/2 + 175, 100, 20, "Polish");
		buttonList.add(polish);
		super.initGui();
	}
	
	@Override
	public ResourceLocation getCardTexture(GuiCard card) {
		// TODO Auto-generated method stub
		return new ResourceLocation("minestuckarsenal:textures/gui/captchalouge/cards.png");
	}
	
	@Override
	public void updateContent()
	{
		NonNullList<ItemStack> stacks = modus.getItems();
		this.cards.clear();
		int columns = (stacks.size() + 1)/2;
		this.maxWidth = Math.max(mapWidth, 10 + (columns*CARD_WIDTH + (columns - 1)*5));
		this.maxHeight = mapHeight;
		super.updateContent();
		
		int start = Math.max(5, (mapWidth - (columns*CARD_WIDTH + (columns - 1)*5))/2);
		for(int i = 0; i < stacks.size(); i++)
			this.cards.add(new GuiCard(stacks.get(i), this, i, start + i/2*(CARD_WIDTH + 5), (mapHeight - 2*CARD_HEIGHT - 5)/2 + (i%2)*(CARD_HEIGHT + 5)));
	}
	
	@Override
	public void updatePosition()
	{
		int columns = (cards.size() + 1)/2;
		this.maxWidth = Math.max(mapWidth, 10 + (columns*CARD_WIDTH + (columns - 1)*5));
		this.maxHeight = mapHeight;
		
		int start = Math.max(5, (mapWidth - (columns*CARD_WIDTH + (columns - 1)*5))/2);
		for(int i = 0; i < cards.size(); i++)
		{
			GuiCard card = cards.get(i);
			card.xPos = start + i/2*(CARD_WIDTH + 5);
			card.yPos = (mapHeight - 2*CARD_HEIGHT - 5)/2 + (i%2)*(CARD_HEIGHT + 5);
		}
	}
	
	
}
package org.example.Pages;

import org.example.CardData;
import org.example.MenuData;
import org.example.Settings;
import org.example.UIComponents.CoffeeLabel;
import org.example.UIComponents.CoffeePanel;
import org.example.UIComponents.InventoryItemCard;

import javax.swing.*;
import java.awt.*;
import java.util.Map;


public class InventoryItemPage extends CoffeePanel {
	
	public CoffeeLabel companyName = new CoffeeLabel("Coffee Shop sa Tabe Tabe");
	
	public CoffeePanel itemList = new CoffeePanel();

	
	public InventoryItemPage(MenuData data){
		
		setBackground(Settings.currentPalette[0]);
		
		itemList.setBounds(0, 0, 1220, 580);
		itemList.setPreferredSize(new Dimension(1220, 580));
		itemList.setBackground(Settings.currentPalette[1]);
		itemList.setBorderColor(Settings.currentPalette[2]);
		itemList.setBorderThickness(4);
		
		JScrollPane itemScrollList = new JScrollPane(itemList);
		itemScrollList.setBounds(20, 80, 1220, 590);
		itemScrollList.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		itemScrollList.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		companyName.setBounds(20, 20, 1280, 60);
		companyName.setFontSize(48);
		
		add(itemScrollList);
		add(companyName);
	}
	
	
	
}

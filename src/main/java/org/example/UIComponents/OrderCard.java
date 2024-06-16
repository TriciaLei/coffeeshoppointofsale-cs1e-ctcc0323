package org.example.UIComponents;

import org.example.Settings;

public class OrderCard extends CoffeePanel{
	
	public CoffeeLabel quantity = new CoffeeLabel("");
	public CoffeeLabel itemName = new CoffeeLabel("");
	public CoffeeLabel itemPrice = new CoffeeLabel("");
	public CoffeeButton plus = new CoffeeButton();
	public CoffeeButton minus = new CoffeeButton();
	public int id = 0;
	
	public OrderCard(String n, String q, String p, int i){
		setBounds(10, 10, 224, 50);
		setBackground(Settings.currentPalette[3]);
		setBorderColor(Settings.currentPalette[2]);
		
		id = i;

		quantity.setBounds(10, 5, 30, 20);
		quantity.setFontSize(16);
		quantity.setFontColor(Settings.currentPalette[2]);
		
		itemName.setBounds(30, 5, 224 ,20);
		itemName.setFontSize(16);
		itemName.setFontColor(Settings.currentPalette[2]);
		
		itemName.setText(n);
		quantity.setText(q);
		itemPrice.setText(p);
		
		if(itemPrice.getText() != null){
			itemPrice.setBounds(200 - (itemPrice.getText().length() * 6), 25, 224, 20);
			itemPrice.setFontSize(16);
			itemPrice.setFontColor(Settings.currentPalette[2]);
		}
		
		
		add(itemName);
		add(quantity);
		add(itemPrice);
	}

}

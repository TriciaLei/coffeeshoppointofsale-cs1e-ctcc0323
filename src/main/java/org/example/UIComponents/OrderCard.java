package org.example.UIComponents;

import java.awt.*;

public class OrderCard extends CoffeePanel{
	
	public CoffeeLabel quantity = new CoffeeLabel("hehe");
	public CoffeeLabel itemName = new CoffeeLabel("hehe");
	public CoffeeLabel itemPrice = new CoffeeLabel("hehe");
	public CoffeeButton plus = new CoffeeButton();
	public CoffeeButton minus = new CoffeeButton();
	public int index = 0;
	
	public OrderCard(String n, String q, String p, int i){
		setBounds(10, 10, 224, 50);
		setBorderColor(new Color(59, 46, 37));
		
		index = i;

		quantity.setBounds(10, 5, 10, 20);
		quantity.setFontSize(16);
		itemName.setBounds(30, 5, 224 ,20);
		itemName.setFontSize(16);
		
		itemName.setText(n);
		quantity.setText(q);
		itemPrice.setText(p);
		
		if(itemPrice.getText() != null){
			itemPrice.setBounds(200 - (itemPrice.getText().length() * 6), 25, 224, 20);
			itemPrice.setBackground(Color.CYAN);
			itemPrice.setFontSize(16);
		}
		
		
		add(itemName);
		add(quantity);
		add(itemPrice);
	}

}

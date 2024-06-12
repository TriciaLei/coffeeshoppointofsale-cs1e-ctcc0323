package org.example.UIComponents;

import java.awt.*;

public class OrderCard extends CoffeePanel{
	
	public CoffeeLabel quantity = new CoffeeLabel("hehe");
	public CoffeeLabel itemName = new CoffeeLabel("hehe");
	public CoffeeLabel itemPrice = new CoffeeLabel("hehe");
	
	public OrderCard(String n, String q, String p){
		setBounds(10, 10, 224, 30);
		setBorderColor(new Color(59, 46, 37));
		

		quantity.setBounds(10, 5, 10, 10);
		itemName.setBounds(30, 5, 60 ,10);
		itemPrice.setBounds(120, 5, 50, 10);
		
		itemName.setText(n);
		quantity.setText(q);
		itemPrice.setText(p);
		
		
		add(quantity);
		add(itemName);
		add(itemPrice);
	}

}

package org.example.UIComponents;

import javax.swing.*;

public class CoffeeCard extends JPanel {
	
//	public CoffeeImage image;
	public CoffeeLabel itemName;
	public CoffeeLabel itemPrice;
	
	public CoffeeCard(ImageIcon icon, String name, String price){
//		image = new CoffeeImage(icon);
		itemName = new CoffeeLabel(name);
		itemPrice = new CoffeeLabel(price);
		
		
		
//		add(image);
		add(itemName);
		add(itemName);
	}
}

package org.example.UIComponents;

import javax.swing.*;
import java.awt.*;


public class CoffeeCard extends CoffeePanel {
	
	public CoffeeImage image;
	public CoffeeLabel itemName;
	public CoffeeLabel itemPrice;
	
	public CoffeeCard(ImageIcon icon, String name, String price){
		setBounds(getX(), getY(), 200, 200);
		setBackground(new Color(166, 138, 121, 0));
		
		setBorderColor(new Color(59, 46, 37));
		setBorderThickness(2);
		
		image = new CoffeeImage(icon);
		itemName = new CoffeeLabel(name);
		itemPrice = new CoffeeLabel(price);
		
		image.setLocation(40, 45);

		itemName.setBounds(50, 10, getWidth(), 30);
		itemName.setFontColor(new Color(125, 88, 67));
		itemName.setFontSize(20);
		
		
		if(price != null){
			itemPrice.setBounds(70, 150, getWidth(), 30);
			itemPrice.setFontColor(new Color(59, 46, 37));
		}
		
		
		add(itemName);
		add(itemPrice);
		add(image);
		
		
	}
}

package org.example.UIComponents;

import org.example.Settings;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;


public class CoffeeCard extends CoffeePanel {
	
	public CoffeeImage image;
	public CoffeeLabel itemName;
	public CoffeeLabel itemPrice;
	
	public CoffeeCard(ImageIcon icon, String name, String price){
		setBounds(getX(), getY(), 200, 200);
		setBackground(Settings.currentPalette[1]);
		
		setBorderColor(Settings.currentPalette[2]);
		setBorderThickness(2);
		
		image = new CoffeeImage(icon);
		itemName = new CoffeeLabel(name);
		itemPrice = new CoffeeLabel(price);
		
		image.setLocation(40, 45);

		itemName.setBounds(50, 10, getWidth(), 30);
		itemName.setFontColor(Settings.currentPalette[2]);
		itemName.setFontSize(20);
		
		
		if(price != null){
			itemPrice.setBounds(80 - itemPrice.getText().length(), 170, getWidth(), 30);
			itemPrice.setFontSize(16);
			itemPrice.setFontColor(Settings.currentPalette[2]);
			itemPrice.setText("P" + price + ".00");
		}
		
		
		add(itemName);
		add(itemPrice);
		add(image);
		
		
	}
}

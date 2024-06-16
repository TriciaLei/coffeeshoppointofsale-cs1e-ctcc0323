package org.example.UIComponents;

import org.example.MenuData;
import org.example.Settings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class InventoryItemCard extends CoffeePanel{
	
	public static int id = 0;
	public CoffeeLabel itemName;
	public CoffeeLabel itemPrice;
	public CoffeeLabel itemCategory;
	public static JFrame frame;
	
	private MenuData data;
	
	public InventoryItemCard(String name, String price, String category, String path, MenuData data){
		
		this.data = data;
		addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
			
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackground(new Color(140, 185, 189));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(Settings.currentPalette[1]);
			}
			
		});
		
		
		setBounds(10, 10, 1200, 80);
		setBorderColor(Settings.currentPalette[2]);
		setBorderThickness(2);
		setBackground(Settings.currentPalette[1]);
		
		itemName = new CoffeeLabel(name);
		itemPrice = new CoffeeLabel(price);
		itemCategory = new CoffeeLabel(category);
		
		itemCategory.setBounds(10, 10, 1200, 30);
		itemCategory.setFontSize(28);
		itemCategory.setFontColor(new Color(128, 61, 59));
		
		itemName.setText("Item Name: " + name);
		itemName.setBounds(10, 50, 1200, 30);
		itemName.setFontSize(24);
		itemName.setFontColor(Settings.currentPalette[2]);
		
		itemPrice.setBounds(1000, 50, 200, 30);
		itemPrice.setFontSize(24);
		itemPrice.setFontColor(Settings.currentPalette[2]);
		
		
		id++;
		
		add(itemName);
		add(itemPrice);
		add(itemCategory);
	
	}
	
	
	
}

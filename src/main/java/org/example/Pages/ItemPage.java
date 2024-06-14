package org.example.Pages;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;

import org.example.Window;
import org.example.UIComponents.CoffeeLabel;
import org.example.UIComponents.CoffeePanel;


public class ItemPage extends CoffeePanel {

	
	public CoffeeLabel ItemLabel = new CoffeeLabel("Inventory Items");
	public CoffeeLabel Products = new CoffeeLabel("Products");
	public CoffeeLabel ItemPriceList = new CoffeeLabel("Item Price List");
	public CoffeeLabel ItemSize = new CoffeeLabel("Item Size");
	public JScrollPane scroll = new JScrollPane();
	
	
	public CoffeePanel panel1 = new CoffeePanel();
	public CoffeePanel panel2 = new CoffeePanel();
	public CoffeePanel panel3 = new CoffeePanel();
	public CoffeePanel panel4 = new CoffeePanel();

	
	
	public ItemPage() {
	
		
		
		ItemLabel.setLocation(470,1);
		ItemLabel.setSize(800,70);
		ItemLabel.setFontSize(50);
		
		
		Products.setLocation(180,90);
		Products.setSize(300,70);
		Products.setFontSize(30);
		
		
	
		
		ItemPriceList.setLocation(510,90);
		ItemPriceList.setSize(300,70);
		ItemPriceList.setFontSize(30);
		

		
		ItemSize.setLocation(970,90);
		ItemSize.setSize(300,70);
		ItemSize.setFontSize(30);
		
	

		
		panel4.setBackground(new Color(254, 216, 177));
		panel4.setBounds(50,100,1160,720);
		panel3.setBackground(new Color(236, 177, 118));
		panel3.setBounds(0,0,1280,720);
		panel2.setBackground(new Color(254, 216, 177));
		panel2.setBounds(0,0,1280,90);
		panel1.setBackground(new Color(166, 123, 91));
		panel1.setBounds(30,10,1200,720);
		
		
		
		
		this.setBackground(new Color(228, 197, 158));

	
		
		add(Products);
		add(ItemPriceList);
		add(ItemSize);
		add(ItemLabel);
		add(panel4);
		add(panel2);
		add(panel1);
		add(panel3);
		

		
	     
	
	}
	
}

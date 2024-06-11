package org.example.Pages.MenuPage;

import org.example.UIComponents.CoffeeCard;
import org.example.UIComponents.CoffeePanel;

import javax.swing.*;
import java.awt.*;

public class MenuTypePanel extends CoffeePanel {
	
	public CoffeeCard hotCoffee;
	public CoffeeCard coldCoffee;
	public CoffeeCard tea;
	public CoffeeCard specialty;
	public CoffeeCard pastries;
	public CoffeeCard sandwiches;
	public CoffeeCard salads;
	public CoffeeCard smoothies;
	public CoffeeCard extras;
	
	
	
	public MenuTypePanel(){
		setBounds(10, 60, 956, 720);
		setPreferredSize(new Dimension(956, 720));
		setBackground(new Color(240, 230, 214));
		
		
		hotCoffee = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Hot Coffee", null);
		coldCoffee = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Cold Coffee", "4");
		tea = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Tea", null);
		specialty = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Specialty Drinks", null);
		pastries = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Pastries", null);
		sandwiches = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Sandwiches", null);
		salads = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Salads", null);
		smoothies = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Smoothies", null);
		extras = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Extras", null);
		
		hotCoffee.setLocation(20, 10);
		coldCoffee.setLocation(260, 10);
		
		tea.setLocation(490, 10);
		tea.itemName.setLocation(80, tea.itemName.getY());
		
		specialty.setLocation(720, 10);
		specialty.itemName.setLocation(35, specialty.itemName.getY());
		
		pastries.setLocation(20, 260);
		pastries.itemName.setLocation(65, pastries.itemName.getY());
		
		sandwiches.setLocation(260, 260);
		sandwiches.itemName.setLocation(55, sandwiches.itemName.getY());
		
		salads.setLocation(490, 260);
		salads.itemName.setLocation(70, salads.itemName.getY());
		
		smoothies.setLocation(720, 260);
		smoothies.itemName.setLocation(55, smoothies.itemName.getY());
		
		
		extras.setLocation(20, 490);
		extras.itemName.setLocation(70, extras.itemName.getY());
		
		
		
		
		
		add(hotCoffee);
		add(coldCoffee);
		add(tea);
		add(specialty);
		add(pastries);
		add(sandwiches);
		add(salads);
		add(smoothies);
		add(extras);
		
		
	}
}

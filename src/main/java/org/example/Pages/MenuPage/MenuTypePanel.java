package org.example.Pages.MenuPage;

import org.example.UIComponents.CoffeeCard;
import org.example.UIComponents.CoffeePanel;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
	
	
	private ArrayList<CoffeeCard> coffeeCards = new ArrayList<>();
	
	
	public MenuTypePanel(){
		setBounds(10, 60, 956, 720);
		setPreferredSize(new Dimension(956, 720));
		setBackground(new Color(240, 230, 214));
		
		
//		hotCoffee = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Hot Coffee", null);
//		coldCoffee = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Cold Coffee", "4");
//		tea = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Tea", null);
//		specialty = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Specialty Drinks", null);
//		pastries = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Pastries", null);
//		sandwiches = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Sandwiches", null);
//		salads = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Salads", null);
//		smoothies = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Smoothies", null);
//		extras = new CoffeeCard(new ImageIcon("coffee-cup.png"), "Extras", null);
//
//		hotCoffee.setLocation(20, 10);
//		coldCoffee.setLocation(260, 10);
//
//		tea.setLocation(490, 10);
//		tea.itemName.setLocation(80, tea.itemName.getY());
//
//		specialty.setLocation(720, 10);
//		specialty.itemName.setLocation(35, specialty.itemName.getY());
//
//		pastries.setLocation(20, 260);
//		pastries.itemName.setLocation(65, pastries.itemName.getY());
//
//		sandwiches.setLocation(260, 260);
//		sandwiches.itemName.setLocation(55, sandwiches.itemName.getY());
//
//		salads.setLocation(490, 260);
//		salads.itemName.setLocation(70, salads.itemName.getY());
//
//		smoothies.setLocation(720, 260);
//		smoothies.itemName.setLocation(55, smoothies.itemName.getY());
//
//
//
//		extras.setLocation(20, 490);
//		extras.itemName.setLocation(70, extras.itemName.getY());
//
//
//
//
		SetUpCards();
		
//		coffeeCards.get(coffeeCards.size() - 2).setBackground(Color.PINK);
		System.out.println("he");
//
//		add(hotCoffee);
//		add(coldCoffee);
//		add(tea);
//		add(specialty);
//		add(pastries);
//		add(sandwiches);
//		add(salads);
//		add(smoothies);
//		add(extras);
//
		
	}
	
	private void SetUpCards() {
		try(BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/MenuTypes.txt"))){
		
			int i = 0;
			String line;
			String path = "";
			String itemName = "";
			String price = "";
			String xLocation = "";
			String yLocation = "";
			String xItemPos = "";
			while((line = reader.readLine()) != null){
				
				switch (i){
					case 0:
						itemName = line;
						i++;
						break;
					case 1:
						path = line;
						i++;
						break;
					case 2:
						if(line.equals("null")){
							price = null;
						}else{
							price = line;
						}
						i++;
						break;
					case 3:
						xLocation = line;
						i++;
						break;
					case 4:
						yLocation = line;
						i++;
						break;
					case 5:
						xItemPos = line;
						i++;
						break;
					default:
						coffeeCards.add(new CoffeeCard(new ImageIcon(path), itemName, price));
						coffeeCards.get(coffeeCards.size() - 1).setLocation(Integer.parseInt(xLocation), Integer.parseInt(yLocation));
						coffeeCards.get(coffeeCards.size() - 1).itemName.setLocation(Integer.parseInt(xItemPos), coffeeCards.get(coffeeCards.size() - 1).itemName.getY());
						//Todo: added the price tag or hide it i don't fucking know anymore HAHAHAHA (help me seriously)
						
						i = 0;
						break;
				}
			}
			
			
			for (CoffeeCard coffeeCard : coffeeCards) {
				
				add(coffeeCard);
			}
		
		
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		
	}
}

package org.example.Pages.MenuPage;

import org.example.CardData;
import org.example.MenuData;
import org.example.Settings;
import org.example.UIComponents.CoffeeCard;
import org.example.UIComponents.CoffeePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class MenuItemsPanel extends CoffeePanel {
	
	
	private ArrayList<CoffeeCard> coffeeCards = new ArrayList<>();
	private OrderPanel orderPanel;
	
	
	private MenuData data;
	
	public MenuItemsPanel(OrderPanel panel, MenuData data){
		
		this.data = data;
		
		setBounds(10, 60, 956, 720);
		setPreferredSize(new Dimension(956, 720));
		setBackground(Settings.currentPalette[1]);
		
		orderPanel = panel;
		
	}
	
	public void SetUpCards(String type) {
		
		int greatestYLocation = 0;
		int currentYLocation = 0;
		
		for (Map.Entry<CardData, String> set : data.itemCards.entrySet()){
			
			if(type.equals(set.getValue())){
				CoffeeCard coffeeCard = new CoffeeCard(new ImageIcon(set.getKey().imagePath), set.getKey().name, set.getKey().price);
				coffeeCard.setLocation(Integer.parseInt(set.getKey().xPos), Integer.parseInt(set.getKey().yPos));
				coffeeCard.itemName.setLocation(Integer.parseInt(set.getKey().xItemPos), coffeeCard.itemName.getY());
				
				coffeeCards.add(coffeeCard);
			}
		}

			
		int i = 0;
		for (CoffeeCard coffeeCard : coffeeCards) {
				
			MouseListener mouseListener = new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					orderPanel.addOrderList("1", coffeeCard.itemName.getText(), coffeeCard.itemPrice.getText());
						
				}
					
				@Override
				public void mousePressed(MouseEvent e) {
				
				}
					
				@Override
				public void mouseReleased(MouseEvent e) {
					
				}
					
				@Override
				public void mouseEntered(MouseEvent e) {
					
				}
					
				@Override
				public void mouseExited(MouseEvent e) {
					
				}
			};
				
			coffeeCard.addMouseListener(mouseListener);
			coffeeCard.image.addMouseListener(mouseListener);
			add(coffeeCard);
			
			if(i >= 1){
				greatestYLocation = Math.max(greatestYLocation, coffeeCard.getY());
			}else{
				greatestYLocation = coffeeCard.getY();
			}

			i++;
		}
		
		setSize(getX(),greatestYLocation + 270);
		setPreferredSize(new Dimension(getWidth(), greatestYLocation  + 270));
		
	}
	
	public void RemoveCards(){
		removeAll();
		coffeeCards.clear();
	}
}

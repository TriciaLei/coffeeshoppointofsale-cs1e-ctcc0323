package org.example.Pages.MenuPage;

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
import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;

public class MenuItemsPanel extends CoffeePanel {
	
	private String type;
	
	private ArrayList<CoffeeCard> coffeeCards = new ArrayList<>();
	private OrderPanel orderPanel;
	private String[] order = new String[1024];
	private ArrayList<String> orderList = new ArrayList<>();
	
	public MenuItemsPanel(OrderPanel panel){
		setBounds(10, 60, 956, 720);
		setPreferredSize(new Dimension(956, 720));
		setBackground(Settings.currentPalette[1]);
		
		orderPanel = panel;
		
	}
	
	public void SetUpCards(String type) {
		try(BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/items/" + type  + ".txt"))){

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
						i = 0;
						break;
				}

			}

			
			
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
			}
			
			setSize(getX(), Integer.parseInt(yLocation) + 270);
			setPreferredSize(new Dimension(getWidth(), Integer.parseInt(yLocation) + 270));
			
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void RemoveCards(){
		removeAll();
		coffeeCards.clear();
	}
}

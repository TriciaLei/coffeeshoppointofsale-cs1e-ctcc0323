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
import java.util.ArrayList;

public class MenuTypePanel extends CoffeePanel {
	
	
	private ArrayList<CoffeeCard> coffeeCards = new ArrayList<>();
	
	public MenuTypePanel(MenuPage page){
		setBounds(10, 60, 956, 720);
		setPreferredSize(new Dimension(956, 720));
		setBackground(Settings.currentPalette[1]);
		setBorderColor(Settings.currentPalette[2]);
		setBorder(BorderFactory.createLineBorder(Settings.currentPalette[2], 2, true));
		SetUpCards();
		
		
		
		for (CoffeeCard c: coffeeCards){
			MouseListener mouseListener = new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					page.changeMenuPanelToItems(c.itemName.getText());
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
				
				}
				
				@Override
				public void mouseReleased(MouseEvent e) {
				
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
//				setBackground(Color.PINK);
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
				
				}
			};
			c.addMouseListener(mouseListener);
			c.image.addMouseListener(mouseListener);
		}
		
		
		
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

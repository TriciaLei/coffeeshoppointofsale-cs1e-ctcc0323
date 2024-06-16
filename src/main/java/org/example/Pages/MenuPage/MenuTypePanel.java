package org.example.Pages.MenuPage;

import org.example.MenuData;
import org.example.Settings;
import org.example.UIComponents.CoffeeCard;
import org.example.UIComponents.CoffeePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MenuTypePanel extends CoffeePanel {
	
	
	private ArrayList<CoffeeCard> coffeeCards = new ArrayList<>();
	
	private MenuPage menuPage;
	
	private MenuData data;
	
	public MenuTypePanel(MenuPage page, MenuData data){
		
		this.data = data;
		this.menuPage = page;
		
		setBounds(10, 60, 956, 720);
		setPreferredSize(new Dimension(956, 720));
		setBackground(Settings.currentPalette[1]);
		setBorderColor(Settings.currentPalette[2]);
		setBorder(BorderFactory.createLineBorder(Settings.currentPalette[2], 2, true));
		
		
		SetUpCards();
		
		
		
	}
	
	// Sets Up and place the menu category cards and add it to the panel
	private void SetUpCards() {
		for (int i = 0; i < data.categoryCards.size(); i++){
			CoffeeCard coffeeCard = new CoffeeCard(new ImageIcon(data.categoryCards.get(i).imagePath), data.categoryCards.get(i).name, data.categoryCards.get(i).price);
			coffeeCard.setLocation(Integer.parseInt(data.categoryCards.get(i).xPos), Integer.parseInt(data.categoryCards.get(i).yPos));
			coffeeCard.itemName.setLocation(Integer.parseInt(data.categoryCards.get(i).xItemPos), coffeeCard.itemName.getY());
			add(coffeeCard);
			coffeeCards.add(coffeeCard);
		}
		
		
		for (CoffeeCard c: coffeeCards){
			MouseListener mouseListener = new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					menuPage.changeMenuPanelToItems(c.itemName.getText());
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
			c.addMouseListener(mouseListener);
			c.image.addMouseListener(mouseListener);
		}
		
		
	}
}

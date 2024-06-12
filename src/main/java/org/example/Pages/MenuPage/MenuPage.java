package org.example.Pages.MenuPage;

import org.example.UIComponents.CoffeeButton;
import org.example.UIComponents.CoffeePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPage extends CoffeePanel {
	
	public CoffeeButton backButton = new CoffeeButton();
	public OrderPanel orderPanel = new OrderPanel();
	public MenuTypePanel menuTypePanel = new MenuTypePanel(this);
	public  MenuItemsPanel menuItemsPanel = new MenuItemsPanel();
	
	public JScrollPane menuTypeScroll = new JScrollPane(menuTypePanel);
	public JScrollPane menuItemScroll = new JScrollPane(menuItemsPanel);
	
	public MenuPage(){
		this.setBackground(new Color(166, 138, 121));
		
		menuTypeScroll.setBounds(10, 60, 956, 600);
		menuTypeScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		menuTypeScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		menuTypeScroll.setWheelScrollingEnabled(true);
		menuTypeScroll.setVisible(true);
		
		menuItemScroll.setBounds(10, 60, 956, 600);
		menuItemScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		menuItemScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		menuItemScroll.setWheelScrollingEnabled(true);
		menuItemScroll.setVisible(false);
		
		
		backButton.setText("Back");
		backButton.setFontColor(new Color(59, 46, 37));
		backButton.setBounds(10, 15, 100, 30);
		backButton.setBackground(new Color(240, 230, 214));
		backButton.setBorderColor(new Color(0, 0, 0));
		backButton.setFontSize(16);
		
		
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(menuTypeScroll.isVisible()){
					//back to the dine in or take out page
				}else if(!menuTypeScroll.isVisible()){
					changeMenuPanelToTypes();
				}
			}
		});
		
		add(menuTypeScroll);
		add(menuItemScroll);
		add(backButton);
		add(orderPanel);
		
		
		
		
	}
	
	
	public void changeMenuPanelToItems(String type){
		menuItemsPanel.SetUpCards(type);
		
		menuItemScroll.setVisible(true);
		menuTypeScroll.setVisible(false);
	}
	public void changeMenuPanelToTypes(){
		menuItemsPanel.RemoveCards();
		
		menuItemScroll.setVisible(false);
		menuTypeScroll.setVisible(true);
	}
}

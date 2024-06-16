package org.example.Pages.MenuPage;

import org.example.*;
import org.example.UIComponents.CoffeeButton;
import org.example.UIComponents.CoffeePanel;
import org.example.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPage extends CoffeePanel {
	
	public CoffeeButton backButton;
	public OrderPanel orderPanel;
	public MenuTypePanel menuTypePanel;
	public  MenuItemsPanel menuItemsPanel;
	
	public JScrollPane menuTypeScroll;
	public JScrollPane menuItemScroll;
	
	private int scrollSpeed = 16;
	
	public MenuPage(MenuData data){
		
		
		backButton = new CoffeeButton();
		orderPanel = new OrderPanel();
		menuTypePanel = new MenuTypePanel(this, data);
		menuItemsPanel = new MenuItemsPanel(orderPanel, data);
		menuTypeScroll = new JScrollPane(menuTypePanel);
		menuItemScroll = new JScrollPane(menuItemsPanel);
		
		
		this.setBackground(Settings.currentPalette[0]);
		
		menuTypeScroll.setBounds(10, 60, 956, 600);
		menuTypeScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		menuTypeScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		menuTypeScroll.setWheelScrollingEnabled(true);
		menuTypeScroll.getVerticalScrollBar().setUnitIncrement(16);
		menuTypeScroll.setVisible(true);
		
		menuItemScroll.setBounds(10, 60, 956, 600);
		menuItemScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		menuItemScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		menuItemScroll.setWheelScrollingEnabled(true);
		menuItemScroll.getVerticalScrollBar().setUnitIncrement(scrollSpeed);
		menuItemScroll.setVisible(false);
		
		
		
		
		
		
		backButton.setText("Back");
		backButton.setFontColor(Settings.currentPalette[2]);
		backButton.setBounds(10, 15, 100, 30);
		backButton.setBackground(Settings.currentPalette[1]);
		backButton.setBorderColor(Settings.currentPalette[2]);
		backButton.setFontSize(scrollSpeed);
		
		
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(menuTypeScroll.isVisible()){
					Window.changePage(Page.DineInTakeOut);
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

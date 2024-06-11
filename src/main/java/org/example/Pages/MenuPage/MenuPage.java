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
	public MenuTypePanel menuTypePanel = new MenuTypePanel();
	public MenuItemsPanel menuItemsPanel = new MenuItemsPanel();
	public MenuPage(){
		this.setBackground(new Color(166, 138, 121));
		
		JScrollPane menuPanelScroll = new JScrollPane(menuTypePanel);
		menuPanelScroll.setBounds(10, 60, 956, 600);
		menuPanelScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		menuPanelScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		menuPanelScroll.setWheelScrollingEnabled(true);
		
		backButton.setText("Back");
		backButton.setFontColor(new Color(59, 46, 37));
		backButton.setBounds(10, 15, 100, 30);
		backButton.setBackground(new Color(240, 230, 214));
		backButton.setBorderColor(new Color(0, 0, 0));
		backButton.setFontSize(16);
		
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(menuTypePanel.isVisible()){
					//back to the dine in or take out page
				}else if(!menuTypePanel.isVisible()){
					menuTypePanel.setVisible(true);
					menuItemsPanel.setVisible(false);
				}
			}
		});
		
		add(menuPanelScroll);
		add(backButton);
		add(orderPanel);
		
		
	}
}

package org.example.Pages.MenuPage;

import org.example.UIComponents.CoffeePanel;

import javax.swing.*;
import java.awt.*;

public class MenuPage extends CoffeePanel {
	
	public MenuHeader menuHeader = new MenuHeader();
	public OrderPanel orderPanel = new OrderPanel();
	public MenuTypePanel menuTypePanel = new MenuTypePanel();
	
	public MenuPage(){
		this.setBackground(new Color(166, 138, 121));
		
		JScrollPane menuPanelScroll = new JScrollPane(menuTypePanel);
		menuPanelScroll.setBounds(10, 60, 956, 600);
		menuPanelScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		menuPanelScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		menuPanelScroll.setWheelScrollingEnabled(true);
		
		add(menuPanelScroll);
		add(menuHeader);
		add(orderPanel);
		
		
	}
}

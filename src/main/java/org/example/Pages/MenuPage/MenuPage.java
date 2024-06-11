package org.example.Pages.MenuPage;

import org.example.UIComponents.CoffeePanel;

import java.awt.*;

public class MenuPage extends CoffeePanel {
	
	public MenuHeader menuHeader = new MenuHeader();
	public OrderPanel orderPanel = new OrderPanel();
	public Menu menu = new Menu();
	
	public MenuPage(){
		this.setBackground(new Color(166, 138, 121));
		
		add(menu);
		add(menuHeader);
		add(orderPanel);
		
		
	}
}

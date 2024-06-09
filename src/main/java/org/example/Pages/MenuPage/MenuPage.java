package org.example.Pages.MenuPage;

import org.example.UIComponents.CoffeePanel;

import java.awt.*;

public class MenuPage extends CoffeePanel {
	
	public OrderPanel orderPanel = new OrderPanel();
	
	public MenuPage(){
		this.setBackground(new Color(240, 230, 214));
		
		add(orderPanel);
		
		
	}
}

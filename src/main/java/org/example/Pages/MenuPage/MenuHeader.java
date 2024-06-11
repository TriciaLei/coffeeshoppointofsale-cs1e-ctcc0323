package org.example.Pages.MenuPage;

import org.example.UIComponents.CoffeeButton;
import org.example.UIComponents.CoffeePanel;

import javax.swing.*;
import java.awt.*;

public class MenuHeader extends CoffeePanel {

	public CoffeeButton buttonHotDrinks = new CoffeeButton();
	public CoffeeButton buttonColdDrinks = new CoffeeButton();

	
	public MenuHeader(){
		setBounds(0, 0, 976, 60);
		setBackground(new Color(166, 138, 121));

		buttonHotDrinks.setText("Hot Drinks");
		buttonHotDrinks.setFontColor(new Color(59, 46, 37));
		buttonHotDrinks.setBounds(10, 15, 100, 30);
		buttonHotDrinks.setBackground(new Color(240, 230, 214));
		buttonHotDrinks.setBorderColor(new Color(0, 0, 0));
		buttonHotDrinks.setFontSize(16);
		
		buttonColdDrinks.setText("Cold Drinks");
		buttonColdDrinks.setFontColor(new Color(59, 46, 37));
		buttonColdDrinks.setBounds(120, 15, 100, 30);
		buttonColdDrinks.setBackground(new Color(240, 230, 214));
		buttonColdDrinks.setBorderColor(new Color(0, 0, 0));
		buttonColdDrinks.setFontSize(16);
		
	
		//TODO: Hey future me, Read this you fucker https://www.geeksforgeeks.org/java-jscrollpane/
		add(buttonHotDrinks);
		add(buttonColdDrinks);
	}
}

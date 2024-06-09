package org.example.Pages.MenuPage;

import org.example.UIComponents.CoffeeLabel;
import org.example.UIComponents.CoffeePanel;

import javax.swing.*;
import java.awt.*;

public class OrderPanel extends CoffeePanel {
	
	private int currentSale = 0;
	private CoffeeLabel currentItemLabel = new CoffeeLabel("Current Items " + "(" + currentSale + ")");
	private CoffeePanel checkListPanel = new CoffeePanel();
	
	JList<CoffeePanel> myList = new JList<>();
	
	
	
	public OrderPanel(){
		setBounds(976, 0, 304, 720);
		setBackground(new Color(166, 138, 121));
		
		currentItemLabel.setBounds(55 , 20, 200, 30);
		currentItemLabel.setFontSize(24);
		currentItemLabel.setFontColor(new Color(59, 46, 37));


		checkListPanel.setBounds(16, 60, 254, 600);
		checkListPanel.setBackground(new Color(240, 230, 214));
		
		add(currentItemLabel);
		add(checkListPanel);
		
		
	}
}

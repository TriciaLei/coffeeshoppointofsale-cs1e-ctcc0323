package org.example.Pages.MenuPage;

import org.example.UIComponents.CoffeeButton;
import org.example.UIComponents.CoffeeLabel;
import org.example.UIComponents.CoffeePanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class OrderPanel extends CoffeePanel {
	
	private int currentSale = 0;
	private CoffeeLabel currentItemLabel = new CoffeeLabel("Current Items " + "(" + currentSale + ")");
	private CoffeePanel checkListPanel = new CoffeePanel();
	
	private CoffeeButton charge = new CoffeeButton("Charge");
	private JScrollPane orderScroll = new JScrollPane(checkListPanel);
	
	
	
	public OrderPanel(){
		setBounds(976, 0, 304, 720);
		setPreferredSize(new Dimension(304, 720));
		setBackground(new Color(166, 138, 121));
		
		
		
		currentItemLabel.setBounds(55 , 20, 200, 30);
		currentItemLabel.setFontSize(24);
		currentItemLabel.setFontColor(new Color(59, 46, 37));


		checkListPanel.setBounds(16, 60, 254, 520);
		checkListPanel.setBackground(new Color(240, 230, 214));
		
		orderScroll.setBounds(checkListPanel.getX(), checkListPanel.getY(), checkListPanel.getWidth(), 520);
		orderScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		orderScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		orderScroll.setWheelScrollingEnabled(true);
		orderScroll.getVerticalScrollBar().setUnitIncrement(16);
		
		charge.setBounds(40, 600, 200, 40);
		
		
		
		
		add(orderScroll);
		add(charge);
		add(currentItemLabel);
		
		
	}
	
	public void addOrderList(String[] list){
//		orderList = new JList<>(list);
	}
}

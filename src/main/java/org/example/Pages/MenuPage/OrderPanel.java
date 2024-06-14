package org.example.Pages.MenuPage;

import org.example.Settings;
import org.example.UIComponents.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class OrderPanel extends CoffeePanel {
	
	private int currentItems = 0;
	private int cardCounter = 0;
	private CoffeeLabel currentItemLabel = new CoffeeLabel("Current Items " + "(" + currentItems + ")");
	private CoffeePanel checkListPanel = new CoffeePanel();
	
	private CoffeeButton charge = new CoffeeButton("Charge");
	private JScrollPane orderScroll = new JScrollPane(checkListPanel);
	
	private CoffeePanel totalPanel = new CoffeePanel();
	
	private double currentTotal = 0;
	private CoffeeLabel totalLabel = new CoffeeLabel("Total: P" + currentTotal);
	
	
	public OrderPanel(){
		setBounds(976, 0, 304, 720);
		setBackground(Settings.currentPalette[0]);
		
		currentItemLabel.setBounds(55 , 20, 200, 30);
		currentItemLabel.setFontSize(24);
		currentItemLabel.setFontColor(Settings.currentPalette[2]);
		
		checkListPanel.setBounds(16, 60, 254, 440);
		checkListPanel.setPreferredSize(new Dimension(254, 440));
		checkListPanel.setBackground(Settings.currentPalette[1]);
		orderScroll.setBorder(BorderFactory.createLineBorder(Settings.currentPalette[2]));
		
		orderScroll.setBounds(checkListPanel.getX(), checkListPanel.getY(), checkListPanel.getWidth(), checkListPanel.getHeight() + 20);
		orderScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		orderScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		orderScroll.setWheelScrollingEnabled(true);
		orderScroll.getVerticalScrollBar().setUnitIncrement(16);
		
		totalPanel.setBounds(16, 530, 254, 40);
		totalPanel.setBackground(Settings.currentPalette[1]);
		totalPanel.setBorderColor(Settings.currentPalette[2]);
		totalLabel.setBounds(10, 0, totalPanel.getWidth(), totalPanel.getHeight());
		totalLabel.setFontSize(16);
		
		
		
		charge.setBounds(40, 600, 200, 40);
		charge.setBackground(Settings.currentPalette[1]);
		charge.setFontColor(Settings.currentPalette[2]);
		charge.setBorderColor(Settings.currentPalette[2]);
		charge.setBorderThickness(2);
		charge.setFontSize(24);
		
		
		charge.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		totalPanel.add(totalLabel);
		add(totalPanel);
		add(orderScroll);
		add(charge);
		add(currentItemLabel);
		
		
	}
	
	private void calculateTotalItem(){
		currentTotal = 0;
		currentItems = 0;
		
		for (Component c :  checkListPanel.getComponents()){
			if(c instanceof OrderCard){
				currentTotal += Double.parseDouble(((OrderCard) c).itemPrice.getText().substring(1)) * Double.parseDouble(((OrderCard) c).quantity.getText());
				currentItems += Integer.parseInt(((OrderCard) c).quantity.getText());
			}
		}
		
		totalLabel.setText("Total: " + currentTotal);
		currentItemLabel.setText("Current Items " + "(" + currentItems + ")");
		checkListPanel.updateUI();
		totalLabel.updateUI();
	}
	
	
	public void addOrderList(String quantity, String name, String price){

		boolean isDuplicate = false;

		for (Component c :  checkListPanel.getComponents()){
			if(c instanceof OrderCard && ((OrderCard) c).itemName.getText() == name){
				int num = Integer.parseInt(((OrderCard) c).quantity.getText());
				num++;
				((OrderCard) c).quantity.setText(String.valueOf(num));
				isDuplicate = true;
			}
		}

		if(!isDuplicate){
			OrderCard order = new OrderCard(name, quantity, price, cardCounter);
			
			//determines if the order cards in the panel is the first one to add or not
			if(currentItems != 0){
				order.setLocation(order.getX(), (checkListPanel.getComponent(checkListPanel.getComponentCount() - 1).getY() + order.getHeight()) + 10);
			}else{
				order.setLocation(order.getX(), 20);
			}

			//If the order list is full of items expand the checklistPanel
			if(cardCounter >= 7){
				checkListPanel.setSize(checkListPanel.getWidth(), checkListPanel.getHeight() + order.getHeight() + 20);
				checkListPanel.setPreferredSize(new Dimension(checkListPanel.getWidth(), checkListPanel.getHeight()));
				System.out.println(checkListPanel.getWidth() + " : " + checkListPanel.getHeight());
			}

			order.addMouseListener(new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					RemoveOrderItem(order.index, order.itemName.getText());
					
					// Adjust the index of each item
					int i = 0;
					for (Component c : checkListPanel.getComponents()){
						
						if(c instanceof OrderCard){
							((OrderCard) c).index = i;
						}
						i++;
					}
				}

				@Override
				public void mousePressed(MouseEvent e) {

				}

				@Override
				public void mouseReleased(MouseEvent e) {

				}

				@Override
				public void mouseEntered(MouseEvent e) {
					order.setBackground(new Color(128, 61, 59));
				}

				@Override
				public void mouseExited(MouseEvent e) {
					order.setBackground(Settings.currentPalette[3]);
				}
			});
			
			
			checkListPanel.add(order);
			cardCounter++;
			
			
			
		}
		
		calculateTotalItem();
		
		
	}
	
	
	// Fuck this code I'm sorry future me HAHAHAHA, there might be some better way of doing this
	// like for example making the layout manager a box layout, but I'm too high rn so cant think lmao
	
	// So basically what I did here is
	// Firstly, I removed the desired order item to the panel
	// Then, I stored that state to a temporary variable
	// I then remove all the components to the checkList panel
	// adjusted all the position then add it to the checklist panel
	public void RemoveOrderItem(int index, String name){
		
		boolean isDuplicate = false;

		for (Component c : checkListPanel.getComponents()){
			if(c instanceof OrderCard && ((OrderCard) c).itemName.getText() == name){
				int num = Integer.parseInt(((OrderCard) c).quantity.getText());

				if(num <= 1){
					isDuplicate = false;
					break;
				}else{
					num--;
					((OrderCard) c).quantity.setText(String.valueOf(num));
					isDuplicate = true;
				}
				
			}
		}
		
		
		if(!isDuplicate){
			checkListPanel.remove(index);
			checkListPanel.updateUI();

			var tmp = checkListPanel.getComponents();

			checkListPanel.removeAll();

			int i = 0;
			for (Component c :  tmp) {
				if (i != 0) {
					c.setLocation(c.getX(), (checkListPanel.getComponent(checkListPanel.getComponentCount() - 1).getY() + c.getHeight()) + 10);
				} else {
					c.setLocation(c.getX(), 20);
				}
				i++;

				System.out.println(c.getX() +" : " + c.getY());

				checkListPanel.add(c);
			}
			
		}
		
		//Calculate the price of the total orders
		calculateTotalItem();

	}
}

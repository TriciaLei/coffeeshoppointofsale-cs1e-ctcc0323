package org.example.Pages.MenuPage;

import org.example.UIComponents.CoffeeButton;
import org.example.UIComponents.CoffeeLabel;
import org.example.UIComponents.CoffeePanel;
import org.example.UIComponents.OrderCard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class OrderPanel extends CoffeePanel {
	
	private int currentSale = 0;
	private CoffeeLabel currentItemLabel = new CoffeeLabel("Current Items " + "(" + currentSale + ")");
	private CoffeePanel checkListPanel = new CoffeePanel();
	
	private CoffeeButton charge = new CoffeeButton("Charge");
	private JScrollPane orderScroll = new JScrollPane(checkListPanel);
	
	
	
	public OrderPanel(){
		setBounds(976, 0, 304, 720);
		setBackground(new Color(166, 138, 121));
		
		
		
		currentItemLabel.setBounds(55 , 20, 200, 30);
		currentItemLabel.setFontSize(24);
		currentItemLabel.setFontColor(new Color(59, 46, 37));


		checkListPanel.setBounds(16, 60, 254, 500);
		checkListPanel.setPreferredSize(new Dimension(254, 500));
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
			OrderCard tmp = new OrderCard(name, quantity, price, currentSale);
			if(currentSale != 0){
				tmp.setLocation(tmp.getX(), (checkListPanel.getComponent(checkListPanel.getComponentCount() - 1).getY() + tmp.getHeight()) + 10);
			}else{
				tmp.setLocation(tmp.getX(), 20);
			}

			//If the order list is full of items expand the checklistPanel
			if(currentSale % 8 == 0){
				checkListPanel.setSize(checkListPanel.getWidth(), checkListPanel.getHeight() + (tmp.getHeight() * checkListPanel.getComponentCount()));
				checkListPanel.setPreferredSize(new Dimension(checkListPanel.getWidth(), checkListPanel.getHeight()));
				System.out.println(checkListPanel.getWidth() + " : " + checkListPanel.getHeight());
			}

			tmp.addMouseListener(new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// Remove the item
					RemoveOrderItem(tmp.index, tmp.itemName.getText());

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
					tmp.setBackground(Color.RED);
				}

				@Override
				public void mouseExited(MouseEvent e) {
					tmp.setBackground(Color.white);
				}
			});
			checkListPanel.add(tmp);
			currentSale++;
			currentItemLabel.setText("Current Items " + "(" + currentSale + ")");
			checkListPanel.updateUI();
		}

		
		
	}
	
	
	// Fuck this code I'm sorry future me HAHAHAHA, there might be some better way of doing this
	// like for example making the layout manager a box layout, but I'm too high rn so cant think lmao
	
	// So basically what I did here is
	// Firstly, I removed the desired order item to the panel
	// Then, I stored that state to a temporary variable
	// I then remove all the components to the checkList panel
	// adjusted all the position then add it to the check list panel
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

			currentSale--;
			currentItemLabel.setText("Current Items " + "(" + currentSale + ")");

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

			checkListPanel.updateUI();
		}

	}
}

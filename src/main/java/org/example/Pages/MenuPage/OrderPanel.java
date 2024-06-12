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


		checkListPanel.setBounds(16, 60, 254, 720);
		checkListPanel.setPreferredSize(new Dimension(254, 720));
		checkListPanel.setBackground(new Color(240, 230, 214));
		checkListPanel.setLayout(new BoxLayout(checkListPanel, BoxLayout.Y_AXIS));
		
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
		
		OrderCard tmp = new OrderCard(name, quantity, price, currentSale);
		
		if(currentSale != 0){
			tmp.setLocation(tmp.getX(), (checkListPanel.getComponent(checkListPanel.getComponentCount() - 1).getY() + tmp.getHeight()) + 10);
		}else{
			tmp.setLocation(tmp.getX(), 20);
		}
		
		
		checkListPanel.setSize(checkListPanel.getWidth(), checkListPanel.getHeight() + (tmp.getHeight() * checkListPanel.getComponentCount()));
		System.out.println(checkListPanel.getWidth() + " : " + checkListPanel.getHeight());
		checkListPanel.setPreferredSize(new Dimension(checkListPanel.getWidth(), checkListPanel.getHeight()));
		
		tmp.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RemoveOrderItem(tmp.index);
				checkListPanel.setSize(checkListPanel.getWidth(), checkListPanel.getHeight() - (tmp.getHeight() * checkListPanel.getComponentCount()));
				System.out.println(checkListPanel.getWidth() + " : " + checkListPanel.getHeight());
				checkListPanel.setPreferredSize(new Dimension(checkListPanel.getWidth(), checkListPanel.getHeight()));
//				tmp.index
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
	
	public void RemoveOrderItem(int index){
		
		
		checkListPanel.remove(index);
		checkListPanel.updateUI();
		
		
		
		currentSale--;
		currentItemLabel.setText("Current Items " + "(" + currentSale + ")");
		
//		int i = 0;
//		for (OrderCard c : (OrderCard[]) checkListPanel.getComponents()){
//			if(i == 0){
//				c.setLocation(c.getX(), 20);
//			}else{
//				c.setLocation(c.getX(), checkListPanel.getComponent(checkListPanel.getComponentCount() - 1).getY() + c.getHeight() + 10);
//				c.index = i;
//			}
//			i++;

//		checkListPanel.updateUI();
	}
}

package org.example.Pages;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import org.example.Window;
import org.example.UIComponents.CoffeeButton;
import org.example.UIComponents.CoffeeCard;
import org.example.UIComponents.CoffeeImage;
import org.example.UIComponents.CoffeeLabel;
import org.example.UIComponents.CoffeePanel;

public class InventoryPage extends CoffeePanel {

	
	public CoffeeLabel InvLabel = new CoffeeLabel("DASHBOARD");
	public CoffeeButton InvBtn = new CoffeeButton("Inventory Items");
	public CoffeeButton Sales = new CoffeeButton("Sales");
	public CoffeeButton OrderHistory = new CoffeeButton("Order History");
	public CoffeeButton Back = new CoffeeButton("Back ⬅");
	public CoffeeImage InventoryItem = new CoffeeImage(new ImageIcon("coffeeshoppointofsale-cs1e-ctcc0323/src/InventoryItem.png"));
	public CoffeeImage cart = new CoffeeImage(new ImageIcon("coffeeshoppointofsale-cs1e-ctcc0323/src/SCart.png"));

	public CoffeePanel panel1 = new CoffeePanel();
	public CoffeePanel panel2 = new CoffeePanel();
	public CoffeePanel panel3 = new CoffeePanel();

	
	
	
	
	public InventoryPage() {
		
		//Corner Frames
		panel1.setBackground(new Color(166, 123, 91));
		panel1.setBounds(0,0,150,720);
		panel2.setBackground(new Color(166, 123, 91));
		panel2.setBounds(1120,0,150,720);
		
		//Inventory Header
		InvLabel.setLocation(490,1);
		InvLabel.setSize(800,70);
		InvLabel.setFontSize(50);
		
		//Buttons Size and Location
		InvBtn.setBounds(150,150,150,40);
		InvBtn.setLocation(360,370);
		InventoryItem.setBounds(200,200,200,128);
		InventoryItem.setLocation(370,210);
		OrderHistory.setBounds(150,150,150,40);
		OrderHistory.setLocation(760,370);
		cart.setBounds(200,200,200,128);
		cart.setLocation(770,210);
		
			
		
		Back.setBounds(200,100,100,30);
		Back.setLocation(590,620);
		
		
		this.setBackground(new Color(228, 197, 158));
		
		
		InvBtn.setBorderColor(new Color(166, 123, 91));
		InvBtn.setBorderThickness(2);
		InvBtn.setBackground(new Color(228, 197, 158));
		InvBtn.setFontColor(new Color(128, 61, 59));
		InvBtn.setFontSize(20);
		InvBtn.setFocusable(false);
		
		OrderHistory.setBorderColor(new Color(166, 123, 91));
		OrderHistory.setBorderThickness(2);
		OrderHistory.setBackground(new Color(228, 197, 158));
		OrderHistory.setFontColor(new Color(128, 61, 59));
		OrderHistory.setFontSize(20);
		OrderHistory.setFocusable(false);
		
		
		Back.setBorderColor(new Color(166, 123, 91));
		Back.setBorderThickness(2);
		Back.setBackground(new Color(228, 197, 158));
		Back.setFontColor(new Color(128, 61, 59));
		Back.setFontSize(20);
		Back.setFocusable(false);
		
		InvBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Window.changePageToDebug();
				
			}
			
		});
		
		add(cart);
		add(InventoryItem);
		add(Back);
		add(OrderHistory);

		add(InvLabel);
		add(InvBtn);
		add(panel2);
		add(panel1);
		
	}



	private void add(ImageIcon box2) {
		// TODO Auto-generated method stub
		
	}
}


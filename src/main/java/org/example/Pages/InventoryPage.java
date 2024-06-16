package org.example.Pages;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.swing.*;

import org.example.MenuData;
import org.example.Page;
import org.example.Settings;
import org.example.UIComponents.*;
import org.example.Window;

import static org.example.UIComponents.InventoryItemCard.frame;

public class InventoryPage extends CoffeePanel {

	
	public CoffeeLabel InvLabel = new CoffeeLabel("DASHBOARD");
	public CoffeeButton InvBtn = new CoffeeButton("Add Menu Items");
	public CoffeeButton Sales = new CoffeeButton("Sales");
	public CoffeeButton OrderHistory = new CoffeeButton("Order History");
	public CoffeeButton Back = new CoffeeButton("Back ⬅");
	public CoffeeImage InventoryItem = new CoffeeImage(new ImageIcon("src/InventoryItem.png"));
	public CoffeeImage cart = new CoffeeImage(new ImageIcon("src/SCart.png"));

	public CoffeePanel panel1 = new CoffeePanel();
	public CoffeePanel panel2 = new CoffeePanel();
	
	private MenuData data;
	
	
	
	
	
	public InventoryPage(MenuData data) {
		
		this.data = data;
		
		//Corner Frames
		panel1.setBackground(new Color(166, 123, 91));
		panel1.setBounds(0,0,150,720);
		panel2.setBackground(new Color(166, 123, 91));
		panel2.setBounds(1120,0,150,720);
		
		//Inventory Header
		InvLabel.setLocation(490,1);
		InvLabel.setSize(800,70);
		InvLabel.setFontSize(50);

		OrderHistory.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Window.changePage(Page.OrderHistory);
			}
		});
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
		
		Back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Window.changePage(Page.Login);
			}
		});
		
		
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
				
				setUpPopUpWindow();
				
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
	
	
	
	private void setUpPopUpWindow(){
		
		
		if(frame == null){
			frame = new JFrame("Edit Item");
			frame.setVisible(true);
			frame.setSize(700, 300);
			frame.setLocationRelativeTo(null);
			frame.setLayout(null);
			frame.getContentPane().setBackground(Settings.currentPalette[0]);
			frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			frame.setResizable(false);
			
			
			CoffeePanel panel = new CoffeePanel();
			panel.setBounds(20, 20, 640, 220);
			panel.setBackground(Settings.currentPalette[1]);
			
			CoffeeLabel newName = new CoffeeLabel("Item Name: ");
			CoffeeTextField nameTextField = new CoffeeTextField();
			
			newName.setBounds(20, 20, panel.getWidth(), 30);
			nameTextField.setBounds(120, 20, 250, 30);
			
			
			String[] categ = new String[data.menuCategories.size()];
			for (int i = 0; i < data.menuCategories.size(); i++) {
				categ[i] = data.menuCategories.get(i);
			}
			
			CoffeeLabel newCategory = new CoffeeLabel("Category: ");
			JComboBox dropDown = new JComboBox(categ);
			
			newCategory.setBounds(20, 60, panel.getWidth(), 30);
			dropDown.setBounds(120, 60, 250, 30);
			
			CoffeeLabel newPrice = new CoffeeLabel("Item Price: ");
			CoffeeTextField priceTextField = new CoffeeTextField();
			
			newPrice.setBounds(20, 100, panel.getWidth(), 30);
			priceTextField.setBounds(120, 100, 250, 30);
			
			
			CoffeeLabel newImage = new CoffeeLabel("Choose new Image: ");
			CoffeeButton editImageButton = new CoffeeButton("Choose file");
			
			newImage.setBounds(20, 140, 140, 30);
			editImageButton.setBounds(150, 140, 250, 30);
			
			String imagePath = "";
			
			CoffeeButton confirmButton = new CoffeeButton("Confirm");
			confirmButton.setBounds(150, 180, 150, 30);
			
			CoffeeLabel locationLabel = new CoffeeLabel("Location: ");
			CoffeeTextField xTextField = new CoffeeTextField();
			CoffeeTextField yTextField = new CoffeeTextField();
			CoffeeTextField xItemTextField = new CoffeeTextField();
			
			locationLabel.setBounds(450, 20, 150, 30);
			xTextField.setBounds(450, 50, 150, 30);
			yTextField.setBounds(450, 80, 150, 30);
			xItemTextField.setBounds(450, 110, 150, 30);
			
			
			
			
			confirmButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String imagePath = "";
					JFileChooser fileChooser = new JFileChooser();
					
					if(e.getSource() == editImageButton){
						if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
							File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
							
							
							
							file.renameTo(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\Menu\\" + nameTextField.getText() + ".png"));
							
						}
					}
					
					if(e.getSource() == confirmButton){
						if(!nameTextField.getText().isEmpty() || !priceTextField.getText().isEmpty()){
							imagePath = "src/main/resources/Menu/" + nameTextField.getText() + ".png";
							data.updateItemFile((String) dropDown.getSelectedItem(), nameTextField.getText(), imagePath, priceTextField.getText(), xTextField.getText(), yTextField.getText(), xItemTextField.getText());
							frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
						}else{
							Toolkit.getDefaultToolkit().beep();
						}
						
					}
					
				}
			});
			
			editImageButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				
				}
			});
			
			dropDown.addActionListener(confirmButton.getActionListeners()[0]);
			editImageButton.addActionListener(confirmButton.getActionListeners()[0]);
			
			
			
			
			panel.add(newName);
			panel.add(nameTextField);
			panel.add(newPrice);
			panel.add(priceTextField);
			panel.add(newImage);
			panel.add(editImageButton);
			panel.add(confirmButton);
			panel.add(newCategory);
			panel.add(dropDown);
			panel.add(locationLabel);
			panel.add(xTextField);
			panel.add(yTextField);
			panel.add(xItemTextField);
			
			frame.add(panel);
			
			frame.addWindowListener(new WindowListener() {
				@Override
				public void windowOpened(WindowEvent e) {
				
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
				
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					frame = null;
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
				
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
				
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
				
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
				
				}
			});
		}else{
			Toolkit.getDefaultToolkit().beep();
		}
	}
}


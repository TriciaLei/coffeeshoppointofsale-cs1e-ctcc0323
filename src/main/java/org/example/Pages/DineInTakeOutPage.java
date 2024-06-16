package org.example.Pages;

import org.example.Page;
import org.example.Pages.MenuPage.ReceiptPage;
import org.example.Settings;
import org.example.UIComponents.CoffeeImage;
import org.example.UIComponents.CoffeeLabel;
import org.example.UIComponents.CoffeePanel;
import org.example.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DineInTakeOutPage extends CoffeePanel {
	
	
	private CoffeePanel dineIn = new CoffeePanel();
	private CoffeePanel takeOut = new CoffeePanel();
	private CoffeeImage dineInImage = new CoffeeImage(new ImageIcon("src/main/resources/Menu/dineeinn.png"));
	private CoffeeImage takeOutImage = new CoffeeImage(new ImageIcon("src/main/resources/Menu/takeoutt.png"));
	
	
	public DineInTakeOutPage(){
		setBackground(Settings.currentPalette[0]);
		 dineInImage.setLocation(64,100);
		 takeOutImage.setLocation(64,100);


		dineIn.setBackground(Settings.currentPalette[1]);
		dineIn.setBorderColor(Settings.currentPalette[2]);
		dineIn.setBorderThickness(3);
		dineIn.setBounds(200, 80, 384, 512);
		
		CoffeeLabel dineInLabel = new CoffeeLabel("Dine In");
		dineInLabel.setBounds(142, 412, 150, 60);
		dineInLabel.setFontSize(32);
		dineInLabel.setFontColor(Settings.currentPalette[2]);
		dineInLabel.setFontFormat(Font.ITALIC);
		
		dineIn.add(dineInLabel);
		dineIn.add(dineInImage);
		
		dineIn.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Window.changePage(Page.Table);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
			
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			
			}
		});
		
		takeOut.setBackground(Settings.currentPalette[1]);
		takeOut.setBorderColor(Settings.currentPalette[2]);
		takeOut.setBorderThickness(3);
		takeOut.setBounds(704, 80, 384, 512);
		
		CoffeeLabel takeOutLabel = new CoffeeLabel("Take Out");
		takeOutLabel.setBounds(142, 412, 150, 60);
		takeOutLabel.setFontSize(32);
		takeOutLabel.setFontColor(Settings.currentPalette[2]);
		takeOutLabel.setFontFormat(Font.ITALIC);
		
		takeOut.add(takeOutLabel);
		takeOut.add(takeOutImage);
		
		takeOut.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReceiptPage.isTakeout = true;
				Window.changePage(Page.Menu);
			}

			@Override
			public void mousePressed(MouseEvent e) {
			
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
			
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			
			}
		});
		
		add(dineIn);
		add(takeOut);
	}
}

package org.example.Pages;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

import org.example.Page;
import org.example.Settings;
import org.example.Window;
import org.example.UIComponents.CoffeeButton;
import org.example.UIComponents.CoffeeImage;
import org.example.UIComponents.CoffeeLabel;
import org.example.UIComponents.CoffeePanel;

public class OrderHistory extends CoffeePanel {

	public CoffeeButton previous = new CoffeeButton("◄ Previous");
	public CoffeeButton next = new CoffeeButton("Next ►");
	public CoffeeButton exit = new CoffeeButton("Exit");

	
	public CoffeeLabel orderHeader = new CoffeeLabel("Order History");
	public CoffeeImage Americano = new CoffeeImage(new ImageIcon("src/main/resources/Menu/Americano.png"));
	public CoffeeImage icedlatte = new CoffeeImage(new ImageIcon("src/main/resources/Menu/Spanish Latte.png"));
	public CoffeeImage greeksalad = new CoffeeImage(new ImageIcon("src/main/resources/Menu/greeksalad.png"));
	public CoffeeImage chickenseasar = new CoffeeImage(new ImageIcon("src/main/resources/Menu/chickenseasar.png"));
	public CoffeeImage coldbrew = new CoffeeImage(new ImageIcon("src/main/resources/Menu/coldbrew.png"));
	public CoffeeImage affogato = new CoffeeImage(new ImageIcon("src/main/resources/Menu/affogato.png"));
	public CoffeeImage caprese = new CoffeeImage(new ImageIcon("src/main/resources/Menu/caprese.png"));
	public CoffeeImage Crossiant = new CoffeeImage(new ImageIcon("src/main/resources/Menu/Crossiant.png"));

	
	public CoffeePanel panel1 = new CoffeePanel();
	public CoffeePanel panel2 = new CoffeePanel();
	public CoffeePanel panel3 = new CoffeePanel();
	public CoffeePanel panel4 = new CoffeePanel();
	
	public JTextArea receiptView = new JTextArea();

	private int currentReceipt = 1;
	

	
	
	
	public OrderHistory() {
		
		//BUTTONS
		previous.setBounds(100,100,170,70);
		previous.setLocation(100,380);
		previous.setBorderColor(new Color(166, 123, 91));
		previous.setBorderThickness(1);
		previous.setBackground(new Color(228, 197, 158));
		previous.setFontColor(new Color(128, 61, 59));
		previous.setFontSize(30);
		previous.setFocusable(false);
		
		next.setBounds(100,100,170,70);
		next.setLocation(990,380);
		next.setBorderColor(new Color(166, 123, 91));
		next.setBorderThickness(1);
		next.setBackground(new Color(228, 197, 158));
		next.setFontColor(new Color(128, 61, 59));
		next.setFontSize(30);
		next.setFocusable(false);
		
		exit.setBounds(100,100,170,40);
		exit.setLocation(550,630);
		exit.setBorderColor(new Color(166, 123, 91));
		exit.setBorderThickness(1);
		exit.setBackground(new Color(228, 197, 158));
		exit.setFontColor(new Color(128, 61, 59));
		exit.setFontSize(20);
		exit.setFocusable(false);
		
		icedlatte.setBounds(200,200,200,128);
		icedlatte.setLocation(220,180);
		Americano.setBounds(200,200,200,128);
		Americano.setLocation(20,180);
		greeksalad.setBounds(200,200,200,128);
		greeksalad.setLocation(20,500);
		chickenseasar.setBounds(200,200,200,128);
		chickenseasar.setLocation(220,500);
		coldbrew.setBounds(200,200,200,128);
		coldbrew.setLocation(920,500);
		affogato.setBounds(200,200,200,128);
		affogato.setLocation(1100,500);
		caprese.setBounds(200,200,200,128);
		caprese.setLocation(1100,180);
		Crossiant.setBounds(200,200,200,128);
		Crossiant.setLocation(920,180);
		
		orderHeader.setLocation(490,1);
		orderHeader.setSize(800,70);
		orderHeader.setFontSize(50);
		
		panel1.setBackground(new Color(166, 123, 91));
		panel1.setBounds(0,0,440,720);
		panel2.setBackground(new Color(166, 123, 91));
		panel2.setBounds(820,0,480,720);
		panel3.setBackground(new Color(166, 123, 91));
		panel3.setBounds(30,70,1270,50);
		panel4.setBackground(new Color(166, 123, 91));
		panel4.setBounds(30,620,1270,70);
		
		receiptView.setBounds(0, 0, 400, 0);
		receiptView.setPreferredSize(new Dimension(400, 0));
		receiptView.setBackground(Settings.currentPalette[1]);
		receiptView.setEditable(false);
		receiptView.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		receiptView.setText(readReceipt());
//		receiptView.setLineWrap(true);
		
		JScrollPane receiptScroll = new JScrollPane(receiptView);
		receiptScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		receiptScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		receiptScroll.setBounds(440, 120, 400, 500);
		

		this.setBackground(new Color(228, 197, 158));
		
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Window.changePage(Page.Inventory);
				
			}
		});
		
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(currentReceipt < Settings.countReceipt()){
					currentReceipt++;
					System.out.println(currentReceipt);
					receiptView.setText(readReceipt());
				}
			}
		});
		
		previous.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(currentReceipt > 1){
					currentReceipt--;
					System.out.println(currentReceipt);
					receiptView.setText(readReceipt());
				}
			}
		});
		
		add(receiptScroll);
		add(exit);
		add(next);
		add(previous);
		add(icedlatte);
		add(greeksalad);
		add(chickenseasar);
		add(coldbrew);
		add(affogato);
		add(caprese);
		add(Crossiant);
		add(Americano);
		add(orderHeader);
		add(panel4);
		add(panel3);
		add(panel1);
		add(panel2);


	}
	
	
	
	
	public String readReceipt(){
		String receiptText = "";
		int receiptViewHeight  = 0;
		if(currentReceipt <= Settings.countReceipt()){
			try(BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/Reciepts/" + currentReceipt + ".txt"))){
				
				String line = "";
				while((line = reader.readLine()) != null){
					receiptText += line;
					receiptText += "\n";
					receiptViewHeight += 20;
					
				}
				
			}catch (IOException e){
			
			}
		}
		
		receiptView.setSize(getWidth(), receiptViewHeight);
		receiptView.setPreferredSize(new Dimension(receiptView.getWidth(), receiptView.getHeight()));
		
		return receiptText;
	}
}

package org.example.Pages.MenuPage;

import org.example.Page;
import org.example.Settings;
import org.example.UIComponents.CoffeeButton;
import org.example.UIComponents.CoffeePanel;
import org.example.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ReceiptPage extends CoffeePanel {
	
	static LocalDateTime dateTime = LocalDateTime.now();
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	private static String tablenumber = "Take Out";
	
	private static boolean isTakeout = true;
	
	private static String seperator = "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
	private static String header =    "|------------------------------------------------------|" +
							          "|                 Coffee Shop sa Tabe Tabe             |" +
									  "|        #420 Caramel Street Balanga City, Bataan      |" +
			                          "|                   " + dateTime.format(formatter) + "                |" +
			                          "|------------------------------------------------------|" +
									  "                         " + (isTakeout? "Take Out" : "Table " + tablenumber) + "\n";
	public static ArrayList<String> currentOrders = new ArrayList<>();
	
	
	private static JTextArea receiptText = new JTextArea(seperator);
	private JScrollPane receiptScroll = new JScrollPane(receiptText);
	
	
	private CoffeeButton confirmButton = new CoffeeButton("Confirm");
	
	
	public ReceiptPage(OrderPanel orderPanel){
		
		setBackground(Settings.currentPalette[0]);
		
		receiptText.setBackground(Settings.currentPalette[1]);
		receiptText.setBounds(0,0, 400, 400);
		receiptText.setPreferredSize(new Dimension(400, 400));
		receiptText.setLineWrap(true);
		receiptText.setEditable(false);
		receiptText.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		
		receiptScroll.setBounds(450, 20, 400, 600);
		receiptScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		receiptText.setText(header + seperator);
		
		
		confirmButton.setBounds(550, 625, 200, 50);
		confirmButton.setBorderColor(Settings.currentPalette[2]);
		confirmButton.setFontSize(24);
		confirmButton.setFontColor(Settings.currentPalette[2]);
		confirmButton.setBackground(Settings.currentPalette[1]);
		confirmButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Window.changePage(Page.DineInTakeOut);
				orderPanel.Reset();
			}
		});
		
		
		add(confirmButton);
		add(receiptScroll);
	}
	
	public static void SetReceipt(){
		String receipt = "\n";
		
		for (String orders : currentOrders){
			receipt += seperator;
			receipt += orders + "\n";
			
		}
		
		receiptText.setText(header + receipt + seperator);
	}
	
	
}

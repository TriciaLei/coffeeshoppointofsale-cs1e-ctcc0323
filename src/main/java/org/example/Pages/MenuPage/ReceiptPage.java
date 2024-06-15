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
	private static OrderPanel orderPanel;
	private static String tablenumber = "Take Out";
	
	private static boolean isTakeout = true;
	
	private static String seperator = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
	private static String header =    "|------------------------------------------------------|\n" +
							          "|                 Coffee Shop sa Tabe Tabe             |\n" +
									  "|        #420 Caramel Street Balanga City, Bataan      |\n" +
			                          "|                   " + dateTime.format(formatter) + "                |\n" +
			                          "|------------------------------------------------------|\n" +
									  "                       " + (isTakeout? "Take Out" : "Table " + tablenumber) + "\n" +
			                          "             Cashier: " + Settings.Cashier + "   \n";
	
	
	public static ArrayList<String> currentOrders = new ArrayList<>();
	
	
	private static JTextArea receiptText = new JTextArea(seperator);
	private static String cashText = "                                    Cash: ";
	private static String changeText =  "                                    Change: ";
	private static String totalText =   "                                    Total: ";
	
	public static String cashPaid = "";
	private static String footNoteText = "        Thank you for your continued support ! :D";
	private JScrollPane receiptScroll = new JScrollPane(receiptText);
	private CoffeeButton confirmButton = new CoffeeButton("Confirm");
	
	
	
	
	public ReceiptPage(OrderPanel panel){
		
		setBackground(Settings.currentPalette[0]);
		orderPanel = panel;
		
		receiptText.setBackground(Settings.currentPalette[1]);
		receiptText.setBounds(0,0, 400, 470);
		receiptText.setPreferredSize(new Dimension(400, 470));
		receiptText.setEditable(false);
		receiptText.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		
		receiptScroll.setBounds(450, 20, 400, 600);
		receiptScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		receiptScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		confirmButton.setBounds(550, 625, 200, 50);
		confirmButton.setBorderColor(Settings.currentPalette[2]);
		confirmButton.setFontSize(24);
		confirmButton.setFontColor(Settings.currentPalette[2]);
		confirmButton.setBackground(Settings.currentPalette[1]);
		confirmButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Window.changePage(Page.DineInTakeOut);
				panel.Reset();
			}
		});
		
		
		add(confirmButton);
		add(receiptScroll);
	}
	
	public static void SetReceipt(){
		String receipt = "\n";
		int i = 0;
		
		for (String orders : currentOrders){
			receipt += seperator;
			receipt += orders + "\n";
			i++;
			
			if(i > 6){
				receiptText.setSize(receiptText.getWidth(), receiptText.getHeight() + 70);
				receiptText.setPreferredSize(new Dimension(receiptText.getWidth(), receiptText.getHeight()));
			}
			
		}
		
		double cash = Double.parseDouble(cashPaid);
		
		double change = cash - orderPanel.currentTotal;
		
		
		receiptText.setText(header + receipt + seperator + totalText + "P" + orderPanel.currentTotal + "\n" + cashText + "P" +cash
				+  "\n" + changeText + "P" + change + "\n" + seperator + footNoteText);
		
		
		System.out.println(receiptText.getText());
	}
	
	
}
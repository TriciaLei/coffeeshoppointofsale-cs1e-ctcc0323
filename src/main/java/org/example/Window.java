package org.example;
import org.example.Pages.DebugPage;
import org.example.Pages.InventoryPage;
import org.example.Pages.ItemPage;

import org.example.Pages.DineInTakeOutPage;
import org.example.Pages.LoginPage;
import org.example.Pages.MenuPage.MenuPage;
import org.example.Pages.MenuPage.ReceiptPage;
import org.example.UIComponents.CoffeeLabel;
import org.example.UIComponents.CoffeePanel;
import org.example.UIComponents.OrderCard;

import javax.swing.*;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;

public class Window extends JFrame {
	
	public DebugPage debugPage = new DebugPage();
	public LoginPage loginPage = new LoginPage();
	public MenuPage menuPage = new MenuPage();
	public InventoryPage Inv = new InventoryPage();
	public ItemPage itempage = new ItemPage();
	public DineInTakeOutPage dineInTakeOutPage = new DineInTakeOutPage();
	public ReceiptPage receiptPage = new ReceiptPage(menuPage.orderPanel);
	
	public static HashMap<Page, CoffeePanel> pages = new HashMap<>();
	
	public static Page currentPage = Page.DineInTakeOut;

	private MenuItemData itemDatas;
	
	//TODO#1: Make an instance of your class here
	// ex: public ExampleClass name = new ExampleClass();
	
	public Window(int width, int height){

		itemDatas = new MenuItemData();

		setSize(width, height);
		setVisible(true);
		setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		//TODO#2: add it to the to frame
		// ex: add(name);
		
		add(dineInTakeOutPage);
		add(loginPage);
		add(menuPage);
//		add(debugPage);
		add(receiptPage);
		
		pages.put(Page.Login, loginPage);
		pages.put(Page.Menu, menuPage);
		pages.put(Page.DineInTakeOut, dineInTakeOutPage);
		pages.put(Page.Receipt, receiptPage);
		
		changePage(Page.Menu);
		
		//TODO#3: make sure to setVisible() to true
		// and set this to false so that you can see own class
		// ex: menu Page.setVisible(false);
		// ex: name.setVisible(true);
		
		setTitle("Coffee Shop sa tabe tabe");
		setLocationRelativeTo(null);
		
		
		
	}
	
	public static void changePage(Page nextPage){
		for (Map.Entry<Page, CoffeePanel> set : pages.entrySet()){
			if(set.getKey() == nextPage){
				set.getValue().setVisible(true);
			}else{
				set.getValue().setVisible(false);
			}
		}
	}
}

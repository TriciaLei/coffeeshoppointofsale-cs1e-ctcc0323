package org.example;
import org.example.Pages.*;

import org.example.Pages.MenuPage.MenuPage;
import org.example.Pages.MenuPage.ReceiptPage;
import org.example.UIComponents.CoffeePanel;

import javax.swing.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Window extends JFrame {
	
	public DebugPage debugPage;
	public LoginPage loginPage;
	public MenuPage menuPage;
	public InventoryPage inventoryPage;
	public ItemPage itempage;
	public DineInTakeOutPage dineInTakeOutPage;
	public ReceiptPage receiptPage;
	public InventoryItemPage inventoryItemPage;
	public TablePage tablePage;
	public OrderHistory orderHistory;

	public static HashMap<Page, CoffeePanel> pages = new HashMap<>();
	
	public static Page currentPage = Page.DineInTakeOut;

	private MenuData menuData;
	
	//TODO#1: Make an instance of your class here
	// ex: public ExampleClass name = new ExampleClass();
	
	public Window(int width, int height){
		System.out.println(System.getProperty("user.dir") + "/src/main\\resources\\Menu\\");
	//	System.getProperty("user.dir") + "\\src\\main\\resources\\Menu\\" + nameTextField.getText() + ".png"));

		File file = new File(".");

		System.out.println(file.getAbsolutePath());
		
		Settings.ReadAccounts();
		
		menuData = new MenuData();


		menuPage = new MenuPage(menuData);
		loginPage = new LoginPage();
		debugPage = new DebugPage();
		inventoryPage = new InventoryPage(menuData);
		itempage = new ItemPage();
		dineInTakeOutPage = new DineInTakeOutPage();
		receiptPage = new ReceiptPage(menuPage.orderPanel);
		inventoryItemPage = new InventoryItemPage(menuData);
		tablePage = new TablePage();
		orderHistory = new OrderHistory();

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
		add(inventoryPage);
		add(inventoryItemPage);
		add(tablePage);
		add(orderHistory);

		pages.put(Page.OrderHistory, orderHistory);
		pages.put(Page.Login, loginPage);
		pages.put(Page.Menu, menuPage);
		pages.put(Page.DineInTakeOut, dineInTakeOutPage);
		pages.put(Page.Receipt, receiptPage);
		pages.put(Page.Inventory, inventoryPage);
		pages.put(Page.EditInventoryItems, inventoryItemPage);
		pages.put(Page.Table,tablePage);
		
		changePage(Page.Login);
		
		//TODO#3: make sure to setVisible() to true
		// and set this to false so that you can see own class
		// ex: menu Page.setVisible(false);
		// ex: name.setVisible(true);
		
		setTitle("Deja Brew");
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

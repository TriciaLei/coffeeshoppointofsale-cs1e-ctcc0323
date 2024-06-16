package org.example;
import org.example.Pages.DebugPage;
import org.example.Pages.DineInTakeOutPage;
import org.example.Pages.LoginPage;
import org.example.Pages.MenuPage.MenuPage;
import org.example.Pages.TablePage;
import org.example.UIComponents.CoffeePanel;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Window extends JFrame {
	
	public DebugPage debugPage = new DebugPage();
	public LoginPage loginPage = new LoginPage();
	public MenuPage menuPage = new MenuPage();
	public DineInTakeOutPage dineInTakeOutPage = new DineInTakeOutPage();
    public TablePage table =new TablePage();

	public static HashMap<Page, CoffeePanel> pages = new HashMap<>();
	
	public static Page currentPage = Page.DineInTakeOut;
	
	//TODO#1: Make an instance of your class here
	// ex: public ExampleClass name = new ExampleClass();
	
	public Window(int width, int height){
		
		setSize(width, height);
		setVisible(true);
		setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		//TODO#2: add it to the to frame
		// ex: add(name);

		add(table);
//		add(dineInTakeOutPage);
//		add(loginPage);
		add(menuPage);
//		add(debugPage);
		
		pages.put(Page.Login, loginPage);
		pages.put(Page.Menu, menuPage);
		pages.put(Page.DineInTakeOut, dineInTakeOutPage);
		pages.put(Page.Table,table);
		
		changePage(Page.Table);
		
		debugPage.setVisible(false);



		add(loginPage);
		add(menuPage);
		add(debugPage);
     	add(dineInTakeOutPage);
		loginPage.setVisible(false);
		debugPage.setVisible(false);

		
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

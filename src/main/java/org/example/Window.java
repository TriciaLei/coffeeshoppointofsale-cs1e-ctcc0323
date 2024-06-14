package org.example;
import org.example.Pages.DebugPage;
import org.example.Pages.InventoryPage;
import org.example.Pages.LoginPage;
import org.example.Pages.MenuPage.MenuPage;

import javax.swing.*;

public class Window extends JFrame {
	
	public DebugPage debugPage = new DebugPage();
	public LoginPage loginPage = new LoginPage();
	public MenuPage menuPage = new MenuPage();
	public InventoryPage Inv = new InventoryPage();
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
		add(Inv);
		add(loginPage);
		add(debugPage);
		add(menuPage);
		
//		loginPage.setVisible(true);
//		debugPage.setVisible(false);
		
		//TODO#3: make sure to setVisible() to true
		// and set this to false so that you can see own class
		// ex: menuPage.setVisible(false);
		// ex: name.setVisible(true);
		
		menuPage.setVisible(false);
		debugPage.setVisible(false);
		loginPage.setVisible(false);
		Inv.setVisible(true);
		setTitle("Coffee Shop sa tabe tabe");
		
		
		
		
	}

	//Temporary Code
	public static void changePageToDebug(){
//		debugPage.setVisible(true);
//		loginPage.setVisible(false);
	}
}

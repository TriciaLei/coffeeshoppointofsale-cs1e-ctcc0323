package org.example;
import org.example.Pages.DebugPage;
import org.example.Pages.LoginPage;
import org.example.Pages.MenuPage.MenuPage;

import javax.swing.*;

public class Window extends JFrame {
	
	public static DebugPage debugPage = new DebugPage();
	public LoginPage loginPage = new LoginPage();
	public static MenuPage menuPage = new MenuPage();
	
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

//		add(loginPage);
		add(menuPage);
		add(debugPage);

//		loginPage.setVisible(true);
//		debugPage.setVisible(false);
		
		//TODO#3: make sure to setVisible() to true
		// and set this to false so that you can see own class
		// ex: menuPage.setVisible(false);
		// ex: name.setVisible(true);
		
		
		menuPage.setVisible(true);
		debugPage.setVisible(false);
		
		setTitle("Coffee Shop sa tabe tabe");
		setLocationRelativeTo(null);
		
		
		
	}

	//Temporary Code
	public static void changePageToDebug(){
//		loginPage.setVisible(false);
		
		debugPage.setVisible(true);
		menuPage.setVisible(false);
		System.out.println("Hello");
	}
}

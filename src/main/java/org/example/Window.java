package org.example;
import org.example.Pages.DebugPage;
import org.example.Pages.DineInTakeOutPage;
import org.example.Pages.LoginPage;
import org.example.Pages.MenuPage.MenuPage;

import javax.swing.*;

public class Window extends JFrame {
	
	public DebugPage debugPage = new DebugPage();
	public LoginPage loginPage = new LoginPage();
	public MenuPage menuPage = new MenuPage();
	public DineInTakeOutPage dineInTakeOutPage = new DineInTakeOutPage();
	
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
//		add(menuPage);
//		add(debugPage);
		add(dineInTakeOutPage);
//		loginPage.setVisible(true);
//		debugPage.setVisible(false);
		
		//TODO#3: make sure to setVisible() to true
		// and set this to false so that you can see own class
		// ex: menu Page.setVisible(false);
		// ex: name.setVisible(true);
		
		
		menuPage.setVisible(true);
		debugPage.setVisible(false);
		
		setTitle("Coffee Shop sa tabe tabe");
		setLocationRelativeTo(null);
		
		
		
	}
}

package org.example;
import org.example.Pages.DebugPage;
import org.example.Pages.LoginPage;
import org.example.Pages.MenuPage.MenuPage;

import javax.swing.*;

public class Window extends JFrame {
	
	public DebugPage debugPage = new DebugPage();
	public LoginPage loginPage = new LoginPage();
	public MenuPage menuPage = new MenuPage();
	public Window(int width, int height){
		
		setSize(width, height);
		setVisible(true);
		setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
//		add(debugPage);
//		add(loginPage);
		add(menuPage);
		
//		loginPage.setVisible(true);
//		debugPage.setVisible(false);
		
		menuPage.setVisible(true);
		
		setTitle("Coffee Shop sa tabe tabe");
		
	}

	//Temporary Code
	public static void changePageToDebug(){
//		debugPage.setVisible(true);
//		loginPage.setVisible(false);
	}
}

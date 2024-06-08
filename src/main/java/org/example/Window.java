package org.example;
import org.example.Pages.DebugPage;
import org.example.Pages.LoginPage;

import javax.swing.*;

public class Window extends JFrame {
	
	public static DebugPage debugPage = new DebugPage();
	public static LoginPage loginPage = new LoginPage();
	public Window(int width, int height){
		
		setSize(width, height);
		setVisible(true);
		setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		add(debugPage);
		add(loginPage);
		
		loginPage.setVisible(true);
		debugPage.setVisible(false);
		
		setTitle("Coffee Shop sa tabe tabe");
		
	}

	//Temporary Code
	public static void changePageToDebug(){
		debugPage.setVisible(true);
		loginPage.setVisible(false);
	}
}

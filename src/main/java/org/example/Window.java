package org.example;
import org.example.Pages.DebugPage;
import org.example.Pages.LoginPage;

import javax.swing.*;

public class Window extends JFrame {
	
	private DebugPage debugPage = new DebugPage();
	private LoginPage loginPage = new LoginPage();
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
}

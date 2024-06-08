package org.example;
import org.example.Pages.DebugPage;

import javax.swing.*;

public class Window extends JFrame {
	
	private DebugPage debugPage = new DebugPage();
	public Window(int width, int height){
		
		setSize(width, height);
		setVisible(true);
		setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(debugPage);
		
	}
}

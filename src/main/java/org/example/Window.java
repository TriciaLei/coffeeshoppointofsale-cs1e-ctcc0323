package org.example;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
	
	public ExamplePanel panel1 = new ExamplePanel(new Color(239, 156, 102), 0);
	public ExamplePanel panel2 = new ExamplePanel(new Color(252, 220, 148), 320);
	public ExamplePanel panel3 = new ExamplePanel(new Color(200, 207, 160), 640);
	public ExamplePanel panel4 = new ExamplePanel(new Color(120, 171, 168), 960);
	public Window(int width, int height){
		
		setSize(width, height);
		setVisible(true);
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		
	}
}

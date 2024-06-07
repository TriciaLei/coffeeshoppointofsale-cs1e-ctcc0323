package org.example;

import javax.swing.*;
import java.awt.*;

public class ExamplePanel extends JPanel {
	
	
	public ExamplePanel(Color color, int x){
		setBounds(x, 0, 320, 720);
		setBackground(color);
		setVisible(true);
	}
}

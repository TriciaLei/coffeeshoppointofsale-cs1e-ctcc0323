package org.example.UIComponents;

import javax.swing.*;

public class CoffeeImage extends JLabel {
	
	public CoffeeImage(ImageIcon icon){
		setIcon(icon);
		setSize(icon.getIconWidth(), icon.getIconHeight());
	}
}

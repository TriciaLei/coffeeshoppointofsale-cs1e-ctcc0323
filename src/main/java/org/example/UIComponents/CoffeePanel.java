package org.example.UIComponents;

import javax.swing.*;
import java.awt.*;

public class CoffeePanel extends JPanel {
	
	private Color m_borderColor = Color.BLACK;
	
	public CoffeePanel(){
		setBounds(0, 0, 1280, 720);
		setLayout(null);
	}
	
	public void setBorderColor(Color color){
		m_borderColor = color;
		setBorder(BorderFactory.createLineBorder(m_borderColor));
	}
	
	public void setBorderThickness(int thickness){
		setBorder(BorderFactory.createLineBorder(m_borderColor, thickness));
		
	}
}

package org.example.UIComponents;

import javax.swing.*;
import java.awt.*;

public class CoffeePanel extends JPanel {
	
	private Color m_borderColor = Color.BLACK;
	private int m_borderThickness = 1;

	
	public CoffeePanel(){
		setBounds(0, 0, 1280, 720);
		setLayout(null);
	}
	
	public void setFontColor(Color color){
		setForeground(color);
	}
	
	public void setBorderColor(Color color){
		m_borderColor = color;
		setBorder(BorderFactory.createLineBorder(m_borderColor, m_borderThickness, true));
	}
	
	public void setBorderThickness(int thickness){
		m_borderThickness = thickness;
		setBorder(BorderFactory.createLineBorder(m_borderColor, m_borderThickness, true));
		
	}


}


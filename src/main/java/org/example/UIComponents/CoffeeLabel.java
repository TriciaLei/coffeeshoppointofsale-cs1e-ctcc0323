package org.example.UIComponents;

import javax.swing.*;
import java.awt.*;

public class CoffeeLabel extends JLabel {
	
	private int m_fontSize = 12;
	private String m_fontFamily = "Serif";
	
	public CoffeeLabel(String text){
		
		setText(text);
		setFont(new Font("", Font.PLAIN, m_fontSize));
		
		
		
		setBounds(0,0, 50, 20);
	}
	
	public void setFontColor(Color color){
		setForeground(color);
	}
	
	public void setFontSize(int size){
		m_fontSize = size;
		setFont(new Font("Serif", Font.PLAIN, m_fontSize));
	}
	
	public void setFontFamily(String family){
		m_fontFamily = family;
		setFont(new Font(m_fontFamily, Font.PLAIN, m_fontSize));
	}
	public void setFontFormat(int format){
		setFont(new Font(m_fontFamily, format, m_fontSize));
	}
}

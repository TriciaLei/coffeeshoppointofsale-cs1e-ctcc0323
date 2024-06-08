package org.example.UIComponents;

import javax.swing.*;
import java.awt.*;

public class CoffeeTextField extends JTextField {
	
	
	private int m_fontSize = 15;
	private String m_fontFamily = "Serif";
	
	public CoffeeTextField(){
		
		setFont(new Font(m_fontFamily, Font.PLAIN, m_fontSize));
	}
	
	public void setBorderColor(Color color){
		setBorder(BorderFactory.createLineBorder(color));
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

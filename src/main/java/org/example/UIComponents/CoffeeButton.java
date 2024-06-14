package org.example.UIComponents;

import javax.swing.*;
import java.awt.*;

public class CoffeeButton extends JButton {

    private int m_borderThickness = 1;
    private Color m_borderColor = Color.BLACK;
    private int m_fontSize = 12;
    private String m_fontFamily = "Serif";


    public CoffeeButton(){
        setFont(new Font(m_fontFamily, Font.PLAIN, m_fontSize));
    }

    public CoffeeButton(String text){
        setFont(new Font(m_fontFamily, Font.PLAIN, m_fontSize));
        setBorder(BorderFactory.createLineBorder(m_borderColor, m_borderThickness, true));
        setText(text);
    }

    public void setFontColor(Color color){
        setForeground(color);
    }

    public void setFontSize(int size){
        m_fontSize = size;
        setFont(new Font(m_fontFamily, Font.PLAIN, m_fontSize));
    }

    public void setFontFamily(String family){
        m_fontFamily = family;
        setFont(new Font(m_fontFamily, Font.PLAIN, m_fontSize));
    }
    public void setFontFormat(int format){
        setFont(new Font(m_fontFamily, format, m_fontSize));
    }

    public void setBorderColor(Color color){
        m_borderColor = color;
        setBorder(BorderFactory.createLineBorder(m_borderColor, m_borderThickness, true));
    }

    public void setBorderThickness(int thickness){
        setBorder(BorderFactory.createLineBorder(m_borderColor, thickness, true));

    }
}

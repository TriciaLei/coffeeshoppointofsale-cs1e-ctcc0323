package org.example.UIComponents;

import javax.swing.*;
import java.awt.*;

public class CoffeePasswordField extends JPasswordField {
	
	public CoffeePasswordField(){
	
	}
	
	
	public void setBorderColor(Color color){
		setBorder(BorderFactory.createLineBorder(color));
	}
}

package org.example.Pages;

import org.example.UIComponents.CoffeeLabel;
import org.example.UIComponents.CoffeePage;
import org.example.UIComponents.CoffeePasswordField;
import org.example.UIComponents.CoffeeTextField;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends CoffeePage {
	
	public CoffeeLabel loginLabel = new CoffeeLabel("Login");
	public CoffeeLabel employeeLabel = new CoffeeLabel("Employee name");
	public CoffeeTextField employeeField = new CoffeeTextField();
	public CoffeeLabel passwordLabel = new CoffeeLabel("Password");
	public CoffeePasswordField passwordField = new CoffeePasswordField();
	
	public LoginPage(){
	
		
		loginLabel.setLocation(505, 50);
		loginLabel.setSize(300, 120);
		loginLabel.setFontSize(100);
		
		employeeLabel.setBounds(530, 250, 250, 60);
		employeeLabel.setFontSize(30);
		
		employeeField.setLocation(415, 300);
		employeeField.setSize(400, 40);
		
		passwordLabel.setBounds(565, 400, 250, 60);
		passwordLabel.setFontSize(30);
		
		passwordField.setBounds(415, 450, 400, 40);
		
		loginLabel.setFontColor(new Color(50, 44, 43));
		employeeLabel.setFontColor(new Color(50, 44, 43));
		passwordLabel.setFontColor(new Color(50, 44, 43));
		
		this.setBackground(new Color(228, 197, 158));
		
		passwordField.setBackground(new Color(228, 197, 158));
		employeeField.setBackground(new Color(228, 197, 158));
		
		passwordField.setBorderColor(new Color(50, 44, 43));
		employeeField.setBorderColor(new Color(50, 44, 43));
		
		
		
		add(loginLabel);
		
		add(employeeLabel);
		add(employeeField);
		
		add(passwordLabel);
		add(passwordField);
	}
}

package org.example.Pages;

import org.example.Settings;
import org.example.UIComponents.*;
import org.example.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginPage extends CoffeePanel {
	
	public CoffeeLabel appName = new CoffeeLabel("Coffee Shop sa tabe tabe");
	public CoffeeLabel employeeLabel = new CoffeeLabel("Employee name");
	public CoffeeTextField employeeField = new CoffeeTextField();
	public CoffeeLabel passwordLabel = new CoffeeLabel("Password");
	public CoffeePasswordField passwordField = new CoffeePasswordField();

	public CoffeeButton loginButton = new CoffeeButton("Login");



	
	public LoginPage(){
	
		
		appName.setLocation(120, 50);
		appName.setSize(1000, 120);
		appName.setFontSize(100);
		
		employeeLabel.setBounds(530, 250, 250, 60);
		employeeLabel.setFontSize(30);
		
		employeeField.setLocation(415, 300);
		employeeField.setSize(400, 40);
		
		passwordLabel.setBounds(565, 400, 250, 60);
		passwordLabel.setFontSize(30);
		
		passwordField.setBounds(415, 450, 400, 40);

		loginButton.setBounds(565, 550, 100, 40);
		
		
		setBackground(Settings.currentPalette[1]);
		appName.setFontColor(Settings.currentPalette[2]);
		employeeLabel.setFontColor(Settings.currentPalette[2]);
		passwordLabel.setFontColor(Settings.currentPalette[2]);

		
		passwordField.setBackground(Settings.currentPalette[1]);
		employeeField.setBackground(Settings.currentPalette[1]);
		
		passwordField.setBorderColor(Settings.currentPalette[2]);
		employeeField.setBorderColor(Settings.currentPalette[2]);
		
		loginButton.setBorderColor(Settings.currentPalette[2]);
		loginButton.setBackground(Settings.currentPalette[1]);
		loginButton.setFontColor(Settings.currentPalette[2]);
		loginButton.setBorderThickness(3);
		loginButton.setFontSize(30);

		



		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Window.changePageToDebug();
			}
		});

		add(appName);
		
		add(employeeLabel);
		add(employeeField);
		
		add(passwordLabel);
		add(passwordField);

		add(loginButton);
	}
}

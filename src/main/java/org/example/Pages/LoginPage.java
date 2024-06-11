package org.example.Pages;

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

	public CoffeeImage table1 = new CoffeeImage(new ImageIcon("C:\\Dev\\Java\\coffeeshoppointofsale-cs1e-ctcc0323\\example.png"));


	
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


		appName.setFontColor(new Color(50, 44, 43));
		employeeLabel.setFontColor(new Color(50, 44, 43));
		passwordLabel.setFontColor(new Color(50, 44, 43));

		this.setBackground(new Color(228, 197, 158));
		
		passwordField.setBackground(new Color(228, 197, 158));
		employeeField.setBackground(new Color(228, 197, 158));
		
		passwordField.setBorderColor(new Color(50, 44, 43));
		employeeField.setBorderColor(new Color(50, 44, 43));
		
		loginButton.setBorderColor(new Color(128, 61, 59));
		loginButton.setBorderThickness(3);
		loginButton.setBackground(new Color(228, 197, 158));
		loginButton.setFontColor(new Color(128, 61, 59));
		loginButton.setFontSize(30);

		table1.setBounds(415, 300, 200, 200);
//		table1.setIcon(new ImageIcon("C:\\Dev\\Java\\coffeeshoppointofsale-cs1e-ctcc0323\\src\\main\\java\\org\\example\\Window.java"));

		table1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(getBackground() == Color.WHITE){
					setBackground(Color.BLACK);
				}else{
					setBackground(Color.white);
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(Color.PINK);
			}
		});

		add(table1);





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

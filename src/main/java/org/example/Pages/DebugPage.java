package org.example.Pages;

import javax.swing.*;
import java.awt.*;

public class DebugPage extends JPanel {
	
	private JLabel message = new JLabel("Oops this page is not implemented yet\n Consider making a class for this page.");
	public JPanel panel1 = new JPanel();
	public JPanel panel2 = new JPanel();
	public JPanel panel3 = new JPanel();
	public JPanel panel4 = new JPanel();
	
	public DebugPage(){
		setBounds(0, 0, 1280, 720);
		setLayout(null);
		
		panel1.setBackground(new Color(239, 156, 102));
		panel2.setBackground(new Color(252, 220, 148));
		panel3.setBackground(new Color(200, 207, 160));
		panel4.setBackground(new Color(120, 171, 168));
		
		panel1.setBounds(0,0, 320, 720);
		panel2.setBounds(320,0, 320, 720);
		panel3.setBounds(640,0, 320, 720);
		panel4.setBounds(960,0, 320, 720);
		
		
		setVisible(true);
		
		message.setSize(1000, 50);
		message.setLocation(180, 300);
		message.setBackground(Color.black);
		message.setFont(new Font("Serif", Font.PLAIN, 30));
		
		// Set the horizontal and vertical alignment of the text to center
//		message.setHorizontalAlignment(SwingConstants.CENTER);
//		message.setVerticalAlignment(SwingConstants.CENTER);
		
		add(message);
		
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		
		
		
		
		
	}
}

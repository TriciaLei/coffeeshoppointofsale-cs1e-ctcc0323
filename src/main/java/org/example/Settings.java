package org.example;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Settings {
	
	
	// 0 - Base Color
	// 1 - Secondary Color
	// 2 - Text Color and Border Color
	// 3 - Highlights
	
	public static String loggedCashier = "";
	public static String tableNumber ="";
	
	public static HashMap<String, String> credentials = new HashMap<>();
	
	
	
	
	public static Color[] currentPalette = {
			new Color(166, 138, 121),
			new Color(240, 230, 214),
			new Color(50, 44, 43),
			new Color(250, 238, 209),


	};
	
	public static void ReadAccounts(){
		try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/accounts.txt"))){
		
			String line = "";
			int i = 0;
			String username = "";
			String password = "";
			while((line = reader.readLine()) != null){
				if(i == 0){
					username = line;
					i++;
				}else if(i == 1){
					password = line;
					i++;
				}else{
					credentials.put(username, password);
					i = 0;
				}
			}
			
			
		}catch (IOException ignored){
		
		}
	}
	
	public static boolean canLogin(String userName, String password){
		if(Settings.credentials.containsKey(userName) && Settings.credentials.get(userName).equals(password)){
			loggedCashier = userName;
			return  true;
		}else{
			return false;
		}
	}
	
	public static String getLoggedCashier(){
		return loggedCashier;
	}
	public static String getTableNumber(){return tableNumber;}
}

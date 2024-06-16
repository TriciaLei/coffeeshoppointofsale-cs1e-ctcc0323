package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MenuData {
    
    public HashMap<CardData, String> itemCards = new HashMap<>();
    
    public ArrayList<CardData> categoryCards = new ArrayList<>();
    
    public ArrayList<String> menuCategories = new ArrayList<>();
    
    
    public MenuData() {
        readTypes();
        readItems();


        for(Map.Entry<CardData, String> set : itemCards.entrySet()){
            System.out.println(set.getKey().name + " : "+ set.getValue());
        }

    }
    
    private void readTypes() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/MenuTypes.txt"))) {
            getMenuTypes();
            readItems();
            
            for (Map.Entry<CardData, String> set : itemCards.entrySet()) {
                System.out.println(set.getKey().name + set.getKey().price);
            }
        } catch (IOException e) {
	        throw new RuntimeException(e);
        }
	    
    }
        
    private void getMenuTypes() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/MenuTypes.txt"))) {
                
            String line = "";
                
            int i = 0;

			String path = "";
			String itemName = "";
			String price = "";
			String xLocation = "";
			String yLocation = "";
			String xItemPos = "";
			while((line = reader.readLine()) != null){

				switch (i){
					case 0:
						itemName = line;
                        menuCategories.add(line);
						i++;
						break;
					case 1:
						path = line;
						i++;
						break;
					case 2:
						if(line.equals("null")){
							price = null;
						}else{
							price = line;
						}
						i++;
						break;
					case 3:
						xLocation = line;
						i++;
						break;
					case 4:
						yLocation = line;
						i++;
						break;
					case 5:
						xItemPos = line;
						i++;
						break;
                    default:
                        categoryCards.add(new CardData(itemName, path, price, xLocation, yLocation, xItemPos));
                        i = 0;
                        break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    private void readItems() {
        for (String t : menuCategories) {
			
            try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/items/" + t + ".txt"))) {
                
                
                String line = "";
				String name = "";
				String imagePath = "";
				String price = "";
				String xPos = "";
				String yPos = "";
				String xItemPos = "";
                int i = 0;
	            CardData data = new CardData();
	            while ((line = reader.readLine()) != null) {
					
	                switch (i) {
                        case 0:
                            name = line;
                            i++;
                            break;
                        case 1:
                            imagePath = line;
                            i++;
                            break;
                        case 2:
                            price = line;
                            i++;
                            break;
                        case 3:
                            xPos = line;
                            i++;
                            break;
                        case 4:
                            yPos = line;
                            i++;
                            break;
                        case 5:
                            xItemPos = line;
                            i++;
                            break;
                        default:
                            itemCards.put(new CardData(name, imagePath, price ,xPos, yPos, xItemPos), t);
                            i = 0;
                            break;
                        
                    }
                }
                
            } catch (IOException e) {
            
            }
        }
    }
	
	public void editItemName(String oldName, String newName, String type){
		for (Map.Entry<CardData, String> set : itemCards.entrySet()){
			if(set.getKey().name.equals(oldName)){
				set.getKey().name = newName;
			}
		}
		
//		updateItemFile(type);
	}
	
	public void editItemImage(String oldPath, String newPath, String type){
		for (Map.Entry<CardData, String> set : itemCards.entrySet()){
			if(set.getKey().name.equals(oldPath)){
				set.getKey().name = newPath;
			}
		}
		
//		updateItemFile(type);
	}
	
	public void editItemPrice(String oldPrice, String newPrice, String type){
		for (Map.Entry<CardData, String> set : itemCards.entrySet()){
			if(set.getKey().name.equals(oldPrice)){
				set.getKey().name = newPrice;
			}
		}
		
//		updateItemFile(type);
	}
	
	

	
	
	
	public void updateItemFile(String type, String name, String imagePath, String price, String xPos, String yPos, String xItemPos){
		
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/items/" + type + ".txt", true))){
			
			writer.write(name);
			writer.newLine();
			writer.write(imagePath);
			writer.newLine();
			writer.write(price);
			writer.newLine();
			writer.write(xPos);
			writer.newLine();
			writer.write(yPos);
			writer.newLine();
			writer.write(xItemPos);
			writer.newLine();
			writer.newLine();
			
		}catch (IOException ignored){
		
		}
	}
	
	
}
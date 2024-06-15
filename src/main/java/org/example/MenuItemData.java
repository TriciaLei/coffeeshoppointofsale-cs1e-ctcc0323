package org.example;

import org.example.UIComponents.CoffeeCard;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MenuItemData {
    
    public HashMap<ItemData, String> items = new HashMap<>();
    
    public ArrayList<String> types = new ArrayList<>();
    
    
    public MenuItemData() {
        readTypes();
        readItems();


//        for(Map.Entry<ItemData, String> set : items.entrySet()){
//            System.out.println(set.getKey().name + set.getKey().price);
//        }
//
//        System.out.println("");
    }
    
    // public ArrayList<ItemData> getItems(){
    //     ArrayList<ItemData> tmp = new ArrayList<>();
    
    //     for (Map.Entry<ItemData, String> set : items.entrySet()){
    
    //         tmp.add(set.getKey());
    //     }
    
    
    //     return tmp;
    
    // }
    
    private void readItems() {
        for (String t : types) {
            try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/items/" + t + ".txt"))) {
                
                
                String line = "";
                int i = 0;
                ItemData data = new ItemData();
                while ((line = reader.readLine()) != null) {
                    switch (i) {
                        case 0:
                            data.name = line;
                            i++;
                            break;
                        case 1:
                            data.imagePath = line;
                            i++;
                            break;
                        case 2:
                            data.price = line;
                            i++;
                            break;
                        case 3:
                            data.xPos = line;
                            i++;
                            break;
                        case 4:
                            data.yPos = line;
                            i++;
                            break;
                        case 5:
                            data.xItemPos = line;
                            i++;
                            break;
                        default:
                            items.put(data, t);
                            i = 0;
                            break;
                        
                    }
                }
                
            } catch (IOException e) {
            
            }
        }
    }
    
    private void readTypes() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/MenuTypes.txt"))) {
            getMenuTypes();
            getItems();
            
            for (Map.Entry<ItemData, String> set : items.entrySet()) {
                System.out.println(set.getKey().name + set.getKey().price);
            }
        } catch (IOException e) {
	        throw new RuntimeException(e);
        }
	    
    }
        
        private void getItems() {
            for (String t : types) {
                try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/items/" + t + ".txt"))) {
                    
                    
                    String line = "";
                    int i = 0;
                    ItemData data = new ItemData();
                    while ((line = reader.readLine()) != null) {
                        switch (i) {
                            case 0:
                                data.name = line;
                                i++;
                                break;
                            case 1, 3, 4, 5:
                                i++;
                                break;
                            case 2:
                                data.price = line;
                                i++;
                                break;
                            default:
                                items.put(data, t);
                                i = 0;
                                break;
                            
                        }
                    }
                } catch (IOException e) {
                
                }
            }
        }
        
        private void getMenuTypes() {
            try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/MenuTypes.txt"))) {
                
                String line = "";
                
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    switch (i) {
                        case 0:
                            types.add(line);
                            i++;
                            break;
                        case 1, 2, 3, 4, 5:
                            i++;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}
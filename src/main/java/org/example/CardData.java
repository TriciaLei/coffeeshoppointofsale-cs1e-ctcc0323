package org.example;

public class CardData {
    
    
    
    public String name = "";
    public String price = "";
    public String xPos = "";
    public String yPos = "";
    public String xItemPos = "";
    public String imagePath = "";
    
    public CardData(String name, String imagePath, String price, String xPos, String yPos, String xItemPos) {
        this.name = name;
        this.price = price;
        this.xPos = xPos;
        this.yPos = yPos;
        this.xItemPos = xItemPos;
        this.imagePath = imagePath;
    }
    
    public CardData(){
    
    }
    
    
    
}

package org.example.UIComponents;

import org.example.Pages.TablePage;
import org.example.Settings;

import javax.swing.*;
import java.awt.*;

public class Table extends CoffeePanel {
    public CoffeeImage image;
    public CoffeeLabel label;


    public Table  (String labelText, String path){
       setBackground(Settings.currentPalette[3]);
       setBorderColor(Color.BLACK);
        label = new CoffeeLabel(labelText);
        image = new CoffeeImage(new ImageIcon(path));

        label.setLocation(58,55);
        label.setFontSize(30);
        add(label);
        add(image);

    }
      public Table  (boolean bool ,String labelText, String path){
       setBackground(Settings.currentPalette[3]);
       setBorderColor(Color.BLACK);
        label = new CoffeeLabel(labelText);
        image = new CoffeeImage(new ImageIcon(path));
        label.setLocation(50,55);
        label.setFontSize(30);
        add(label);
        add(image);



    }




}

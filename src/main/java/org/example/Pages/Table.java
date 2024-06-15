package org.example.Pages;
import org.example.UIComponents.CoffeeImage;
import org.example.UIComponents.CoffeePanel;

import javax.swing.*;
import java.awt.*;
public class Table extends CoffeePanel {
    public Table() {
        CoffeeImage image1 = new CoffeeImage(new ImageIcon("/Users/trixiemaeb.alburo/Documents/GitHub/coffeeshoppointofsale-cs1e-ctcc0323/src/kopiii.png"));
       add(image1);
       image1.setLocation(200,15);
       image1.setSize(50,50);


    }
}

package org.example.Pages;
import org.example.UIComponents.CoffeeImage;
import org.example.UIComponents.CoffeePanel;

import javax.swing.*;
import java.awt.*;
public class Table extends CoffeePanel {
    public Table() {
        CoffeeImage image1 = new CoffeeImage(new ImageIcon("/Users/trixiemaeb.alburo/Documents/GitHub/coffeeshoppointofsale-cs1e-ctcc0323/src/table1.png"));
       add(image1);
       image1.setLocation(200,15);
       image1.setSize(128,128);
        CoffeeImage image2 = new CoffeeImage(new ImageIcon("/Users/trixiemaeb.alburo/Documents/GitHub/coffeeshoppointofsale-cs1e-ctcc0323/src/table1.png"));
        add(image2);

        image2.setLocation(350,15);
        image2.setSize(128,128);


    }
}

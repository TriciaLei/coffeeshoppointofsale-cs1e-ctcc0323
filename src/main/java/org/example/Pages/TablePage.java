package org.example.Pages;
import org.example.Page;
import org.example.Settings;
import org.example.UIComponents.CoffeeImage;
import org.example.UIComponents.CoffeeLabel;
import org.example.UIComponents.CoffeePanel;
import org.example.UIComponents.Table;
import org.example.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TablePage extends CoffeePanel {
 CoffeeLabel coffeeLabel = new CoffeeLabel("TABLES");

 public TablePage() {
       setBackground(Settings.currentPalette[0]);
       coffeeLabel.setLocation(550,1);
       coffeeLabel.setSize(800,70);
       coffeeLabel.setFontSize(50);


  add(coffeeLabel);

     MouseListener mouseListener = new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
          Window.changePage(Page.Menu);
      }

      @Override
      public void mousePressed(MouseEvent e) {

      }

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      @Override
      public void mouseEntered(MouseEvent e) {

      }

      @Override
      public void mouseExited(MouseEvent e) {

      }
     };

        Table image1 = new Table("1","src/main/resources/Menu/tabol.png");
        image1.addMouseListener(mouseListener);
        add(image1);
        image1.setLocation(200,80);
        image1.setSize(128,128);

       Table image2= new Table ("2","src/main/resources/Menu/tabol.png" );
        image2.addMouseListener(mouseListener);
        add(image2);
        image2.setLocation(330,80);
        image2.setSize(128,128);

       Table image3 = new Table("3","src/main/resources/Menu/tabol.png" );
        image3.addMouseListener(mouseListener);
        add(image3);
        image3.setLocation(200,210);
        image3.setSize(128,128);

        Table image4 = new Table("4","src/main/resources/Menu/tabol.png" );
        image4.addMouseListener(mouseListener);
        add(image4);
        image4.setLocation(330,210);
        image4.setSize(128,128);

        Table image5 = new Table("5","src/main/resources/Menu/tabol.png" );
        image5.addMouseListener(mouseListener);
        add(image5);
        image5.setLocation(550,80);
        image5.setSize(128,128);

        Table image6 = new Table("6","src/main/resources/Menu/tabol.png" );
        image6.addMouseListener(mouseListener);
        add(image6);
        image6.setLocation(680,80);
        image6.setSize(128,128);

        Table image7 = new Table("7","src/main/resources/Menu/tabol.png" );
        image7.addMouseListener(mouseListener);
        add(image7);
        image7.setLocation(550,210);
        image7.setSize(128,128);

        Table image8 = new Table("8","src/main/resources/Menu/tabol.png" );
        image8.addMouseListener(mouseListener);
        add(image8);
        image8.setLocation(680,210);
        image8.setSize(128,128);

        Table image9 = new Table("9","src/main/resources/Menu/tabol.png" );
        image9.addMouseListener(mouseListener);
        add(image9);
        image9.setLocation(930,80);
        image9.setSize(128,128);

        Table image10 = new Table(true,"10","src/main/resources/Menu/tabol.png" );
        image10.addMouseListener(mouseListener);
        add(image10);
        image10.setLocation(1060,80);
        image10.setSize(128,128);

        Table image11 = new Table(true,"11","src/main/resources/Menu/tabol.png" );
        image11.addMouseListener(mouseListener);add(image11);
        image11.setLocation(930,210);
        image11.setSize(128,128);

        Table image12 = new Table(true,"12","src/main/resources/Menu/tabol.png" );
        image12.addMouseListener(mouseListener);
        add(image12);
        image12.setLocation(1060,210);
        image12.setSize(128,128);

        Table image13 = new Table(true,"13","src/main/resources/Menu/tabol.png" );
        image13.addMouseListener(mouseListener);
        add(image13);
       image13.setLocation(930,350);
       image13.setSize(128,128);

        Table image14 = new Table(true,"14","src/main/resources/Menu/tabol.png" );
        image14.addMouseListener(mouseListener);
        add(image14);
       image14.setLocation(1060,350);
       image14.setSize(128,128);

        Table image15 = new Table(true,"15","src/main/resources/Menu/tabol.png" );
        image15.addMouseListener(mouseListener);
        add(image15);
        image15.setLocation(930,480);
        image15.setSize(128,128);

        Table image16 = new Table(true,"16","src/main/resources/Menu/tabol.png" );
        image16.addMouseListener(mouseListener);
        add(image16);
        image16.setLocation(1060,480);
        image16.setSize(128,128);






    }


}
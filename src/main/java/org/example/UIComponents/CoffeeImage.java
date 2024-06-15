package org.example.UIComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class CoffeeImage extends JLabel{
    public CoffeeImage(Icon image){
       setIcon(image);
       setBounds(getX(),getY(),1280,720);
       addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent e) {
               setBackground(Color.pink);

           }

           @Override
           public void mousePressed(MouseEvent e) {

           }

           @Override
           public void mouseReleased(MouseEvent e) {

           }

           @Override
           public void mouseEntered(MouseEvent e) {
           setBackground(Color.pink);
           }

           @Override
           public void mouseExited(MouseEvent e) {
               setBackground(Color.black);

           }
       });







    }


}

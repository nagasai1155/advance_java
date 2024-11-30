package Swing;

import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.*;

public class Menu {

    Menu(){
        JFrame f = new JFrame("menu and menuitem example");

        JMenuBar mb =new JMenuBar();
          JPanel p1 = new JPanel();
           p1.setBackground(Color.green);
         p1.setBounds(40 ,50,  500,200);

         f.add(p1);
      JMenu  menu = new JMenu("menu");
      JMenu  submenu = new JMenu("submenu");
        JMenuItem i1 = new JMenuItem("item1");
        JMenuItem i2 = new JMenuItem("item2");
        JMenuItem i3 = new JMenuItem("item3");
        JMenuItem i4 = new JMenuItem("item4");
        JMenuItem i5 = new JMenuItem("item5");

        menu.add(i1);menu.add(i2); menu.add(i3);
        submenu.add(i4);submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        p1.add(menu);
        p1.add(submenu);


        f.setSize(400,400);

        f.setLayout(null);

        f.setVisible(true);

  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
    public static void main(String args[]){

        new Menu();




    }
}

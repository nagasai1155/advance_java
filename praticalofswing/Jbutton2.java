package praticalofswing;

import javax.swing.*;

public class Jbutton2 extends JFrame {  //cocnept through inhertance


JFrame f ;

    Jbutton2 (){
        f = new JFrame();

        JButton b = new JButton("click");

        b.setBounds(40,50,30,50);
        add(b);
        setVisible(true);
        setSize(400,400);

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]){
        new Jbutton2();
    }
}

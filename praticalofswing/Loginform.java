package praticalofswing;

import javax.swing.*;
import java.awt.*;

public class Loginform {
    public static void main(String args[]){
        JFrame f = new JFrame("login form");
        JLabel label = new JLabel("username: ");
        f.add(label);
        label.setBounds(30,30,80,60);

        JTextField tf = new JTextField();
        f.add(tf);
        tf.setBounds(100,50,160,20);

        JLabel label2 = new JLabel("password:");
        f.add(label2);
        label2.setBounds(30,60,60,50);

        JPasswordField pwd = new JPasswordField();
        f.add(pwd);
        pwd.setBounds(100,80,60,20);

        JButton b = new JButton("login");
        f.add(b);
        b.setBounds(100,130,100,30);

        JCheckBox cb = new JCheckBox("car");
        f.add(cb);
        cb.setBounds(100,200,100,20);

        JTextArea ta = new JTextArea(2,2);
        f.add(ta);
        ta.setBounds(100,240,100,40);

        JRadioButton rb = new JRadioButton("male");
        f.add(rb);
        rb.setBounds(100,370,80,20);

        String country[] = {"india","usa","china","russia"};
        JComboBox ch = new JComboBox(country);
        f.add(ch);
        ch.setBounds(100,400,100,40);


        String name[] = {"name","id","country"};
        String name1[][] = {{"nagasai","1","india"},{"balam","2","india"},{"sjd","321","india"}};
        JTable tb = new JTable(name1,name);
        f.add(tb);
        tb.setBounds(400,200,100,100);



         //f.setLayout(new GridLayout());
        f.setLayout(null);
          f.setSize(900,1000);
          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

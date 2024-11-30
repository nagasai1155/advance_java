package praticalofswing;

import javax.swing.*;

public class Jlist {



    public static void main(String args[]){
        JFrame f = new JFrame();

        DefaultListModel<String > l1 = new DefaultListModel<>();
        l1.addElement("java");
        l1.addElement("c++");
        l1.addElement("c");
        l1.addElement("python");

        JList list = new JList(l1);
        list.setBounds(200,200,100,100);
        f.add(list);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);


    }
}

package praticalofswing;

import javax.swing.*;

public class Jtable {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        String names[] = {"name","id","country"};
        String names1[][] = {{"nagasai","3","india"},{"nagasai","3","india"},{"nagasai","3","india"}};
        JTable tb = new JTable(names1,names);

        //f.add(tb);
        tb.setBounds(200,200,200,300);

        JScrollPane sp = new JScrollPane(tb);
        f.add(sp);
         //f.setLayout(new GridLayout());
          f.setSize(300,400);
          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

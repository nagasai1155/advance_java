package praticalofswing;

import javax.swing.*;

public class Jtablewithjscrollpane {
    public static void main(String args[]){
          String  column[] = {"id ","name","salary"};
          String data[][] = {{"101","nagasai","34534"},
                  {"303","surya","23423"},{"23","nagaszai","2341234"},{"23","ndfa;","223"}};


        JFrame f = new JFrame();
        JTable table = new JTable(data,column);
        JScrollPane sp= new JScrollPane(table);







        f.add(sp);



        f.setSize(200,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

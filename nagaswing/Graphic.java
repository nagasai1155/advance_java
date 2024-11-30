package nagaswing;

import javax.swing.*;
import java.awt.*;

public class Graphic  extends  Canvas{
    public  void paint(Graphics g){


        g.drawLine(50,12,45,67);
        g.drawRect(100,200,50,90);
        setBackground(Color.GREEN);

    }
    public static void main(String args[]){
        Graphic ss= new Graphic();
        JFrame f = new JFrame();
        f.add(ss);

          f.setSize(300,400);

          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

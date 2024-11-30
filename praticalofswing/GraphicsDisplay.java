package praticalofswing;
import javax.swing.*;
import java.awt.*;

public class GraphicsDisplay extends  Canvas{

    public void paint(Graphics g){
        g.drawString("nagasai",40,40);
        setBackground(Color.WHITE);
        g.drawRect(40,100,60,70);
        setForeground(Color.green);
        g.fillRect(50,250,60,70);
        g.drawOval(120,100,60,50);
        g.fillOval(150,100,50,60);
        g.drawArc(200,200,40,70,90,180);
        g.fillArc(120,150,50,50,90,180);
        g.drawLine(405,106,417,118);
    }

    public static void main(String[] args) {
        GraphicsDisplay m = new GraphicsDisplay();
        JFrame f = new JFrame("GRAPHICS");
        f.add(m);
        //f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);


    }
}

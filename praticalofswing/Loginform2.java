package praticalofswing;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import static sun.util.locale.LocaleUtils.isEmpty;

public class Loginform2 {

    public static void main(String args[]){

        JFrame f = new JFrame("loginfromvalidation");

         JLabel label1= new JLabel("username");
         label1.setBounds(50,100,80,50);

        JTextField tf = new JTextField();
        tf.setBounds(110,100,100,60);

        JLabel label2 = new JLabel("password");
        label2.setBounds(50,200,100,50);

        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(110,200,90,60);

        JButton b = new JButton("click here");
        b.setBounds(100,300,100,60);

        JTextField tf1 = new JTextField();
        tf1.setBounds(100,340,100,80);
        f.add(tf1);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               // ArrayList<String > data= tf.getText();
                //String data1= pwd.getPassword();
                //data.stream().
                tf1.setText("login successful ");
                String data = tf.getText();

            //String pwd1 = pwd.getPassword();
                String data1 = new String(pwd.getPassword());
//                if(data == " " && data1 == " "){
//
//                }


               System.out.println("username :" + data);
               System.out.println("pwd:" + data1);
                System.out.println("login successful");
            }
        });

        f.add(label1);f.add(label2);f.add(tf);f.add(pwd);f.add(b);
        f.setLayout(null);
          f.setSize(300,400);
          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          ;
    }
}

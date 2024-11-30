
package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jlistexample extends JFrame {
    private JList<String> itemList;
    private DefaultListModel<String> listModel;

    public Jlistexample() {
        setTitle("JList Example");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a DefaultListModel
        listModel = new DefaultListModel<>();
        listModel.addElement("c");
        listModel.addElement("c++");
        listModel.addElement("java");
        listModel.addElement("python");
        listModel.addElement("c#");

        // Create a JList with the DefaultListModel
        itemList = new JList<>(listModel);
        itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Create a JScrollPane to add the JList
        JScrollPane scrollPane = new JScrollPane(itemList);

        // Add the JScrollPane to the JFrame
        add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jlistexample::new);

    }
}
//String username = textFieldUsername.getText();
//String password = new String(passwordField.getPassword());
//
//// You can add your authentication logic here
//// For simplicity, let's just check if username and password are not empty
//                if (!username.isEmpty() && !password.isEmpty()) {
//        JOptionPane.showMessageDialog(LoginWindow.this, "Login Successful!");
//                } else {
//                        JOptionPane.showMessageDialog(LoginWindow.this, "Invalid Username or Password");
//                }
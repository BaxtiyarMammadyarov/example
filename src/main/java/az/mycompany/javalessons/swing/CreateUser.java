package az.mycompany.javalessons.swing;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateUser  {
    User user ;
    DbConnect connect ;

    private JPanel jp1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton canselButton;
    private JButton createButton;

    public CreateUser(User user) {

        canselButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                passwordField1.setText("");
            }
        });
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username=textField1.getText();
                String password=passwordField1.getText();
                if(user.userNameCheck(username)){
                    user.setUsername(username);
                    if(user.passwordCheck(password)){
                    DbConnect connect=new DbConnect();
                    user.setPassword(password);
                    connect.insertUserTable(user);
                    JOptionPane.showMessageDialog(null,"username yaradildi");
                    connect.disConnectDb();
                    }else JOptionPane.showMessageDialog(null," password duzgun deyil !!! \n password herif ve en az 2 reqemden ibaret 10 simvol olmalidi olmalidi");
                }else JOptionPane.showMessageDialog(null,"username  basada var");
            }
        });
    }




    public JPanel getJp1(){
        return jp1;
    }
}

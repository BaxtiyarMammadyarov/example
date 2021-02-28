package az.mycompany.javalessons.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateUser  {
    private JFrame frame1=new JFrame();;
    private JPanel jp1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton canselButton;
    private JButton createButton;

    public JFrame getFrame(){
        frame1.setContentPane(new CreateUser().jp1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocation(100,300);
        frame1.setVisible(true);
        frame1.setSize(100,200);
        return frame1;
    }
    public CreateUser() {
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
                User user =new User();
                DbConnect connect =new DbConnect();
                String username=textField1.getText();
                String password=passwordField1.getText();
                if(user.userNameCheck(username)&& user.passwordCheck(password)){
                    user.setUsername(username);
                    user.setPassword(password);
                    connect.insertUserTable(user);
                    JOptionPane.showMessageDialog(null,"username yaradildi");
                    System.exit(0);

                }else JOptionPane.showMessageDialog(null,"username ve ya password duzgun deyil");
            }
        });
    }


}

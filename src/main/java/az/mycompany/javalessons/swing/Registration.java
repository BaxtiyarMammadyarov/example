package az.mycompany.javalessons.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration {

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JButton canselButton;
    private JButton savePersonButton;
    private  JPanel jp;
    private JTextField textField4;
    private CreateUser createUser;




    public Registration(){

        canselButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               textField1.setText("");
               textField2.setText("");
               textField3.setText("");
                textField4.setText("");

            }
        });

        savePersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User user =new User();
                DbConnect connect=new DbConnect();

                user.setName(textField1.getText());
                user.setSurname(textField2.getText());
                user.setFathername(textField3.getText());
                user.setAge(Integer.parseInt(textField4.getText()));
                user.setGender(comboBox1.getSelectedItem().toString());
                connect.insertTablePerson(user);
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");

               CreateUser createUser=new CreateUser();
               createUser.getFrame();


            }
        });
    }


    public static void main(String[] args) {
        JFrame frame=new JFrame("registration");
        frame.setContentPane(new Registration().jp);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100,200);
        frame.setVisible(true);
        frame.setSize(200,300);

    }



}

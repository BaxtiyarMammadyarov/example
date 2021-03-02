package az.mycompany.javalessons.swing;

import javax.swing.*;

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
    public Registration(){
        User user =new User();
        canselButton.addActionListener(v-> {

               textField1.setText("");
               textField2.setText("");
               textField3.setText("");
                textField4.setText("");
        });

        savePersonButton.addActionListener(v-> {
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

                 showFrame(new CreateUser(user).getJp1(),"Create user");

        });
    }
    public static void showFrame(JPanel jp,String title){
        JFrame frame=new JFrame();
        frame.setContentPane(jp);
        frame.setTitle(title);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(300,300);
        frame.setVisible(true);
        frame.setSize(400,300);
    }


    public static void main(String[] args) {
       showFrame(new Registration().jp,"Registration");

    }



}

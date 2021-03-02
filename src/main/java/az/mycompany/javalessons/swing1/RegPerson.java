package az.mycompany.javalessons.swing1;

import javax.swing.*;

import java.awt.*;


public class RegPerson extends JFrame {

    private JPanel jp;
    private JTextField textField1;
    private JTextField textField2;
    private JButton btn;
    public RegPerson(){
        init();
        btn.addActionListener(v->  textField2.setText(textField1.getText()));
    }
    public void init(){

        jp=new JPanel();
        textField1=new JTextField();
        jp.add(textField1);
        textField2=new JTextField();
        jp.add(textField2);
        btn=new JButton("Yaz");
        jp.add(btn);

    }


    public static  void main(String[] args) {
     JFrame frame =new JFrame();
     frame.setContentPane(new RegPerson().jp);
     frame.setLayout(new GridLayout());
     frame.setSize(300,300);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
    }

}

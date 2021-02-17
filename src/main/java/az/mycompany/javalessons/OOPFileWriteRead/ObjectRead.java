package az.mycompany.javalessons.OOPFileWriteRead;

import java.io.*;

public class ObjectRead {

    public static void main(String[] args) {


        String s="D:\\IdeaProjects\\example\\src\\main\\java\\az\\mycompany\\javalessons\\OOPFileWriteRead\\outhuman.txt";
        try {

            FileInputStream inputStream=new FileInputStream(s);
            ObjectInputStream inputobj=new ObjectInputStream(inputStream);
            Human human;
            human = (Human) inputobj.readObject();
            inputobj.close();
            inputStream.close();
            System.out.println(human.toString());
            System.out.println("The Object  was succesfully readen to a file");

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}

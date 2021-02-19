package az.mycompany.javalessons.OOPFileWriteRead;

import java.io.*;

public class ObjectWrite {
    public static void main(String[] args) {


        Human human2 =new Human("Alexande","Hunold",40,"Ernst","Diana");
        String s="D:\\IdeaProjects\\example\\src\\main\\java\\az\\mycompany\\javalessons\\OOPFileWriteRead\\outhuman.txt";
                try {

            FileOutputStream fileOut = new FileOutputStream(s);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(human2);
            objectOut.close();
            fileOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    }



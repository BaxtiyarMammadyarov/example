package az.mycompany.javalessons.OOPFileWriteRead;

import java.io.*;

public class ObjectWriteRead {
    public static void main(String[] args) {

        Human human=new Human();
        Human human2 =new Human("Alexande","Hunold",40,"Ernst","Diana");
        String s="D:\\IdeaProjects\\example\\src\\main\\java\\az\\mycompany\\javalessons\\OOPproject\\outhuman.txt";
        String objectfile="D:\\IdeaProjects\\example\\src\\main\\java\\az\\mycompany\\javalessons\\OOPproject\\Human.java";
        File file=new File(s);


        try {

            FileOutputStream fileOut = new FileOutputStream(s);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(objectfile);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    }



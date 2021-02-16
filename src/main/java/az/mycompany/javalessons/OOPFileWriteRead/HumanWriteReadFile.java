package az.mycompany.javalessons.OOPFileWriteRead;



import java.io.*;

public class HumanWriteReadFile {
    public static void main(String[] args)  {
        Human human1=new Human();
       Human human2 =new Human("Alexande","Hunold",40,"Ernst","Diana");

      String s="D:\\IdeaProjects\\example\\src\\main\\java\\az\\mycompany\\javalessons\\OOPproject\\outhuman.txt";

       try {
           FileOutputStream fops=new FileOutputStream(new File(s));
           ObjectOutputStream o =new ObjectOutputStream(fops);
           o.writeObject(human2);

           o.close();
           fops.close();



       }catch (FileNotFoundException e){
           System.out.println("file not found");
       }catch (IOException e){
           System.out.println("Error initializing stream");
           System.out.println(e.getLocalizedMessage());
       }


    }
}

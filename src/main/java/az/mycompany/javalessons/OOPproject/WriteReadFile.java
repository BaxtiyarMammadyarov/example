package az.mycompany.javalessons.OOPproject;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class WriteReadFile {
    public static void main(String[] args) throws IOException {
        List<Human> humanList=new ArrayList<>();
        humanList.add(new Human("Steven","King",45,"Kochhar","Neena"));
        humanList.add(new Human("Alexande","Hunold",40,"Ernst","Diana"));
        humanList.add(new Human("Nancy","Greenberg",55,"John","Julia"));
        humanList.add(new Human("Payam","Fripp",35,"Vollman","Julia"));
        humanList.add(new Human("Steven","Hunold",30,"John","Neena"));
        humanList.add(new Human("Irene","Landry",25,"James","Laura"));
        humanList.add(new Human("Ernst","Fripp",50,"Michael","Trenna"));
        humanList.add(new Human("John","Patel",28,"Stephen","Janette"));
        humanList.add(new Human("McEwen","Doran",60,"Allan","Clara"));
        humanList.add(new Human("William","Smith",38,"Harrison","Lisa"));
        humanList.add(new Human("Ellen","Abel",23,"Jack","Julia"));
        humanList.add(new Human("Smith","James",33,"Michael","Diana"));
        humanList.add(new Human("Samuel","McCain",43,"Pat","Jennifer"));
        humanList.add(new Human("Hermann","Baer",37,"William","Shelley"));
        humanList.add(new Human("Douglas","Grant",53,"Kevin","Susan"));
        File file=new File("D:\\IdeaProjects\\example\\src\\main\\java\\az\\mycompany\\javalessons\\OOPproject\\out.txt");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))  ;
          humanList.stream()
                  .sorted(Comparator.comparingInt(Human::getAge))
                  .forEach(human -> {
              try  {
                  bw.write( human.getName() + " "
                          + human.getSurname() + " "
                          + human.getAge() + " "
                          + human.getFathername() + " "
                          + human.getMothername() +"\n");
                  bw.newLine();

              } catch (IOException e) {
                  e.printStackTrace();
              }
          });
          bw.close();

          BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
          try {
              while (br.ready()){
                  System.out.println(br.readLine());
              }

          }catch (IOException e){
              System.out.println(e.getMessage());
          }

    }
}

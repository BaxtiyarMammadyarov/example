package az.mycompany.javalessons.kassa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kassa {


    private Map<Integer,Product> productMap=new HashMap<>();

    public Map<Integer, Product> getProductMap() {
        return productMap;
    }

    public void insertProduct(Product product){

      productMap.put(product.getProduct_id(),product);
    }

    public static void main(String[] args) {
        Kassa kassa=new Kassa();
        Scanner scanner =new Scanner(System.in);
        kassa.insertProduct(new Product(1,"Java kitab",20));
        kassa.insertProduct(new Product(2,"C# kitab",18));
        kassa.insertProduct(new Product(3,"c++ kitab",10));
        kassa.insertProduct(new Product(4,"Phyton kitab",15));
        kassa.insertProduct(new Product(5,"CCs kitab",10));
        kassa.insertProduct(new Product(6,"Html kitab",10));
        String payment="";
        int sum=0;

        System.out.print("input Admin password: ");
        int adminpassword=scanner.nextInt();

         if(adminpassword==123){
             System.out.println("məhsul kodunu daxil  cek ucun p sistemden cixis ucun e duymesini sixin");
              int count =1;

             while (true){
                  String input=scanner.next();

                 if (input.equals("e"))  {
                     System.out.println("kassa baglandi");
                     break;
                 }
                 else if(input.equals("p")) {System.out.println(payment+"\n"+"Mebleg------ " +sum);
                     File file= new File("D:\\IdeaProjects\\example\\src\\main\\java\\az\\mycompany\\javalessons\\kassa\\"+count+"payment.txt");
                     try (FileWriter fileWriter = new FileWriter(file)) {
                         fileWriter.write(payment+"\n"+"Mebleg------ " +sum);

                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                     count++;
                     payment="";
                     sum=0;
                     System.out.println("məhsul kodunu daxil edib enter duymesin sixin");
                 }else {
                     int kod=Integer.parseInt(input);
                     if(kassa.productMap.containsKey(kod)){
                         payment+=kassa.getProductMap().get(kod).getProduct_id()+" "+
                                 kassa.getProductMap().get(kod).getProduct_name()+" "+
                                 kassa.getProductMap().get(kod).getProduct_price()+"\n";
                         sum+=kassa.getProductMap().get(kod).getProduct_price();
                     }else System.out.println("Kod bazada yoxdur");
                 }


             }


         }else System.out.println("password is incorrect");



    }
    }







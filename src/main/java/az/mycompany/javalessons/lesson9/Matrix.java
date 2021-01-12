package az.mycompany.javalessons.lesson9;

import java.util.ArrayList;
import java.util.List;

public class Matrix {
  private List<List>matrix=new ArrayList<>();

   public  void setMatrix(int number){
        for (int i=0;i<number;i++ )
              matrix.add(0,inputArray(number));

        }

        List<Integer>inputArray(int num) {
           List <Integer> arr= new ArrayList<>();
           for(int j=0;j<num;j++)
                   arr.add(j, (int) (Math.random() * 100));

           return arr;
       }
       public List<Integer> elementsLineMatrix(int indexline){
          return  matrix.get(indexline);
       }
       public Integer elementMatrix(int indexline,int indexcolumn){
         return elementsLineMatrix(indexline).get(indexcolumn);
       }



   public void showMatrix(){
       for(List i:matrix)
           System.out.println(i.toString().replace(",","").replace("[","").replace("]",""));
        }

    public static void main(String[] args) {
        Matrix matrix=new Matrix();
        matrix.setMatrix(5);
        matrix.showMatrix();
        System.out.println("-----------------------------------");
        System.out.println( matrix.elementsLineMatrix(3));
        System.out.println("------------------------------------");
        System.out.println(matrix.elementMatrix(3,4));

    }
}

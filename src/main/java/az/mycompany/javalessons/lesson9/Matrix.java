package az.mycompany.javalessons.lesson9;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


public class Matrix {
  private ArrayList<ArrayList>matrix=new ArrayList<>();

   public  void setMatrix(int number){
        for (int i=0;i<number;i++ )
              matrix.add(0, inputArray(number));
        }

        ArrayList<Integer>inputArray(int num) {
           ArrayList <Integer> arr= new ArrayList<>();
           for(int j=0;j<num;j++)
                   arr.add(j, (int) (Math.random() * 100));
           return arr;
       }
       public ArrayList<Integer> elementsLineMatrix(int indexline){
                            return  matrix.get(indexline);
       }
       public Integer elementMatrix(int indexline,int indexcolumn){
         return elementsLineMatrix(indexline).get(indexcolumn);
       }
   public void showMatrix(){
       for(ArrayList  i:matrix)
           System.out.println(i.toString().replace(",","").replace("[","").replace("]",""));
        }

    public static void main(String[] args) {
        long starttime=System.nanoTime();
        Matrix matrix=new Matrix();
        matrix.setMatrix(1000);
        matrix.showMatrix();
        long endtime=System.nanoTime();

        System.out.println((endtime-starttime)/100000000);
    }
}

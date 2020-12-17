package az.mycompany.javalessons.lesson6;

public class ArrayTest {
    public static void main(String[] args) {


        int[] arr = {12, 100, 8, 1500, 876, 89, 9454};
        for(int i:arr){
            System.out.print(" "+i);

        }
        System.out.println("\n");

         for(int i=0;i<arr.length;i++){
               for(int j=i+1;j<arr.length;j++){
                   if (arr[i]>arr[j]){
                       arr[i]=arr[i]+arr[j];
                       arr[j]=arr[i]-arr[j];
                       arr[i]=arr[i]-arr[j];
                   }
               }
         }
         for(int i:arr){
             System.out.print(" "+i);
         }


        }
    }


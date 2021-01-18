package az.mycompany.javalessons.leesson10;

public class Passwordcheck {
    public static void main(String[] args) {
        //Matcher
        String str ="B19964564803";
        System.out.println( countDigitAlphabetic(str)[0]+" "+ countDigitAlphabetic(str)[1]);
        checkPassword(str);


    }
   public static void checkPassword(String str){
        if(str.length()<10) System.out.println(" dogru deyil");
        else {
            if (countDigitAlphabetic(str)[0]>0&& countDigitAlphabetic(str)[1]>1&& countDigitAlphabetic(str)[0]+ countDigitAlphabetic(str)[1]==str.length())
                System.out.println("sifre teleblere uygundur");
            else System.out.println("sifre teleblere uygun deyil!!");
        }



    }
    public static int[] countDigitAlphabetic(String str){
        int countalphabetic=0;
        int countdigit=0;
        int[] countlist=new int[2];
        for (char i:str.toCharArray())
             if (Character.isAlphabetic(i))
                 countalphabetic++;
             else if(Character.isDigit(i))
                 countdigit++;
          countlist[0]=countalphabetic;
          countlist[1]=countdigit;
        return countlist;
    }
}

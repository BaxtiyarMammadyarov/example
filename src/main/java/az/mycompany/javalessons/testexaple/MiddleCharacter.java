package az.mycompany.javalessons.testexaple;


public class MiddleCharacter {
    public static void main(String[] args) {

        MiddleChar("150");
        System.out.println("---");
        MiddleChar("1980");
        System.out.println("----------------");
        MiddleChar1("150");
        System.out.println("---");
        MiddleChar1("1980");
    }
    public static void MiddleChar(String str){
        if(str.length()%2==0) System.out.println(str.substring(str.length()/2-1,str.length()/2+1));
        else  System.out.println(str.charAt((str.length()-1)/2));
    }
    public static void MiddleChar1(String str){
        if(str.length()%2==0) System.out.println(str.charAt(str.length()/2-1)+""+str.charAt(str.length()/2));
        else  System.out.println(str.charAt((str.length()-1)/2));
    }


}


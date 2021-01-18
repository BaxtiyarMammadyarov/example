package az.mycompany.javalessons.leesson10;

public class Example2 {
    public static void main(String[] args) {
        String[] str = new String[7];
        String innerstr = "";
        for (int i = 1; i < 8; i+=2) {
            for (int j = 1; j < 8; j++)
                innerstr += "*";
            str[i - 1] = innerstr;
            innerstr = "";
        }
         int count=0;
        for (String i:str) {
            System.out.println(resultLine(i, count));
            count++;
        }
    }
    public static String bosluq(int number){
        String str ="";
        for (int i =0;i<number;i++)
            str+=" ";
    return str;}
    public static String resultLine(String str, int i){
        String result="";
        result+=bosluq((str.length()-i-1))+str.charAt(i);
        if(i>0) {
            for (int j = 1; j < i; j++)
                result += " " + str.charAt(i);
        }
    return  result;}
}

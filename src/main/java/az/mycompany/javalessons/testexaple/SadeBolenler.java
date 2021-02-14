package az.mycompany.javalessons.testexaple;

public class SadeBolenler {
    public static void main(String[] args) {
        simpleDivisor(100);
        System.out.println(simpleDivisor(100));


    }
    public static int simpleDivisor(int number){
        int oldnumber=number;
        int simple =2;
        int count=0;
        int differentsimple=0;
        String list="";
        String primefactors="";
        while(number>=simple){
            if(number% simple ==0){
                number=number/ simple;
                list=list.concat("*"+simple);
                count++;
                differentsimple++;
                if(count<2)
                    primefactors= primefactors.concat(simple+",");

            }else {
                simple++;
                count=0;
            }
        }
        System.out.println(oldnumber+" = 1"+list);
        System.out.println("Prime factors : "+primefactors.substring(0,primefactors.length()-1));
        return differentsimple;
    }
}

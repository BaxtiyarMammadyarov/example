package az.mycompany.javalessons.registrationapp;

public class User extends  Person {

    private String username;
    private String password;

   public User(){
       super();
   }
   public User( String name, String surname, String fathername, Integer age, String gender,String username,String password){
       super(   name, surname,  fathername, age,  gender);
       this.username=username;
       this.password=password;

   }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
          this.password = password;
    }
    boolean passwordCheck(String str){
        boolean answer=false;
        int count=0;
        if(str.length()>=8){
            for(char i:str.toCharArray()){
                if (Character.isDigit(i)){
                    count++;
                    if (count>1 && count<str.length())
                        answer=true;
                }
                else if(!Character.isAlphabetic(i)) {
                    answer=false;
                    break;
                }

            }
        }
        return answer;
    }
}

package az.mycompany.javalessons.registrationapp;

public class User {
    private Integer person_id;
    private String username;
    private String password;

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
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

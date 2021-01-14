package az.mycompany.javalessons.example4;



public class Pet  {
    String species;
    String nickname;
    byte age;
    byte trickLevel;
    String[] habits;
    public Pet(){

    }
    public Pet( String species,String nickname, int age, int trickLevel,String[]habits){
       this.species=species;
       this.nickname=nickname;
       this.age=(byte) age;
       this.trickLevel=(byte) trickLevel;
       this.habits=habits;

    }
    public String petShow(){

        return species+"\n "+nickname+"\n "+age+"\n "+trickLevel;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (byte) age;
    }
    public byte getTrickLevel() {
        return trickLevel;
    }
    public void setTrickLevel(int Level) {
        if(Level>=1||Level<=100) this.trickLevel = (byte) Level;
        else System.out.println("input a Level number from 1 to 100");
    }
    public String[] getHabits() {
        return habits;
    }
    public void setHabits(String[] habits) {
        this.habits = habits;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }





}

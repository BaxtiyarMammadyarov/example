package az.mycompany.javalessons.exampleOOP;


import java.util.HashMap;

public class Person extends Human implements ActivitePerson {
    public Person(){
        super();
    }
   private Pet pet;
   private Human father;
   private Human mother;
    private HashMap<String,String> schedule=new HashMap<>();

    public HashMap<String,String> getSchedule() {
        return schedule;
    }

    public void setSchedule(String day,String dayactiviti) {schedule.put(day,dayactiviti) ;  }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }
    public void showHuman(){
        System.out.println(getName()+" "
                +getSurname()+"\n "
                +getDateofbirthyear()+"\n "
                +getIqlevel()+"\n "
                +father.getName()+"  "+father.getSurname()+"\n "
                +mother.getName()+" "+ mother.getSurname()+"\n "
                + pet.petShow());
    }


    @Override
    public void greetPet() {
        System.out.println("Hello "+pet.getNickname());
    }

    @Override
    public void describePet() {
        if(pet.getTrickLevel()>50) {
            System.out.println("species :"+pet.getAge()+"\n"+"age : "+pet.getAge()+"\n"+"very sly");
        } else  System.out.println("species :"+pet.getAge()+"\n"+"age : "+pet.getAge()+"\n"+"almost not sly");

    }
    public void nonWorkingActiviti(String day){
        System.out.println(day+":"+schedule.get(day));
    }


}

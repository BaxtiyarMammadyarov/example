package az.mycompany.javalessons.example4;

public class Person extends Human implements MetodPerson{
    public Person(){
        super();
    }
   private Pet pet;
   private Human father;
   private Human mother;
    private String[] schedule=new String[2];

    public String[] getSchedule() {
        return schedule;
    }

    public void setSchedule(String nonworkingday,String nonworkingactiviti) {

        schedule[0]=nonworkingday;
        schedule[1]=nonworkingactiviti;

    }

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
    public void nonWorkingActiviti(){
        System.out.println(schedule[0]+":"+schedule[1]);
    }


}

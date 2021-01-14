package az.mycompany.javalessons.example4;

public class Man extends Human implements MetodMan,MetodPet{
    public Man(){
        super();
    }
    Pet pet;
    Human father;
    Human mother;

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
        System.out.println(name+" "+surname+"\n "+dateofbirthyear+"\n "+iqlevel+"\n "+father.getName()+"  "+father.getSurname()+"\n "+ mother.getName()+" "+mother.getSurname()+"\n "+ pet.petShow());
    }


    @Override
    public void greetPet() {
        System.out.println("Hello "+pet.nickname);
    }

    @Override
    public void describePet() {
        if(pet.getTrickLevel()>50) {
            System.out.println("species :"+pet.getAge()+"\n"+"age : "+pet.getAge()+"\n"+"very sly");
        } else  System.out.println("species :"+pet.getAge()+"\n"+"age : "+pet.getAge()+"\n"+"almost not sly");

    }

    @Override
    public String habitsPet(int index) {

          return pet.nickname+" "+pet.habits[index];}


    @Override
    public void respondPet() {

    }

    @Override
    public void foul() {

    }
}

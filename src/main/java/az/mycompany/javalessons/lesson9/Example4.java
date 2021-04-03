package az.mycompany.javalessons.lesson9;

public class Example4 {
    class Human {
        String name;
        String surname;
        int dateofbirthyear;
        byte iqlevel;// (a whole number from 1 to 100))
        Pet pet;
        Human mother;// (object type Human)
        Human father;// (object type Human)

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getDateofbirthyear() {
            return dateofbirthyear;
        }

        public void setDateofbirthyear(int dateofbirthyear) {
            this.dateofbirthyear = dateofbirthyear;
        }

        public byte getIqlevel() {
            return iqlevel;
        }

        public void setIqlevel(int iqlevel) {
            if (iqlevel >= 1 || iqlevel <= 100) this.iqlevel = (byte) iqlevel;
        }

        public Pet getPet() {
            return pet;
        }

        public void setPet(Pet pet) {
            this.pet = pet;
        }

        public Human getMother() {
            return mother;
        }

        public void setMother(Human mother) {
            this.mother = mother;
        }

        public Human getFather() {
            return father;
        }

        public void setFather(Human father) {
            this.father = father;
        }
    }

    class Pet {
        String species;
        String nickname;
        byte age;
        byte trickLevel;
        String[] habits;

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public byte getAge() {
            return age;
        }

        public void setAge(byte age) {
            this.age = age;
        }

        public byte getTrickLevel() {
            return trickLevel;
        }

        public void setTrickLevel(int trickLevel) {
            if (trickLevel >= 1 || trickLevel <= 100) this.trickLevel = (byte) trickLevel;
            else System.out.println("input a whole number from 1 to 100");
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
}

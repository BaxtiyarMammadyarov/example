package az.mycompany.javalessons.example4;



public  class Human  {
   private String name;
   private String surname;
   private int dateofbirthyear ;
    private byte iqlevel ;// (a whole number from 1 to 100))
    public Human(){

    }
    public Human(String name,String surname){
        this.name=name;
        this.surname=surname;
    }



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

    public void setIqlevel(int iq) {
       if(iqlevel>=1||iqlevel<=100) iqlevel = (byte) iq;
       else System.out.println("iq a whole number from 1 to 100");
    }

}

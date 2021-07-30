package com.clasesreforzamiento.cesaramaya.exceptions;

public class CheckedException {

    private int edad;
    private String firstName;
    private String lastName;
    private  String adress;

    public CheckedException(){
                edad =  42;
                firstName =  "Homer";
                lastName =  "Simpson";
                adress = "Ave, Siempre Viva 16202, Sprintfield";
    }
    public CheckedException(int edad, String firstName, String lastName, String adress){
                this.edad =  edad;
                this.firstName = firstName;
                this.lastName =  lastName;
                this.adress = adress;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

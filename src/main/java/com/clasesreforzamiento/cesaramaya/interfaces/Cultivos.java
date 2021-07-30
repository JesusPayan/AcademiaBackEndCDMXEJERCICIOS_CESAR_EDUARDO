package com.clasesreforzamiento.cesaramaya.interfaces;
public abstract class Cultivos implements Cultivable{
    @Override
    public String plantar() {
        return "Plantar ";
    }
    public String regar(){
        return "Regar ";
    }
}

package com.clasesreforzamiento.cesaramaya.interfaces;



public  class CultivoFresas extends Cultivos{
    @Override
    public String plantar() {
         return  super.plantar() + " Fresas";
    }

    @Override
    public String regar() {
        return  super.regar() + "Fresas";

    }

    @Override
    public int cosechar() {
        return 10;
    }
}

package com.clasesreforzamiento.cesaramaya.interfaces;

public  class CultivoManzanas extends Cultivos {

    @Override
    public int cosechar() {
        return 15;
    }

    @Override
    public String plantar() {
        return super.plantar() + " Manzanas";
    }

    @Override
    public String regar() {
        return super.regar() + " Manzanas";
    }
}

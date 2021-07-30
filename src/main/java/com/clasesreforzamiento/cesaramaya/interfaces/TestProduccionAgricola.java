package com.clasesreforzamiento.cesaramaya.interfaces;

public class TestProduccionAgricola{

    public static void main(String[] args) {

        CultivoFresas cultivoFresas = new CultivoFresas();
        CultivoManzanas cultivoManzanas = new CultivoManzanas();
        System.out.println("----------Cultivos Fresas--------");
        System.out.println(cultivoFresas.plantar());
        System.out.println(cultivoFresas.regar());
        System.out.println("Fresas " +cultivoFresas.cosechar());
        System.out.println("----------Cultivos Manzanas--------");
        System.out.println(cultivoManzanas.plantar());
        System.out.println(cultivoManzanas.regar());
        System.out.println("Fresas " +cultivoManzanas.cosechar());

    }


}

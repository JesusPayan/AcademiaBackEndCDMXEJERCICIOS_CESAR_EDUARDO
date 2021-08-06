package com.clasesreforzamiento.cesaramaya.generics;

import java.util.ArrayList;
import java.util.List;

public class Genericos {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(28);
        iOb.mostrarTipo();
        int v = iOb.getOb();
        System.out.println("Valor: " + v);
        System.out.println();
        Gen<String> strOb = new Gen<String>("Prueba de generico" );
        strOb.mostrarTipo();
        String str = strOb.getOb();
        System.out.println("Valor " + str );
        Cat kitty = new Cat();
        Gen<Cat> helloKitty = new Gen<Cat>(kitty);

        helloKitty.mostrarTipo();
        Cat pussy = helloKitty.getOb();
        System.out.println(pussy.getCatSound());


    }
}

package com.clasesreforzamiento.eduardozampayo.collections;

import java.util.ArrayList;

public class EjempArrayList {

    public static void main(String[] args) {
        ArrayList nombres = new ArrayList();
        System.out.println(nombres.size());
        nombres.add("pedro");
        nombres.add("ana");
        nombres.add("juan");
        nombres.add("paco");
        nombres.add("luis");
        System.out.println("******************");
        System.out.println("contenido " + nombres);
        System.out.println("Elementos " + nombres.size());
        System.out.println("******************");
        nombres.remove("ana");
        System.out.println("******************");

        System.out.println("contenido " + nombres);
        System.out.println("Elementos " + nombres.size());
    }

}

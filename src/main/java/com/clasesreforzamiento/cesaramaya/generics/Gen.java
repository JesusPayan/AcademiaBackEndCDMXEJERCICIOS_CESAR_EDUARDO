package com.clasesreforzamiento.cesaramaya.generics;

public class Gen <T>{
    T ob;
    Gen(T o){
        this.ob = o;
    }

    public T getOb() {
        return ob;
    }
    void mostrarTipo(){
        System.out.println("El Tipo de T es : "  + ob.getClass().getName() );
    }
}

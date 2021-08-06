package com.clasesreforzamiento.cesaramaya.fluidcontrol.exceptions;

public class Main {
    public static void main(String[] args) throws Exception {
        doSomething();
    }
    private static void doSomething() throws Exception{
        System.out.println("before if clause");
        if(Math.random() > 0.5){throw new Exception();}
        System.out.println("after if clause");
    }
}

package com.clasesreforzamiento.cesaramaya.fluidcontrol.exceptions;

public class TestException {
            public static void main(String[] args) {
                    int notas[] = new int [10];

                   try {
                       addNumbersToArray(notas);
                   }catch (NullPointerException e){
                       System.out.println("Excepcion " + e.getMessage());
                   }

            }
            public static  void addNumbersToArray(int[] notas) throws NullPointerException{
                for (int i = 0 ; i < notas.length; i ++  ){// the condition in for's loop create a NullPointerException, because length is 10 and the index only goes to 9.
                    notas[i] =  (int) Math.random()*100+1;

                }
            }
}

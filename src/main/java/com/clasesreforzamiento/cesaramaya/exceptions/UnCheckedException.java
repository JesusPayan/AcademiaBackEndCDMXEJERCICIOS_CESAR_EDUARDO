package com.clasesreforzamiento.cesaramaya.exceptions;

public class UnCheckedException {
            public static void main(String[] args) {
                        int []numbersArray = new int [30];
                for (int i = 0; i <= numbersArray.length ; i++) {
                            numbersArray[i] =  (int) Math.random()* 100 +1;
                }
                for (int i = 0; i <= numbersArray.length; i++) {
                    System.out.println("Elemento: " + numbersArray[i]);

                }
            }
}

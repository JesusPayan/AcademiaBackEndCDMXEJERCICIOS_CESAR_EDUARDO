package com.clasesreforzamiento.cesaramaya.exceptions;

public class TestCheckedException {
            public static void main(String[] args) {
                    CheckedException checkedException1 = new CheckedException(30,"jesus","hernandez","centauro");
                    CheckedException checkedException2 =  new CheckedException();
                    CheckedException checkedException3 = null;


                try {
                    System.out.println(isNull(checkedException1));// tfalse
                    System.out.println(isNull(checkedException2));;//false
                    System.out.println(isNull(checkedException3));
                }catch (Exception e){
                    System.out.println("Se arrojo una Excepcion " + e);
                }
            }
            public static boolean isNull(Object obj) throws Exception {
                if (obj == null) {
                        //obj = new CheckedException();
                        isNull(obj);
                    return true;

                } else {
                    return false;
                }
            }
}

package com.clasesreforzamiento.cesaramaya.generics;

public class TestNGen {
        public static void main(String[] args) {
                        NGen <Integer,String, Double,Boolean> nGen =  new NGen<>(1,"Hola",2.4,true);
                nGen.mostrarTipo();
                int valor =  nGen.getOb();
                String msg =  nGen.getObJ();
                double value = nGen.getObjj();
                boolean flag = nGen.getObjjj();

                System.out.println(valor + " " + msg  + "  " + value + "  "+  flag  + " "   );
        }
}

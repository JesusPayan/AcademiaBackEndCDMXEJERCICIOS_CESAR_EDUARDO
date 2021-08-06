package com.clasesreforzamiento.cesaramaya.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestGenericosII {
            public static void main(String[] args) {

                DosGen<Integer, Integer> dosGen = new DosGen<>(1, 2);
                System.out.println("Dos Gen con Integer " + dosGen.getObj1() + dosGen.getObj2());
            }
}

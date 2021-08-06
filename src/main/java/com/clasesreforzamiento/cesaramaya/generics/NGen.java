package com.clasesreforzamiento.cesaramaya.generics;

public class NGen <T , K , V , M>{
    T ob;
    K obJ;
    V objj;
    M objjj;

    public NGen(T ob, K obJ, V objj, M objjj) {
        this.ob = ob;
        this.obJ = obJ;
        this.objj = objj;
        this.objjj = objjj;
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

    public K getObJ() {
        return obJ;
    }

    public void setObJ(K obJ) {
        this.obJ = obJ;
    }

    public V getObjj() {
        return objj;
    }

    public void setObjj(V objj) {
        this.objj = objj;
    }

    public M getObjjj() {
        return objjj;
    }

    public void setObjjj(M objjj) {
        this.objjj = objjj;
    }
    public void mostrarTipo(){
        System.out.println(ob.getClass().getName());
        System.out.println(objj.getClass().getName());
        System.out.println(objjj.getClass().getName());
        System.out.println(obJ.getClass().getName());
    }
}

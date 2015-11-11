package com.com.Less15;

/**
 * Created by uitsc_000 on 07.11.2015.
 */
class Gen<T>{
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }
    public T getOb() {
        return ob;
    }
    void showType(){
        System.out.println("Type of T is "+ob.getClass().getName());
    }
}

public class Test {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("value v: "+v);
        System.out.println();
        Gen<String> strOb = new Gen<String>("Generics Test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("value str: "+str);
    }
}

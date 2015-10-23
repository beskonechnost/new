package com.UkranianITSchool.Korotkov;

/**
 * Created by uitsc_000 on 10.10.2015.
 */
public class OverloadDemo {
    /*
    public void test(){
        System.out.println("No parameters");
    }
    */
    public void  test(int... a){
        System.out.println("a: "+a);
    }

    /*
    public void test(int a, int b){
        System.out.println("a & b: "+a+" "+b);
    }
    */
    public double test(double a){
        System.out.println("double a: "+a);
        return a*a;
    }
}

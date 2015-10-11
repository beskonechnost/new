package com.UkranianITSchool.Korotkov;

/**
 * Created by uitsc_000 on 11.10.2015.
 */
public class Test {
    int a;
    public int b;
    private int c;


    Test(int i, int j){
        a = i;
        b = j;
    }
    Test (int i){
        a = i;
    }

    public Test() {
    }

    boolean equals1(Test o){
        if (o.a == a && o.b==b) return true;
        else return false;
    }
    void meth(Test o){
        o.a *=2;
        o.b /=2;
    }
    void meth(int a, int b){
        a *=2;
        b /=2;
    }
    Test incrByTen(){
        Test temp = new Test(a+10);
        return temp;
    }

    public int getC() {
        return c;
    }

    public void setC(int i) {
        this.c = i;
    }
}

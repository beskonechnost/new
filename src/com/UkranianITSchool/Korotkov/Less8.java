package com.UkranianITSchool.Korotkov;

/**
 * Created by uitsc_000 on 11.10.2015.
 */
public class Less8 {
    public static void main(String[] args) {
        /*
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);
        System.out.println("ob1 == 0b2: "+ob1.equals1(ob2));
        System.out.println("ob1 == 0b3: "+ob1.equals1(ob3));
        */
        /*
        Test ob = new Test(15, 20);
        int x =10, y=10;
        ob.meth(x,y);
        System.out.println("x and y before call: " + x + " " + y);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: "+ob.a+" "+ob.b);
        */
        /*
        Test ob1=new Test(2);
        Test ob2;
        ob2 = ob1.incrByTen();
        System.out.println("ob1: "+ob1.a);
        System.out.println("ob2: "+ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2 2 : "+ob2.a);
        */

        //работа с приватными данными через гетеры и сетеры
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;
        ob.setC(100);
        System.out.println("a, b and c: "+ob.a+" "+ob.b+" "+ob.getC());
    }
}

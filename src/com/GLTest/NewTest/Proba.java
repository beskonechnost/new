package com.GLTest.NewTest;

/**
 * Created by Андрей on 01.12.2015.
 */
public class Proba {
    public static void main(String[] args) {
        TestA a = new TestA();
        System.out.println(a.toString());
        a.metodTestA();
        a.metodAncestor();
        TestA.TestInner a1 = a.new TestInner();
        System.out.println(a1.toString());
        a1.metodTestInner();
        a1.metodAncestorInner();
    }
}

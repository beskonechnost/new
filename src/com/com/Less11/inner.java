package com.com.Less11;

/**
 * Created by uitsc_000 on 24.10.2015.
 */
public class inner {
    public static void main(String[] args) {
        Test a = new Test();
        a.show();

        Test.Mynested a1 = new Test.Mynested();
        a1.nestedshow();

        Test.Myinner a2 = a.new Myinner();
        Test.Myinner a3 = a.new Myinner();
        a2.innershow();
        a3.innershow();
    }
}

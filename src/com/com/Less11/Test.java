package com.com.Less11;

/**
 * Created by uitsc_000 on 24.10.2015.
 */
public class Test {
    public String testfiled = "(testfiled!";

    public static class Mynested {
        public String nested = "(nensted!)";

        public void nestedshow() {
            System.out.println("Привет,  вложеный класс !" + nested);
        }
    }

    public class Myinner {
        public String inner = "(inner!)";

        public void innershow() {
            System.out.println("привет, я вложеный класс !" + inner);
        }
    }

    public void show() {
        System.out.println("Привет, я просто класс! " + testfiled);
    }
}

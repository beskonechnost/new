package com.com.Less10.abstr;

/**
 * Created by uitsc_000 on 18.10.2015.
 */
public class Test {
    public static void main(String[] args) {
        Shape s[] = new Shape[3];
        s[0] = new Circle("green", 2, 3, 5);
        s[1] = new Square("yellow", 2, 3, 4, 5);
        s[2] = new Circle("blye", 4, 5, 6);

        for (int i = 0; i<s.length; i++){
            s[i].draw();
        }
    }
}

package com.com.Less13;

/**
 * Created by uitsc_000 on 31.10.2015.
 */
public class Test2 {
    public static void main(String[] args) {
        Integer iOb = 1000;//100
        Integer kOb = 1000;//100
        //при сотне == будет работать. (== будет работать в диапазоне байта. если его привысить, то в таком случае будут сравниваться обекты)
        //equals будет работать всегда

        if (iOb.equals(kOb)) System.out.println("equals");
        else System.out.println("no equals");

        if (iOb==kOb)System.out.println("== equals");
        else System.out.println("== no equals");
    }
}

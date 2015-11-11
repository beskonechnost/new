package com.com.Less15;

import static com.com.Less15.GenDemo.isIn;

/**
 * Created by uitsc_000 on 07.11.2015.
 */
class GenDemo{
    static <T, V extends T> boolean isIn(T x, V[] y){
        for (int i = 0; i < y.length; i++){
            if(x.equals(y[i])) return true;
        }
        return false;
    }
}

public class tEST2 {
    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        if(isIn(2, nums))
            System.out.println("2 is nums");
        if (!isIn(7, nums)) System.out.println("7is not nums");
    }
}

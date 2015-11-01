package com.com.Less14;

/**
 * Created by uitsc_000 on 01.11.2015.
 */
public class MultiCatch {
    public static void main(String[] args) {
        int a;
        try {
            a = args.length;
            int b = 42/a;
            int[] c = new int[a];
            c[a] = 666;
        } catch (ArithmeticException e){
            System.out.println("Делене на ноль." + e);
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Уже после всех блоков исключения");
    }
}

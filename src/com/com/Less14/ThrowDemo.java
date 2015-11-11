package com.com.Less14;

/**
 * Created by uitsc_000 on 01.11.2015.
 */
public class ThrowDemo {
    static void demoproc(){
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e){
            System.out.println("Перехвачено внутри demoproc");
            throw e;//повторно возбудить исключение
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e){
            System.out.println("Повторный перехват: "+e);
        }
    }
}

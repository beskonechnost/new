package com.UkranianITSchool.Korotkov;

/**
 * Created by Андрей on 06.10.2015.
 */
public class ArrayInver {
    public static void invertString(String[] array){
        for (int index = 0; index<array.length/2; index++){
            String buffer = array[index];
            array[index]=array[array.length-1-index];
            array[array.length-1-index]=buffer;
        }
    }
    public static void invertByte(byte array[]){
        for (int index = 0; index<array.length/2; index++){
            byte buffer = array[index];
            array[index]=array[array.length-1-index];
            array[array.length-1-index]=buffer;
        }
    }
    public static void invertInt(Integer array[]){
        for (int index = 0; index<array.length/2; index++){
            int buffer = array[index];
            array[index]=array[array.length-1-index];
            array[array.length-1-index]=buffer;
        }
    }
}

package com.UkranianITSchool.Korotkov;

/**
 * Created by Андрей on 06.10.2015.
 */
public class WorkFromArray {
    public static void convertStringInInt(String[] array, int[] arrayInt){
        for (int index = 0; index<array.length; index++){
           arrayInt[index] = Integer.parseInt(array[index]);
        }
    }
    public static int sumElementOfArrayInt(int[] array){
        int total = 0;
        for (int index = 0; index<array.length; index++){
            total +=array[index];
        }
        return total;
    }
    public static int multiplicationElementOfArrayInt(int[] array){
        int multiplication = 1;
        for (int index = 0; index<array.length; index++){
            multiplication *=array[index];
        }
        return multiplication;
    }
    public static int sumElementOfArrayString(String[] array) {
        int total = 0;
        for (int index = 0; index < array.length; index++) {
            total += Integer.parseInt(array[index]);
        }
        return total;
    }
    public static int multiplicationElementOfArrayString(String[] array) {
        int mul = 1;
        for (int index = 0; index < array.length; index++) {
            mul *= Integer.parseInt(array[index]);
        }
        return mul;
    }
   public static int maximumElementOfArrayString(String[] array){
       int maximum = Integer.MIN_VALUE;
       for (int index = 0; index < array.length; index++){
           if (maximum<Integer.parseInt(array[index])) maximum = Integer.parseInt(array[index]);
       }
       return maximum;
   }
    public static int minimumElementOfArrayString(String[] array){
        int minimum = Integer.MAX_VALUE;
        for (int index = 0; index < array.length; index++){
            if (minimum>Integer.parseInt(array[index])) minimum = Integer.parseInt(array[index]);
        }
        return minimum;
    }
    public static int maximumElementOfArrayInt(int[] array){
        int maximum = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++){
            if (maximum<array[index]) maximum = array[index];
        }
        return maximum;
    }
    public static int minimumElementOfArrayInt(int[] array){
        int minimum = Integer.MAX_VALUE;
        for (int index = 0; index < array.length; index++){
            if (minimum>array[index]) minimum = array[index];
        }
        return minimum;
    }
}

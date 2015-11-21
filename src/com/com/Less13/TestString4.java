package com.com.Less13;

/**
 * Created by uitsc_000 on 31.10.2015.
 */
public class TestString4 {
    static String arr[] = {"Now", "No", "1", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid", "of", "their","country"};

    public static void main(String[] args) {
        for (int j  = 0; j < arr.length; j++){
            for (int i = j+1; i < arr.length; i++){
                if (arr[i].compareTo(arr[j])<0){
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println(arr[j]);
        }
    }
}

package com.UkranianITSchool.HW3.Korotkov;

/**
 * Created by Андрей on 16.11.2015.
 */
public class Test {
    public static void main(String[] args) {
        Sentence[] s = new Sentence[3];
        Text text = new Text(s);
        text.divideTheTextIntoSentences();
        System.out.println(text.toString());
    }
}

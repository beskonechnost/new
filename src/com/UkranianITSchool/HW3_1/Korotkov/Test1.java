package com.UkranianITSchool.HW3_1.Korotkov;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрей on 20.11.2015.
 */
public class Test1 {
    public static void main(String[] args) {
        List<Sentence1> a = new ArrayList<>();
        Text1 t = new Text1(a);
        t.divideTheTextIntoSentences();
        for(int i = 0; i<a.size(); i++){
            a.get(i).divideTheSentenceIntoWords();
        }
        System.out.println(t.getSens());
        String s = "HELLO";
        int m = 2;
        for(int i = 0; i<a.size(); i++){
            for(int j = 0; j < a.get(i).getWord().size(); j++){
                a.get(i).getWord().get(j).replacement(m, s);
            }
        }
        System.out.println(t.getSens());
    }
}

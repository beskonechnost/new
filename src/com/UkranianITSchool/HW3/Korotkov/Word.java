package com.UkranianITSchool.HW3.Korotkov;

import java.util.Scanner;

/**
 * Created by Андрей on 12.11.2015.
 */
public class Word {
    private String words;

    public String getWords() {
        return words;
    }
    public void setWords(String words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "Word{" +
                "words='" + words + '\'' +
                '}';
    }

    public void lengthCheck(int equivalentLength, String stringToReplace){
        if(getWords().length() == equivalentLength){
            setWords(stringToReplace);
        }
    }
}

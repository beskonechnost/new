package com.UkranianITSchool.HW3_1.Korotkov;

/**
 * Created by Андрей on 20.11.2015.
 */
public class Word1 {
    private String word;

    public Word1(String word) {
        this.word = word;
    }
    public Word1() {
    }

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Word1{" +
                "word='" + word + '\'' +
                '}';
    }

    public void replacement(int fixedLength, String stringToReplace){
        if(this.word.length()==fixedLength){
            setWord(stringToReplace);
        }

    }
}

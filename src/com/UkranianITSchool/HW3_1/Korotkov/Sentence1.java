package com.UkranianITSchool.HW3_1.Korotkov;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрей on 20.11.2015.
 */
public class Sentence1 {
    private char markTheEndOfTheOffer;
    private String sentence;
    private List<Word1> word = new ArrayList<>();

    public Sentence1(char markTheEndOfTheOffer, String sentence) {
        this.markTheEndOfTheOffer = markTheEndOfTheOffer;
        this.sentence = sentence;
    }
    public Sentence1() {
    }

    public String getSentence() {
        return sentence;
    }
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
    public char getMarkTheEndOfTheOffer() {
        return markTheEndOfTheOffer;
    }
    public void setMarkTheEndOfTheOffer(char markTheEndOfTheOffer) {
        this.markTheEndOfTheOffer = markTheEndOfTheOffer;
    }
    public List<Word1> getWord() {
        return word;
    }
    public void setWord1(String w, int position) {
        this.word.add(position, new Word1(w));
    }

    public void divideTheSentenceIntoWords(){
        int k = 0;
        int theBeginningOfTheNewProposal = 0;
        for (int i = 0; i < sentence.length(); i++){
            if(i!=0) {
                if (sentence.charAt(i) == ' ') {
                    setWord1(sentence.substring(theBeginningOfTheNewProposal, i), k);
                    k++;
                    if (i != sentence.length() - 1) {
                        theBeginningOfTheNewProposal = i + 1;
                    } else {
                        theBeginningOfTheNewProposal = i;
                    }
                }
                if (sentence.charAt(i) == ',' || sentence.charAt(i) == ':' || sentence.charAt(i) == ';') {
                    setWord1(sentence.substring(theBeginningOfTheNewProposal, i), k);
                    k++;
                    if (i != sentence.length() - 1) {
                        theBeginningOfTheNewProposal = i + 2;
                    } else {
                        theBeginningOfTheNewProposal = i + 1;
                    }
                }
                if(i == sentence.length()-1){
                    setWord1(sentence.substring(theBeginningOfTheNewProposal, i), k);
                    k++;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Sentence1{" +
                "sentence='" + sentence + '\'' +
                ", word=" + word +
                '}';
    }
}

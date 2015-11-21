package com.UkranianITSchool.HW3.Korotkov;

/**
 * Created by Андрей on 12.11.2015.
 */
public class Sentence {
    private char markTheEndOfTheOffer;
    private String textSentence;
    private Word[] words = new Word[100];

    public char getMarkTheEndOfTheOffer() {
        return markTheEndOfTheOffer;
    }
    public void setMarkTheEndOfTheOffer(char markTheEndOfTheOffer) {
        this.markTheEndOfTheOffer = markTheEndOfTheOffer;
    }
    public String getTextSentence() {
        return textSentence;
    }
    public void setTextSentence(String textSentence) {
        textSentence.trim();
        this.textSentence = textSentence;
    }
    public Word[] getWords() {
        return words;
    }
    public void setWords(int position, String sent) {
        this.words[position].setWords(sent);
    }

    public void divideTheSentenceIntoWords(){
        int k = 0;
        int theBeginningOfTheNewProposal = 0;
        for (int i = 0; i<this.textSentence.length()-1; i++){
            char buf = this.textSentence.charAt(i);
            if (buf == ' '){
                if (this.textSentence.charAt(i-1) == ','&&this.textSentence.charAt(i-1)==':'&&this.textSentence.charAt(i-1)==';'){
                    setWords(k,textSentence.substring(theBeginningOfTheNewProposal,i-1));
                    k++;
                    theBeginningOfTheNewProposal = i+2;
                }

            }
        }
    }
}

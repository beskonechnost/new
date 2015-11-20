package com.UkranianITSchool.HW3.Korotkov;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Андрей on 12.11.2015.
 */
public class Text {
    private String texts;
    private Sentence[] sentencesInText = new Sentence[100];

    public Sentence[] getSentencesInText() {
        return sentencesInText;
    }
    public void setSentencesInText(int position, String sent) {
        this.sentencesInText[position].setTextSentence(sent);
    }

    public Text(Sentence[] sentencesInText) {
        System.out.println("Введите текст. По окончанию нажмите Энтер!");
        Scanner scanner = new Scanner(System.in);
        this.texts = scanner.nextLine();
        this.sentencesInText = sentencesInText;
    }

    public void divideTheTextIntoSentences(){
        int k = 0;
        int theBeginningOfTheNewProposal = 0;
        for (int i = 0; i < texts.length(); i++){
            char buf = texts.charAt(i);
            if (buf=='.'&&buf=='!'&&buf=='?'){
                setSentencesInText(k, texts.substring(theBeginningOfTheNewProposal, buf));
                getSentencesInText()[k].setMarkTheEndOfTheOffer(buf);
                k++;
                theBeginningOfTheNewProposal = i+1;
            }
        }
    }

    @Override
    public String toString() {
        return "Text{" +
                "texts='" + texts + '\'' +
                ", sentencesInText=" + Arrays.toString(sentencesInText) +
                '}';
    }
}

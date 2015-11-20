package com.UkranianITSchool.HW3_1.Korotkov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.UkranianITSchool.HW3_1.Korotkov.Sentence1.*;

/**
 * Created by Андрей on 20.11.2015.
 */
public class Text1 {
    private String text;
    private List<Sentence1> sens = new ArrayList<>();

    public Text1(List<Sentence1> s) {
        System.out.println("Введите текст. По окончанию нажмите Энтер!");
        Scanner scanner = new Scanner(System.in);
        this.text = scanner.nextLine();
        this.sens = s;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public List<Sentence1> getSens() {
        return sens;
    }
    public void setSens1(String sens, char ch, int position) {
        this.sens.add(position, new Sentence1(ch, sens.trim()));
    }

    public void divideTheTextIntoSentences(){
        int k = 0;
        int theBeginningOfTheNewProposal = 0;
        for (int i = 0; i<text.length(); i++)
            if (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?') {
                setSens1(text.substring(theBeginningOfTheNewProposal, i + 1), text.charAt(i), k);
                k++;
                if (i != text.length() - 1) {
                    theBeginningOfTheNewProposal = i + 1;
                } else {
                    theBeginningOfTheNewProposal = i;
                }

            }
    }


}

package com.UkranianITSchool.HW3_1.Korotkov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Андрей on 20.11.2015.
 */
public class Test1 {
    public static void main(String[] args) {
        List<Sentence1> ListSentences = new ArrayList<>();
        Text1 text = new Text1(ListSentences);//это конструктор, внутри его уже есть ввод текста!
        text.divideTheTextIntoSentences();
        for(int i = 0; i<ListSentences.size(); i++){
            ListSentences.get(i).divideTheSentenceIntoWords();
        }
        System.out.println(text.getSens());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, которой будем заменять слова указанной длины: ");
        String toReplaceTheWord = scanner.nextLine();
        System.out.println("Введите число, которое соответствует длине заменяемых слов: ");
        int lengthOfWordsThatChange = scanner.nextInt();
        for(int i = 0; i<ListSentences.size(); i++){
            for(int j = 0; j < ListSentences.get(i).getWord().size(); j++){
                ListSentences.get(i).getWord().get(j).replacement(lengthOfWordsThatChange, toReplaceTheWord);
            }
        }
        System.out.println(text.getSens());
        System.out.println();
        System.out.println("Тпереь соберем текст, уже с заменой!");
        String newTexts = text.collectTheTextOfTheWords();
        System.out.println(newTexts);

    }
}

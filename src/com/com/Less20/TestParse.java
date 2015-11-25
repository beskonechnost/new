package com.com.Less20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by uitsc_000 on 22.11.2015.
 */
public class TestParse {
    public static final String sourseFileName = "D:\\TESTFILE.txt";
    public static final String destFileName = "dest.txt";

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader((new FileReader(sourseFileName)));
        PrintWriter writer = new PrintWriter(destFileName);
        String s = null;
        int words = 0, lines = 0, chars = 0;
        while ((s = reader.readLine())!=null){
            lines++;
            String[] ws = s.trim().split("\\s");
            words+=ws.length;
            for(String l:ws){
                chars+=l.length();
            }
            writer.println(s.toUpperCase());
        }
        reader.close();
        writer.close();
        System.out.printf("Посмотрим сколько у нас в строке символов - %d, слов - %d, линий - %d\n", chars,words,lines);
    }
}

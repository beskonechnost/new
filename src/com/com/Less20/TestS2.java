package com.com.Less20;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by uitsc_000 on 22.11.2015.
 */
public class TestS2 {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("D:\\TESTFILE.txt");
            BufferedWriter br = new BufferedWriter(out);
            PrintWriter pw = new PrintWriter(br);
            pw.println("sssss dddd wwwww eeee rrrr ttt!");
            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

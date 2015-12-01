package com.com.Less21;

import java.io.*;

/**
 * Created by uitsc_000 on 28.11.2015.
 */
public class TestWriteRead {
    public static void main(String[] args) throws IOException{
        FileInputStream st = new FileInputStream("D:\\TESTFILE.txt");
        System.out.println("Pабота с потоком, чтение по байтам!");
        while (st.available()!=0){
            int b = st.read();
            char ch = (char)b;
            System.out.println(ch);
        }
        st.close();
        FileOutputStream so = new FileOutputStream("D:\\TESTFILE.txt");
        String d = "Hello";
        byte[] bytes = d.getBytes();
        so.write(bytes);
        so.close();
        BufferedReader bf = new BufferedReader(new FileReader("D:\\TESTFILE.txt"));
        String s = null;
        System.out.println("Работа с буфером читаем по строкам!");
        while ((s = bf.readLine())!=null){
            System.out.println(s);
        }
        bf.close();
        PrintWriter writer = new PrintWriter("D:\\TESTFILE.txt");
        writer.printf("%s %d %c", "String",100,'e');
        writer.close();
    }
}

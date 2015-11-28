package com.com.Less21;

import java.io.*;

/**
 * Created by uitsc_000 on 28.11.2015.
 */
public class TestRandWrite {
    public static void main(String[] args) throws IOException{
        RandomAccessFile raf = new RandomAccessFile("D:\\TESTFILE.txt","rw");
        System.out.println(raf.length());
        raf.seek(10);
        String s = raf.readLine();
        System.out.println(s);
        raf.seek(raf.length());
        raf.writeUTF("HELLO");
        raf.close();

        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("outputstream"),"UTF8"));
        out.write("abcds");
        out.close();
        System.err.println("sdsdasda");
    }
}

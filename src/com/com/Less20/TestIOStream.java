package com.com.Less20;

import java.io.File;

/**
 * Created by uitsc_000 on 22.11.2015.
 */
public class TestIOStream {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("D:\\TESTFILE.txt");
        p("File Neme: "+f1.getName());
        p("Path: "+f1.getParent());
        p("Abs Path: "+f1.getAbsolutePath());
        p("Parent: "+f1.getParent());
        p(f1.exists()?"exists":"does not exist");
        p(f1.canWrite()?"is write":"is not write");
        p(f1.canRead()?"is readebel":"is not readable");
        p("is"+(f1.isDirectory()?"":"not"+"a directory"));
        p(f1.isFile()?"is normal file":"might be a named pipe");
        p(f1.isAbsolute()?"is absolute":"is not absolute");
        p("File last modified: "+f1.lastModified());
        p("File size: "+f1.length()+" Bytes");
    }
}

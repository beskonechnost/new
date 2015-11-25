package com.com.Less20;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by uitsc_000 on 22.11.2015.
 */
public class TestS {
    public static void main(String[] args) throws IOException{
        try (/*InputStream inFile = new FileInputStream("D:\\TESTFILE.txt");
        InputStream inUrl = new URL("http://google.com").openStream();*/
        InputStream inArray = new ByteArrayInputStream(new byte[] {65, 66, 67, 68, 69,-1,-65,-66,-127})){
            /*readFullyByByte(inFile);
            System.out.println("\n\n\n");
            readFullyByByte(inUrl);
            System.out.println("\n\n\n");*/
            readFullyByByte(inArray);
            System.out.println("\n\n\n");
        }
    }
    public static void readFullyByByte(InputStream in) throws IOException{
        while (true){
            int oneByte = in.read();
            if(oneByte !=-1){
                System.out.print(/*(char)*/ oneByte);
            } else {
                System.out.print("\n"+"end");
                break;
            }
        }
    }
}

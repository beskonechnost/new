package com.com.Less20;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by uitsc_000 on 22.11.2015.
 */
public class TestS1 {
    public static void main(String[] args) throws IOException{
        String source = "werwerer ffsdf vbvb  fgfgdfgrgfd fgdfgfdg" +
                "bkjdnbjgnfbjg  gjnb gbjn fkbnkgngfngkgk" +
                "jndfnfdd fkvm dlfla olskdos f.";

        try (FileOutputStream f0 = new FileOutputStream("filef0.txt");
        FileOutputStream f1 = new FileOutputStream("filef1.txt");
        FileOutputStream f2 = new FileOutputStream(("filef3.txt"));){

        }

    }
}

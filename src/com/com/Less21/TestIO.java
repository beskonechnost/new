package com.com.Less21;

import java.io.*;

/**
 * Created by uitsc_000 on 28.11.2015.
 */
public class TestIO {
    public static void main(String[] args){
            try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("D:\\Test.dat"))) {
                dout.writeDouble(98.2);
                dout.writeInt(100);
                dout.writeBoolean(true);
            } catch (FileNotFoundException e) {
                System.out.println("Cannot Open Output");
                return;
            } catch (IOException e) {
                System.out.println("I/O Error " + e);
            }
        try (DataInputStream din = new DataInputStream(new FileInputStream("D:\\Test.dat"))) {
            double d = din.readDouble();//вывод данных должен производиться в том же порядке что и ввод (в порядкев типов), иначе выводит произвольные данные
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println(d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open Output");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}

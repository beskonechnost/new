package com.com.Less14;

/**
 * Created by uitsc_000 on 01.11.2015.
 */
public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("buffer = "+sb);
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());

        sb.setCharAt(1, 'i');//������ 1-� ������ �� ��������
        sb.setLength(2);//�������� ������
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("I Java!");
        sb1.insert(2, "like ");//������� � �������� ����� �������� ������
        System.out.println(sb1);

        sb1.delete(2, 7);
        System.out.println(sb1);

        sb.deleteCharAt(1);
        System.out.println(sb);
    }
}

package com.com.Less16;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by uitsc_000 on 08.11.2015.
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");
        while (queue.size()>0)
            System.out.print(queue.remove()+" ");
    }
}
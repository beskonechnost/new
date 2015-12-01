package com.GLTest;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Андрей on 30.11.2015.
 */
public class TestS {
    public static void main(String[] args) {
        LinkedList<StudyGroup.Students> list = new LinkedList<>();
        StudyGroup s1 = new StudyGroup("groupStudent",3, list,"FMCH");
        list.add(new StudyGroup.Students(3,"11","11",19,true, 2));
    }
}

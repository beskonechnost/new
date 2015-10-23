package com.UkranianITSchool.HW2.OOP.Task0.Korotkov;

import java.util.Arrays;

/**
 * Created by Андрей on 23.10.2015.
 */
public class Course {
    private int numberCourse;
    private Student[] studentsCourse;

    public Course(int numberCourse, Student[] studentsCourse) {
        this.numberCourse = numberCourse;
        this.studentsCourse = studentsCourse;
    }
    public Course() {
    }

    public Course(int numberCourse) {
        this.numberCourse = numberCourse;
    }

    public int getNumberCourse() {
        return numberCourse;
    }
    public void setNumberCourse(int numberCourse) {
        this.numberCourse = numberCourse;
    }
    public Student[] getStudentsCourse() {
        return studentsCourse;
    }
    public void setStudentsCourse(Student[] studentsCourse) {
        this.studentsCourse = studentsCourse;
    }

    @Override
    public String toString() {
        return "Course{" +
                "numberCourse=" + numberCourse +
                ", studentsCourse=" + Arrays.toString(studentsCourse) +
                '}';
    }

    public void listStudentsCourse(Student[] students){
        int k = 0;
        for (int i = 0; i < students.length; i++){
            if (students[i].getCourse()==numberCourse){
                studentsCourse[k]=students[i];
                k++;
            }
        }
    }
}

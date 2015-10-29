package com.UkranianITSchool.HW2.OOP.Task1.Korotkov;

import java.util.Arrays;

/**
 * Created by Андрей on 29.10.2015.
 */
public class Container {
    private WritingInstrument[] containerWritingInstruments;
    private int countObjectsInTheContainer = 0;

    public Container() {
    }
    public Container(WritingInstrument[] containerWritingInstruments, int countObjectsInTheContainer) {
        this.containerWritingInstruments = containerWritingInstruments;
        this.countObjectsInTheContainer = countObjectsInTheContainer;
    }

    public WritingInstrument[] getContainerWritingInstruments() {
        return containerWritingInstruments;
    }
    public void setContainerWritingInstruments(WritingInstrument[] containerWritingInstruments) {
        this.containerWritingInstruments = containerWritingInstruments;
    }
    public int getCountObjectsInTheContainer() {
        return countObjectsInTheContainer;
    }
    public void setCountObjectsInTheContainer(int countObjectsInTheContainer) {
        this.countObjectsInTheContainer = countObjectsInTheContainer;
    }

    @Override
    public String toString() {
        return "Container{" +
                "containerWritingInstruments=" + Arrays.toString(containerWritingInstruments) +
                ", countObjectsInTheContainer=" + countObjectsInTheContainer +
                '}';
    }

    public void Count(){
        this.setCountObjectsInTheContainer(getCountObjectsInTheContainer()+1);
    }
    public void Add(WritingInstrument writingInstrument){
        if (this.getCountObjectsInTheContainer()<containerWritingInstruments.length){
        this.containerWritingInstruments[this.getCountObjectsInTheContainer()]=writingInstrument;
        Count();}
        else System.out.println("Контейнер переполнен! Давайте сделаем контейнер большего объема!");
    }
    public void AccessByIndex(int index){
        if (index>=0&&index<containerWritingInstruments.length-1){
            System.out.println(containerWritingInstruments[index].toString());
        } else {
            System.out.println("Элемента под таким номером нет в выбранном контейнере!");
        }
    }
    public void SortByPrice(){
        for (int i = containerWritingInstruments.length-1; i>=0; i--){
            for (int j = 0; j<i; j++){
                if (j<containerWritingInstruments.length-1){
                    if (containerWritingInstruments[j].getPrise()<containerWritingInstruments[j+1].getPrise()){
                        WritingInstrument p1 = getContainerWritingInstruments()[j];
                        WritingInstrument p2 = getContainerWritingInstruments()[j+1];
                        setCountObjectsInTheContainerSorting(p2, j);
                        setCountObjectsInTheContainerSorting(p1, j+1);
                    }
                }
            }
        }
    }
    public void Print(){
        System.out.println("Распичатаем содержимое нашего контейнера:");
        System.out.println();
        for (int i = 0; i < containerWritingInstruments.length; i++){
            System.out.println(containerWritingInstruments[i].toString());
        }
    }

    private void setCountObjectsInTheContainerSorting(WritingInstrument writingInstrument, int n) {
        this.containerWritingInstruments[n] = writingInstrument;
    }
}

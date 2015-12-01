package com.GLTest;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Андрей on 30.11.2015.
 */
public class Collective {
    private String appointment;
    private int numberOfParticipants;
    private List<Human> listOfParticipants = new LinkedList<>();

    public Collective(String appointment, int numberOfParticipants) {
        this.appointment = appointment;
        this.numberOfParticipants = numberOfParticipants;
    }
    public Collective(String appointment, int numberOfParticipants, List<Human> listOfParticipants) {
        this.appointment = appointment;
        this.numberOfParticipants = numberOfParticipants;
        this.listOfParticipants = listOfParticipants;
    }
    public Collective() {
    }

    public String getAppointment() {
        return appointment;
    }
    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }
    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }
    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }
    public List<Human> getListOfParticipants() {
        return listOfParticipants;
    }
    public void addHumanInListOfParticipants(Human human) {
        this.listOfParticipants.add(human);
    }
    public void removeHumanOfListOfParticipants(Human human) {
        this.listOfParticipants.remove(human);
    }

    @Override
    public String toString() {
        return "Collective{" +
                "appointment='" + appointment + '\'' +
                ", numberOfParticipants=" + numberOfParticipants +
                ", listOfParticipants=" + listOfParticipants +
                '}';
    }
}

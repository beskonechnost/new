package com.UkranianITSchool.HW2.OOP.Task1.Korotkov;

/**
 * Created by Андрей on 29.10.2015.
 */
public class Pens extends WritingInstrument{
    private String typeRecordingMechanism;
    private String typeMechanismForExtractingTheRod;

    public Pens() {
    }
    public Pens(String name, double prise, String color, String typeRecordingMechanism, String typeMechanismForExtractingTheRod) {
        super(name, prise, color);
        this.typeRecordingMechanism = typeRecordingMechanism;
        this.typeMechanismForExtractingTheRod = typeMechanismForExtractingTheRod;
    }

    public String getTypeRecordingMechanism() {
        return typeRecordingMechanism;
    }
    public void setTypeRecordingMechanism(String typeRecordingMechanism) {
        this.typeRecordingMechanism = typeRecordingMechanism;
    }
    public String getTypeMechanismForExtractingTheRod() {
        return typeMechanismForExtractingTheRod;
    }
    public void setTypeMechanismForExtractingTheRod(String typeMechanismForExtractingTheRod) {
        this.typeMechanismForExtractingTheRod = typeMechanismForExtractingTheRod;
    }

    @Override
    public String toString() {
        return "Pens{" + super.toString() +
                "typeRecordingMechanism='" + typeRecordingMechanism + '\'' +
                ", typeMechanismForExtractingTheRod='" + typeMechanismForExtractingTheRod + '\'' +
                '}';
    }

    @Override
    public void write() {

    }
}

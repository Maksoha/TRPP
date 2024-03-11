package com.mirea.trpp.data.models;

public class SpecialistModel {
    private String name;
    private String speciality;

    public SpecialistModel(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

}

package com.example.myapplication;

public class NewFile {
    String name,gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public NewFile(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
}

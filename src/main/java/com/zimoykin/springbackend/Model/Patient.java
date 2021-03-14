package com.zimoykin.springbackend.Model;

import org.springframework.data.annotation.Id;


public class Patient implements ApiModel {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    public Patient() {}

    public Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
       // this.id = new UUID(0, 4);
    }

    @Override
    public String toString() {
        return this.firstName + this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String geLasttName() {
        return lastName;
    }
}
package com.zimoykin.springbackend.Model;

import java.util.UUID;


import org.springframework.data.annotation.Id;

public class Doctor implements ApiModel {

        @Id
        private UUID id;

        private String firstName;
        private String lastName;

        public Doctor() {}

        public Doctor(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return this.firstName + this.lastName;
        }



    }


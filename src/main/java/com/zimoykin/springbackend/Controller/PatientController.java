package com.zimoykin.springbackend.Controller;

import java.net.URI;
import java.util.UUID;

import com.zimoykin.springbackend.Model.Patient;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/patient")
public class PatientController { 

    private final MongoTemplate mongoTemplate;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json", path = "/{id}")
    public Patient getPatient(@PathVariable String id) throws InterruptedException {
        return getPatientID(id);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Patient> save() throws InterruptedException {
        
        Patient patient = new Patient("Test", "Test");
        mongoTemplate.save(patient);

        return new ResponseEntity<Patient>(patient, HttpStatus.OK);
    }

    private Patient getPatientID(String id) throws InterruptedException {
        return mongoTemplate.findById(id, Patient.class);
    }

    public PatientController(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

}

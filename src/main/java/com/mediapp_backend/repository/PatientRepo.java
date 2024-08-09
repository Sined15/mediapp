package com.mediapp_backend.repository;

import org.springframework.stereotype.Repository;

import com.mediapp_backend.model.Patient;

@Repository
public class PatientRepo {
  
  public String sayHello(Patient p) {
    return p.getId() + " - " + p.getName();
  }
}

package com.mediapp_backend.repository;

import com.mediapp_backend.model.Patient;

public class PatientRepo {
  
  public String sayHello(Patient p) {
    return p.getId() + " - " + p.getName();
  }
}

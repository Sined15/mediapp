package com.mediapp_backend.service;

import com.mediapp_backend.model.Patient;
import com.mediapp_backend.repository.PatientRepo;

public class PatientService {
  
  private PatientRepo repo = new PatientRepo();

  public String sayHello(Patient p) {
    return repo.sayHello(p);
  }
}

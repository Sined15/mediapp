package com.mediapp_backend.service;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediapp_backend.model.Patient;
import com.mediapp_backend.repository.PatientRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientService {
  
  //! Formas de inyectar una dependencia
  //! 1ra forma: forma manual
  // private PatientRepo repo = new PatientRepo();

  //! 2da forma: usando ID con @Autowired y los beans de los estereotiopos de spring
  // @Autowired
  // private PatientRepo repo;

  //! 3ra forma: usando ID por constructor
  // private PatientRepo repo;
  // public PatientService(PatientRepo repo) {
  //   this.repo = repo;
  // }

  //! 4ta forma: usando ID por anotacion de Lombok @RequiredArgsConstructor
  private final PatientRepo repo;
  
  public String sayHello(Patient p) {
    return repo.sayHello(p);
  }
}

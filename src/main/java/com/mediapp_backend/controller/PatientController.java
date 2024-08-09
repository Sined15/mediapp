package com.mediapp_backend.controller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mediapp_backend.model.Patient;
import com.mediapp_backend.service.PatientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {

  //! 1ra forma
  // private PatientService service = new PatientService();

  //! 2da forma
  // @Autowired
  // private PatientService service;

  //! 3ra forma
  // private PatientService service;
  // public PatientController (PatientService service) {
  //   this.service = service;
  // }

  //! 4ta forma
  private final PatientService service;

  @GetMapping
  public String hello() {
    Patient p = new Patient();
    p.setId(1);
    p.setName("Denis");
    return service.sayHello(p);
  }

}

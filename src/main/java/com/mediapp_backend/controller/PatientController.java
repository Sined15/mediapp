package com.mediapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mediapp_backend.model.Patient;
import com.mediapp_backend.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {
  
  private PatientService service = new PatientService();

  @GetMapping
  public String hello() {
    Patient p = new Patient();
    p.setId(1);
    p.setName("Denis");
    return service.sayHello(p);
  }
  
}

package com.mediapp_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mediapp_backend.model.Patient;
import com.mediapp_backend.service.PatientServiceImpl;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {
  
  private final PatientServiceImpl service;

  @GetMapping
  public List<Patient> findAll() {
    return service.findAll();
  }

  @GetMapping("/{id}")
  public Patient findById(@PathVariable Integer id) {
    return service.findById(id);
  }

  @PostMapping
  public Patient save(@RequestBody Patient patient) {
    return service.save(patient);
  }

  @PutMapping
  public Patient update(@RequestBody Patient patient) {
    return service.update(patient);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Integer id) {
    service.delete(id);
  }

}

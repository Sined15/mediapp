package com.mediapp_backend.service;

import java.util.List;

import com.mediapp_backend.model.Patient;

public interface IPatientService {
  
  Patient save(Patient patient);
  Patient update(Patient patient);
  List<Patient> findAll();
  Patient findById(Integer id);
  void delete(Integer id);
  
}

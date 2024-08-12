package com.mediapp_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mediapp_backend.model.Patient;
import com.mediapp_backend.repository.IPatientRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements IPatientService {

  private final IPatientRepo repo;

  @Override
  public Patient save(Patient patient) {
    return repo.save(patient);
  }

  @Override
  public Patient update(Patient patient) {
    return repo.save(patient);
  }

  @Override
  public List<Patient> findAll() {
    return repo.findAll();
  }

  @Override
  public Patient findById(Integer id) {
    // Optional<Patient> op = repo.findById(id);
    // return op.isPresent() ? op.get() : new Patient();
    return repo.findById(id).orElse(new Patient());
  }

  @Override
  public void delete(Integer id) {
    repo.deleteById(id);
  }
  
}

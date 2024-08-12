package com.mediapp_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mediapp_backend.model.Patient;

// @Repository // No es obligatorio
public interface IPatientRepo extends JpaRepository<Patient, Integer> {
  
}

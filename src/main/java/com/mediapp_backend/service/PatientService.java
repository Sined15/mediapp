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

/*
  ID por @RequiredArgsContructor
  • Beneficios:
    • Menos código boilerplate: Reduce la cantidad de código repetitivo al eliminar la necesidad de escribir manualmente los constructores.
    • Inyección de dependencias simplificada: Spring puede usar el constructor generado automáticamente por Lombok para inyectar las dependencias.
  • Inyección de Dependencias
    • Inyección en PatientService:
      - PatientRepo es inyectado a través del constructor generado por @RequiredArgsConstructor.
      - La clase PatientService ahora depende de Lombok para la generación del constructor, asegurando que repo siempre sea inyectado correctamente.
    • Inyección en PatientController:
      - PatientService es inyectado a través del constructor generado por @RequiredArgsConstructor.
      - La clase PatientController ahora depende de Lombok para la generación del constructor, asegurando que service siempre sea inyectado correctamente.

  • Flujo de Ejecución Modificado
    • Spring Boot Container:
      - Escanea las clases y detecta las anotaciones @Service, @RestController, y @RequiredArgsConstructor.
      - Lombok genera constructores para PatientService y PatientController basados en los campos final.
    • Creación de Beans:
      - PatientService: Spring detecta que PatientService tiene un campo final repo y utiliza el constructor generado por Lombok para inyectar una instancia de PatientRepo.
      - PatientController: Spring detecta que PatientController tiene un campo final service y utiliza el constructor generado por Lombok para inyectar una instancia de PatientService.
 */
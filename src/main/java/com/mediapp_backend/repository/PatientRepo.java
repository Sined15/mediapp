package com.mediapp_backend.repository;

import org.springframework.stereotype.Repository;

import com.mediapp_backend.model.Patient;

@Repository // Marca esta clase como un componente de Spring que interactúa con la base de datos. Aunque en este caso, PatientRepo no está interactuando con una base de datos real, la anotación @Repository indica que esta clase es responsable de la capa de acceso a datos.
            // Permite que Spring gestione esta clase como un bean, habilitando características como el manejo de excepciones de persistencia.
public class PatientRepo {
  
  public String sayHello(Patient p) {
    return p.getId() + " - " + p.getName();
  }
}

/*
 * @Repository
 * • Descripción:
 *    La anotación @Repository se utiliza para indicar que una clase es un "Repositorio", lo que significa que la clase es responsable de interactuar con la base de datos.
 *    En términos de arquitectura de software, los repositorios manejan la lógica de persistencia, es decir, operaciones CRUD (Crear, Leer, Actualizar, Eliminar).
 * • Funcionalidad Especial:
 *    Proporciona un mecanismo para la captura automática de excepciones específicas de la base de datos y las convierte en excepciones no verificadas (unchecked exceptions).
 *    Marca las clases de persistencia de modo que se pueda realizar automáticamente la inyección de dependencias.
 */

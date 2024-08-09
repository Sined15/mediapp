package com.mediapp_backend.controller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mediapp_backend.model.Patient;
import com.mediapp_backend.service.PatientService;

import lombok.RequiredArgsConstructor;

@RestController // Marca la clase como un controlador REST. Esto indica que los métodos de esta clase manejarán solicitudes HTTP y las respuestas estarán en formato JSON (por defecto).
@RequestMapping("/patients") // Mapea todas las solicitudes que empiecen con /patients a este controlador.
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
/*
  @RestController
  • Descripción:
    • @RestController es una combinación de @Controller y @ResponseBody.
    • Se utiliza para crear controladores RESTful que manejan solicitudes web (HTTP) y devuelven respuestas JSON o XML, en lugar de vistas HTML.
  • Funcionalidad Especial:
    • Todas las respuestas de los métodos de la clase anotada con @RestController son serializadas automáticamente en JSON o XML y se envían al cliente HTTP.
    • Simplifica la creación de servicios RESTful al evitar la necesidad de anotar cada método de controlador con @ResponseBody.

  @RequestMapping
  • Descripción:
    • @RequestMapping se utiliza para mapear solicitudes web a métodos específicos de clases de controladores.
    • Puede mapear una clase completa a una URL base o métodos individuales a sub-URL y métodos HTTP específicos (GET, POST, etc.).
  • Funcionalidad Especial:
    • Acepta varios atributos como path, method, params, headers, etc., para definir de manera precisa cómo se deben manejar las solicitudes.
    • Permite configurar mapeos más complejos y personalizados.

  @GetMapping
  • Descripción:
    • @GetMapping es una anotación especializada de @RequestMapping para manejar solicitudes HTTP GET.
    • Simplifica la definición de métodos de controlador que responden a solicitudes GET.
  • Funcionalidad Especial:
    • Hace que el código sea más legible y claro al indicar explícitamente que el método maneja solicitudes GET.
    • Acepta atributos como path y params para definir mapeos de manera específica para solicitudes GET.
 */
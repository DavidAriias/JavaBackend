package com.example.backend.controllers.impl;

import com.example.backend.models.Alumno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/alumno")
public interface AlumnoApiController {

    @GetMapping("/lista")
    ResponseEntity<List<Alumno>> getAlumnoList();

    @GetMapping("/{idAlumno}")
    ResponseEntity<Alumno> getAlumnoById(@PathVariable int idAlumno);

    @PostMapping("/")
    ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumnoNuevo);

    @GetMapping("/nombre")
    ResponseEntity<String> getName();

    @GetMapping("/nombre/{nombreAlumno}")
    ResponseEntity<String> getName(@PathVariable String nombreAlumno);
}

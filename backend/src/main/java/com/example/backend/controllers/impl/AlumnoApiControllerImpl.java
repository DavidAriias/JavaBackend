package com.example.backend.controllers.impl;

import com.example.backend.models.Alumno;
import com.example.backend.services.impl.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoApiControllerImpl implements AlumnoApiController{
    private AlumnoService alumnoService;
    @Autowired
    AlumnoApiControllerImpl(AlumnoService alumnoService){
        this.alumnoService = alumnoService;
    }

    @Override
    public ResponseEntity<List<Alumno>> getAlumnoList() {
        return ResponseEntity.ok().body(
                alumnoService.getAlumnoList()
        );
    }

    @Override
    public ResponseEntity<Alumno> getAlumnoById(@PathVariable int idAlumno) {
        return ResponseEntity.ok().body(alumnoService.getAlumnoById(idAlumno));
    }

    @Override
    public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumnoNuevo) {
        alumnoService.createAlumno(alumnoNuevo);
        return ResponseEntity.ok().body(alumnoNuevo);
    }

    @Override
    public ResponseEntity<String> getName() {
        return ResponseEntity.ok().body("David Arias");
    }

    @Override
    public ResponseEntity<String> getName(@PathVariable String nombreAlumno) {
        return ResponseEntity.ok().body(nombreAlumno);
    }
}

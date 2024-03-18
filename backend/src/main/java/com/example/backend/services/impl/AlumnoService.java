package com.example.backend.services.impl;

import com.example.backend.models.Alumno;

import java.util.List;

public interface AlumnoService{
    List<Alumno> getAlumnoList();
    void createAlumno(Alumno newAlumno);
    Alumno getAlumnoById(int id);
}

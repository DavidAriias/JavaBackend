package com.example.backend.services.impl;

import com.example.backend.models.Alumno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoServiceImpl implements  AlumnoService {

    List<Alumno> alumnoList = new ArrayList<>();
    public List<Alumno> getAlumnoList(){
        return alumnoList;
    }

    public void createAlumno(Alumno newAlumno){
        alumnoList.add(newAlumno);
    }
    public Alumno getAlumnoById(int id) {
        return alumnoList.get(id);
    }
}

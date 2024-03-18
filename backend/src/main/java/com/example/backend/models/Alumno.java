package com.example.backend.models;

public class Alumno {
    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private String fechaNac;
    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }
}

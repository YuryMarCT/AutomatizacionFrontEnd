package com.siigo.gastaging.models;

public class Formulario {
    private String nombres;
    private String apellidos;
    private String identificacion;
    private String ciudad;

    public Formulario(String nombres, String apellidos, String identificacion, String ciudad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.ciudad = ciudad;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getCiudad() {
        return ciudad;
    }
}

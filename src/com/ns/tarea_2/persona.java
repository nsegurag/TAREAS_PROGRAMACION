package com.ns.tarea_2;

public class persona {
    private int id;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String genero;
    private String dpi;
    private int edad;
    private String ciudad;

    // Constructor
    public persona(int id, String primerNombre, String segundoNombre, String primerApellido,
                   String segundoApellido, String genero, String dpi, int edad, String ciudad) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.genero = genero;
        this.dpi = dpi;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    // Getters
    public int getId() { return id; }
    public String getPrimerNombre() { return primerNombre; }
    public String getSegundoNombre() { return segundoNombre; }
    public String getPrimerApellido() { return primerApellido; }
    public String getSegundoApellido() { return segundoApellido; }
    public String getGenero() { return genero; }
    public String getDpi() { return dpi; }
    public int getEdad() { return edad; }
    public String getCiudad() { return ciudad; }

    @Override
    public String toString() {
        return primerNombre + " " + segundoNombre + " " + primerApellido + " " + segundoApellido;
    }
}


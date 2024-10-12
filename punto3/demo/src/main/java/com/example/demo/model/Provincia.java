package com.example.demo.model;

import com.example.demo.util.Region;

public class Provincia {
    private int identificador;
    private String nombre;
    private Region region;
    private int poblacion;
    private double superficie;
    private boolean estado;

    public Provincia(int identificador, String nombre, Region region, int poblacion, double superficie, boolean estado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.region = region;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.estado = estado;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public Region getRegion() {
        return region;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public boolean isEstado() {
        return estado;
    }

    // Método para calcular la densidad poblacional
    public double calcularDensidadPoblacional() {
        return poblacion / superficie;
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", region=" + region +
                ", poblacion=" + poblacion +
                ", superficie=" + superficie +
                ", estado=" + estado +
                ", densidad poblacional=" + calcularDensidadPoblacional() +
                '}';
    }
}

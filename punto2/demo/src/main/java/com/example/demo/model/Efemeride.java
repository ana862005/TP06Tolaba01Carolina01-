package com.example.demo.model;
import com.example.demo.util.Mes;   

public class Efemeride {

    private int codigo;
    private String nombre;
    private Mes mes;
    private int dia;
    private String detalle;

    public Efemeride(int codigo, String nombre, Mes mes, int dia, String detalle) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.mes = mes;
        this.dia = dia;
        this.detalle = detalle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mes getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Efemeride{" +
                "nombre='" + nombre + '\'' +
                ", dia=" + dia +
                ", mes=" + mes +
                ", detalle='" + detalle + '\'' +
                '}';
    }
    
}

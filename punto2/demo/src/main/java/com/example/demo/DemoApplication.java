package com.example.demo;

import java.util.ArrayList;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Efemeride;
import com.example.demo.util.Mes;

@SpringBootApplication
public class DemoApplication {

	  public static void main(String[] args) {
        // Crear una lista de 5 efemérides
        ArrayList<Efemeride> efemerides = new ArrayList<>();

        efemerides.add(new Efemeride(1, "Día del Trabajador", Mes.MAYO, 1, "Celebración internacional del trabajo"));
        efemerides.add(new Efemeride(2, "Día de la Independencia", Mes.JULIO, 9, "Celebración de la independencia nacional"));
        efemerides.add(new Efemeride(3, "Día de la Bandera", Mes.JUNIO, 20, "Homenaje al creador de la bandera nacional"));
        efemerides.add(new Efemeride(4, "Navidad", Mes.DICIEMBRE, 25, "Celebración del nacimiento de Jesús"));
        efemerides.add(new Efemeride(5, "Año Nuevo", Mes.ENERO, 1, "Celebración del inicio del nuevo año"));

        // Mostrar las 5 efemérides
        System.out.println("Lista original de efemérides:");
        for (Efemeride efemeride : efemerides) {
            System.out.println(efemeride.getNombre() + " - " + efemeride.getDia() + " de " + efemeride.getMes());
        }

        // Eliminar la tercera efeméride (índice 2)
        efemerides.remove(2);

        // Modificar la segunda efeméride (índice 1)
        efemerides.get(1).setNombre("Día de la Amistad");
        efemerides.get(1).setDetalle("Celebración de la amistad y los amigos");

        // Mostrar las 4 efemérides que quedan
        System.out.println("\nLista modificada de efemérides:");
        for (Efemeride efemeride : efemerides) {
            System.out.println(efemeride.getNombre() + " - " + efemeride.getDia() + " de " + efemeride.getMes());
        }
    }
}

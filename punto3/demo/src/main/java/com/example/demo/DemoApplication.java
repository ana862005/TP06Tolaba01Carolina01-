package com.example.demo;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Provincia;
import com.example.demo.util.Region;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        // Crear un array de 10 provincias
        Provincia[] provincias = new Provincia[10];

        provincias[0] = new Provincia(1, "Jujuy", Region.NOA, 770000, 53219, true);
        provincias[1] = new Provincia(2, "Salta", Region.NOA, 1443000, 155488, true);
        provincias[2] = new Provincia(3, "Tucumán", Region.NOA, 1690000, 22524, true);
        provincias[3] = new Provincia(4, "Misiones", Region.NEA, 1180000, 29801, true);
        provincias[4] = new Provincia(5, "Formosa", Region.NEA, 600000, 72066, true);

        provincias[5] = new Provincia(6, "Mendoza", Region.CUYO, 2000000, 148827, false);
        provincias[6] = new Provincia(7, "San Juan", Region.CUYO, 700000, 89651, false);
        provincias[7] = new Provincia(8, "Santa Fe", Region.CENTRO, 3500000, 133007, false);
        provincias[8] = new Provincia(9, "La Pampa", Region.PATAGONIA, 340000, 143440, false);
        provincias[9] = new Provincia(10, "Río Negro", Region.PATAGONIA, 750000, 203013, false);

        // Mostrar solo las provincias con estado 'true'
        System.out.println("Provincias con estado 'true':");
        for (Provincia provincia : provincias) {
            if (provincia.isEstado()) {
                System.out.println(provincia);
            }
        }
    }
}

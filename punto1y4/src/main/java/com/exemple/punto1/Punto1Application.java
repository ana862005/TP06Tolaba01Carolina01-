package com.exemple.punto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import com.exemple.punto1.model.Producto;
import com.exemple.punto1.util.Categoria;
import com.exemple.punto1.util.OrigenDeFabricacion;
import com.exemple.punto1.model.Compra;
import java.time.LocalDate;
@SpringBootApplication
public class Punto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Punto1Application.class, args);

	ArrayList<Producto> listaProducto=new ArrayList<>();
	listaProducto.add(new Producto(1, "netbook samsung", 20, OrigenDeFabricacion.BRASIL, Categoria.INFORMATICA));
	listaProducto.add(new Producto(2,"Tele tcl",16,OrigenDeFabricacion.URUGUAY,Categoria.ELECTROGAR));
	listaProducto.add(new Producto(4,"celular motorola",11,OrigenDeFabricacion.CHINA,Categoria.TELEFONIA));
	listaProducto.add(new Producto(7,"tostadora philips",19,OrigenDeFabricacion.ARGENTINA,Categoria.ELECTROGAR));
	listaProducto.add(new Producto(9,"fritadora ",25,OrigenDeFabricacion.BRASIL,Categoria.ELECTROGAR));
     listaProducto.add(new Producto(23,"tablet",12,OrigenDeFabricacion.BRASIL,Categoria.INFORMATICA));
	 listaProducto.add(new Producto (34,"auriculares",25,OrigenDeFabricacion.CHINA,Categoria.INFORMATICA));
	 listaProducto.add(new Producto (34,"play",34,OrigenDeFabricacion.URUGUAY,Categoria.ELECTROGAR));
	 listaProducto.add(new Producto (54,"cafetera",33,OrigenDeFabricacion.ARGENTINA,Categoria.ELECTROGAR));
	 listaProducto.add(new Producto (19,"microondas",56,OrigenDeFabricacion.CHINA,Categoria.ELECTROGAR));

	for(Producto producto:listaProducto){
		System.out.println(producto);
	}


	ArrayList<Compra> listaDeCompra = new ArrayList<>();
	
	listaDeCompra.add(new Compra (1,LocalDate.now() ,listaProducto.get(3),5));
    listaDeCompra.add(new Compra(2, LocalDate.now(), listaProducto.get(9),20));
	listaDeCompra.add(new Compra(5, LocalDate.of(2023,12,5), listaProducto.get(4), 3));
for (Compra compra : listaDeCompra){
	compra.imprimirRecibo();
}
	}
}

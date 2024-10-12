package com.exemple.punto1.model;
import java.time.LocalDate;
import com.exemple.punto1.model.Producto;

public class Compra {
    private int codigo;
    private LocalDate fechaDeCompra ;
    private Producto producto ;
    private int cantidad ;

    public Compra (int codigo,LocalDate fechaDeCompra,Producto producto,int cantidad){
        this.codigo=codigo;
        this.fechaDeCompra=fechaDeCompra;
        this.producto=producto;
        this.cantidad=cantidad;
    }

    public double totalDeLaCompra (){
        return producto.getPreciounitario()*cantidad;
    }

    public void imprimirRecibo (){
            System.out.println("codigo de compra :" + codigo);
            System.out.println(" fecha de compa:" + fechaDeCompra);
            System.out.println("producto :" + producto.getDescripcion());
            System.out.println("cantidad :" + cantidad);
            System.out.println("precio unitario :" + producto.getPreciounitario());
            System.out.println("total de factura  :" + totalDeLaCompra());
    
        
    
    
    }
}

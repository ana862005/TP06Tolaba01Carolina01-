package com.exemple.punto1.model;
import com.exemple.punto1.util.OrigenDeFabricacion;
import com.exemple.punto1.util.Categoria;
public class Producto {
    private int codigo;
    private String descripcion ;
    private double precioUnitario ;
    private OrigenDeFabricacion origenDeFabricacion;
    private Categoria categoria;

    public Producto (int codigo, String descripcion, double precioUnitario,OrigenDeFabricacion origenDeFabricacion, Categoria categoria){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precioUnitario=precioUnitario;
        this.origenDeFabricacion=origenDeFabricacion;
        this.categoria=categoria;
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(int descripcion){

    }
    public double getPreciounitario(){
        return precioUnitario;

    }
    public void setPreciounitario(double precioUnitario){

    }
    public OrigenDeFabricacion getOrigenDeFabricacion(){
        return origenDeFabricacion;
    }
    public void setOrigenDeFabricacion(OrigenDeFabricacion origenDeFabricacion ) {

    }
    public Categoria getCategoria(){
        return categoria;
    }
    public void setCategoria(Categoria categria){

    }
    @Override
    public String toString (){
        return "codigo :"+ codigo + "   descripcion:"+ descripcion + "    precio unitario:"+precioUnitario+"      origen de fabricacion :"+origenDeFabricacion+"    categoria:"+categoria;
    }
}

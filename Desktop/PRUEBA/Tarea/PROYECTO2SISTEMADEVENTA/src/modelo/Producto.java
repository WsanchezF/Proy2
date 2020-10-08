/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author q669YS4G
 */
public class Producto {
    
    
    private int id;
    public static int idSiguientep =2000;
    private String producto;
    private int precioUnidad;
    private String marca;
    
    
    
    public Producto(){
        
        id=idSiguientep;
        idSiguientep++;
    }

    public Producto(String producto, int precioUnidad, String marca) {
        this();
        this.producto = producto;
        this.precioUnidad = precioUnidad;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return Utilerias.getNombreClase(Producto.class)+ "{" + "id=" + id + ", producto=" + producto + ", precioUnidad=" + precioUnidad + ", marca=" + marca + '}';
    }
    
    
    
    
    
    
}

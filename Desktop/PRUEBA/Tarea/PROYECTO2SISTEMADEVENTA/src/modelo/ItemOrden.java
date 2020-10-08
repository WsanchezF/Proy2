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
public class ItemOrden {
    
    private int noLinea;
    private int cantidad;
    Producto producto;
    
    public ItemOrden()
    {
        
    }
   

    public ItemOrden(int noLinea, int cantidad, Producto producto) {
        this.noLinea = noLinea;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getNoLinea() {
        return noLinea;
    }

    public void setNoLinea(int noLinea) {
        this.noLinea = noLinea;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return  Utilerias.getNombreClase(ItemOrden.class)+"{" + "noLinea=" + noLinea + ", cantidad=" + cantidad + ", producto=" + producto + '}';
    }
    
    public int getTotalItem(){
        
        return producto.getPrecioUnidad() *  cantidad;
               
    }
    
    
     
     
}

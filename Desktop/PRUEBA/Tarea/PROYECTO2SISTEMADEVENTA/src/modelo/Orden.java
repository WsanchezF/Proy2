/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author q669YS4G
 */
public class Orden {
    
    
    private int idOrden;
    static int idSigOrden=1;
    private Cliente cliente;
    private Date fechaOrder;
    private ArrayList<ItemOrden> articulos;
    private double precioEnvio;
    private double total;
    private String tipoEnvio;
    private String estado;
    private int diasEnvio;
    
   
    
    
    public Orden(){
        
        idOrden=idSigOrden;
        total = 0.0;
        fechaOrder = new Date();
        idSigOrden++;
    }

    public Orden(Cliente cliente,ArrayList<ItemOrden> articulos, double precioEnvio, String tipoEnvio, String estado, int diasEnvio) {
        
        this();
        this.cliente = cliente;
        this.articulos = articulos;
        this.precioEnvio = precioEnvio;
        this.tipoEnvio = tipoEnvio;
        this.estado = estado;
        this.diasEnvio = diasEnvio;
        
        for(ItemOrden item: articulos)
        {
          this.total +=  item.getTotalItem();
        }
        
        this.total+=precioEnvio;
        
    }
    
    
   
    
   

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaOrder() {
        return fechaOrder;
    }

    public void setFechaOrder(Date fechaOrder) {
        this.fechaOrder = fechaOrder;
    }

    public ArrayList<ItemOrden> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<ItemOrden> articulos) {
        this.articulos = articulos;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDiasEnvio() {
        return diasEnvio;
    }

    public void setDiasEnvio(int diasEnvio) {
        this.diasEnvio = diasEnvio;
    }

 

    @Override
    public String toString() {
        return Utilerias.getNombreClase(Orden.class)+ "{" + "idOrden=" + idOrden + ", cliente=" + cliente + ", fechaOrder=" + fechaOrder + ", articulos=" + articulos + ", precioEnvio=" + precioEnvio + ", total=" + total + ", tipoEnvio=" + tipoEnvio + ", estado=" + estado + ", diasEnvio=" + diasEnvio + '}';
    }
    
    
    
    
}

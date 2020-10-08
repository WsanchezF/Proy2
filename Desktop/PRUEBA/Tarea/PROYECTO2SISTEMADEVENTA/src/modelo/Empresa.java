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

//clase Empresa hereda de la clase cliente
public class Empresa extends Cliente{
    
    private String contacto;
    private int descuento;

    public Empresa(String contacto, int descuento) {
        this.contacto = contacto;
        this.descuento = descuento;
    }

    public Empresa(String contacto, int descuento, String nombre, String apellido, String tipo) {
        super(nombre, apellido, tipo);
        this.contacto = contacto;
        this.descuento = descuento;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Empresa{" + "contacto=" + contacto + ", descuento=" + descuento + '}';
    }
    
    
    
    
    
}

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

//clase individual hereda de la clase cliente
public class Individual extends Cliente{
    
    private String DPI;

    public Individual(String DPI) {
        this.DPI = DPI;
    }

    public Individual(String DPI, String nombre, String apellido, String tipo) {
        super(nombre, apellido, tipo);
        this.DPI = DPI;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    @Override
    public String toString() {
        return "Individual{" + "DPI=" + DPI + '}';
    }
    
    
    
}

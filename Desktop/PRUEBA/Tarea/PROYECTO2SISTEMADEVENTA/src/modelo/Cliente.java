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
//clase cliente super clase de Individual y Empresa (estos son tipos de clientes)
public class Cliente {
    
    
    private int id;
    public static int idSiguiente =1;
    
    private String nombre;
    private String apellido;
    private String tipo;
    
    public Cliente()
    {
        id=idSiguiente;
        idSiguiente++;
        
    }

    public Cliente(String nombre, String apellido, String tipo) {
        
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return Utilerias.getNombreClase(Cliente.class) +"{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", tipo=" + tipo + '}';
    }
    
    
    
}

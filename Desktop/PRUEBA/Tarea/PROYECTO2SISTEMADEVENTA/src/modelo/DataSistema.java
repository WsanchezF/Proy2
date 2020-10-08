/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author q669YS4G
 */
public class DataSistema {
    
    //3 arrays estaticos para almacenar la informacion de carga/inicio
    public static Cliente clientes [];
    public static Producto productos [];
    public static Orden ordenes [];

    public static Orden[] getOrdenes() {
        return ordenes;
    }

    public static void setOrdenes(Orden[] ordenes) {
        DataSistema.ordenes = ordenes;
    }
    
    public DataSistema(String s)
    {
        
    }
    

    public DataSistema() {
        
        Cliente.idSiguiente=1;
        clientes = new Cliente[8];
        clientes[0]=new Individual("2245965555512","Michell","Alcantara","Individual");
        clientes[1]=new Individual("1212456784545","Anna","Ventura","Individual");
        clientes[2]=new Individual("45451234567878","Roxana","Booss","Individual");
        clientes[3]=new Individual("2245789451111","Jose","Perez","Individual");
        clientes[4]= new Empresa("Sara Lebia",3,"Seguros GYT", "", "Empresa");
        clientes[5]= new Empresa("Roberto Gomez",2,"Seguros Roble", "", "Empresa");
        clientes[6]= new Empresa("Anai poca",3,"Importadora AC", "", "Empresa");
        clientes[7]= new Empresa("Leonel Garcia",3,"AutoVentas", "", "Empresa");
        
    }
    
     public DataSistema(boolean var) {
         
        Producto.idSiguientep=2000;
        productos = new Producto[8];
        productos[0] = new Producto("Alternados", 750, "Toyota");
        productos[1] = new Producto("Cargador de motor", 250, "Mazda");
        productos[2] = new Producto("Bomba de Agua", 350, "Toyota");
        productos[3] = new Producto("Bomba Acite", 450, "Kia");
        productos[4] = new Producto("Retenedor", 100, "Toyota");
        productos[5] = new Producto("Bobina", 120, "Kia");
        productos[6] = new Producto("Cojinete", 200, "Toyota");
        productos[7] = new Producto("Shock", 800, "Mazda");
 
    }
     //metodos auxiliares para busca un cliente existente
     public Cliente getCliente(int index)
     {
         
        
        Cliente.idSiguiente=1;
        clientes = new Cliente[8];
        clientes[0]=new Individual("2245965555512","Michell","Alcantara","Individual");
        clientes[1]=new Individual("1212456784545","Anna","Ventura","Individual");
        clientes[2]=new Individual("45451234567878","Roxana","Booss","Individual");
        clientes[3]=new Individual("2245789451111","Jose","Perez","Individual");
        clientes[4]= new Empresa("Sara Lebia",3,"Seguros GYT", "", "Empresa");
        clientes[5]= new Empresa("Roberto Gomez",2,"Seguros Roble", "", "Empresa");
        clientes[6]= new Empresa("Anai poca",3,"Importadora AC", "", "Empresa");
        clientes[7]= new Empresa("Leonel Garcia",3,"AutoVentas", "", "Empresa");
        for(int k=0; k< clientes.length; k++)
        {
            if(index==k)
            {
                return clientes[k];
            }
        }
        
        return null;
        
        
    }
     
     
      public Producto getProducto(int index) {
         
        Producto.idSiguientep=2000;
        productos = new Producto[8];
        productos[0] = new Producto("Alternados", 750, "Toyota");
        productos[1] = new Producto("Cargador de motor", 250, "Mazda");
        productos[2] = new Producto("Bomba de Agua", 350, "Toyota");
        productos[3] = new Producto("Bomba Acite", 450, "Kia");
        productos[4] = new Producto("Retenedor", 100, "Toyota");
        productos[5] = new Producto("Bobina", 120, "Kia");
        productos[6] = new Producto("Cojinete", 200, "Toyota");
        productos[7] = new Producto("Shock", 800, "Mazda");
        
        for(int k=0; k< productos.length; k++)
        {
            if(index==k)
            {
                return productos[k];
            }
        }
        
        return null;
    }
     
    public void cargarOrdenes()
    {
        Orden.idSigOrden=1;
        ordenes = new Orden[8];
        ItemOrden tempItem1 = new ItemOrden(1, 2, getProducto(0));
        ItemOrden tempItem2 = new ItemOrden(2, 2, getProducto(1));
        
       ArrayList<ItemOrden> compra1 = new ArrayList<ItemOrden>();
        
       compra1.add(tempItem1);
       compra1.add(tempItem2);
       
       
       
        ordenes[0] = new Orden(getCliente(0), compra1, 50, "Normal", "Cancelado", 3);
        ordenes[1] = new Orden(getCliente(1), compra1, 75, "Gold", "Cancelado", 2);
        
        
    }
    
    public static Cliente[] getClientes() {
        return clientes;
    }

    public static void setClientes(Cliente[] clientes) {
        DataSistema.clientes = clientes;
    }
    
     public static Producto[] getProductos() {
        return productos;
    }

    public static void setProductos(Producto[] productos) {
        DataSistema.productos = productos;
    }

    
}

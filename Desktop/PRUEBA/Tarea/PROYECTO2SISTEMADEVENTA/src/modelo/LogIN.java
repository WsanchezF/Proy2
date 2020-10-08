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
public class LogIN {
    
    
    public boolean usuarioExiste(String usuario, String pass)
    {
        // agregar usuarios en memoria
        
        Usuario misUsuarios[] = new Usuario[5];
        
        misUsuarios[0]= new Usuario("admin","1234");
        misUsuarios[1]= new Usuario("agente1","1234");
        misUsuarios[1]= new Usuario("agente2","1234");
        
        //recorrer usuarios y verificar si conicide
        for(int i=0; i<misUsuarios.length; i++)
        {
            if(usuario.equals(misUsuarios[i].getUsuario()) && pass.equals(misUsuarios[i].getPass()))
            {
                return true;
            }
            
        }
        
        return false;
    }
    
    
}

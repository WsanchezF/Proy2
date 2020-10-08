/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static com.sun.javafx.util.Utils.split;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author q669YS4G
 */
public class Utilerias {
    
    public static String getNombreClase(Class nombre)
    {
        
        String temp = nombre.getSimpleName().toString();
        
        return temp;
        
    }
    
    public static String getMoneda(int valor)
    {
        
        Locale locale = new Locale("es", "GT");      
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        //System.out.println(currencyFormatter.format(valor));
        
        String temp = currencyFormatter.format(valor);
        
        return temp;
    }
    
}

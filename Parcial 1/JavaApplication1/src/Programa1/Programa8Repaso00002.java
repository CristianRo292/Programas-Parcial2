/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa1;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class Programa8Repaso00002 {
     public static void main(String[] args) throws IOException{
        int edad;
        int ch = 0, cm = 0,sh = 0, sm = 0;
        float ph= 0.0f, pm= 0.0f;
        String nombre, sexo;
        
         for(int i = 0; i < 2; i ++){
             
          nombre = JOptionPane.showInputDialog("Escribe un nombre");
          sexo = JOptionPane.showInputDialog("Escriba el sexo f/m");
         
         edad = Integer.parseInt(JOptionPane.showInputDialog("Escriba la edad"));//convertimos string a int
         
          if(sexo.equals("m")){ //.equals es lo equivalente a un ==, pero solo se aplica para letras 
             ch++;
             sh = sh + edad;
            }else{
            cm++;
            sm = sm + edad;
            }
                 
         }
        ph = ((float)sh) / ch;
        pm = ((float)sm)/ cm;
        
       JOptionPane.showMessageDialog(null,"El promedio de las edades de los hombres  es: " 
                                    + ph+ "\n"+ "El promedio de las edades de las mujeres es: " + pm );
       //no olvides agreagar el null y la coma, sino no sirve, y dentro de la coma para concatenar usa +, recuerda 😁
      // JOptionPane.showMessageDialog(null,"El promedio de las edades de las mujeres es: " + pm);
        
       //System.out.println("El promedio de hombres es: " + ph + " años");
       //System.out.println("El prodio de mujeres es: " + pm + " Años");
    }
}

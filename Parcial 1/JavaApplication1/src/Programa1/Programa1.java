/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class Programa1 {
    public static void main (String[] args) throws IOException {
    
        
        int edad = 0;
        
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe una edad");
        
        edad = Integer.parseInt(JOptionPane.showInputDialog("Escribe una edad"));
        //JOptionPane.showMessageDialog(null, edad);
       
       // JOptionPane.showMessageDialog(null, "Hola mundo,\n EDAD",
       //         "mensaje",JOptionPane.PLAIN_MESSAGE);//indica que simbolo se muestra en laventana 
       String nombre = JOptionPane.showInputDialog(null,"Cual es tu nombre","entrada",JOptionPane.PLAIN_MESSAGE);
       
       
        //edad = Integer.parseInt(entrada.readLine());
       // JOptionPane.showMessageDialog(null,"La edad es: \n ", edad);
       
   
    }          
}

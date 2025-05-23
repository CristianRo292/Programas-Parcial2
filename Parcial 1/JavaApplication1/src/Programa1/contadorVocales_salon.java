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
public class contadorVocales_salon {
    public static void main(String[] args) throws IOException{
        int ca = 0, ce = 0,ci = 0, co = 0,cu = 0;
        String cadena;
        cadena = JOptionPane.showInputDialog("Escribe una cadena");
        cadena = cadena.toLowerCase();
        
        for(int i =0;i<cadena.length(); i++){
            if(cadena.charAt(i) == 'a'){
            ca++;
            }
            if(cadena.charAt(i) == 'e'){
            ce++;
            }
            if(cadena.charAt(i) == 'i'){
            ci++;
            }
            if(cadena.charAt(i) == 'o'){
            co++;
            }
            if(cadena.charAt(i) == 'u'){
            cu++;
            }
        }
        String mensaje = "";
        if (ca !=0){
            mensaje = mensaje + " vocales a: "+ca;
        }
        if (ce !=0){
            mensaje = mensaje + " vocales e: "+ce;
        }
        if (ci !=0){
            mensaje = mensaje + " vocales i: "+ci;
        }
        if (co !=0){
            mensaje = mensaje + " vocales o: "+co;
        }
        if (cu !=0){
            mensaje = mensaje + " vocales u: "+cu;
        }
        
        if (mensaje == ""){
            JOptionPane.showMessageDialog(null, "no hay vocales");
        }
        JOptionPane.showMessageDialog(null, mensaje);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa1;

import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class programa7 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Escribe una palabra");
        nombre = nombre.toLowerCase();
        String nc = "";
        String ca = "";
        for(int i = 0; i < nombre.length(); i++){
            if (nombre.charAt(i) != ' '){
            nc += nombre.charAt(i);
         }
        }
        
        System.out.println(nc);
        
        for(int i = nc.length()-1; i >= 0; i --){
            ca += nc.charAt(i);
        }
        if (ca.endsWith(nc)){
       // System.out.println("Es un palindromo");
            JOptionPane.showMessageDialog(null, "Es un palindromo");
        }else{
        //System.out.println("No es un palindromo");
            JOptionPane.showMessageDialog(null, "NO es un palindromo");
        }
    }
}

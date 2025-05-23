/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeexmen;

import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class Ejercicio3 {
   
//hacer un programa que lea 2 cadenas, el programa obtendra unicamente la vocal o de las dos palabras, 
//lo cual se mostraran dichar palabras sin la letra estraida
    
    public static void main(String[] args) {
        String ca1=JOptionPane.showInputDialog("ingrese una frace");
        ca1 = ca1.toLowerCase();
        
        String ca2 = JOptionPane.showInputDialog("ingresa la segunda cadena");
         ca2 = ca2.toLowerCase();
         
        ca1 = ca1.replace("o", "");
        ca2 = ca2.replace("o", "");
        
        JOptionPane.showMessageDialog(null, "La cedea uno queda: "+ca1+
                                        "\n La cadena 2 queda:"+ca2);
        
    }
}

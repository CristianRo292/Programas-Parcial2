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
public class Ejercicio1Optimizado {
    public static void main(String[] args) {
        String numero  = "";
        String numero1 = "";
         for (int i = 1; i <= 5; i ++){
        numero = JOptionPane.showInputDialog("Favor de ingresar el numero,(NO.resgitro: "+i+")");
        numero= numero.replace(" ", "");
        
        double num = Double.parseDouble(numero);
        
        if (num >= 0){
            numero1= numero + ",";
        }else{
            JOptionPane.showMessageDialog(null, "NUMERO NO VALIDO");
            i = i-1;
        }
        }
         JOptionPane.showMessageDialog(null, numero);
       
    }
}

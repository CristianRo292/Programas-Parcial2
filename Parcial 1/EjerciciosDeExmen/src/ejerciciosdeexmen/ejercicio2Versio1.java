/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeexmen;

import java.lang.management.ClassLoadingMXBean;
import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
//programa 2
//hacer un programa que lea una cadena no mayor a 10 caracteres, de lo contrario mostrara un error.
//Si la cadena si es menor a 10 caracteres,cambiar todas las vocales por el signo de pesos($)
public class ejercicio2Versio1 {

    public static void main(String[] args) {
        String cad = JOptionPane.showInputDialog("cadena1");
        cad = cad.toLowerCase();
        int cantidad = cad.length();
        System.out.println(cantidad);

        if (cantidad > 10) {
            JOptionPane.showMessageDialog(null, "noo valido");
        } else {
            cad = cad.replace("a","$");
            cad = cad.replace("e", "$");
            cad = cad.replace("i", "$");
            cad = cad.replace("o", "$");
            cad = cad.replace("u", "$");
            
            JOptionPane.showMessageDialog(null, cad);
            System.out.println(cad);
        }

    }
}

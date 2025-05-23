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
public class anexos_usode_joptionpane {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hola mundo");

        JOptionPane.showMessageDialog(null, "Nombre \n Edad \n Telefono",
                                       "Mensaje", JOptionPane.INFORMATION_MESSAGE);//cambia el icono 

        String nombre = JOptionPane.showInputDialog(null, "¿Cuál es tu nombre?",
                                            "Entrada",JOptionPane.QUESTION_MESSAGE) ;
        JOptionPane.showMessageDialog(null, "Hola, " + nombre);
        
        


        int respuesta = JOptionPane. showConfirmDialog(null, "¿Quieres continuar?",
                                     "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION) ;
        
        if (respuesta == JOptionPane.YES_OPTION) {
        JOptionPane. showMessageDialog(null, "Elegiste Sí.");
        } else if (respuesta == JOptionPane.NO_OPTION) {
        JOptionPane. showMessageDialog(null, "Elegiste No.");
        } else {
        JOptionPane. showMessageDialog(null, "Cancelaste.");


}
        
    }
}

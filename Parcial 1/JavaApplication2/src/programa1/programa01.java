/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import java.io.BufferedReader;

import javax.swing.JOptionPane;

public class programa01{
public static void main(String[] arg){
    String contraseña = JOptionPane.showInputDialog("Escribe tu contraseña");
    String contraseñaCorect = "12345";
    boolean validacion = contraseña.equals(contraseñaCorect);
    JOptionPane.showMessageDialog(null, validacion);
    
}
}

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
public class programa4Resuelto {
    public static void main(String[] arg){
    int cl = 0;
    int cn = 0;
    int cln = 0;
    String valor = JOptionPane.showInputDialog("Escrie un dato");
    
    for (int i = 0; i < valor.length(); i++){
    //65 - 90 mayusculas
    // 97 - 122 inusculas
    //48-57 numeros
    if(valor.codePointAt(i) >= 48 && valor.codePointAt(i)<= 57){
    cn++;
    }
    if (valor.codePointAt(i) >= 65 && valor.codePointAt(i)<= 90){
    cl++;
    }
    if (valor.codePointAt(i) >= 97  && valor.codePointAt(i)<= 122){
    cl++;
    }
    }
    if (cl == valor.length()){
    JOptionPane.showMessageDialog(null,"Son letras");
    }
    if (cn == valor.length()){
    JOptionPane.showMessageDialog(null,"Son numeros");
    }
    if (cn > 0 && cl > 0){
    JOptionPane.showMessageDialog(null,"Son numeros y letras");
    }
    }
}

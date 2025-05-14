/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class validacione {

    public static void main(String[] args) {
        //1.1
        String n = JOptionPane.showInputDialog("Escribe un numero con decimales");
        if (validarNumerosDecimales(n)) {
            JOptionPane.showMessageDialog(null, "SI es un numero con decimales");
        } else {
            JOptionPane.showMessageDialog(null, "NO es un numero con decimales");
        }
    }

    static boolean validarNumerosDecimales(String a) {

        boolean r = false;
        int c = 0;
        int cn = 0;
        int p = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.codePointAt(i) == 46) {
                c++;
                p = i;
            }
        }
        if (c != 1) {
            r = false;
        } else {
            //JOptionPane.showMessageDialog(null, "El punto esta: "+p);

            if (p == 0) { //agregamos un cero antres de punto si esta en la primera posicion
                a = "0" + a;
            }
            if (p == a.length() - 1) {//agregamos un cero despues del punto si esta en la ultima posocion
                a = a + "0";
            }
            for (int i = 0; i < a.length(); i++) {
                System.out.println(a.charAt(i));
                if (a.codePointAt(i) >= 48 && a.codePointAt(i) <= 57 || a.codePointAt(i) == 46) {
                    cn++;
                }
            }
            if (cn == a.length()) {
                r = true;
            }
        }

        return r;
    }
}

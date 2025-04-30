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
public class Clase2ResolucionBucleInfinito {

    public static void main(String[] args) {

        // boolean est = true;
        while (true) {
            String des = "";
            String num = JOptionPane.showInputDialog("Escribe un numero");
            if (num.equals("")) {
                JOptionPane.showMessageDialog(null, "Campo vasio");
            } else if (vlidacion(num)) {
                int a = Integer.parseInt(num);
                if ((a % 2) == 0) { // si es par el modulo sera de 0 ✌️
                    divisiones(a);//llama a division que acepata INT
                } else {
                    float b = (float) a;
                    divisiones(b); //llama a division que acepa FLOAT
                }
            }
            int respuesta = JOptionPane.showConfirmDialog(null, "Quiere continuar",
                    "confirmacion", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                //est = true;

            } else if (respuesta == JOptionPane.NO_OPTION) {
                //est = false;
                break;
            }

        }
    }

    //Sobre carga de metodoas
    static void divisiones(int a) { //puede haber dos metodos con el mismos nombre siemrpe y cuando los datos de entrada sea de tipo sistinto 
        JOptionPane.showMessageDialog(null, (a / 2));
    }

    static void divisiones(float b) {
        JOptionPane.showMessageDialog(null, (b / 2));
    }

    static boolean vlidacion(String e) {
        int c = 0;
        boolean est;
        for (int i = 0; i < e.length(); i++) {
            if (e.codePointAt(i) >= 48 && e.codePointAt(i) <= 57) {
                c++;
            }
        }
        
        if (c == e.length()) {
            System.out.println("Si son numeros");
            est = true;

        } else {
            System.out.println("No todos son numeros");
            JOptionPane.showMessageDialog(null, "NO todos son numeros");
            est = false;

        }

        return est;

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class tarea002 {

    public static void main(String[] args) throws IOException {
        //ingreso una palabra y cuento las vocales
        BufferedReader letras = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        System.out.println("Escribe una palabra");//
        String palabra = letras.readLine();//ANA
        palabra = palabra.toLowerCase();//ana
        int c = palabra.length();//3

        //System.out.println(c);
        for (int k = 0; k < c; k++) {
            //System.out.println("ciclo for");
            if (palabra.charAt(k) == 'a') {
                a = a + 1;
            }
            if (palabra.charAt(k) == 'e') {
                e = e + 1;
            }
            if (palabra.charAt(k) == 'i') {
                i = i + 1;
            }
            if (palabra.charAt(k) == 'o') {
                o = o + 1;
            }
            if (palabra.charAt(k) == 'u') {
                u = u + 1;
            }
        }
        if (a != 0) {
            JOptionPane.showMessageDialog(null, "la vocal 'a' aparece: \n" + a + " veces");//2
        }
        if (e != 0) {
            JOptionPane.showMessageDialog(null, "la vocal 'e' aparece: \n" + e + " veces");//2
        }
        if (i != 0) {
            JOptionPane.showMessageDialog(null, "la vocal 'i' aparece: \n" + i + " veces");//2
        }
        if (o != 0) {
            JOptionPane.showMessageDialog(null, "la vocal 'o' aparece: \n" + o + " veces");//2
        }
        if (u != 0) {
            JOptionPane.showMessageDialog(null, "la vocal 'u' aparece: \n" + u + " veces");//2
        }

    }
}

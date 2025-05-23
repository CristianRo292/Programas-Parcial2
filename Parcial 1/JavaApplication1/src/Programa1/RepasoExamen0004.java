/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class RepasoExamen0004 {

    //hacer un programa que lea nombre,y aoellidos por separado de una persona, ademas del dia, mes , y año 
    //de nacimiento, El programa debe optener de los datos aneriores el rfc de la persona 
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Scanner dia = new Scanner(System.in);
        String rfc = "";
        String aux = "";

        System.out.println("Escribe el nombre de una persona");
        String nombre = leer.readLine();
        System.out.println("Escibe el apellido paterno");
        String ap = leer.readLine();
        ap = ap.toLowerCase();//convertimos a minusculas 
        String []palabras = ap.split(" ");
        
        if (palabras.length == 2){ //si es compuesto lo dividimos en palabras, solo lo aplicamos a ap  
        ap = palabras[1];
        }
        if (palabras.length == 3){
        ap = palabras[2];
        }
        System.out.println("Escibe el apellido materno");
        String am = leer.readLine();
        System.out.println("Escibe el dia de nacimiento: ");
        int d = dia.nextInt();
        
        System.out.println("Escibe el mes de nacimiento: ");
        int m = dia.nextInt(); //convierte a numero enteros, quita el cero cuando esta enfrente 
        System.out.println("Escibe el año de nacimiento: ");
        int a = dia.nextInt();

        rfc = rfc + ap.toUpperCase().charAt(0);
        if (ap.charAt(1) == 'a' || ap.charAt(1) == 'e' || ap.charAt(1) == 'i' || ap.charAt(1) == 'o' || ap.charAt(1) == 'u') {
            rfc = rfc + ap.toUpperCase().charAt(1);
        } else if (ap.charAt(2) == 'a' || ap.charAt(2) == 'e' || ap.charAt(2) == 'i' || ap.charAt(2) == 'o' || ap.charAt(2) == 'u') {
            rfc = rfc + ap.toUpperCase().charAt(2);
        } else {
            rfc = rfc + ap.toUpperCase().charAt(3);
        }

        rfc = rfc + am.toUpperCase().charAt(0);
        rfc = rfc + nombre.toUpperCase().charAt(0);

        aux = Integer.toString(a);
        rfc = rfc + aux.substring(2, 4);
        System.out.println("paso el paso de a ");
        
        aux = Integer.toString(m);
        if (aux.length()== 1){
        aux = "0"+aux;
        }
        rfc = rfc + aux.substring(0, 2);
         System.out.println("paso el paso de m ");
         
        aux = Integer.toString(d);
        if (aux.length()== 1){ //concatenamos el cero cuando es solo un digito
        aux = "0"+aux;
        }
        rfc = rfc + aux.substring(0, 2);
        

        JOptionPane.showMessageDialog(null, rfc);

    }
}

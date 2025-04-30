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
public class Principal {

    public static void main(String[] args) {
        String r = "";
        while (!r.equals("5")) {
            r = Menu();
            if (r.equals("1")) {
                JOptionPane.showMessageDialog(null, "Suma");
                leerDatos(r);
            }else if (r.equals("2")) {
                JOptionPane.showMessageDialog(null, "Resta");
                leerDatos(r);

            } else if (r.equals("3")) {
                JOptionPane.showMessageDialog(null, "Multiplicacion");
                leerDatos(r);

            } else if (r.equals("4")) {
                JOptionPane.showMessageDialog(null, "Divicion");
                leerDatos(r);

            } else if (r.equals("5")) {
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Opcion no valida \n vuelve a intentarlo");
            }
        }

    }

    static String leerDatos(String r) {
        int est1 = 0, est2 = 0;
        String b = "";
        String a = JOptionPane.showInputDialog("Escribe un numero");
        
        if (ValiadarNumeros(a)){
             b = JOptionPane.showInputDialog("Escribe otro numero");
         if (ValiadarNumeros(b)){
             suma(a + " " + b + " " + r);
         }else {
         JOptionPane.showMessageDialog(null, "Error en el numero 2");
         }
        }else{
        JOptionPane.showMessageDialog(null, "Error en el numero 1");
        }
        
        /**if (ValiadarNumeros(a)){
         a = a;
         est1 = 1;
        } 
        if (est1 == 1){
        b = JOptionPane.showInputDialog("Escribe otro numero");
        if (ValiadarNumeros(b)){
        b = b;
        est2 = 1;
        }
        
        }
        
        if (est1 == 1&& est2 == 1){
        suma(a + " " + b + " " + r);
        }*/
        return "";
    }
    static boolean ValiadarNumeros(String e){
    int c = 0;
            boolean est;
        for(int i  = 0; i < e.length(); i++){
            if(e.codePointAt(i) >= 48 && e.codePointAt(i) <= 57){
            c++;
            }
        }
        if (c == e.length()){
            System.out.println("Si son numeros");
            //est = true;
            //int b = Integer.parseInt(e);
            //edad = anio - b;
            //JOptionPane.showMessageDialog(null, "El año de nacimiento es: \n"+ edad);
            return true;
        }else {
            System.out.println("No todos son numeros");
            JOptionPane.showMessageDialog(null,"Dato no valido");
            est = false;
            //System.exit(0);
        }
        return est;
    }
    

    static void suma(String datos) {
        // JOptionPane.showMessageDialog(null, datos);
        String[] d = datos.split(" ");//parte la cadena en base a un caracter
        //JOptionPane.showMessageDialog(null, "valor 1: " + d[0]);
        //JOptionPane.showMessageDialog(null, "valor 2: " + d[1]);
        //JOptionPane.showMessageDialog(null, "valor 3: " + d[2]);

        switch (d[2]) {
            case "1":{
             int a = Integer.parseInt(d[0]);
            int b = Integer.parseInt(d[1]);
            int r = a + b;
            JOptionPane.showMessageDialog(null, "Resultado es: " + r);
            }
                break;  
            case "2":{
             int a = Integer.parseInt(d[0]);
            int b = Integer.parseInt(d[1]);
            int r = a - b;
            JOptionPane.showMessageDialog(null, "Resultado es: " + r);
            }
                
                break;
            case "3":{
            int a = Integer.parseInt(d[0]);
            int b = Integer.parseInt(d[1]);
            int r = a * b;
            JOptionPane.showMessageDialog(null, "Resultado es: " + r);
            
            }
                break;
            case "4":{
            float a = Float.parseFloat(d[0]);
            float b = Float.parseFloat(d[1]);
            double r = a/b;
            JOptionPane.showMessageDialog(null, "Resultado es: " + r);
            }
                break;
        }
    }

    static String Menu() {

        String op = JOptionPane.showInputDialog(" 1._Suma \n"
                + " 2._Resta \n 3._ Multiplicacion\n "
                + "4._Division \n 5._Salir");

        return op;
    }

}

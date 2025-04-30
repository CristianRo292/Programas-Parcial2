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
public class Clase2 {
    public static void main(String[] args) {
        
        boolean est = true;
        while (est) { 
            String des = ""; 
            String num = JOptionPane.showInputDialog("Escribe un numero");
            if (vlidacion(num)){
                int a = Integer.parseInt(num);
                    if ((a%2) == 0){ // si es par el modulo sera de 0 ✌️
                    divisiones(a);//llama a division que acepata INT
                }else {
                    float b = (float)a;
                    divisiones(b); //llama a division que acepa FLOAT
                }
            }else {
             JOptionPane.showMessageDialog(null,"dato no valido");
             }
            
            boolean r = false;
            while (r == false) {
               des = JOptionPane.showInputDialog("Desea agregar otro dato (SI o NO)");
               des = des.toLowerCase();
             
             
             if (des.equals("si")){
             est = true;
             r = true;
             }else if (des.equals("no")){
                 est = false;
                 r = true;
             }else {
              JOptionPane.showMessageDialog(null, "Opcion no valida");
              r = false;
             }
                
            }
             
            
            
        }
        
                
        //int a = Integer.parseInt( JOptionPane.showInputDialog("Escribe un numero")); //convierte lo escrito a numeros
        
        /**if ((a%2) == 0){ // si es par el modulo sera de 0 ✌️
            divisiones(a);//llama a division que acepata INT
        }else {
            float b = (float)a;
            divisiones(b); //llama a division que acepa FLOAT
        }*/
    }
    
    //Sobre carga de metodoas
    static void divisiones(int a){ //puede haber dos metodos con el mismos nombre siemrpe y cuando los datos de entrada sea de tipo sistinto 
           JOptionPane.showMessageDialog(null, (a/2));
    }
    static void divisiones(float b){
            JOptionPane.showMessageDialog(null, (b/2));
    }
    static boolean vlidacion(String e){
        int c = 0;
            boolean est;
        for(int i  = 0; i < e.length(); i++){
            if(e.codePointAt(i) >= 48 && e.codePointAt(i) <= 57){
            c++;
            }
        }
        if (c == e.length()){
            System.out.println("Si son numeros");
            est = true;
            //int b = Integer.parseInt(e);
            //edad = anio - b;
            //JOptionPane.showMessageDialog(null, "El año de nacimiento es: \n"+ edad);
        }else {
            System.out.println("No todos son numeros");
            JOptionPane.showMessageDialog(null,"Dato no valido");
            est = false;
            //System.exit(0);
        }
        return est;
        
    
    }
}

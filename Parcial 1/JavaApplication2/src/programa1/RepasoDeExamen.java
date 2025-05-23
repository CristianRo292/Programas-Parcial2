/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class RepasoDeExamen {
    //hacer un programa que pida ingresar numero para iniciar, despues solicita un correo electronico, 
    // despues solcite su nombre 
    
    public static void main(String[] args) {
        while (true) {            
             String num = JOptionPane.showInputDialog("Ingrese un numero");
             if (CampoBasio(num)&&valNumeros(num)){
                 JOptionPane.showMessageDialog(null, "Si son numeros ");
                String correo = JOptionPane.showInputDialog("Ingrese un correro");
                if (CampoBasio(correo)&&ValCorrero(correo)){
                    JOptionPane.showMessageDialog(null, "Su correro fue aceptado");
                    String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                    nombre = nombre.toLowerCase();
                    if (CampoBasio(nombre)&&ValNombre(num)){
                        JOptionPane.showMessageDialog(null, "El registro se completo con exito");
                    }
                    
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
    static  boolean valNumeros(String num){
       int c = 0;
        boolean est;
        for (int i = 0; i < num.length(); i++) {
            if (num.codePointAt(i) >= 48 && num.codePointAt(i) <= 57) {
                c++;
            }
        }
        
        if (c == num.length()) {
            System.out.println("Si son numeros");
            est = true;

        } else {
            System.out.println("No todos son numeros");
            JOptionPane.showMessageDialog(null, "NO todos son numeros");
            est = false;

        }

        return est;
    }
    
    static boolean ValCorrero(String a){
     int c=0;
        boolean r = false;
        for (int i = 0; i < a.length(); i++) {
            if (a.codePointAt(i) == 64) {
                c++;  
            }
        }
        if (c != 1) {
            r = false;
        } else {
            System.out.println("Por el momento si es un correo valido");
            int p = a.indexOf("@");
            String c1 = a.substring(0,p);//z-a 0-9 _-
            String c2 = a.substring((p+1),a.length());//z-a .com
            System.out.println(c1+" "+c2);
            if (c1.length()>1 && c2.length()>=5){
                int cn = 0;
            for (int i = 0; i < c1.length(); i++) {
                System.out.println(c1.charAt(i));
                if (c1.codePointAt(i) >= 97 && c1.codePointAt(i) <= 122 
                        || c1.codePointAt(i) == 45||c1.codePointAt(i) == 95) {
                    cn++;
                }
            }
            
            int pcom = c2.indexOf(".com");
            if (pcom != -1){
                String c3 = c2.substring(pcom, c2.length());
                
                System.out.println("COM: "+c3);
                
                if (c3.endsWith(".com")){
                    String c4 = c2.substring(0,pcom);
                    if (c4.length()>1){
                        for (int i = 0; i < c4.length(); i++) {
                            if (c4.codePointAt(i) >= 97 && c4.codePointAt(i) <= 122) {
                                cn++;
                            }
                        }
                        
                        if (cn == c4.length()+c1.length()) {
                            r = true;
                        }
                    }
                    
                }else{
                    r = false;
                }    
            }else {
                r = false;
            }
            
            }else {
                r = false;
            }
            
        }
        return r;
        }
   
    static boolean ValNombre(String nom){
    boolean val;
        int c = 0;
        for (int i = 0; i < nom.length(); i++) {
            if (nom.codePointAt(i) >= 97 && nom.codePointAt(i) <= 122) {
                c++;
            }
        }
        if (c == (nom.length())) {
            JOptionPane.showMessageDialog(null, "Si es un nombre");
            val = true;
        } else {
            JOptionPane.showMessageDialog(null, "No es un nombre");
            val = false;
        }

        return val;
    }
    
    static boolean CampoBasio(String cam){
        boolean est;
        if (cam.equals("")){
            JOptionPane.showMessageDialog(null, "El campo esta basio");
            est = false;
        }else{
            est = true;
        }
    return est;
    }
    
   
}

   


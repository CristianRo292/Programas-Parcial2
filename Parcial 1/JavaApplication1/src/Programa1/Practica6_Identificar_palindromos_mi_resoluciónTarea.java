/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa1;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class Practica6_Identificar_palindromos_mi_resoluciónTarea {
    public static void main(String[] args)throws IOException {
        //ingresar una palabra y saber si es palindromo 
        String palabra = JOptionPane.showInputDialog("ingresa una frace");//entra palabra
        String palabra1= palabra.replace(" ","");
        System.out.println(palabra1);
        //Ana
        int c1 = 0;
        int c2 = 0;
        int a = 0;
        int sumaT = 0;
        int tolalp = palabra1.length();
        String nPal= palabra1.toLowerCase();
        
        for (int i = 0; i < palabra1.length(); i++){
                a++;
            //System.out.println(palabra.length());
            //ana
            //System.out.println(nPal);
         
         c1 = nPal.codePointAt(i);//97
          //System.out.println(c1);
         
         c2 = nPal.codePointAt(tolalp -a);
         //System.out.println(c2);
       
         if(c1 != c2){
          sumaT = 1;
         }
        }
        if(0 == sumaT){
         JOptionPane.showMessageDialog(null,"La palabra utilizada SI es un palindromo");
         }else{
         JOptionPane.showMessageDialog(null, "La palabra no es un palindromo");
        }
    }
}



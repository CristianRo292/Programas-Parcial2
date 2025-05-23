/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author roc53
 */
public class programa3 {
    public static void main(String[] arg)throws IOException{
    //metodos clase string 
    //convercion a Ascii
    
    String nombre= "";
    int b = 0;
    int cn = 0;
    
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    //Scanner leer = new Scanner(System.in);
    
     System.out.println("Escribe un numero");
    // nombre = leer.readLine();
     nombre = leer.readLine(); //Correjir 
    
   // b = leer.nextInt();
    //ñ = 164
    //0 = 48
     for(int i = 0; i < nombre.length(); i++){
        // System.out.println(nombre.codePointAt(i));//optiene cada caracter por individual en codigo ascii
        if (nombre.codePointAt(i)>= 48 && nombre.codePointAt(i)<= 57){
         cn++;
     } 
    }
    if (cn == nombre.length()){
    System.out.println("Si se puede convertir ");
    b = Integer.parseInt(nombre);
    }else{
    System.out.println("Error, no todos son numeros");
}
}
}
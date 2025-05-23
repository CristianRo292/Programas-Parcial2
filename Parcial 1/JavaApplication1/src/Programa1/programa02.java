/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa1;

/**
 *
 * @author roc53
 */
public class programa02 {
    public static void main(String[] arg){
    //tipo de dato
    // int byte, long, short 8-32 bit
    // float, double 16 - 32 bit
    
    // carcter o carcteres string
    // 
    String dia2 = "100";
    int dia = 7;
    float d = 1.0f;
    d = (float)dia; // convercion implicita
    dia = (int)d;
    
    dia = Integer.parseInt(dia2);//convercion explicita
    d = Float.parseFloat(dia2);
    
    //Math.pow //elevar a potencia double
    //Math.sqrt // raiz cuadrada double
    
    //divicion
    int a = 5;
    int b = 2;
    float c= 0;
    c = (float)a / (float)b;
    
    System.out.println(c);
    }
    
}

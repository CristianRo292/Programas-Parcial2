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
public class nkjjhdfkjhdgf {
     //terminar la incriptacion de las letras hasta el 122
    public static void main(String[] args) {
        String nombre = "abc";
        //letras minuscualas: 97 - 122
        //0-9  10
        //simbolos 33-47  14
        //58-64  6
        //92 y 95 \ y _
        String otra = (encriptar(nombre));
        desencriptar(otra);
                
       
        
        
    }
    //terminar el programa 
    static String desencriptar(String a){
    String codigo ="";
        a = a.toLowerCase();
        
        for (int i =0; i < a.length(); i ++){
            System.out.println(a.charAt(i));
             switch(a.codePointAt(i)){
                 case 48:
                     codigo = codigo + "a";
                     break;
                case 49:
                     codigo = codigo + "b";
                     break;
                case 50:
                     codigo = codigo + "c";
                     break;
                case 51:
                     codigo = codigo + "d";
                     break;
                case 101:
                     codigo = codigo + "4";
                     break;
                case 102:
                     codigo = codigo + "5";
                     break;
                case 103:
                     codigo = codigo + "6";
                     break;
                case 104:
                     codigo = codigo + "7";
                     break;
                case 105:
                     codigo = codigo + "8";
                     break;
                case 106:
                     codigo = codigo + "9";
                     break;
                case 107:
                     codigo = codigo + "!";
                     break;
                case 108:
                     codigo = codigo + '"';
                     break;
                case 109:
                     codigo = codigo + "#";
                     break;
                     
                case 110:
                     codigo = codigo + "$";
                     break;
                case 111:
                     codigo = codigo + "%";
                     break;
                case 112:
                     codigo = codigo + "&";
                     break;
                case 113:
                     codigo = codigo + "'";
                     break;
                case 114:
                     codigo = codigo + "(";
                     break;
                case 115:
                     codigo = codigo + ")";
                     break;
                case 116:
                     codigo = codigo + "*";
                     break;
                case 117:
                     codigo = codigo + "+";
                     break;
                case 118:
                     codigo = codigo + ",";
                     break;
                case 119:
                     codigo = codigo + "-";
                     break;
                case 120:
                     codigo = codigo + ".";
                     break;
                case 121:
                     codigo = codigo + "/";
                     break;
                case 122:
                     codigo = codigo + ":";
                     break;
               
             
             }
            
        }
    return codigo;
        
    }
    
    static String encriptar(String a){
        String codigo ="";
        a = a.toLowerCase();
        
        for (int i =0; i < a.length(); i ++){
            System.out.println(a.charAt(i));
             switch(a.codePointAt(i)){
                 case 97:
                     codigo = codigo + "0";
                     break;
                case 98:
                     codigo = codigo + "1";
                     break;
                case 99:
                     codigo = codigo + "2";
                     break;
                case 100:
                     codigo = codigo + "3";
                     break;
                case 101:
                     codigo = codigo + "4";
                     break;
                case 102:
                     codigo = codigo + "5";
                     break;
                case 103:
                     codigo = codigo + "6";
                     break;
                case 104:
                     codigo = codigo + "7";
                     break;
                case 105:
                     codigo = codigo + "8";
                     break;
                case 106:
                     codigo = codigo + "9";
                     break;
                case 107:
                     codigo = codigo + "!";
                     break;
                case 108:
                     codigo = codigo + '"';
                     break;
                case 109:
                     codigo = codigo + "#";
                     break;
                     
                case 110:
                     codigo = codigo + "$";
                     break;
                case 111:
                     codigo = codigo + "%";
                     break;
                case 112:
                     codigo = codigo + "&";
                     break;
                case 113:
                     codigo = codigo + "'";
                     break;
                case 114:
                     codigo = codigo + "(";
                     break;
                case 115:
                     codigo = codigo + ")";
                     break;
                case 116:
                     codigo = codigo + "*";
                     break;
                case 117:
                     codigo = codigo + "+";
                     break;
                case 118:
                     codigo = codigo + ",";
                     break;
                case 119:
                     codigo = codigo + "-";
                     break;
                case 120:
                     codigo = codigo + ".";
                     break;
                case 121:
                     codigo = codigo + "/";
                     break;
                case 122:
                     codigo = codigo + ":";
                     break;
               
             
             }
            
        }
    return codigo;
    
    }

}

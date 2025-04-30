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
public class Operacion {
     public String desencriptar(String a) {
        String codigo = "";
        for (int i = 0; i < a.length(); i++) {
            //System.out.println(a.charAt(i));
            switch (a.codePointAt(i)) {
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
                case 52:
                    codigo = codigo + "e";
                    break;
                case 53:
                    codigo = codigo + "f";
                    break;
                case 54://6
                    codigo = codigo + "g";//
                    break;
                case 55://7
                    codigo = codigo + "h";//h
                    break;
                case 56://8
                    codigo = codigo + "i";//105
                    break;
                case 57://9
                    codigo = codigo + "j";//106
                    break;
                case 33://!
                    codigo = codigo + "k";//107
                    break;
                case 34://"
                    codigo = codigo + 'l';//108
                    break;
                case 35://#
                    codigo = codigo + "m";//109
                    break;

                case 36://$
                    codigo = codigo + "n";//110
                    break;
                case 37://%
                    codigo = codigo + "o";//111
                    break;
                case 38://&
                    codigo = codigo + "p";//112
                    break;
                case 39://'
                    codigo = codigo + "q";//113
                    break;
                case 40://(
                    codigo = codigo + "r";//114
                    break;
                case 41://)
                    codigo = codigo + "s";//115
                    break;
                case 42://*
                    codigo = codigo + "t";//116
                    break;
                case 43://+
                    codigo = codigo + "u";//117
                    break;
                case 44://,
                    codigo = codigo + "v";//118
                    break;
                case 45://-
                    codigo = codigo + "w";//119
                    break;
                case 46:// .
                    codigo = codigo + "x";//120
                    break;
                case 47:// /
                    codigo = codigo + "y";//121
                    break;
                case 58:// :
                    codigo = codigo + "z";//122
                    break;

            }

        }
        return codigo;

    }

    public String encriptar(String a) {
        String codigo = "";
        //a = a.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            //System.out.println(a.charAt(i));
            switch (a.codePointAt(i)) {
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
    
    public boolean validarNombre(String nom) {
        boolean val;
        int c = 0;
        //nom= nom.toLowerCase();
        for (int i = 0; i < nom.length(); i++) {
            if (nom.codePointAt(i) >= 97 && nom.codePointAt(i) <= 122) {
                c++;
            }
        }
        if (c == (nom.length())) {
            //JOptionPane.showMessageDialog(null, "Si es un nombre");
            val = true;
        } else {
            //JOptionPane.showMessageDialog(null, "No es un nombre");
            val = false;
        }

        return val;
    }
    
    public int buscarA (String a ){
        a = a.toLowerCase();
        int c =0;
        for (int i = 0; i < a.length(); i++) {
            if (a.codePointAt(i)==97){
            c++;
            }
        }
        return c;    }
    
    public int BuscarE (String pal){
        pal = pal.toLowerCase();
        int c = 0;
        for (int i = 0; i < pal.length(); i++) {
            if (pal.codePointAt(i)== 101){
                 c++;
            }
        }
        return c;
    }
    
    public int BuscarI(String pal){
        pal = pal.toLowerCase();
        int c= 0;
        for (int i = 0; i < pal.length(); i++) {
          if (pal.codePointAt(i)==105){
          c++;
          }  
        }
        return c;
    }
    
    public int BuscarO (String pal){
        pal = pal.toLowerCase();
        int c=0;
        for(int i =0; i<pal.length();i++){
            if (pal.codePointAt(i)== 111){
            c++;
            }
        }
        return c;
    }
    
    public int BuscarU (String pal){
    pal = pal.toLowerCase();
    int c =0;
    for (int i = 0;i < pal.length();i++){
        if (pal.codePointAt(i)==117){
            c++;
        }
    }
    return c;
    }
}

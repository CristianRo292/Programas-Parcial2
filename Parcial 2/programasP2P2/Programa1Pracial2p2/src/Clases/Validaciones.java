/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author roc53
 */
public class Validaciones {
    public boolean ValidarNumeros(String c){
        boolean est;
        int con =0;
        if (c.length()==0){
        return false;
        }
        
        for(int i =0;i<c.length();i++){
        if (c.codePointAt(i)>= 48&& c.codePointAt(i)<=57){
            con++;
        }
        }
        if (con == c.length()){
        est= true;
        }else {
        est = false;
        }
        
        return est;
    }
    
    public boolean ValidarNumeros2(String a){
        boolean r = false;
        try {
            int b = Integer.parseInt(a);
            r = true;
        } catch (Exception e) {
            r = false;
        }
        return r;
    }
}

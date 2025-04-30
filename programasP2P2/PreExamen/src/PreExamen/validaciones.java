/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PreExamen;

import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class validaciones {
    public boolean ValidarNumero(String num){
        int c =0;
        boolean est;
        
        for (int i =0; i < num.length();i ++){
            if (num.codePointAt(i)>=48 && num.codePointAt(i)<=57){
             c++;
            }
        }
        if (c == num.length()){
        est = true;
        }else{
            est = false;
        }
        return est;
    }
    
    public boolean ValidarNum(String num){
        boolean est;
        int nu;
        try {
            nu = Integer.parseInt(num);
            est = true;
        } catch (Exception e) {
            est = false;
        }
        return est;
    }
    
}

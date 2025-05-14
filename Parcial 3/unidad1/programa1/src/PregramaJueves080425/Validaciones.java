/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PregramaJueves080425;

/**
 *
 * @author roc53
 */
public class Validaciones {
    public boolean ValidarNOmbre(String nom){
        boolean est = false;
        int c =0;
        for (int i = 0; i < nom.length(); i++) {
            if ((nom.codePointAt(i)>=97 && nom.codePointAt(i)<=122)|| (nom.codePointAt(i)>= 65&& nom.codePointAt(i)<=90)||nom.codePointAt(i)== 32){
            c++;
            }
        }
        if (c == nom.length()){
            est = true;
        }else{
        est = false;
        }
        
    return est;
    }
    public boolean ValEdad(String edad){
        boolean est = false;
    try {
           int a = Integer.parseInt(edad);
             est = true;
        } catch (Exception e) {
            est = false;
        }
    return est;
    }
    public boolean ValAltura(String alt){
        boolean est = false;
        
        
    try {
            int altura = Integer.parseInt(alt);
           est = true;
        } catch (Exception e) {
            
            est = false;
        }
    return est;
    }
    
}

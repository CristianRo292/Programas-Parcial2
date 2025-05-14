/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author roc53
 */
public class Validaciones {
    public boolean Validar(String nom){
    
        boolean est = false;
        try {
            int num = Integer.parseInt(nom);
            est = true;
        } catch (Exception e) {
            est = false;
        }
    return est;
    }
    
}

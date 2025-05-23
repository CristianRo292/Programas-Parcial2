/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa1;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
/**
 *
 * @author roc53
 */
public class programa2 {
    public static void main(String[] arg){
        String n1;
        int r = 0;
        n1 = JOptionPane.showInputDialog("Escribe un numero");
        r = Integer.parseInt(n1);
        
        JOptionPane.showMessageDialog(null,"1 * "+n1 + " = "+ (r*1)
                +"\n 2 * "+ n1 + " = "+ (r*2) 
                +"\n 3 * " + n1 + " = " + (r*3)
                +"\n 4 * " + n1 + " = " + (r*4)
                 + "\n 5 * "+n1 + " = "+ (r*5)
        );
        /* 
        1 * 20 = 20
        2*20 = 40
        3*20 = 60
        
        */
       // String numero = JOptionPane.showInputDialog(null,"Escribe un numero","entrada",JOptionPane.PLAIN_MESSAGE);
        
    }
}

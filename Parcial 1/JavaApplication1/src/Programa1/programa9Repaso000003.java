/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa1;

import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class programa9Repaso000003 {
    public static void main(String[] args) {
        double a,b,c;
        double x1 = 0.0,x2 = 0.0, a2 = 0.0;
        double b2 = 0.0, m4ac = 0.0, r = 0.0, raiz = 0.0;
        char pregunta = 's';
        while(pregunta == 's' ){
            a = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor de A"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor de B"));
            c = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor de C"));

                if (Math.pow(b,2) > (4*a*c)){
                    b2 = Math.pow(b,2);
                    m4ac = 4*a*c;
                    r = b2 - m4ac;
                    raiz = Math.sqrt(r);//calcula la raiz 
                    a2 = 2*a;
                    x1 = (-b+raiz)/(2*a);
                    x2 = ((-b)-raiz)/(a2);
                    JOptionPane.showMessageDialog(null,"El resultado de x1 es = "+x1+"\n"
                                                   +"El resultado de x2 es = "+x2);


                }else{
                    JOptionPane.showMessageDialog(null, "Error no se puede hacer esta operacion");
                }
                int respuesta = JOptionPane.showConfirmDialog(null, "Quiere volverlos a correr",
                                                               "Confirmacion",JOptionPane.YES_NO_CANCEL_OPTION);
                if (respuesta == JOptionPane.YES_OPTION){
                     pregunta = 's';
                }
                if(respuesta == JOptionPane.NO_OPTION){
                    pregunta = 'n';
                }else {
                    break;
                }
                
                  
        }
        
    }
}

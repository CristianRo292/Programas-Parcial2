/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa1;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class preExamen_calcular_areas {
    public static void main(String[] args)throws IOException {
        String fig = JOptionPane.showInputDialog("Nombre de la figura");
        String figura = fig.toLowerCase();
        double lado;
        char es = 'e';
        double base, altura,radio,resultado,ra2,per = 0;
        
       // for(int i = 0; i < 3; i ++){
         //    lado = Double.parseDouble(JOptionPane.showInputDialog("medida del lado"));
           //  per = per + lado;
            //}
        
        if(figura.equals("triangulo")){
            base = Double.parseDouble(JOptionPane.showInputDialog("medida de la base"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Medida de la altura"));
            
            for (int i = 0; i < 3; i ++){
             lado = Double.parseDouble(JOptionPane.showInputDialog("medida del lado"));
             per = per + lado;
            }
            resultado = (base * altura)/2;
            
            JOptionPane.showMessageDialog(null, "El area de"+fig+" es: " + resultado);
            
            JOptionPane.showMessageDialog(null, "El perimetro de"+fig+" es: " + per);
            es = 's';
        }
        if (figura.equals("rectangulo")){
            base = Double.parseDouble(JOptionPane.showInputDialog("medida de la base"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Medida de la altura"));
            resultado = (base * altura);
            es = 's';
            
            for (int i = 0; i < 4; i ++){
             lado = Double.parseDouble(JOptionPane.showInputDialog("medida del lado"));
             per = per + lado;
            }
            JOptionPane.showMessageDialog(null, "El area de"+fig+" es: " + resultado);
            JOptionPane.showMessageDialog(null, "El perimetro de"+fig+" es: " + per);
        }
        if(figura.equals("circulo")){
            radio = Double.parseDouble(JOptionPane.showInputDialog("medida del radio"));
           // altura = Double.parseDouble(JOptionPane.showInputDialog("Medida de la altura"));
           ra2 = Math.pow(radio,2);
            resultado = (ra2 * 3.1416);
            JOptionPane.showMessageDialog(null, "El area de"+fig+" es: " + resultado);
            es = 's';
            per= 3.1416 * (radio+radio);
            JOptionPane.showMessageDialog(null, "El perimetro de"+fig+" es: " + per);
            
        }
        if (figura.equals("cuadrado")){
            base = Double.parseDouble(JOptionPane.showInputDialog("medida del lado "));
            
            resultado = Math.pow(base, 2);
            JOptionPane.showMessageDialog(null, "El area de"+fig+" es: " + resultado);
            es = 's';
            per = 4 * base;
            JOptionPane.showMessageDialog(null, "El perimetro de"+fig+" es: " + per);
        }
        if (es == 'e'){
          JOptionPane.showMessageDialog(null, "ERROR,  \n nombre de figura no valida ");
        }
    }
}

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
public class resolcucionPreexamen {
    public static void main(String[] args) {
        String figura;
        int ac = 0, ar =0,pc =0, pr = 0;
        double aci = 0.0, pci = 0.0, at = 0.0, pt = 0.0;
        double radio;
        
        figura = JOptionPane.showInputDialog("Escribe una figura geometrica");
        if (figura.equals("circulo")){
        radio = Double.parseDouble(JOptionPane.showInputDialog("Escribe el radio del circulo"));
        aci = 3.1416 * Math.pow(radio, 2);
        pci = 3.1416 * (radio+radio);
        JOptionPane.showMessageDialog(null,"El area del circulo es: "+aci+"\n El perimetro del circulo es: "+pci);
        }
    }
}

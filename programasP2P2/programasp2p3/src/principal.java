
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roc53
 */
public class principal {
    public static void main(String[] args) {
        metodos objeto = new metodos(); 
        String nombre1,nombre2,nombre3;
        
        nombre1= JOptionPane.showInputDialog("escribe un nombre");
        if (objeto.ValNombre1(nombre1)){
            nombre2 = JOptionPane.showInputDialog("Escribe otro nombre");
            if (objeto.valNombre2(nombre2)){
                nombre3 =JOptionPane.showInputDialog("Escribe el ultimo nombre");
                if (objeto.valNombre3(nombre3)){
                JOptionPane.showMessageDialog(null, "la multiplicacion de la palabras es\n"
                                                + (nombre1.length()*nombre2.length()*nombre3.length()));
                }else{
                    JOptionPane.showMessageDialog(null, "Dato Invalido","Error",JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Dato Invalido","Error",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
                }
        }else{
            JOptionPane.showMessageDialog(null, "Dato Invalido","Error",JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
        
    }
}

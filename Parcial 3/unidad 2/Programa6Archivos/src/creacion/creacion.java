/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class creacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String r = "n";
            // TODO code application logic here
           
            FileWriter archivo = new FileWriter("Datos.txt");
            do{
                archivo.write(JOptionPane.showInputDialog("Escribe un dato")+ "\n");//guardamos datos saltando un renglon
                r = JOptionPane.showInputDialog("Deseas otro");
                    
            }while(r.equals("s"));//se repite hasta que se escriba un "s" en respuesta
            archivo.write("hola mundo");//abro archivo
            archivo.close(); //cierro archivo
            
            
        } catch (IOException ex) {
            Logger.getLogger(creacion.class.getName()).log(Level.SEVERE, null, ex);//crear el archivo si no existe
        }
    
}
}

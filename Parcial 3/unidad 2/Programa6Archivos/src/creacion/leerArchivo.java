/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class leerArchivo {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader leer =  new BufferedReader(new FileReader("datos.txt"));
            String renglon = "";
            String auxiliar = "";
            while((renglon = leer.readLine() )!= null){//busca datos renglon por renglon hasta  🔍
                auxiliar += renglon + "\n";//guardo los datos que salen en auxiliar
                
            }
            leer.close();
            JOptionPane.showMessageDialog(null,auxiliar); //nuestro los datos encontrados 👀
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(leerArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

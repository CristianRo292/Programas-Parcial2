/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class entrenamientop1 {
    //calculadora de volumenes 
    //calcula el volumen de de las figuras 
    //cubo v=l^2 a = 6.l^2
    //esfera v = 4/3(3.1416)(r^3) a = 4(3.1416)(r^2)
    //cilindro v = (3.1416)(r^2)(altura) a = 2(3.1416)(r)(r+altura)
    //usuario ingresa el nombre de la figura, y las medidas, calcula el volumen y area 
    //mostrae el resulado en cuadros de dialogo, si ingresa una figura diferente mandar mensaje de error
    public static void main(String[] args) {
       double vol, area,lado,altura, radio;
       double pi = 3.1416;
       String figura = JOptionPane.showInputDialog("Ingresa el nombre de a figura");
       figura = figura.toLowerCase();
       System.out.println(figura);
       boolean es = false;
       
       if (figura.equals("cubo")){
           lado = Double.parseDouble(JOptionPane.showInputDialog("medida del lado"));
           vol = Math.pow(lado,3);
           area = 6*(Math.pow(lado, 2));
           System.out.println(vol);
           JOptionPane.showMessageDialog(null, "El area de "+figura+" es: "+area
                   +"\n y el volumen es de: "+vol);
            es = true;
           
       }
       if (figura.equals("esfera")){
           radio = Double.parseDouble(JOptionPane.showInputDialog("medida radio"));
           vol = radio*(4/3)*(pi)*(Math.pow(radio, 3));
           area = 4*(pi)*(Math.pow(radio, 2));
           JOptionPane.showMessageDialog(null, "El area de "+figura+" es: "+area
                   +"\n y el volumen es de: "+vol);
           es = true;
       }
       if (figura.equals("cilindro")){
           radio = Double.parseDouble(JOptionPane.showInputDialog("medida radio"));
           altura = Double.parseDouble(JOptionPane.showInputDialog("medida de su altura"));
           vol= (pi)*(Math.pow(radio,2))*(altura);
           area = ((pi)*(Math.pow(radio, 2))*2)+(altura*(2*radio*pi));
           JOptionPane.showMessageDialog(null, "El area de "+figura+" es: "+area
                   +"\n y el volumen es de: "+vol);
           es = true;
       }
       
       if (es == false){
       JOptionPane.showMessageDialog(null, "Figura no valida");
       }
       
    }
     
}

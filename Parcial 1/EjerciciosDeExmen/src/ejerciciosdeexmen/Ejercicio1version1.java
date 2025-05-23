/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeexmen;

import javax.swing.JOptionPane;

/**
 *
 * @author roc53
 */
public class Ejercicio1version1 {
    public static void main(String[] args) {
 // hacer un programa que lea 5 numeros, los cuales deben ser pocitivos, de los contrario mostrar un mensaje de error
//El programa mostrara lo siguiente 
//si el producto(multiplicacion) del primero y el quinto es mayor que el producto o multiplicacion del segundo y el cuarto,
//mostrara un mensaje que diga hola mundo, 
//si el promedio de todos los numero es mayor o igual al tercer numero al cuadrado, mostrara otro mensaje de hola mundo
//indicar cual de todos los numero es el mayor



        double nu1,nu2,nu3,num4,num5;
        nu1 = Double.parseDouble(JOptionPane.showInputDialog("numero 1"));//se solicitan los numeros 
        System.out.println(nu1);
        nu2 = Double.parseDouble(JOptionPane.showInputDialog("numero 2"));
        System.out.println(nu2);
        nu3 = Double.parseDouble(JOptionPane.showInputDialog("numero 3"));
        System.out.println(nu3);
        num4 = Double.parseDouble(JOptionPane.showInputDialog("numero 4"));
        System.out.println(num4);
        num5 = Double.parseDouble(JOptionPane.showInputDialog("numero 5"));
        System.out.println(num5);
        double val = nu1*nu2*nu3*num4*num5;
        
        if (nu1 >=0&& nu2 >=0 && nu3>=0 && num4>=0 && num5>=0){//corrobora que los numero sean positivos 
        double p1 = (nu1*num5);
        double p2 = (nu2 * num4);
        double promedio = val/5;
       boolean est = false;
        //int est = 0;
        
        if (p1>p2){
         JOptionPane.showMessageDialog(null, "Hola mundo");
        }
        if (promedio >= (Math.pow(nu3, 2))){
        JOptionPane.showMessageDialog(null, "Hola mundo");
        }
        
        if (nu1 >= nu2 &&nu1 >= nu3 && nu1 >= num4 && nu1 >= num5 && est == false){ //Se verifica que numero es el mayor 
            JOptionPane.showMessageDialog(null, "EL numero mayor es: "+ nu1);// se usa la variable est para evitar que se repitan resultados 
            est = true;           
        }
        if (nu2 >= nu1 &&nu2 >= nu3 && nu2 >= num4 && nu2 >= num5 && est == false){
            JOptionPane.showMessageDialog(null, "EL numero mayor es: "+ nu2);
            est = true;           
        }
        if (nu3 >= nu2 &&nu3 >= nu1 && nu3 >= num4 && nu3 >= num5 && est == false){
            JOptionPane.showMessageDialog(null, "EL numero mayor es: "+ nu3);
            est = true;           
        }
        if (num4 >= nu2 &&num4 >= nu3 && num4 >= nu1 && num4 >= num5 && est == false){
            JOptionPane.showMessageDialog(null, "EL numero mayor es: "+ num4);
            est = true;           
        }
        if (num5 >= nu2 &&num5 >= nu3 && num5 >= num4 && num5 >= nu1 && est == false){
            JOptionPane.showMessageDialog(null, "EL numero mayor es: "+ num5);
            est = true;           
        }
        
       
        }else {
        JOptionPane.showMessageDialog(null, "Hay un numero negativo");
        }
        
        
    }
}

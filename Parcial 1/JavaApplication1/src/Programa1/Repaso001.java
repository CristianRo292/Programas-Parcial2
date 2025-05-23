/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author roc53
 */
public class Repaso001 {
    //si no tiene metodo no funciona
    //calse: bloques de codigo que nos permite solcionar poblemas 
    public static void main(String[] args) throws IOException {
        
        //char: permite solo un caracter 
        //int : permite solo numero sin decimales(positivos y negativos)
        //byte(0 a 128) 
        //long(muchos numeros), short(pocos numeros)
        //decimales
        //Float(mas pequeño) y double(mas grande de todos)
        //Caracteres String
        //Bolean falso y verdadero o 0 y 1 
        
        //librerias 
        //Scanner BuferedRead(ingresar datos)
        //JOptionPane (introducir y mostrar datos en una ventana)
        
        //Operadores matematicas:
        // +,-,*,/,%(mod),Math.pow(potencia), Math.sqrt(raiz cuadrada)
        //>< == >= <= !=
        
        //operadores relacionales 
        // && and 
        // || or 
        // ! not 
        
        //Metodos de la clase String 
        //codepointAt (convierte a ascii)
        //equals (compara cadenas)
        //charAt (optiene el carcater de por un indice)
        //trim (elimina espacios al inicio y al final)
        //length (muestra la longitud de la cadena )
        // a.toLowerCase();(convierte a MAYUSCULAS)
        // a.toUpperCase();(Convierte a minusculas)
        
      //Estructuras
      //if
      //if else
      //swith
      //for 
      
//hacer un programa que lea nombre, edad,
//y el sexo de 5 personas, el programa mostrara el promedio de edades 
//de hombres y mujeres 

     //int edadH= 0;
     //int edadM = 0;
     //String edadT = "";
     //String sexo = "";
             
     BufferedReader datos = new BufferedReader(new InputStreamReader(System.in));
        Scanner leer = new Scanner(System.in);
        String nombre, sexo;
        int edad;
        int ch = 0, cm = 0,sh = 0, sm = 0;
        float ph= 0.0f, pm= 0.0f;
        
        for (int i = 1; i > 5; i ++){
            
            System.out.println("Escribe un nombre");
            nombre = datos.readLine();
            System.out.println("Escribe el sexo f/m");
            sexo = datos.readLine();
            System.out.println("Escribe la edad");
            edad  = leer.nextInt();
      
            if(sexo.equals("m")){
             ch++;
             sh = sh + edad;
            }else{
            cm++;
            sm = sm + edad;
            }
          //sexo = JOptionPane.showInputDialog("Escria su sexo, M(si es mujer), H(Si es hombre)");
          //if ( sexo == "H"){
           //edadT = JOptionPane.showInputDialog("Que edad tiene (Sin decimales )");
                //edadH = edadH + Integer.parseInt(edadT);   
          }
        ph = ((float)sh) / ch;
        pm = ((float)sm)/ cm;
        
       System.out.println("El promedio de hombres es: " + ph + " años");
       System.out.println("El prodio de mujeres es: " + pm + " Años");
         
     }
        
        
        
    }


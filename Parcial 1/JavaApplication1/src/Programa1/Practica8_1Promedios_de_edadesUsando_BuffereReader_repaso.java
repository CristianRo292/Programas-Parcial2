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
public class Practica8_1Promedios_de_edadesUsando_BuffereReader_repaso {
    public static void main(String[] args) throws IOException {
        
             
     BufferedReader datos = new BufferedReader(new InputStreamReader(System.in)); // se usa para letras 👌
        Scanner leer = new Scanner(System.in); // se usa para numeros 👍
        String nombre, sexo;
        int edad;
        int ch = 0, cm = 0,sh = 0, sm = 0;
        float ph= 0.0f, pm= 0.0f;
        //no ingresa al bucle
        //El sigo de comparacion estaba mal 😂
         
        for (int i = 1; i < 5; i ++){  
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
       
          }
        ph = ((float)sh) / ch;
        pm = ((float)sm)/ cm;
        
       System.out.println("El promedio de hombres es: " + ph + " años");
       System.out.println("El prodio de mujeres es: " + pm + " Años");
         
     }
        
}

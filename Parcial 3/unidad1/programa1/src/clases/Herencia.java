/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author roc53
 */
public class Herencia {

    public static void main(String[] args) throws IOException {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Validaciones val = new Validaciones();

        String[] nombres = new String[10];
        String nValidar;

        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe un numero");
            nValidar = leer.readLine();
            if (val.Validar(nValidar)) {
                nombres[i] = nValidar;
            }else{
                System.out.println("No es un numero");
               
            }

        }

        for (int i = 0; i < 10; i++) {
            System.out.println(nombres[i]);
        }
    }
}

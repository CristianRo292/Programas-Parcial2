
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
public class metodos {

    public boolean ValNombre1(String nom) {
        boolean est;
        int c = 0;
        for (int i = 0; i < nom.length(); i++) {
            if (nom.codePointAt(i) >= 97 && nom.codePointAt(i) <= 122) {
                c++;
            }
        }
        if (nom.length() == c) {
            est = true;
        } else {
            est = false;
        }
        return est;
    }

    public boolean valNombre2(String nom) {
        boolean est;
        int c = 0;
        for (int i = 0; i < nom.length(); i++) {
            if (nom.codePointAt(i) >= 65 && nom.codePointAt(i) <= 90) {
                c++;
            }
        }
        if (c == nom.length()) {
            est = true;
        } else {
            est = false;
        }

        return est;
    }

    public boolean valNombre3(String nom) {
        boolean est;
        int c = 0;
        nom = nom.toLowerCase();
        for (int i = 0; i < nom.length(); i++) {
            if (nom.codePointAt(i) >= 97 && nom.codePointAt(i) <= 122
                    || nom.codePointAt(i) == 32) {
                c++;
            }

        }
        if (c == nom.length()&& c <=5) {
            est = true;
        } else {
            est = false;
        }

        return est;
    }
}

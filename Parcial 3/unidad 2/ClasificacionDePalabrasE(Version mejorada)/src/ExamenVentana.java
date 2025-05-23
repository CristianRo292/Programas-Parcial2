
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author roc53
 */
public class ExamenVentana extends javax.swing.JFrame {

    DefaultTableModel Mod_CTabla = new DefaultTableModel();
    DefaultTableModel Mod_CTabla_in = new DefaultTableModel();
    private int cantidadPalabras = 0;

    /**
     * Creates new form ExamenVentana
     */
    public ExamenVentana() {
        try {
            initComponents();
            String[] titulosPar = {"palabras Pares"}; // arreglo de string
            Mod_CTabla = new DefaultTableModel(null, titulosPar);// aqui se le cambiaron los titulos de la parte superior de la tabla
            tabla_par.setModel(Mod_CTabla);
            String[] titulosInpar = {"Palabras Inpares"}; // arreglo de string
            Mod_CTabla_in = new DefaultTableModel(null, titulosInpar);// aqui se le cambiaron los titulos de la parte superior de la tabla
            tabla_inpar.setModel(Mod_CTabla_in);
            crearArchivoInpares();
            crearArchivoPares();
            LeerArchInpar();
            LeerArchPar();

            if (cantidadPalabras >= 10) {
                txtPalabras.setEnabled(false);
                btnAgregar.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Hay mas de 10 registros");
            }
        } catch (IOException ex) {
            Logger.getLogger(ExamenVentana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void crearArchivoPares() {
        try {

            //aqui no sirve "setLocationRelativeTo"
            FileWriter archivo = new FileWriter("PalabasPares.txt", true);
            archivo.close();
        } catch (IOException ex) {
            Logger.getLogger(ExamenVentana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void crearArchivoInpares() {
        try {

            //aqui no sirve "setLocationRelativeTo"
            FileWriter archivo = new FileWriter("PalabasInpares.txt", true);
            archivo.close();
        } catch (IOException ex) {
            Logger.getLogger(ExamenVentana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void LeerArchPar() throws IOException {
        //le dices a tu tabla que muestre lo que hay en el contenedor

        try {
            BufferedReader leer = new BufferedReader(new FileReader("PalabasPares.txt"));

            String renglon = "";
            //String auxiliar = "";
            while ((renglon = leer.readLine()) != null) {//busca datos renglon por renglon hasta  que se acaben
                //auxiliar += renglon + "\n";//guardo los datos que salen en auxiliar

                Mod_CTabla.addRow(new Object[]{renglon});
                tabla_par.setModel(Mod_CTabla);
                cantidadPalabras = cantidadPalabras + 1;
            }
            leer.close();
            //JOptionPane.showMessageDialog(null,auxiliar); //nuestro los datos encontrados 👀

        } catch (FileNotFoundException ex) {

        }
    }

    public void LeerArchInpar() throws IOException {
        //le dices a tu tabla que muestre lo que hay en el contenedor

        try {
            BufferedReader leer = new BufferedReader(new FileReader("PalabasInpares.txt"));

            String renglon = "";
            //String auxiliar = "";
            while ((renglon = leer.readLine()) != null) {//busca datos renglon por renglon hasta  que se acaben
                //auxiliar += renglon + "\n";//guardo los datos que salen en auxiliar

                Mod_CTabla_in.addRow(new Object[]{renglon});// se agregar toda la informacion de renglon, porque solo guarda una palabra 
                tabla_inpar.setModel(Mod_CTabla_in);
                cantidadPalabras = cantidadPalabras + 1;
            }
            leer.close();
            //JOptionPane.showMessageDialog(null,auxiliar); //nuestro los datos encontrados 👀

        } catch (FileNotFoundException ex) {

        }
    }

    public void AgregarPalabraP() {
        String palabra = txtPalabras.getText();

        FileWriter archivo = null;
        try {
            archivo = new FileWriter("PalabasPares.txt", true);
            archivo.write(palabra + "\n");
            archivo.close();
            JOptionPane.showMessageDialog(null, "Registro guardado");
            txtPalabras.setText("");
            cantidadPalabras = cantidadPalabras + 1;

            Mod_CTabla.addRow(new Object[]{palabra});//se ingresan los datos al contenedor
            tabla_par.setModel(Mod_CTabla);// se muestra contenedor en la tabla

        } catch (IOException ex) {
            Logger.getLogger(ExamenVentana.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                Logger.getLogger(ExamenVentana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void AgregarPalabraIn() {
        String palabra = txtPalabras.getText();
        FileWriter archivo = null;
        try {
            archivo = new FileWriter("PalabasInpares.txt", true);
            archivo.write(palabra + "\n");
            archivo.close();
            JOptionPane.showMessageDialog(null, "Registro guardado");
            txtPalabras.setText("");
            cantidadPalabras = cantidadPalabras + 1;

            Mod_CTabla_in.addRow(new Object[]{palabra});//se ingresan los datos al contenedor
            tabla_inpar.setModel(Mod_CTabla_in);

        } catch (IOException ex) {
            Logger.getLogger(ExamenVentana.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                Logger.getLogger(ExamenVentana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_par = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_inpar = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        txtPalabras = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(10, 280));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(10, 280));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setPreferredSize(new java.awt.Dimension(400, 10));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setLayout(new java.awt.GridLayout(2, 1));

        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        tabla_par.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(tabla_par);

        jPanel6.add(jScrollPane1);

        tabla_inpar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane3.setViewportView(tabla_inpar);

        jPanel6.add(jScrollPane3);

        jPanel5.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(3, 1));

        txtPalabras.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtPalabras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabrasActionPerformed(evt);
            }
        });
        txtPalabras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPalabrasKeyTyped(evt);
            }
        });
        jPanel7.add(txtPalabras);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(1, 2));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel9.add(btnAgregar);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel9.add(btnSalir);

        jPanel7.add(jPanel9);

        jPanel5.add(jPanel7);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabrasActionPerformed

    private void txtPalabrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPalabrasKeyTyped
        // TODO add your handling code here:
        int c = evt.getKeyChar();//me da el ascii de cada caracter
        if (c >= 97 && c <= 122 || c == 8) {

        } else {
            evt.consume();//si esta mal
        }
    }//GEN-LAST:event_txtPalabrasKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:

        if (cantidadPalabras == 10) {
            JOptionPane.showMessageDialog(null, "Alto, ya has hecho 10 registros ✋");
            txtPalabras.setEnabled(false);
            btnAgregar.setEnabled(false);
        } else {
            String Palabra = txtPalabras.getText();
            if (Palabra.length() != 0) {

                int CLetras = (Palabra.length()) % 2;
                //JOptionPane.showMessageDialog(null, CLetras);
                if (CLetras != 0) {//palabras no par
                    AgregarPalabraIn();
                } else {//palabras pares 
                    AgregarPalabraP();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Faltan datos", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExamenVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamenVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamenVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamenVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamenVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla_inpar;
    private javax.swing.JTable tabla_par;
    private javax.swing.JTextField txtPalabras;
    // End of variables declaration//GEN-END:variables
}

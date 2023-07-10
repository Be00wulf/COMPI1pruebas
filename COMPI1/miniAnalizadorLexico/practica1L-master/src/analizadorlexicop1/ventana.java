/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexicop1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author orcha
 */
public class ventana extends javax.swing.JFrame {       //archivos entrada y salida
    ArrayList<tokensLexemas> listaTokensLexemas = new ArrayList();
    
    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    
    public ventana() {
        initComponents();
    }

    
    //ABRIENDO EL ARCHIVO...
    public String abrirArchivo(File archivo){
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) !=  -1) {                
                char caracter = (char)ascci;
                documento += caracter;
            }
        } catch (Exception e) {
        }
        return documento;
    }
    
    
    //GUARDANDO EL ARCHIVO...
    public String guardarArchivo(File archivo, String documento){
        String mensaje = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje = "ʕ•́ᴥ•̀ʔっ SE HA GUARDADO EL ARCHIVO EXITOSAMENTE";
        } catch (Exception e) {
        }
        return mensaje;
    }
    
    
    //BUSCANDO PALABRA...
    public boolean buscarPalabra(String palabra){
        boolean hallado = false;
        int contador = 0;
        
        while (hallado == false && contador<listaTokensLexemas.size()) {            
            if (listaTokensLexemas.get(contador).getPalabra().compareTo(palabra) == 0) {    //==0 cadenas equivalentes
                hallado = true;
                
            } else {
                contador++;
            }
            
        }//fin while
        
        if (hallado == true) {
            JOptionPane.showMessageDialog(null, "ʕ•́ᴥ•̀ʔっ SE HA ENCONTRADO LA PALABRA \n" + listaTokensLexemas.get(contador).toString());
            return false;
            
        } else {
            JOptionPane.showMessageDialog(null, "ʕ•́ᴥ•̀ʔっ NO SE HA ENCONTRADO LA PALABRA");
            return true;
        }
        
    }//fin buscarPalabra
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnabrir = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaError = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnAnalizarErrores = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtareaTokens = new javax.swing.JTextArea();
        btnAnalizarTokens = new javax.swing.JButton();
        btnAnalizarAutomata = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtareaaUTOMATAS = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnabrir.setText("CARGAR ARCHIVO");
        btnabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabrirActionPerformed(evt);
            }
        });

        btnguardar.setText("GUARDAR ARCHIVO");
        btnguardar.setEnabled(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        txtarea.setColumns(20);
        txtarea.setRows(5);
        txtarea.setEnabled(false);
        jScrollPane2.setViewportView(txtarea);

        jLabel1.setText("TEXTO DE ENTRADA");

        txtareaError.setEditable(false);
        txtareaError.setColumns(20);
        txtareaError.setRows(5);
        jScrollPane1.setViewportView(txtareaError);

        jLabel2.setText("ERRORES");

        jLabel3.setText("TOKENS");

        jLabel4.setText("AUTOMATAS");

        btnbuscar.setText("BUSCAR PALABRA");
        btnbuscar.setEnabled(false);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("NUMERO");

        jLabel6.setText("TOKEN");

        jLabel8.setText("1");

        jLabel9.setText("IDENTIFICADOR");

        jLabel10.setText("2");

        jLabel11.setText("NUMERO");

        jLabel12.setText("3");

        jLabel13.setText("DECIMAL");

        jLabel14.setText("4");

        jLabel15.setText("PUNTUACION");

        jLabel16.setText("5");

        jLabel17.setText("OPERADOR");

        jLabel18.setText("6");

        jLabel19.setText("AGRUPACION");

        jLabel20.setText("7");

        jLabel21.setText("ERROR");

        btnAnalizarErrores.setText("ANALIZAR ERRORES");
        btnAnalizarErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarErroresActionPerformed(evt);
            }
        });

        txtareaTokens.setEditable(false);
        txtareaTokens.setColumns(20);
        txtareaTokens.setRows(5);
        jScrollPane3.setViewportView(txtareaTokens);

        btnAnalizarTokens.setText("ANALIZAR TOKENS");
        btnAnalizarTokens.setEnabled(false);
        btnAnalizarTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarTokensActionPerformed(evt);
            }
        });

        btnAnalizarAutomata.setText("ANALIZAR AUTOMATA");
        btnAnalizarAutomata.setEnabled(false);
        btnAnalizarAutomata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarAutomataActionPerformed(evt);
            }
        });

        txtareaaUTOMATAS.setEditable(false);
        txtareaaUTOMATAS.setColumns(20);
        txtareaaUTOMATAS.setRows(5);
        jScrollPane5.setViewportView(txtareaaUTOMATAS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnabrir)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnalizarErrores)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnalizarTokens, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnguardar)
                                    .addComponent(btnAnalizarAutomata, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnabrir)
                    .addComponent(btnAnalizarErrores)
                    .addComponent(btnAnalizarTokens)
                    .addComponent(btnAnalizarAutomata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(btnguardar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //BOTON ABRIR
    private void btnabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabrirActionPerformed
        // TODO add your handling code here:
        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {                 //seleccion de archivo
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                
                if (archivo.getName().endsWith("txt")) {                                            //LEYENDO ARCGHIVO TIPO .txt
                    String documento = abrirArchivo(archivo);
                    txtarea.setText(documento);
                    //...
                    
                } else {
                    JOptionPane.showMessageDialog(null, "ʕ•́ᴥ•̀ʔっ EL ARCHIVO SELECCIONADO NO ES COMPATIBLE, DE PREFERENCIA SELECCIONE UN ARCHIVO DE TEXTO");
                }
            }
        }
        txtarea.setEnabled(true);
        btnguardar.setEnabled(true);
    }//GEN-LAST:event_btnabrirActionPerformed
    
    
    //BOTON GYARDAR
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        if (seleccionar.showDialog(null, "ʕGuardar") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            
            if (archivo.getName().endsWith("txt")) {
                String Documento = txtarea.getText();
                String mensaje = guardarArchivo(archivo, Documento);
                
                if (mensaje != null ) {
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    JOptionPane.showMessageDialog(null, "ʕ•́ᴥ•̀ʔっ Este tipo de archivo no es compatible, solo se permiten archivos de texto (.txt)");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Guardar");
            }
            
        }
 
    }//GEN-LAST:event_btnguardarActionPerformed

    
    //BOTON DE BUSQUEDA
    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        boolean valor = false;
            String palabraBusqueda = JOptionPane.showInputDialog("ʕ•́ᴥ•̀ʔっ Ingrese una palabra a buscar en el texto de entrada");
            valor = buscarPalabra(palabraBusqueda);
            
    }//GEN-LAST:event_btnbuscarActionPerformed

    
    private void btnAnalizarErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarErroresActionPerformed
        // BOTONCITO DE ANALISIS DE ERRORES
        listaTokensLexemas.clear();//linpiar arraylist
        txtareaError.setText("");//limpiar area de texto de errores
        String entrada = this.txtarea.getText(); 
        new Analizador(listaTokensLexemas).analizar(txtarea.getText());
        boolean b = false;
        
        for (int i = 0; i < listaTokensLexemas.size(); i++) {
            if (listaTokensLexemas.get(i).getLexema() != 7) {
                b = false;//PQJ
                
            } else {
                txtareaError.setText(txtareaError.getText() + "\n" + listaTokensLexemas.get(i).toString());
            }
            
        }//fin for

        if (txtareaError.getText().length() == 0) {//txtarea vacia?
            txtareaError.setText("ʕ•́ᴥ•̀ʔっ NO SE HAN ENCONTRADO \nERRORES PUEDE ANALIZAR TOKENS");
            //AGREGAR AQUI LA ACTIVACION DEL BOTON DE GENERACIOON DE TOKENS
            btnAnalizarTokens.setEnabled(true);
        }
        
        //AGREGAR ACTIVACION DEL BOTON DE BUSQUEDA  
        btnbuscar.setEnabled(true); //solo se acriva EL BOTON DE busqueda, si se han analizado los errores
        
    }//GEN-LAST:event_btnAnalizarErroresActionPerformed
 
    
    private void btnAnalizarTokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarTokensActionPerformed
        // TODO add your handling code here:
        listaTokensLexemas.clear();//no tocar
        String entrada = this.txtarea.getText(); 
        new Analizador(listaTokensLexemas).analizar(txtarea.getText());
        
        for (int i = 0; i < listaTokensLexemas.size(); i++) {
            txtareaTokens.setText(txtareaTokens.getText() + "\n" + listaTokensLexemas.get(i).toString());
        }//fin for
        btnAnalizarAutomata.setEnabled(true);
    }//GEN-LAST:event_btnAnalizarTokensActionPerformed

    
    private void btnAnalizarAutomataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarAutomataActionPerformed
        // TODO add your handling code here:
       /* for (int i = 0; i < listaTokensLexemas.size(); i++) {
            //char listaCarateres = listaTokensLexemas.get(i).getPalabra().charAt(i);
            txtareaaUTOMATAS.setText(txtareaaUTOMATAS.getText() + "\nPalabra: " + listaTokensLexemas.get(i).getPalabra() + "\n");
        }*/
        
        int tamanio;
        char listaCarateres;
                
        for (int i = 0; i < listaTokensLexemas.size(); i++) {
            txtareaaUTOMATAS.setText(txtareaaUTOMATAS.getText() + "\nPalabra: " + listaTokensLexemas.get(i).getPalabra() + "\n");
            tamanio = listaTokensLexemas.get(i).getPalabra().length();
            
            for (int j = 0; j < tamanio; j++) {
                listaCarateres = listaTokensLexemas.get(i).getPalabra().charAt(j);
                txtareaaUTOMATAS.setText(txtareaaUTOMATAS.getText() + " S" + j + "=" + listaCarateres + " ");
            }
        }

    }//GEN-LAST:event_btnAnalizarAutomataActionPerformed

    
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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizarAutomata;
    private javax.swing.JButton btnAnalizarErrores;
    private javax.swing.JButton btnAnalizarTokens;
    private javax.swing.JButton btnabrir;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextArea txtareaError;
    private javax.swing.JTextArea txtareaTokens;
    private javax.swing.JTextArea txtareaaUTOMATAS;
    // End of variables declaration//GEN-END:variables
}
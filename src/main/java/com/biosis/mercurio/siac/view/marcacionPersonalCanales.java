/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biosis.mercurio.siac.view;

/**
 *
 * @author tito_
 */
public class marcacionPersonalCanales extends javax.swing.JFrame {

    /**
     * Creates new form marcacionPersonalCanales
     */
    public marcacionPersonalCanales() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        txtfechacanales = new java.awt.TextField();
        label3 = new java.awt.Label();
        txthoracanales = new java.awt.TextField();
        label4 = new java.awt.Label();
        txtdnicanales = new java.awt.TextField();
        btningreso = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnsalida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFocusable(false);
        label1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 153, 204));
        label1.setName("lblname_system"); // NOI18N
        label1.setText("SISTEMA DE ASISTENCIA EN CENTROS");

        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(102, 102, 102));
        label2.setText("Fecha");

        txtfechacanales.setEditable(false);
        txtfechacanales.setFocusable(false);
        txtfechacanales.setName("txtfecha"); // NOI18N

        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(102, 102, 102));
        label3.setText("Hora");

        txthoracanales.setEditable(false);
        txthoracanales.setFocusable(false);
        txthoracanales.setName("txthora"); // NOI18N

        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(102, 102, 102));
        label4.setText("N° DNI");

        txtdnicanales.setName("txtdni"); // NOI18N
        txtdnicanales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdnicanalesActionPerformed(evt);
            }
        });

        btningreso.setBackground(new java.awt.Color(0, 204, 51));
        btningreso.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btningreso.setForeground(new java.awt.Color(0, 102, 51));
        btningreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/intro.png"))); // NOI18N
        btningreso.setText("Ingreso");
        btningreso.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/marcacion/ingreso2.png"))); // NOI18N
        btningreso.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/marcacion/ingreso2.png"))); // NOI18N
        btningreso.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/marcacion/ingreso2.png"))); // NOI18N

        jToggleButton1.setBackground(new java.awt.Color(0, 153, 204));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marcacion/hermes.png"))); // NOI18N
        jToggleButton1.setAutoscrolls(true);
        jToggleButton1.setIconTextGap(2);

        btnsalida.setBackground(new java.awt.Color(204, 0, 0));
        btnsalida.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnsalida.setForeground(new java.awt.Color(102, 0, 0));
        btnsalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salida.png"))); // NOI18N
        btnsalida.setText("Salida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfechacanales, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(txthoracanales, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btningreso, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(btnsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtdnicanales, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfechacanales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthoracanales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdnicanales, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btningreso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        label1.getAccessibleContext().setAccessibleName("lblname_system");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdnicanalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdnicanalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdnicanalesActionPerformed

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
            java.util.logging.Logger.getLogger(marcacionPersonalCanales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(marcacionPersonalCanales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(marcacionPersonalCanales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(marcacionPersonalCanales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new marcacionPersonalCanales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningreso;
    private javax.swing.JButton btnsalida;
    private javax.swing.JToggleButton jToggleButton1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.TextField txtdnicanales;
    private java.awt.TextField txtfechacanales;
    private java.awt.TextField txthoracanales;
    // End of variables declaration//GEN-END:variables
}

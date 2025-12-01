/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import javax.swing.table.DefaultTableModel;
import modelo.Pago;
import servicio.ArregloPagos;

public class FrmVendedorPagos extends javax.swing.JFrame {
    private ArregloPagos servicioPagos;
    /**
     * Creates new form FrmVendedorPagos
     */
    public FrmVendedorPagos() {
        initComponents();
        setLocationRelativeTo(null);

        servicioPagos = new ArregloPagos(100); // capacidad inicial
        configurarTabla();
        actualizarTabla();
    }

   private void configurarTabla() {
        String[] columnas = { "Cliente", "Método de pago", "Monto abonado" };

        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        tbLibro.setModel(modelo);
    }

    private void actualizarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tbLibro.getModel();
        modelo.setRowCount(0);

        for (int i = 0; i < servicioPagos.getContador(); i++) {
            Pago p = servicioPagos.getPago(i);

            Object[] fila = {
                p.getCliente(),
                p.getMetodoPago(),
                p.getMontoAbonado()
            };

            modelo.addRow(fila);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCliente = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLibro = new javax.swing.JTable();
        lblPrecio = new javax.swing.JLabel();
        txtMetodoPago = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        lblCodigo1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtMontoAbonado = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        tbLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbLibro);

        lblPrecio.setText("Cliente");

        txtMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetodoPagoActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblCodigo1.setText("Monto abonado");

        lblTitulo.setText("Metodo de pago");

        txtMontoAbonado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoAbonadoActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPrecio)
                .addGap(38, 38, 38)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblTitulo)
                        .addGap(28, 28, 28)
                        .addComponent(txtMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(lblCodigo1)
                        .addGap(27, 27, 27)
                        .addComponent(txtMontoAbonado, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnRegistrar)
                .addGap(67, 67, 67)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar1)
                .addGap(80, 80, 80)
                .addComponent(btnVolver)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo1)
                    .addComponent(txtMontoAbonado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnActualizar)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEliminar1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String cliente = txtCliente.getText();
        String metodo  = txtMetodoPago.getText();
        double monto   = 0;

        if (!txtMontoAbonado.getText().isEmpty()) {
            monto = Double.parseDouble(txtMontoAbonado.getText());
        }

        Pago p = new Pago(cliente, metodo, monto);
        servicioPagos.agregar(p);

        actualizarTabla();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetodoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetodoPagoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String cliente = txtCliente.getText();
        Pago p = servicioPagos.buscarPorCliente(cliente);

        if (p != null) {
            p.setMetodoPago(txtMetodoPago.getText());

            if (!txtMontoAbonado.getText().isEmpty()) {
                p.setMontoAbonado(Double.parseDouble(txtMontoAbonado.getText()));
            }
        }

        actualizarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtMontoAbonadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoAbonadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoAbonadoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
    new FrmVendedorP().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVendedorPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVendedorPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVendedorPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVendedorPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVendedorPagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbLibro;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtMetodoPago;
    private javax.swing.JTextField txtMontoAbonado;
    // End of variables declaration//GEN-END:variables
}

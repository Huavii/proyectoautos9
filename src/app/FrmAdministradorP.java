/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

/**
 *
 * @author Renato
 */
public class FrmAdministradorP extends javax.swing.JFrame {

    /**
     * Creates new form FrmAdministradorP
     */
    public FrmAdministradorP() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuEmpleados = new javax.swing.JMenu();
        jMenuVehiculos = new javax.swing.JMenu();
        jMenupPromociones = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Panel del Administrador");

        jMenuEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/employee_icon-icons.com_66882.png"))); // NOI18N
        jMenuEmpleados.setText("Empleados");
        jMenuEmpleados.setToolTipText("");
        jMenuEmpleados.setFocusable(false);
        jMenuEmpleados.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jMenuEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuEmpleadosMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuEmpleados);

        jMenuVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car_pickup_icon_138804.png"))); // NOI18N
        jMenuVehiculos.setText("Vehiculos");
        jMenuVehiculos.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jMenuVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuVehiculosMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuVehiculos);

        jMenupPromociones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discount_icon_151388.png"))); // NOI18N
        jMenupPromociones.setText("Promociones");
        jMenupPromociones.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jMenupPromociones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenupPromocionesMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenupPromociones);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit_icon-icons.com_48304.png"))); // NOI18N
        jMenu1.setText("Salir");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(254, 254, 254))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEmpleadosMouseClicked
    FrmAdministradorEmpleados frm = new FrmAdministradorEmpleados();
    frm.setLocationRelativeTo(null);
    frm.setVisible(true);
    }//GEN-LAST:event_jMenuEmpleadosMouseClicked

    private void jMenuVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVehiculosMouseClicked
    FrmAdministradorVehiculos frm = new FrmAdministradorVehiculos();
    frm.setLocationRelativeTo(null);
    frm.setVisible(true);
    }//GEN-LAST:event_jMenuVehiculosMouseClicked

    private void jMenupPromocionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenupPromocionesMouseClicked
    FrmAdministradorPromociones frm = new FrmAdministradorPromociones();
    frm.setLocationRelativeTo(null);
    frm.setVisible(true);
    }//GEN-LAST:event_jMenupPromocionesMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
    FrmMenuPrincipal frmLogin = new FrmMenuPrincipal();
    frmLogin.setVisible(true);
    this.dispose();  
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(FrmAdministradorP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdministradorP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdministradorP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdministradorP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdministradorP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuEmpleados;
    private javax.swing.JMenu jMenuVehiculos;
    private javax.swing.JMenu jMenupPromociones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

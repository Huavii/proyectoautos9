/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

/**
 *
 * @author Renato
 */
public class FrmVendedorP extends javax.swing.JFrame {

    /**
     * Creates new form FrmVendedorP
     */
    public FrmVendedorP() {
    initComponents();
    setLocationRelativeTo(null);

    // ACTIVAR MENÚS
    jMenuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jMenuClientesMouseClicked(evt);
        }
    });

    jMenuCotizaciones.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jMenuCotizacionesMouseClicked(evt);
        }
    });

    jMenuVentas.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jMenuVentasMouseClicked(evt);
        }
    });

    jMenuPagos.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jMenuPagosMouseClicked(evt);
        }
    });

    jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jMenuSalirMouseClicked(evt);
        }
    });
}
    
    private void jMenuClientesMouseClicked(java.awt.event.MouseEvent evt) {                                           
        new FrmVendedorClientes().setVisible(true);
        this.dispose();
    }                                          

    private void jMenuCotizacionesMouseClicked(java.awt.event.MouseEvent evt) {                                               
        new FrmVendedorCotizaciones().setVisible(true);
        this.dispose();
    }                                              

    private void jMenuVentasMouseClicked(java.awt.event.MouseEvent evt) {                                         
        new FrmVendedorVentas().setVisible(true);
        this.dispose();
    }                                        

    private void jMenuPagosMouseClicked(java.awt.event.MouseEvent evt) {                                        
        new FrmVendedorPagos().setVisible(true);
        this.dispose();
    }                                       

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {                                        
        new FrmMenuPrincipal().setVisible(true);
        this.dispose();
    }  
             
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuClientes = new javax.swing.JMenu();
        jMenuCotizaciones = new javax.swing.JMenu();
        jMenuVentas = new javax.swing.JMenu();
        jMenuPagos = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/employee_icon-icons.com_66882.png"))); // NOI18N
        jMenuClientes.setText("Clientes");
        jMenuClientes.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jMenuBar1.add(jMenuClientes);

        jMenuCotizaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contract_icon-icons.com_64813.png"))); // NOI18N
        jMenuCotizaciones.setText("Cotizaciones");
        jMenuCotizaciones.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jMenuBar1.add(jMenuCotizaciones);

        jMenuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sell_stock-48_46556.png"))); // NOI18N
        jMenuVentas.setText("Ventas");
        jMenuVentas.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jMenuBar1.add(jMenuVentas);

        jMenuPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pay_cash_payment_money_dollar_bill_icon_143267.png"))); // NOI18N
        jMenuPagos.setText("Pagos");
        jMenuPagos.setFocusable(false);
        jMenuPagos.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jMenuBar1.add(jMenuPagos);

        jMenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit_icon-icons.com_48304.png"))); // NOI18N
        jMenuSalir.setText("Salir");
        jMenuSalir.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmVendedorP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVendedorP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVendedorP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVendedorP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVendedorP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuCotizaciones;
    private javax.swing.JMenu jMenuPagos;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenu jMenuVentas;
    // End of variables declaration//GEN-END:variables
}

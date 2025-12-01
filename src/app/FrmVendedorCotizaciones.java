/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;


import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Vehiculo;
import modelo.Cotizacion;
import servicio.ArregloClientes;
import servicio.ArregloVehiculos;
import servicio.ArregloCotizaciones;
import servicio.DatosCompartidos;

public class FrmVendedorCotizaciones extends javax.swing.JFrame {

    private ArregloClientes servicioClientes;
    private ArregloVehiculos servicioVehiculos;
    private ArregloCotizaciones servicioCotizaciones;
    
    public FrmVendedorCotizaciones() {
        initComponents();
        setLocationRelativeTo(null);

        servicioClientes      = DatosCompartidos.ARREGLO_CLIENTES;
        servicioVehiculos     = DatosCompartidos.ARREGLO_VEHICULOS;
        servicioCotizaciones  = DatosCompartidos.ARREGLO_COTIZACIONES;

        configurarTablas();
        actualizarTablas();
    }
    
    private void configurarTablas() {
        // Clientes
        String[] cabClientes = {"DNI", "Nombres", "Ap. Paterno", "Ap. Materno"};
        tbClientes.setModel(new DefaultTableModel(null, cabClientes));

        // Vehículos
        String[] cabVehiculos = {"Código", "Marca", "Modelo", "Precio Base"};
        tbVehiculos.setModel(new DefaultTableModel(null, cabVehiculos));

        // Cotizaciones
        String[] cabCoti = {"N°", "DNI Cliente", "Vendedor", "Código Vehículo",
                            "Vehículo", "Monto Total"};
        tbCotizaciones.setModel(new DefaultTableModel(null, cabCoti));
    }

        private void actualizarTablas() {
        actualizarTablaClientes();
        actualizarTablaVehiculos();
        actualizarTablaCotizaciones();
    }

    private void actualizarTablaClientes() {
        DefaultTableModel modelo = (DefaultTableModel) tbClientes.getModel();
        modelo.setRowCount(0);

        for (int i = 0; i < servicioClientes.getContador(); i++) {
            Cliente c = servicioClientes.getCliente(i);

            Object[] fila = {
                c.getDni(),
                c.getNombres(),
                c.getApellidoPaterno(),
                c.getApellidoMaterno()
            };
            modelo.addRow(fila);
        }
    }

    private void actualizarTablaVehiculos() {
        DefaultTableModel modelo = (DefaultTableModel) tbVehiculos.getModel();
        modelo.setRowCount(0);

        for (int i = 0; i < servicioVehiculos.getContador(); i++) {
            Vehiculo v = servicioVehiculos.getVehiculo(i);

            Object[] fila = {
                v.getCodigo(),
                v.getMarca(),
                v.getModelo(),
                v.getPrecioBase()
            };
            modelo.addRow(fila);
        }
    }

    private void actualizarTablaCotizaciones() {
        DefaultTableModel modelo = (DefaultTableModel) tbCotizaciones.getModel();
        modelo.setRowCount(0);

        for (int i = 0; i < servicioCotizaciones.getContador(); i++) {
            Cotizacion c = servicioCotizaciones.getCotizacion(i);

            String dniCliente = c.getCliente().getDni();
            String vendedor   = "vendedor01"; 
            String codVeh     = c.getVehiculo().getCodigo();
            String descVeh    = c.getVehiculo().getMarca() + " " + c.getVehiculo().getModelo();
            double total      = c.getPrecioFinal();  

            Object[] fila = {
                c.getNumero(),
                dniCliente,
                vendedor,
                codVeh,
                descVeh,
                total
            };
            modelo.addRow(fila);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        lblCodigo1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVehiculos = new javax.swing.JTable();
        lblCodigo2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo3 = new javax.swing.JLabel();
        lblCodigo4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblCodigo5 = new javax.swing.JLabel();
        lblCodigo6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCotizaciones = new javax.swing.JTable();
        lblCodigo7 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbClientes);

        lblCodigo1.setText("Datos de los clientes:");

        tbVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbVehiculos);

        lblCodigo2.setText("Datos de los vehiculos:");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        lblCodigo3.setText("DNI:");

        lblCodigo4.setText("Seleccion Cliente:");

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        lblCodigo5.setText("Codigo:");

        lblCodigo6.setText("Seleccion Vehiculo:");

        tbCotizaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbCotizaciones);

        lblCodigo7.setText("Cotizaciones creadas:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(lblCodigo1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(lblCodigo2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblCodigo3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodigo6)
                            .addComponent(lblCodigo4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigo5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblCodigo7)
                                .addGap(273, 273, 273))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnVolver)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(674, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblCodigo1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblCodigo2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo4)
                    .addComponent(lblCodigo7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblCodigo3)
                        .addGap(53, 53, 53)
                        .addComponent(lblCodigo6)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEliminar)
                    .addComponent(btnVolver))
                .addGap(70, 70, 70))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(530, Short.MAX_VALUE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(278, 278, 278)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String dni    = txtDni.getText().trim();
        String codigo = txtCodigo.getText().trim();

        if (dni.isEmpty() || codigo.isEmpty()) {
            return; 
        }


        Cliente cliente = servicioClientes.buscarPorDni(dni);
        if (cliente == null) {
            return; 
        }

        Vehiculo vehiculo = servicioVehiculos.buscarPorCodigo(codigo);
        if (vehiculo == null) {
            return; 
        }


        double montoTotal = vehiculo.getPrecioBase();


        int numero = servicioCotizaciones.getContador() + 1;  

        Cotizacion c = new Cotizacion(
            numero,
            cliente,
            "Vendedor01",
            vehiculo,
            null,           
            montoTotal,     
            0,              
            montoTotal,     
            "Pendiente"
        );

        servicioCotizaciones.agregar(c);
        actualizarTablaCotizaciones();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        String dni    = txtDni.getText().trim();
        String codigo = txtCodigo.getText().trim();

        if (dni.isEmpty() || codigo.isEmpty()) {
            return;
        }

        servicioCotizaciones.eliminarPorClienteYVehiculo(dni, codigo);
        actualizarTablaCotizaciones();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new FrmVendedorP().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVendedorCotizaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVendedorCotizaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVendedorCotizaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVendedorCotizaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVendedorCotizaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCodigo3;
    private javax.swing.JLabel lblCodigo4;
    private javax.swing.JLabel lblCodigo5;
    private javax.swing.JLabel lblCodigo6;
    private javax.swing.JLabel lblCodigo7;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTable tbCotizaciones;
    private javax.swing.JTable tbVehiculos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}

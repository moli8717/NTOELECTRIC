
package ventanas;

public class ventanaPrincipal extends javax.swing.JFrame {

    
    public ventanaPrincipal() {
        initComponents();
          this.setLocationRelativeTo(null); // Centrar la ventana
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_modulo = new javax.swing.JLabel();
        b_cliente = new javax.swing.JButton();
        b_productos = new javax.swing.JButton();
        b_ventas = new javax.swing.JButton();
        b_almacen = new javax.swing.JButton();
        b_volver = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        b_email = new javax.swing.JButton();
        l_logo = new javax.swing.JLabel();
        L_fondo = new javax.swing.JLabel();
        m_var = new javax.swing.JMenuBar();
        m_opciones = new javax.swing.JMenu();
        op_acercade = new javax.swing.JMenuItem();
        op_abrir = new javax.swing.JMenuItem();
        op_guardar = new javax.swing.JMenuItem();
        op_salir = new javax.swing.JMenuItem();
        m_ayuda = new javax.swing.JMenu();
        acerca_de = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VENTANA NPRINCIPAL");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_modulo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        l_modulo.setText("MODULO ADMINISTRACION");
        getContentPane().add(l_modulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        b_cliente.setBackground(new java.awt.Color(102, 255, 102));
        b_cliente.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.png"))); // NOI18N
        b_cliente.setText("clientes");
        b_cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(b_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 160, 60));

        b_productos.setBackground(new java.awt.Color(102, 255, 102));
        b_productos.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.png"))); // NOI18N
        b_productos.setText("productos");
        b_productos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_productos.setMaximumSize(new java.awt.Dimension(151, 51));
        b_productos.setMinimumSize(new java.awt.Dimension(151, 51));
        b_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_productosActionPerformed(evt);
            }
        });
        getContentPane().add(b_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 160, 60));

        b_ventas.setBackground(new java.awt.Color(102, 255, 102));
        b_ventas.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        b_ventas.setText("ventas");
        b_ventas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_ventas.setMaximumSize(new java.awt.Dimension(151, 51));
        b_ventas.setMinimumSize(new java.awt.Dimension(151, 51));
        b_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ventasActionPerformed(evt);
            }
        });
        getContentPane().add(b_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 150, 60));

        b_almacen.setBackground(new java.awt.Color(102, 255, 102));
        b_almacen.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_almacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/almacen.png"))); // NOI18N
        b_almacen.setText("almacen");
        b_almacen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(b_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 150, 60));

        b_volver.setBackground(new java.awt.Color(102, 255, 102));
        b_volver.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        b_volver.setText("volver");
        b_volver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_volverActionPerformed(evt);
            }
        });
        getContentPane().add(b_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 110, 40));

        b_salir.setBackground(new java.awt.Color(102, 255, 102));
        b_salir.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        b_salir.setText("salir");
        b_salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });
        getContentPane().add(b_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 110, 40));

        b_email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/email.png"))); // NOI18N
        b_email.setText("Email");
        b_email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_emailActionPerformed(evt);
            }
        });
        getContentPane().add(b_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        l_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo verde.png"))); // NOI18N
        getContentPane().add(l_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 290, 100));

        L_fondo.setBackground(new java.awt.Color(51, 0, 204));
        L_fondo.setForeground(new java.awt.Color(51, 255, 204));
        L_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_principal.jpg"))); // NOI18N
        getContentPane().add(L_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1006, 400));

        m_opciones.setBackground(new java.awt.Color(51, 153, 0));
        m_opciones.setBorder(null);
        m_opciones.setForeground(new java.awt.Color(51, 51, 51));
        m_opciones.setText("opciones");
        m_opciones.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N

        op_acercade.setBackground(new java.awt.Color(51, 153, 0));
        op_acercade.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        op_acercade.setForeground(new java.awt.Color(51, 51, 51));
        op_acercade.setText("Acerca de");
        op_acercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_acercadeActionPerformed(evt);
            }
        });
        m_opciones.add(op_acercade);

        op_abrir.setBackground(new java.awt.Color(51, 153, 0));
        op_abrir.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        op_abrir.setText("abrir");
        m_opciones.add(op_abrir);

        op_guardar.setBackground(new java.awt.Color(51, 153, 0));
        op_guardar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        op_guardar.setText("guardar");
        m_opciones.add(op_guardar);

        op_salir.setBackground(new java.awt.Color(51, 153, 0));
        op_salir.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        op_salir.setText("slair");
        m_opciones.add(op_salir);

        m_var.add(m_opciones);

        m_ayuda.setBackground(new java.awt.Color(51, 153, 0));
        m_ayuda.setBorder(null);
        m_ayuda.setForeground(new java.awt.Color(51, 51, 51));
        m_ayuda.setText("ayuda");
        m_ayuda.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N

        acerca_de.setBackground(new java.awt.Color(51, 153, 0));
        acerca_de.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        acerca_de.setText("Acerca de");
        m_ayuda.add(acerca_de);

        m_var.add(m_ayuda);

        setJMenuBar(m_var);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_clienteActionPerformed
        ventanClientes clientes = new ventanClientes();
        clientes.setVisible(true);
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_b_clienteActionPerformed

    private void b_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_productosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_productosActionPerformed

    private void b_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ventasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_ventasActionPerformed

    private void op_acercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_acercadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_acercadeActionPerformed

    private void b_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volverActionPerformed
        login ventanaLogin = new login();
        ventanaLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b_volverActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        System.exit(0);   // TODO add your handling code here:
    }//GEN-LAST:event_b_salirActionPerformed

    private void b_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_emailActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_fondo;
    private javax.swing.JMenuItem acerca_de;
    private javax.swing.JButton b_almacen;
    private javax.swing.JButton b_cliente;
    private javax.swing.JButton b_email;
    private javax.swing.JButton b_productos;
    private javax.swing.JButton b_salir;
    private javax.swing.JButton b_ventas;
    private javax.swing.JButton b_volver;
    private javax.swing.JLabel l_logo;
    private javax.swing.JLabel l_modulo;
    private javax.swing.JMenu m_ayuda;
    private javax.swing.JMenu m_opciones;
    private javax.swing.JMenuBar m_var;
    private javax.swing.JMenuItem op_abrir;
    private javax.swing.JMenuItem op_acercade;
    private javax.swing.JMenuItem op_guardar;
    private javax.swing.JMenuItem op_salir;
    // End of variables declaration//GEN-END:variables
}

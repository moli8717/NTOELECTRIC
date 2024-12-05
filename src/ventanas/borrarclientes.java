
package ventanas;

import java.sql.ResultSet; 
import conexion.Conexiones;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement; 
import java.sql.SQLException;

public class borrarclientes extends javax.swing.JFrame {

    
    public borrarclientes() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_titulo = new javax.swing.JLabel();
        l_nombre = new javax.swing.JLabel();
        l_direccion = new javax.swing.JLabel();
        l_telefono = new javax.swing.JLabel();
        b_borrar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        l_id = new javax.swing.JLabel();
        t_idcliente = new javax.swing.JTextField();
        b_buscar = new javax.swing.JButton();
        l_nombrecliente = new javax.swing.JLabel();
        l_direccioncliente = new javax.swing.JLabel();
        l_telefonocliente = new javax.swing.JLabel();
        l_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BORRAR CLIENTES");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_titulo.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        l_titulo.setForeground(new java.awt.Color(255, 255, 255));
        l_titulo.setText("borrar cliente");
        getContentPane().add(l_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        l_nombre.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        l_nombre.setForeground(new java.awt.Color(255, 255, 255));
        l_nombre.setText("nombre");
        getContentPane().add(l_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        l_direccion.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        l_direccion.setForeground(new java.awt.Color(255, 255, 255));
        l_direccion.setText("direccion");
        getContentPane().add(l_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        l_telefono.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        l_telefono.setForeground(new java.awt.Color(255, 255, 255));
        l_telefono.setText("telefono");
        getContentPane().add(l_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        b_borrar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_borrar.setText("borrar");
        b_borrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_borrarActionPerformed(evt);
            }
        });
        getContentPane().add(b_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        b_cancelar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_cancelar.setText("cancelar");
        b_cancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        l_id.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        l_id.setForeground(new java.awt.Color(255, 255, 255));
        l_id.setText("id cliente");
        getContentPane().add(l_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 60, -1));
        getContentPane().add(t_idcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 60, -1));

        b_buscar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_buscar.setText("buscar");
        b_buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(b_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        l_nombrecliente.setText("jLabel1");
        getContentPane().add(l_nombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 60, -1));

        l_direccioncliente.setText("jLabel1");
        getContentPane().add(l_direccioncliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 60, -1));

        l_telefonocliente.setText("jLabel1");
        getContentPane().add(l_telefonocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 70, -1));

        l_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo proyecto.jpg"))); // NOI18N
        getContentPane().add(l_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_borrarActionPerformed
               
    }//GEN-LAST:event_b_borrarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed

        new ventanClientes().setVisible(true); 
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed
    
    }//GEN-LAST:event_b_buscarActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new borrarclientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_borrar;
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JLabel l_direccion;
    private javax.swing.JLabel l_direccioncliente;
    private javax.swing.JLabel l_fondo;
    private javax.swing.JLabel l_id;
    private javax.swing.JLabel l_nombre;
    private javax.swing.JLabel l_nombrecliente;
    private javax.swing.JLabel l_telefono;
    private javax.swing.JLabel l_telefonocliente;
    private javax.swing.JLabel l_titulo;
    private javax.swing.JTextField t_idcliente;
    // End of variables declaration//GEN-END:variables
}

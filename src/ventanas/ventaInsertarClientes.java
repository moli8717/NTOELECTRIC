
package ventanas;

import conexion.Conexiones;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement; 
import java.sql.SQLException;

public class ventaInsertarClientes extends javax.swing.JFrame {

    
    public ventaInsertarClientes() {
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
        t_nombre = new javax.swing.JTextField();
        t_direccion = new javax.swing.JTextField();
        t_telefono = new javax.swing.JTextField();
        b_insertar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        l_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INSERTAR CLIENTES");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_titulo.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        l_titulo.setForeground(new java.awt.Color(255, 255, 255));
        l_titulo.setText("insertar cliente");
        getContentPane().add(l_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        l_nombre.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        l_nombre.setForeground(new java.awt.Color(255, 255, 255));
        l_nombre.setText("nombre");
        getContentPane().add(l_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        l_direccion.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        l_direccion.setForeground(new java.awt.Color(255, 255, 255));
        l_direccion.setText("direccion");
        getContentPane().add(l_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        l_telefono.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        l_telefono.setForeground(new java.awt.Color(255, 255, 255));
        l_telefono.setText("telefono");
        getContentPane().add(l_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));
        getContentPane().add(t_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 120, -1));
        getContentPane().add(t_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 180, -1));
        getContentPane().add(t_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 120, -1));

        b_insertar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_insertar.setText("insertar");
        b_insertar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_insertarActionPerformed(evt);
            }
        });
        getContentPane().add(b_insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        b_cancelar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_cancelar.setText("cancelar");
        b_cancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        l_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo proyecto.jpg"))); // NOI18N
        getContentPane().add(l_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_insertarActionPerformed
        String nombre =t_nombre.getText().trim();//trim elimina los espacios
        String direccion = t_direccion.getText().trim();
        String telefono = t_telefono.getText().trim();
        
        Conexiones conexion = new Conexiones();
        Connection con = conexion.conectar();
        
        String sql = "insert into clientes(nombre, direccion, telefono)values(?,?,?)";
        if(nombre.isEmpty()||direccion.isEmpty()||telefono.isEmpty()){
            JOptionPane.showConfirmDialog(null,"debe llenar todos los datos","advertencia", 
                    JOptionPane.WARNING_MESSAGE);
            return;
        }try {
            PreparedStatement insertar = con.prepareStatement(sql);
            insertar.setString(1, nombre);
            insertar.setString(2, direccion);
            insertar.setString(3, telefono);
            
            int resultado = insertar.executeUpdate();
                    if(resultado >0){
                        JOptionPane.showConfirmDialog(null,"cliente insertado correctamente","aviso",
                                JOptionPane.INFORMATION_MESSAGE);
                         
                        
                    }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null,"error en el ensert"+e.getMessage());
        }
       
                
    }//GEN-LAST:event_b_insertarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        dispose();
        new ventanClientes().setVisible(true); 
    }//GEN-LAST:event_b_cancelarActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventaInsertarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_insertar;
    private javax.swing.JLabel l_direccion;
    private javax.swing.JLabel l_fondo;
    private javax.swing.JLabel l_nombre;
    private javax.swing.JLabel l_telefono;
    private javax.swing.JLabel l_titulo;
    private javax.swing.JTextField t_direccion;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_telefono;
    // End of variables declaration//GEN-END:variables
}

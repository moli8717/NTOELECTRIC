
package ventanas;

import java.sql.ResultSet; 
import conexion.Conexiones;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement; 
import java.sql.SQLException;

public class ventaActualizarCliente extends javax.swing.JFrame {

    
    public ventaActualizarCliente() {
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
        b_actualizar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        l_id = new javax.swing.JLabel();
        t_idcliente = new javax.swing.JTextField();
        b_buscar = new javax.swing.JButton();
        l_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INSERTAR CLIENTES");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_titulo.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        l_titulo.setForeground(new java.awt.Color(255, 255, 255));
        l_titulo.setText("actualizar cliente");
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
        getContentPane().add(t_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 120, -1));

        t_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_direccionActionPerformed(evt);
            }
        });
        getContentPane().add(t_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 180, -1));
        getContentPane().add(t_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 120, -1));

        b_actualizar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_actualizar.setText("actualizar");
        b_actualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(b_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

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

        l_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo proyecto.jpg"))); // NOI18N
        getContentPane().add(l_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_actualizarActionPerformed
      String idcliente = t_idcliente.getText().trim();
      String nombre = t_nombre.getText().trim();
      String direccion = t_direccion.getText().trim();
      String telefono = t_telefono.getText().trim();
                if (idcliente.isEmpty()||nombre.isEmpty()||direccion.isEmpty()||telefono.isEmpty()){
                    JOptionPane.showMessageDialog(null,"cliente no encontrado","AVISO",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                Connection con = Conexiones.conectar();       
               // String verficacliente = "select count(*) from clientes where id_cliente=?";
                String actualizar = "update clientes set nombre=?, dereccion=?, telefono=? where id_cliente=?";
                
                try {
            PreparedStatement verificar = con.prepareStatement(actualizar);
            verificar.setInt(1,Integer.parseInt(idcliente));
            ResultSet resultado = verificar.executeQuery();
            resultado.next();
            int existe = resultado.getInt(1);
            
                  if(existe>0) {
                      try {
                      PreparedStatement p_actualizar =  con.prepareStatement(actualizar);
                      p_actualizar.setString(1, nombre);
                      p_actualizar.setString(2, direccion);
                      p_actualizar.setString(3, telefono);
                      p_actualizar.setInt(4, Integer.parseInt(idcliente));
                      
                    int actualizacion = p_actualizar.executeUpdate();
                    if(actualizacion>0){
                          JOptionPane.showMessageDialog(null, "cliente actualizado corectamente");
                          t_nombre.setText("");//limpiamos los campos luego de actualizar
                          t_direccion.setText("");
                          t_telefono.setText("");
                          t_idcliente.setText("");
                          
                      }else{
                          JOptionPane.showMessageDialog(null,"error al actualizar cliente", "aviso",
                                  JOptionPane.WARNING_MESSAGE);
                      }
                        
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null,"error actualizando cliente","error",
                                JOptionPane.ERROR_MESSAGE);
                    }}
            
            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"error actualizando cliente","error",
                                JOptionPane.ERROR_MESSAGE);
        }
                
                
    }//GEN-LAST:event_b_actualizarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed

        new ventanClientes().setVisible(true); 
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void t_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_direccionActionPerformed

    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed
     String idcliente = t_idcliente.getText();
     if(idcliente.isEmpty()){
         JOptionPane.showConfirmDialog(null,"debe ingresar el id del cliente","alesta",
                 JOptionPane.INFORMATION_MESSAGE);
         return;
         
     }
     String sql = " select nombre,direccion, telefono from clientes where id_cliente = ?";
     Connection con = Conexiones.conectar();
     
        try {
            PreparedStatement consulta = con.prepareStatement(sql);
            consulta.setInt(1,Integer.parseInt(idcliente));
            ResultSet resultado = consulta.executeQuery();
            
            if(resultado.next()) {
                t_nombre.setText(resultado.getString("nombre"));
                t_direccion.setText(resultado.getString("direccion"));
                t_telefono.setText(resultado.getString("telefono"));

            }else{
                JOptionPane.showMessageDialog(null, "cliente no encontrado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro"+e.getMessage());
        }
    }//GEN-LAST:event_b_buscarActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new ventaActualizarCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_actualizar;
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JLabel l_direccion;
    private javax.swing.JLabel l_fondo;
    private javax.swing.JLabel l_id;
    private javax.swing.JLabel l_nombre;
    private javax.swing.JLabel l_telefono;
    private javax.swing.JLabel l_titulo;
    private javax.swing.JTextField t_direccion;
    private javax.swing.JTextField t_idcliente;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_telefono;
    // End of variables declaration//GEN-END:variables
}

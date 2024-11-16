
package ventanas;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import conexion.Conexiones;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
  

public class login extends javax.swing.JFrame {

    
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png"));
        setIconImage(icono);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_logo = new javax.swing.JLabel();
        L_usuario = new javax.swing.JLabel();
        L_pasword = new javax.swing.JLabel();
        E_id = new javax.swing.JTextField();
        E_pasword = new javax.swing.JPasswordField();
        B_ingreso = new javax.swing.JButton();
        B_salir = new javax.swing.JButton();
        L_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO DE USUARIO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        getContentPane().add(L_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 240, 230));

        L_usuario.setText("ingrese su asuario:");
        getContentPane().add(L_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        L_pasword.setText("ingrese su pasword:");
        getContentPane().add(L_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));
        getContentPane().add(E_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 120, -1));
        getContentPane().add(E_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 120, -1));

        B_ingreso.setBackground(new java.awt.Color(51, 255, 51));
        B_ingreso.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        B_ingreso.setText("acceder");
        B_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ingresoActionPerformed(evt);
            }
        });
        getContentPane().add(B_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        B_salir.setBackground(new java.awt.Color(51, 204, 0));
        B_salir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        B_salir.setText("salir");
        B_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_salirActionPerformed(evt);
            }
        });
        getContentPane().add(B_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 470, 90, -1));

        L_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_login.jpg"))); // NOI18N
        getContentPane().add(L_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int intentos=0;
    private void B_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ingresoActionPerformed
        // TODO add your handling code here:
         Connection conexion = Conexiones.conectar();
        String usuario = E_id.getText();
        String clave = new String(E_pasword.getPassword());
        PreparedStatement consulta;
        ResultSet resultado;
        int control=0;
        if (E_id.getText().isEmpty()||new String(E_pasword.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null,"no deben haber campos vacios", "errror",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
             String sql = "SELECT * FROM usuarios WHERE nombre_usuario=? AND clave=?";
        consulta = conexion.prepareStatement(sql);
        consulta.setString(1, usuario);
        consulta.setString(2, clave);
        resultado = consulta.executeQuery();
        
             if (resultado.next()) {
               JOptionPane.showMessageDialog(null, "Login correcto", "Login", 
                       JOptionPane.INFORMATION_MESSAGE);
            
            } else {
                 intentos ++;
              JOptionPane.showMessageDialog(null, "Usuario/contraseña incorrecta"+" Intente de nuevo.", " Error", 
                      JOptionPane.ERROR_MESSAGE);
              E_id.setText("");
              E_pasword.setText("");
            }
             if (intentos==3){
                JOptionPane.showMessageDialog(null,
                        "cantidad de intentos agotada\n"+
                                                 " su cuenta a sido bloqueada\n"+ 
                                         " contacte con soporte",
                                             "  aviso",
                        JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_B_ingresoActionPerformed

    private void B_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_salirActionPerformed
         int respuesta=JOptionPane.showConfirmDialog(null, "confrima salir de la aplicacion\n",
                 "confirma salida",
                 JOptionPane.YES_NO_OPTION,
                  JOptionPane.QUESTION_MESSAGE);
         if (respuesta == JOptionPane.YES_OPTION){
             System.exit(0);
         }
    }//GEN-LAST:event_B_salirActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_ingreso;
    private javax.swing.JButton B_salir;
    private javax.swing.JTextField E_id;
    private javax.swing.JPasswordField E_pasword;
    private javax.swing.JLabel L_fondo;
    private javax.swing.JLabel L_logo;
    private javax.swing.JLabel L_pasword;
    private javax.swing.JLabel L_usuario;
    // End of variables declaration//GEN-END:variables
}

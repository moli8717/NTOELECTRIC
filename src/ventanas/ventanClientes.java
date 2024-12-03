package ventanas;
import conexion.Conexiones;
import java.sql.*;
import java.sql.Connection;          
import java.sql.DriverManager;       
import java.sql.PreparedStatement;   
import java.sql.ResultSet;           
import java.sql.SQLException;        
import javax.swing.JOptionPane;      
import javax.swing.JTable;           
import javax.swing.table.DefaultTableModel; 
import javax.swing.table.DefaultTableCellRenderer; 

public class ventanClientes extends javax.swing.JFrame {

      public ventanClientes() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        Mostrar("clientes");
    }
    Conexiones conexion = new Conexiones();

    public void Mostrar(String tabla) {
    String sql = "SELECT * FROM " + tabla;
    Connection Con = conexion.conectar();

    if (Con == null) {
        System.out.println("Error: No se pudo establecer conexión con la base de datos.");
        return;
    }

    DefaultTableModel modelo = new DefaultTableModel(
        new Object[][]{},
        new String[]{"id_cliente", "nombre", "direccion", "telefono"}
    ) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    tabla1.setModel(modelo);
    for (int i = 0; i < tabla1.getColumnCount(); i++) {
        tabla1.getColumnModel().getColumn(i).setResizable(false);
    }

    String[] datos = new String[4];
    try {
        Statement consulta = Con.createStatement();
        ResultSet resultado = consulta.executeQuery(sql);
        while (resultado.next()) {
            datos[0] = resultado.getString(1);
            datos[1] = resultado.getString(2);
            datos[2] = resultado.getString(3);
            datos[3] = resultado.getString(4);
            modelo.addRow(datos);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al ejecutar la consulta: " + e.getMessage());
    }
        centrarTexto(tabla1);
}public void centrarTexto(JTable tabla) {
    DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
    centrado.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
    for (int i = 0; i < tabla.getColumnCount(); i++) {
        tabla.getColumnModel().getColumn(i).setCellRenderer(centrado);
    }
}  

public void Buscar_id_cliente(){
    String idCliente = t_idcliente.getText();
        if (idCliente.isEmpty()){
        JOptionPane.showInputDialog(null,"ingrese ID del cliente","aviso",
                JOptionPane. WARNING_MESSAGE);
        return;
    }
        String sql = "select * from clientes where id_cliente = ?";
        DefaultTableModel modelo = (DefaultTableModel)tabla1.getModel();
        modelo.setRowCount(0);
        try {
        Connection con =conexion.conectar();
       PreparedStatement consulta = con.prepareStatement(sql);
        consulta.setString(1, idCliente);
        ResultSet resultado = consulta.executeQuery();
        
        if (resultado.next()){
            String[] datos = {
                resultado.getString("Id_cliente"),
                resultado.getString("Nombre"),
                resultado.getString("Direccion"),
                resultado.getString("Telefono"),
            };
            modelo.addRow(datos);
          
        }else{
            JOptionPane.showConfirmDialog(this,"CLIENTE NO EXISTRE","RESULTADO DE BUSQUEDA",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"ERROR:"+e.getMessage(),"error",JOptionPane.ERROR_MESSAGE);
        
    }

}

public void Buscar_nombre() {
    String Nombrecliente = t_nombre.getText();
    if(Nombrecliente.isEmpty()){
        JOptionPane.showMessageDialog(null,"debe ingresar nombre de usuario o id","aviso",
                JOptionPane.WARNING_MESSAGE);
        return;
    }
    String sql ="select * from clientes where nombre like ?";
    DefaultTableModel modelo = (DefaultTableModel)tabla1.getModel();
    modelo.setRowCount(0);
    try {
        Connection con =conexion.conectar();
        PreparedStatement consulta = con.prepareStatement(sql);
        consulta. setString(1,"%"+Nombrecliente+"%");
        ResultSet resultado = consulta.executeQuery();
        boolean encontrado= false;

        while (resultado.next()) {
        String[] datos= {
            resultado.getString("id_cliente"),
            resultado.getString("nombre"),
            resultado.getString("direccion"),
            resultado.getString("telefono"),
        };
         modelo.addRow(datos);
         encontrado=true;
        }
    if (!encontrado){
    JOptionPane.showMessageDialog(this,"cliente no encontrado","reultado",
            JOptionPane.INFORMATION_MESSAGE);
        }
        
    } catch (Exception e) {
       JOptionPane.showConfirmDialog(null,"error en la busqueda","resultado",
 JOptionPane.WARNING_MESSAGE);
    }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_logo = new javax.swing.JLabel();
        b_buscar = new javax.swing.JButton();
        b_insertar = new javax.swing.JButton();
        b_actualizar = new javax.swing.JButton();
        t_nombre = new javax.swing.JTextField();
        t_idcliente = new javax.swing.JTextField();
        l_idcliente = new javax.swing.JLabel();
        l_nombre = new javax.swing.JLabel();
        b_borrar = new javax.swing.JButton();
        j_tabla1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        b_volver = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        l_clientea = new javax.swing.JLabel();
        l_fonfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo verde.png"))); // NOI18N
        getContentPane().add(l_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        b_buscar.setBackground(new java.awt.Color(102, 255, 102));
        b_buscar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        b_buscar.setText("buscar");
        b_buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(b_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 110, 40));

        b_insertar.setBackground(new java.awt.Color(102, 255, 102));
        b_insertar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_insertar.setText("Insertar");
        b_insertar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(b_insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 110, 40));

        b_actualizar.setBackground(new java.awt.Color(102, 255, 102));
        b_actualizar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_actualizar.setText("Actualizar");
        b_actualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(b_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 110, 40));

        t_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(t_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, 120, -1));

        t_idcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_idclienteActionPerformed(evt);
            }
        });
        getContentPane().add(t_idcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 130, 80, -1));

        l_idcliente.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        l_idcliente.setText("id cliente");
        getContentPane().add(l_idcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, -1, -1));

        l_nombre.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        l_nombre.setText("nombre");
        getContentPane().add(l_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, -1, -1));

        b_borrar.setBackground(new java.awt.Color(102, 255, 102));
        b_borrar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_borrar.setText("Borrar");
        b_borrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_borrarActionPerformed(evt);
            }
        });
        getContentPane().add(b_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 110, 40));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        j_tabla1.setViewportView(tabla1);

        getContentPane().add(j_tabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 810, 210));

        b_volver.setBackground(new java.awt.Color(102, 255, 102));
        b_volver.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        b_volver.setText("volver");
        b_volver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_volverActionPerformed(evt);
            }
        });
        getContentPane().add(b_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 110, 40));

        b_salir.setBackground(new java.awt.Color(102, 255, 102));
        b_salir.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        b_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        b_salir.setText("salir");
        b_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });
        getContentPane().add(b_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 560, 110, 40));

        l_clientea.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        l_clientea.setText("Modulo Clientes");
        getContentPane().add(l_clientea, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, -1));

        l_fonfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_clientes.jpg"))); // NOI18N
        l_fonfo.setText("jLabel1");
        l_fonfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(l_fonfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1160, 619));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volverActionPerformed
        ventanaPrincipal ventanaPrincipal = new ventanaPrincipal();
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b_volverActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
       System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_b_salirActionPerformed

    private void b_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_borrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_borrarActionPerformed

    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed

 if (!t_idcliente.getText().isEmpty()){
            
           Buscar_id_cliente(); 
        }else if (!t_nombre.getText().isEmpty()){
            Buscar_nombre();
        }else{
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR NOMBRE O ID DEL CLIENTE","AVISO",
                    JOptionPane.WARNING_MESSAGE);
        }

        
    }//GEN-LAST:event_b_buscarActionPerformed

    private void t_idclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_idclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_idclienteActionPerformed

    private void t_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(ventanClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_actualizar;
    private javax.swing.JButton b_borrar;
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_insertar;
    private javax.swing.JButton b_salir;
    private javax.swing.JButton b_volver;
    private javax.swing.JScrollPane j_tabla1;
    private javax.swing.JLabel l_clientea;
    private javax.swing.JLabel l_fonfo;
    private javax.swing.JLabel l_idcliente;
    private javax.swing.JLabel l_logo;
    private javax.swing.JLabel l_nombre;
    private javax.swing.JTextField t_idcliente;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables

}
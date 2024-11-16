
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexiones {
    private static final String url = "jdbc:mysql://localhost:3306/produccion?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String usuario = "root";
    private static final String pass = "Aa089520·";
    
    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(url, usuario, pass);
            System.out.println("Conexión correcta a MySQL");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return conexion;
    }

    public static void main(String[] args) {
        Conexiones test = new Conexiones();
        test.conectar();
    }
}


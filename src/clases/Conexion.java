package clases;

import java.sql.*;

public class Conexion {

    //Conexion Local - Configurar contraseña localmente
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/bd_ds", 
                    "data_user", 
                    "data123"
            );
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión local " + e);
        }
        return (null);
    }
}

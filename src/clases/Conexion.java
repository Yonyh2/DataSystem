package clases;

import java.sql.*;

public class Conexion {

    //Conexion Local
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds", "root", "MyContraseñaSQL1981@");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión local " + e);
        }
        return (null);
    }
}

package pruebas; // Asegúrate de que el paquete sea el correcto según tu estructura.

import com.empresa.modulo.dao.conexiondb; // Importa la clase de conexión.
import java.sql.Connection;
import java.sql.SQLException;

public class prueba {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            // Intentar establecer una conexión
            conexion = conexiondb.conectar();
            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
            }
        } catch (SQLException e) {
            // Mostrar el error si ocurre
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        } finally {
            // Asegúrate de cerrar la conexión después de usarla
            if (conexion != null) {
                try {
                    conexion.close();
                    System.out.println("Conexión cerrada correctamente.");
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
}

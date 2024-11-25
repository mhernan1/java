package pruebas;

import com.empresa.modulo.modelo.usuario; // Importar la clase Usuario

public class main {
    public static void main(String[] args) {
        // Crear una instancia de Usuario
        usuario usuario = new usuario(1, "Juan Pérez", "juan.perez@example.com");

        // Mostrar los valores de Usuario
        System.out.println("ID: " + usuario.getId());
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Correo: " + usuario.getCorreo());
    }
}

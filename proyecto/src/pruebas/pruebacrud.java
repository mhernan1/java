package pruebas;

import com.empresa.modulo.dao.operacionescrud;
import com.empresa.modulo.modelo.usuario;

import java.util.List;

public class pruebacrud {
    public static void main(String[] args) {
        operacionescrud crud = new operacionescrud();


        usuario nuevoUsuario = new usuario(0, "Juan Pérez", "juan.perez@example.com");
        boolean insercion = crud.insertarusuario(nuevoUsuario);
        System.out.println("Usuario insertado: " + insercion);

        List<usuario> listaUsuarios = crud.obtenerusuarios();
        System.out.println("Lista de usuarios:");
        for (usuario u : listaUsuarios) {
            System.out.println("ID: " + u.getId() + ", Nombre: " + u.getNombre() + ", Correo: " + u.getCorreo());
        }


        if (!listaUsuarios.isEmpty()) {
            usuario usuarioExistente = listaUsuarios.get(0);
            usuarioExistente.setNombre("Juan Actualizado");
            usuarioExistente.setCorreo("juan.actualizado@example.com");
            boolean actualizacion = crud.actualizarusuario(usuarioExistente);
            System.out.println("Usuario actualizado: " + actualizacion);
        }


        if (!listaUsuarios.isEmpty()) {
            int idAEliminar = listaUsuarios.get(0).getId();
            boolean eliminacion = crud.eliminarusuario(idAEliminar);
            System.out.println("Usuario eliminado: " + eliminacion);
        }

        listaUsuarios = crud.obtenerusuarios();
        System.out.println("Lista de usuarios después de eliminar:");
        for (usuario u : listaUsuarios) {
            System.out.println("ID: " + u.getId() + ", Nombre: " + u.getNombre() + ", Correo: " + u.getCorreo());
        }
    }
}

package com.empresa.modulo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.empresa.modulo.modelo.usuario;


public class operacionescrud {

    public boolean insertarusuario(usuario usuario) {
        String sql = "INSERT INTO usuarios_ecommerce (nombre, correo) VALUES (?, ?)";
        try (Connection conn = conexiondb.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getCorreo());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<usuario> obtenerusuarios() {
        List<usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios_ecommerce";
        try (Connection conn = conexiondb.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                usuario usuario = new usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("correo"));
                lista.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean actualizarusuario(usuario usuario) {
        String sql = "UPDATE usuarios_ecommerce SET nombre = ?, correo = ? WHERE id = ?";
        try (Connection conn = conexiondb.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getCorreo());
            stmt.setInt(3, usuario.getId());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean eliminarusuario(int id) {
        String sql = "DELETE FROM usuarios_ecommerce WHERE id = ?";
        try (Connection conn = conexiondb.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

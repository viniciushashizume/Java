package com.projeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BDUsuario {

    // CREATE (Adicionar)
    public void adicionarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome_usuario, senha) VALUES (?, ?)";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, usuario.getNomeUsuario());
            pstmt.setString(2, usuario.getSenha());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            // Em uma aplicação real, um tratamento de erro mais robusto seria necessário
            System.out.println(e.getMessage());
        }
    }

    // READ (Buscar)
    public Usuario buscarPorNomeUsuario(String nomeUsuario) {
        String sql = "SELECT * FROM usuarios WHERE nome_usuario = ?";
        Usuario usuario = null;

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nomeUsuario);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    usuario = new Usuario(
                        rs.getString("nome_usuario"),
                        rs.getString("senha")
                    );
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return usuario;
    }

    // UPDATE (Atualizar)
    public void atualizarUsuario(String nomeUsuario, Usuario novoUsuario) {
        String sql = "UPDATE usuarios SET senha = ? WHERE nome_usuario = ?";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, novoUsuario.getSenha());
            pstmt.setString(2, nomeUsuario); // Usa o nome de usuário original para encontrar o registro
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // DELETE (Remover)
    public void removerUsuario(String nomeUsuario) {
        String sql = "DELETE FROM usuarios WHERE nome_usuario = ?";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nomeUsuario);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
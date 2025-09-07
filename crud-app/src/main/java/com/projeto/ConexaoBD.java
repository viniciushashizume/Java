package com.projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static final String URL = "jdbc:mysql://localhost:3306/projeto_login";
    private static final String USUARIO = "root";
    private static final String SENHA = "1234"; // <-- MUDE AQUI PARA A SUA SENHA

    public static Connection conectar() {
        try {
            // Tenta estabelecer a conexão
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            // Lança uma exceção em caso de falha na conexão
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }
}
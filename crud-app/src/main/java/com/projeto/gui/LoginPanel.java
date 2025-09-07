package com.projeto.gui; 

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {
    private LoginAppGUI mainApp;
    private JTextField nomeUsuarioField;
    private JPasswordField senhaField;

    public LoginPanel(LoginAppGUI mainApp) {
        this.mainApp = mainApp;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel tituloLabel = new JLabel("Login");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 16));

        nomeUsuarioField = new JTextField(15);
        senhaField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");
        JButton voltarButton = new JButton("Voltar");

        loginButton.addActionListener(e -> fazerLogin());
        voltarButton.addActionListener(e -> mainApp.mostrarPainel("menu"));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(tituloLabel, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 1;
        add(new JLabel("Nome de Usuário:"), gbc);

        gbc.gridx = 1;
        add(nomeUsuarioField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Senha:"), gbc);

        gbc.gridx = 1;
        add(senhaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(loginButton, gbc);

        gbc.gridx = 1;
        add(voltarButton, gbc);
    }

    private void fazerLogin() {
        String nomeUsuario = nomeUsuarioField.getText();
        String senha = new String(senhaField.getPassword());

        if (mainApp.getUsuarioServico().fazerLogin(nomeUsuario, senha)) {
            JOptionPane.showMessageDialog(this, "Login bem-sucedido. Bem-vindo, " + nomeUsuario + "!");
            nomeUsuarioField.setText("");
            senhaField.setText("");
            mainApp.mostrarPainel("menu");
        } else {
            JOptionPane.showMessageDialog(this, "Nome de usuário ou senha incorretos.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
        }
    }
}
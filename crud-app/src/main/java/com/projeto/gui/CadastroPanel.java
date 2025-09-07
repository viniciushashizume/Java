package com.projeto.gui; 

import javax.swing.*;
import java.awt.*;

public class CadastroPanel extends JPanel {
    private LoginAppGUI mainApp;
    private JTextField nomeUsuarioField;
    private JPasswordField senhaField;

    public CadastroPanel(LoginAppGUI mainApp) {
        this.mainApp = mainApp;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel tituloLabel = new JLabel("Cadastro de Usuário");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 16));

        nomeUsuarioField = new JTextField(15);
        senhaField = new JPasswordField(15);
        JButton cadastrarButton = new JButton("Cadastrar");
        JButton voltarButton = new JButton("Voltar");

        cadastrarButton.addActionListener(e -> cadastrarUsuario());
        voltarButton.addActionListener(e -> mainApp.mostrarPainel("menu"));

        // Adicionando componentes ao painel com GridBagLayout
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
        add(cadastrarButton, gbc);

        gbc.gridx = 1;
        add(voltarButton, gbc);
    }

    private void cadastrarUsuario() {
        String nomeUsuario = nomeUsuarioField.getText();
        String senha = new String(senhaField.getPassword());

        if (nomeUsuario.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (mainApp.getUsuarioServico().cadastrarUsuario(nomeUsuario, senha)) {
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
            nomeUsuarioField.setText("");
            senhaField.setText("");
            mainApp.mostrarPainel("menu");
        } else {
            JOptionPane.showMessageDialog(this, "Nome de usuário já existe. Tente outro.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
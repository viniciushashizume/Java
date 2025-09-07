package com.projeto.gui; 

import javax.swing.*;
import java.awt.*;

public class AtualizarSenhaPanel extends JPanel {
    private LoginAppGUI mainApp;
    private JTextField nomeUsuarioField;
    private JPasswordField novaSenhaField;

    public AtualizarSenhaPanel(LoginAppGUI mainApp) {
        this.mainApp = mainApp;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel tituloLabel = new JLabel("Atualizar Senha");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 16));

        nomeUsuarioField = new JTextField(15);
        novaSenhaField = new JPasswordField(15);
        JButton atualizarButton = new JButton("Atualizar");
        JButton voltarButton = new JButton("Voltar");

        atualizarButton.addActionListener(e -> atualizarSenha());
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
        add(new JLabel("Nova Senha:"), gbc);

        gbc.gridx = 1;
        add(novaSenhaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(atualizarButton, gbc);

        gbc.gridx = 1;
        add(voltarButton, gbc);
    }

    private void atualizarSenha() {
        String nomeUsuario = nomeUsuarioField.getText();
        String novaSenha = new String(novaSenhaField.getPassword());

        if (nomeUsuario.isEmpty() || novaSenha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (mainApp.getUsuarioServico().atualizarSenha(nomeUsuario, novaSenha)) {
            JOptionPane.showMessageDialog(this, "Senha atualizada com sucesso!");
            nomeUsuarioField.setText("");
            novaSenhaField.setText("");
            mainApp.mostrarPainel("menu");
        } else {
            JOptionPane.showMessageDialog(this, "Usuário não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
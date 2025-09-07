package com.projeto.gui; // <-- RENAMED HERE

import javax.swing.*;
import java.awt.*;

public class RemoverContaPanel extends JPanel {
    private LoginAppGUI mainApp;
    private JTextField nomeUsuarioField;

    public RemoverContaPanel(LoginAppGUI mainApp) {
        this.mainApp = mainApp;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel tituloLabel = new JLabel("Remover Conta");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 16));

        nomeUsuarioField = new JTextField(15);
        JButton removerButton = new JButton("Remover");
        JButton voltarButton = new JButton("Voltar");

        removerButton.addActionListener(e -> removerConta());
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
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(removerButton);
        buttonPanel.add(voltarButton);
        add(buttonPanel, gbc);
    }

    private void removerConta() {
        String nomeUsuario = nomeUsuarioField.getText();

        if (nomeUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, digite o nome de usuário.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja remover a conta de " + nomeUsuario + "?",
                "Confirmação de Remoção",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            if (mainApp.getUsuarioServico().removerConta(nomeUsuario)) {
                JOptionPane.showMessageDialog(this, "Conta removida com sucesso!");
                nomeUsuarioField.setText("");
                mainApp.mostrarPainel("menu");
            } else {
                JOptionPane.showMessageDialog(this, "Usuário não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
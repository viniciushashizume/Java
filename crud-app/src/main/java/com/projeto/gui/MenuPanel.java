package com.projeto.gui; // 

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    private LoginAppGUI mainApp;

    public MenuPanel(LoginAppGUI mainApp) {
        this.mainApp = mainApp;
        setLayout(new GridLayout(5, 1, 10, 10)); // 5 linhas, 1 coluna, espaçamento de 10px
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Adiciona uma margem

        JButton cadastrarButton = new JButton("Cadastrar");
        JButton loginButton = new JButton("Login");
        JButton atualizarSenhaButton = new JButton("Atualizar Senha");
        JButton removerContaButton = new JButton("Remover Conta");
        JButton sairButton = new JButton("Sair");

        // Ações dos botões para navegar para os painéis correspondentes
        cadastrarButton.addActionListener(e -> mainApp.mostrarPainel("cadastro"));
        loginButton.addActionListener(e -> mainApp.mostrarPainel("login"));
        atualizarSenhaButton.addActionListener(e -> mainApp.mostrarPainel("atualizar"));
        removerContaButton.addActionListener(e -> mainApp.mostrarPainel("remover"));
        sairButton.addActionListener(e -> System.exit(0));

        add(cadastrarButton);
        add(loginButton);
        add(atualizarSenhaButton);
        add(removerContaButton);
        add(sairButton);
    }
}
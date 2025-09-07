package com.projeto.gui;

import com.projeto.BDUsuario;
import com.projeto.UsuarioServico;

import javax.swing.*;
import java.awt.*;

public class LoginAppGUI extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private UsuarioServico usuarioServico;

    public LoginAppGUI() {
        BDUsuario repositorio = new BDUsuario();
        this.usuarioServico = new UsuarioServico(repositorio);

        setTitle("Sistema de Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        MenuPanel menuPanel = new MenuPanel(this);
        CadastroPanel cadastroPanel = new CadastroPanel(this);
        LoginPanel loginPanel = new LoginPanel(this);
        AtualizarSenhaPanel atualizarSenhaPanel = new AtualizarSenhaPanel(this);
        RemoverContaPanel removerContaPanel = new RemoverContaPanel(this);

        mainPanel.add(menuPanel, "menu");
        mainPanel.add(cadastroPanel, "cadastro");
        mainPanel.add(loginPanel, "login");
        mainPanel.add(atualizarSenhaPanel, "atualizar");
        mainPanel.add(removerContaPanel, "remover");

        add(mainPanel);

        cardLayout.show(mainPanel, "menu");
    }

    public void mostrarPainel(String nome) {
        cardLayout.show(mainPanel, nome);
    }

    public UsuarioServico getUsuarioServico() {
        return usuarioServico;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginAppGUI app = new LoginAppGUI();
            app.setVisible(true);
        });
    }
}
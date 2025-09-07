package com.projeto;

// src/main/java/LoginApp.java
import java.util.Scanner;

public class LoginApp {
    private UsuarioServico usuarioServico;
    private Scanner scanner;

    public LoginApp(UsuarioServico usuarioServico) {
        this.usuarioServico = usuarioServico;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("--- Menu de Login ---");
            System.out.println("1. Cadastrar");
            System.out.println("2. Login");
            System.out.println("3. Atualizar Senha");
            System.out.println("4. Remover Conta");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opcao: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    cadastrarUsuario();
                    break;
                case "2":
                    fazerLogin();
                    break;
                case "3":
                    atualizarSenha();
                    break;
                case "4":
                    removerConta();
                    break;
                case "5":
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }

    private void cadastrarUsuario() {
        System.out.print("Digite o nome de usuario: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (usuarioServico.cadastrarUsuario(nomeUsuario, senha)) {
            System.out.println("Usuario cadastrado com sucesso!");
        } else {
            System.out.println("Nome de usuario ja existe. Tente outro.");
        }
    }

    private void fazerLogin() {
        System.out.print("Digite o nome de usuario: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (usuarioServico.fazerLogin(nomeUsuario, senha)) {
            System.out.println("Login bem-sucedido. Bem-vindo, " + nomeUsuario + "!");
        } else {
            System.out.println("Nome de usuario ou senha incorretos.");
        }
    }

    private void atualizarSenha() {
        System.out.print("Digite o nome de usuario para atualizar a senha: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite a nova senha: ");
        String novaSenha = scanner.nextLine();

        if (usuarioServico.atualizarSenha(nomeUsuario, novaSenha)) {
            System.out.println("Senha atualizada com sucesso!");
        } else {
            System.out.println("Usuario nao encontrado.");
        }
    }

    private void removerConta() {
        System.out.print("Digite o nome de usuario para remover a conta: ");
        String nomeUsuario = scanner.nextLine();

        if (usuarioServico.removerConta(nomeUsuario)) {
            System.out.println("Conta removida com sucesso!");
        } else {
            System.out.println("Usuario nao encontrado.");
        }
    }

    public static void main(String[] args) {
        BDUsuario repositorio = new BDUsuario();
        UsuarioServico servico = new UsuarioServico(repositorio);
        LoginApp app = new LoginApp(servico);
        app.exibirMenu();
    }
}
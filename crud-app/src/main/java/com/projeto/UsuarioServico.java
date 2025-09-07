package com.projeto;

// src/main/java/UsuarioServico.java
public class UsuarioServico {
    private BDUsuario usuarioRepositorio;

    public UsuarioServico(BDUsuario usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public boolean cadastrarUsuario(String nomeUsuario, String senha) {
        if (usuarioRepositorio.buscarPorNomeUsuario(nomeUsuario) == null) {
            Usuario novoUsuario = new Usuario(nomeUsuario, senha);
            usuarioRepositorio.adicionarUsuario(novoUsuario);
            return true;
        }
        return false;
    }

    public boolean fazerLogin(String nomeUsuario, String senha) {
        Usuario usuario = usuarioRepositorio.buscarPorNomeUsuario(nomeUsuario);
        return usuario != null && usuario.getSenha().equals(senha);
    }

    public boolean atualizarSenha(String nomeUsuario, String novaSenha) {
        Usuario usuarioExistente = usuarioRepositorio.buscarPorNomeUsuario(nomeUsuario);
        if (usuarioExistente != null) {
            Usuario usuarioAtualizado = new Usuario(nomeUsuario, novaSenha);
            usuarioRepositorio.atualizarUsuario(nomeUsuario, usuarioAtualizado);
            return true;
        }
        return false;
    }

    public boolean removerConta(String nomeUsuario) {
        if (usuarioRepositorio.buscarPorNomeUsuario(nomeUsuario) != null) {
            usuarioRepositorio.removerUsuario(nomeUsuario);
            return true;
        }
        return false;
    }
}
package Exercicios.JavaCRUD;

import java.util.ArrayList;
import java.util.List;

public class BDUsuario {
    private List<Usuario> usuarios;

    public BDUsuario() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarPorNomeUsuario(String nomeUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNomeUsuario().equals(nomeUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    public void atualizarUsuario(String nomeUsuario, Usuario novoUsuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNomeUsuario().equals(nomeUsuario)) {
                usuarios.set(i, novoUsuario);
                return;
            }
        }
    }

    public void removerUsuario(String nomeUsuario) {
        usuarios.removeIf(usuario -> usuario.getNomeUsuario().equals(nomeUsuario));
    }
}
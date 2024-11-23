package listas.Lista5_Ex2;

import java.util.List;
import java.util.ArrayList;

public class biblioteca {
    private List<livro> livros;

    public biblioteca() {
        this.livros = new ArrayList<livro>();
    }

    public void adicionarLivro(String nome, String autor)
    {
        livro livronovo = new livro(nome, autor);
        this.livros.add(livronovo);
        System.out.println("Livro adicionado");
    }

    public void emprestarLivroBiblioteca(String nome, int diaEmprestado)
    {
        for(livro livronovo : livros)
        {
            if(livronovo.getNome() == nome)
            {
                livronovo.emprestar(diaEmprestado);
            }
        }
    }

    public void devolverLivroBiblioteca(String nome, int diaDevolucao)
    {
        for(livro livronovo : livros)
        {
            if(livronovo.getNome() == nome)
            {
                livronovo.devolver(diaDevolucao);
            }
        }
    }

    
}

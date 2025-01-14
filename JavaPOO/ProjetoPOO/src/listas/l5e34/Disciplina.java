package listas.l5e34;
import java.util.List;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private List<Aluno> alunos;

    
    public Disciplina(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(String nome, int ra)
    {
        Aluno aluno = new Aluno(nome, ra);
        this.alunos.add(aluno);

    }

    public void adicionarNotaAluno(int ra, double nota)
    {
        for(Aluno aluno : alunos)
        {
            if(aluno.getRA()== ra)
            {
                aluno.adicionarNota(nota);
            }
        }
        
    }



    


}

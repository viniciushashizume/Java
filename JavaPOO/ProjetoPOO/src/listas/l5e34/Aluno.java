package listas.l5e34;
import java.util.List;
import java.util.ArrayList;

public class Aluno {

    private String nome;
    private int RA;
    private List<Double> notas;
    private static double soma;
    public Aluno(String nome, int rA) {
        this.nome = nome;
        RA = rA;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota)
    {
        notas.add(nota);
    }

    public double calcularMedia()
    {
        for(double nota : notas)
        {
            soma+=nota;
        }
        return soma/notas.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int rA) {
        RA = rA;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public static double getSoma() {
        return soma;
    }

    /*public static void setSoma(double soma) {
        Aluno.soma = soma;
    }*/

    



}

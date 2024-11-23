package listas.Lista5_Ex2;

public class livro {
    private String nome;
    private String autor;
   // private int diaEmprestimo;
    private boolean estado;
    private static double taxa;
    private static int diaEmprestimo;

    public livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
        //this.diaEmprestimo = diaEmprestimo;
        this.estado = false;
    }

    public void emprestar(int dia)
    {
        if(this.estado == true)
            System.out.println("Nao é possivel emprestar o livro");
        else{
            this.estado = true;
            diaEmprestimo = dia;
            System.out.println("Livro emprestado!");
        }
    }

    public void devolver(int diaDevolucao)
    {
        if(this.estado == false)
            System.out.println("Nao é possivel devolver o livro");
        else{
            this.estado = false;
            System.out.println("Livro devolvido!");
            calculartaxa(diaDevolucao);
        }
    }

    public void calculartaxa(int diaDevolucao)
    {
        if((diaDevolucao-diaEmprestimo) <= 7)
        {
            System.out.println("Nenhuma taxa será aplicada");
        }else{
            taxa = ((diaDevolucao-diaEmprestimo)-7) * 1.5;
            System.out.println("Prazo de devolução excedido, deve pagar " + taxa + " de taxa");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }
}

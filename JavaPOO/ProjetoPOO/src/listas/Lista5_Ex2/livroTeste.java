package listas.Lista5_Ex2;

public class livroTeste {
    public static void main(String[] args) {
        //livro livro1 = new livro("a", "d", 2);
        biblioteca utfpr = new biblioteca();
        utfpr.adicionarLivro("Memorias postuma", "Machado de Assis");
        utfpr.emprestarLivroBiblioteca("Memorias postuma", 3);
        utfpr.devolverLivroBiblioteca("Memorias postuma", 12);
        /*livro1.emprestar();
        livro1.devolver(10);*/
    }





}

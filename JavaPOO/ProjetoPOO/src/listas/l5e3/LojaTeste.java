package listas.l5e3;

public class LojaTeste {
    public static void main(String[] args) {
        Loja loja1 = new Loja();
        loja1.adicionarProduto(1, "batata", 4);
        loja1.adicionarProduto(1, "batata", 4);
        loja1.adicionarProduto(1, "batata", 4);
        loja1.adicionarProduto(1, "batata", 4);
        loja1.imprimir();
        loja1.adicionarProduto(2, "couve", 5);
        loja1.adicionarProduto(2, "couve", 5);
        loja1.imprimir();

    }
}

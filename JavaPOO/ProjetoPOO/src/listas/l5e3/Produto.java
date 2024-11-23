package listas.l5e3;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidadeEstoque;
    private double precoUnitario;

    public Produto(int codigo, String nome, double precoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEstoque = 1;
        this.precoUnitario = precoUnitario;
    }

    public void atualizarEstoque()
    {
        this.quantidadeEstoque++;
    }

    public void adicionarEstoque(int quantidade)
    {
        this.quantidadeEstoque += quantidade;
    }

    public void vender(int quantidade)
    {
        if(quantidadeEstoque >= quantidade)
        {
            quantidadeEstoque -= quantidade;
        }else{
            System.out.println("A quantidade para venda solicitada é maior do que a quantidade em estoque");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void imprimirEstoque() {
        System.out.println("Quantidade em estoque: " + this.quantidadeEstoque);
    }
}

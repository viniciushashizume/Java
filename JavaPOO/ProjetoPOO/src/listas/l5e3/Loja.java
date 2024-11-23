package listas.l5e3;
import java.util.List;
import java.util.ArrayList;

public class Loja {
    private List<Produto> produtos;

    public Loja() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(int codigo, String nome, double precoUnitario) {
        if(verificarEstoque(codigo))
            System.out.println("Produto com o código " + codigo + " já está registrado. Estoque atualizado.");
        //verificarEstoque(codigo);
        else{
            System.out.println("Produto com o codigo " + codigo + " registrado.");
            Produto produto = new Produto(codigo, nome, precoUnitario);
            //System.out.println("Test");
            this.produtos.add(produto);
        }
        
    }

    public boolean verificarEstoque(int codigo)
    {
        for(Produto produto : produtos)
        {
            if(produto.getCodigo() == codigo)
            {
                //System.out.println("Não é possível registrar, pois o produto já está registrado");
                produto.atualizarEstoque();
                return true;
            }
        }
        return false;
    }

    public void adicionarEstoqueLoja(int codigo, int quantidade)
    {
        for (Produto produto : produtos)
        {
            if(produto.getCodigo() == codigo)
            {
                produto.adicionarEstoque(quantidade);
            }
        }
    }

    public void imprimir()
    {
        for(Produto produto : produtos)
        {
            produto.imprimirEstoque();
        }
    }

    

}

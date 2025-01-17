package listas.aula16_2;

public class ImovelUsaDO extends Imovel {
    private double valorDesconto;

    public ImovelUsaDO(String endereco, double valorBase, double valorDesconto) {
        super(endereco, valorBase);
        this.valorDesconto = valorDesconto;
    }

    public void imprimir()
    {
        System.out.println("Valor final: " + (valorBase-valorDesconto));
    }
    
  

}

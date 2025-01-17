package listas.aula16_2;

public class ImovelNovo extends Imovel{

    private double valorAdicional;

    public ImovelNovo(String endereco, double valorBase, double valorAdicional) {
        super(endereco, valorBase);
        this.valorAdicional = valorAdicional;
    }

    public void imprimir()
    {
        System.out.println("Valor final: " + (valorBase+valorAdicional));
    }
    

}

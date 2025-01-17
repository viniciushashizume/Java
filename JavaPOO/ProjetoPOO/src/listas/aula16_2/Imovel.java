package listas.aula16_2;

public class Imovel {
    protected String endereco;
    protected double valorBase;

    public Imovel(String endereco, double valorBase) {
        this.endereco = endereco;
        this.valorBase = valorBase;
    }
    
    public void imprimir()
    {
        System.out.println("Endereco: " + endereco + " Valor Base: " + valorBase);
    }
}

package listas.aula17;

public abstract class FormaGeometrica {

    protected String cor;

    public FormaGeometrica(String cor) {
        this.cor = cor;
    }

    protected abstract double calcularArea();
    protected abstract double calcularPerimetro();

    public void imprimirDados()
    {
        System.out.println("Cor: " + this.cor);
    }

}

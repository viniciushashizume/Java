package listas.aula16;

public class Retangulo extends Quadrilatero {
    private double altura;
    private double largura;
    

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }


    public double calcularArea()
    {
        return altura*largura;
    }

}

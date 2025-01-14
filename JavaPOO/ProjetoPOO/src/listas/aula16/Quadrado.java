package listas.aula16;

public class Quadrado extends Quadrilatero {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea()
    {
        return lado*lado;
    }
}

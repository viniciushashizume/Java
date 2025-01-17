package listas.aula17;

public class Quadrado extends FormaGeometrica{
    private double lado;

    public Quadrado(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    @Override
    protected double calcularArea() {
        return lado * lado;
    }

    @Override
    protected double calcularPerimetro() {
        return 4 * lado;
    }
    
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Area: " + calcularArea());
        System.out.println("Area: " + calcularPerimetro());
    }
}

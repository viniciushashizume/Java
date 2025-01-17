package listas.aula17;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    protected double calcularArea() {
        return 3.14 * raio * raio;
    }

    @Override
    protected double calcularPerimetro() {
        return 2 * 3.14 * raio;
    }
    
    public void imprimirDados()
    {
        super.imprimirDados();
        System.out.println("Area: " + calcularArea());
        System.out.println("Area: " + calcularPerimetro());
    }


}

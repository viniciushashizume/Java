package listas.aula17;

public class FormaGeometricaTeste {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = null;
        String opcao = "Quadrado";

        switch (opcao) {
            case "Circulo":
                formaGeometrica = new Circulo("Azul", 3);
                break;
            case "Quadrado":
                formaGeometrica = new Quadrado("Azul", 3);
            default:
                break;
        }
        formaGeometrica.calcularArea();
        formaGeometrica.calcularPerimetro();
        formaGeometrica.imprimirDados();

    }

}

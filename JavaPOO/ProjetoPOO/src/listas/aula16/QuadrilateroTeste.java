package listas.aula16;

public class QuadrilateroTeste {
    public static void main(String[] args) {
        Quadrilatero quadrilatero = null;
        String opcao = "Retangulo";

        switch (opcao) {
            case "Quadrado":
                quadrilatero = new Quadrado(3);
                break;
        
            case "Retangulo":
                quadrilatero = new Retangulo(3, 5.4);
            default:
                break;
        }
        System.out.println(quadrilatero.calcularArea());
        
    }

}

package listas.aula16_2;

public class ImovelTeste {
    public static void main(String[] args) {
        Imovel imovel = new Imovel("RUA 1", 1200);
        String opcao = "Novo";

        switch (opcao) {
            case "Novo":
                imovel = new ImovelNovo("RUA 1", 1200, 500);
                break;
            case "Usado":
                imovel = new ImovelUsaDO("RUA 1", 1200, 300);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        imovel.imprimir();
    }
}


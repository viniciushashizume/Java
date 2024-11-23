package listas.Lista5_Ex1;

public class bancoTeste {
    public static void main(String[] args) {
        banco banco1 = new banco("UTF Bank", "44445");

		banco1.adicionarNovaConta(111, "João da Silva");
		banco1.adicionarNovaConta(222, "Maria de Oliveira");
		banco1.adicionarNovaConta(333, "Ricardo Carvalho");

		banco1.imprimir();
        banco1.depositarConta(111, 2000);
        banco1.imprimir();

    }
}

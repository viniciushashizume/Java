package listas.Lista5_Ex1;

public class contaBancaria {
    private int numeroConta;
    private double saldo;
    private String nomeTitular;

    public contaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void sacar(double valor)
    {
        if(valor > this.saldo)
            System.out.println("Nao é possivel sacar esse valor");
        else{
            this.saldo -= valor;
        }
    }

    public void depositar(double valor)
    {
        this.saldo += valor;
    }

    public void imprimirSaldo() {

		System.out.println("===============================");
		System.out.println("Número da Conta: " + this.numeroConta);
		//System.out.println("Nome do Titular: " + this.titular);
		System.out.println("Saldo: R$" + this.saldo);
	}

    
}

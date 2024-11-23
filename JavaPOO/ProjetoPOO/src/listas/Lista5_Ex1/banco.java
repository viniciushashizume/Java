package listas.Lista5_Ex1;

import java.util.List;
import java.util.ArrayList;


public class banco {

    private String nome;
    private String cnpj;
    private List<contaBancaria> contas;
    public banco(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = new ArrayList<contaBancaria>();
    }
    public void adicionarNovaConta(int numeroConta, String nomeTitular) {

		contaBancaria conta = new contaBancaria(numeroConta, nomeTitular);
		this.contas.add(conta);
		System.out.println("Conta " + numeroConta + " criada com sucesso.");
	}

    public void depositarConta(int numeroConta, double valor)
    {
        for(contaBancaria conta : contas )
        {
            if(conta.getNumeroConta() == numeroConta)
            {
                conta.depositar(valor);
            }
        }
    }

    public void imprimir(){
        for(contaBancaria conta : contas)
        {
            conta.imprimirSaldo();
        }
    }
    public String getNome() {
        return nome;
    }
    public String getCnpj() {
        return cnpj;
    }
        
    

}

package projetos;
import java.util.Scanner;

public class EX03 {

    public double somar(double num1, double num2){
        return num1+num2;
    }
    public double subtracao(double num1, double num2){
        return num1-num2;
    }   
    public double multiplicacao(double num1, double num2){
        return num1*num2;
    }
    public double divisao(double num1, double num2){
        if(num2 == 0)
        {
            System.out.println("divisão impossível de ser realizada");
        }
        return num1/num2;
    }
    public static void main(String[] args) {
        EX03 funcao = new EX03();
        Scanner input = new Scanner(System.in);
        int op;

        do {
            System.out.println("Digite o primeiro numero: ");
            double num1 = input.nextDouble();
            System.out.println("Digite o segundo numero: ");
            double num2 = input.nextDouble();
            System.out.println("Qual operação deseja fazer? 1- Soma | 2- Subtração | 3- Multiplicação | 4- Divisão | 0- Sair: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Resultado: " + funcao.somar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + funcao.subtracao(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + funcao.multiplicacao(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado: " + funcao.divisao(num1, num2));
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (op >= 1 && op <= 4);
        input.close();
    }
}
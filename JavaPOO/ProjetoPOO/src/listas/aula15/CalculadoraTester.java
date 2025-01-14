package listas.aula15;
import java.util.ArrayList;

public class CalculadoraTester {
    public static void main(String []args)
    {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(45);
        numeros.add(222);
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(21, 1));
        System.out.println(calculadora.somar(2.6, 0.4));
        System.out.println(calculadora.somar(numeros));

        
    }

}

package listas.aula15;
import java.util.ArrayList;

public class Calculadora {

    public int somar(int numero1, int numero2)
    {
        return numero1+numero2;
    }

    public double somar(double numero1, double numero2)
    {
        return numero1+numero2;
    }

    public int somar(ArrayList<Integer> numeros)
    {
        int soma=0;
        for(int numero : numeros)
        {
            soma+=numero;
        }
        return soma;
    }

}

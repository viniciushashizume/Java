package listas.ex04;

public class calculadora {
    String marca;
    String modelo;
    boolean estado;

    public calculadora (String marca, String modelo, boolean estado)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
    }

    public String getmarca()
    {
        return marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public boolean getEstado()
    {
        return estado;
    }

    /*public void setEstado()
    {
        this.estado = estado;
    }*/

    public void ligar()
    {
        this.estado = true;
    }

    public void desligar()
    {
        this.estado = false;
    }
    
    public double soma (double num1, double num2)
    {
        return num1+num2;
    }
    public double subtracao (double num1, double num2)
    {
        return num1-num2;
    }
    public double multiplicacao (double num1, double num2)
    {
        return num1*num2;
    }
    public double divisao (double num1, double num2)
    {
        return num1/num2;
    }


}

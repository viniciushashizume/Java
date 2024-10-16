package listas.ex04;

public class ex01 {

    public class Calculadora {
        String marca;
        String modelo;
        boolean estado;
    
        public Calculadora(String marca, String modelo, boolean estado) {
            this.marca = marca;
            this.modelo = modelo;
            this.estado = estado;
        }
    
        public String getMarca() {
            return marca;
        }
    
        public String getModelo() {
            return modelo;
        }
    
        public boolean getEstado() {
            return estado;
        }
    
        public void setEstado(boolean estado) {
            this.estado = estado;
        }
    
        public void ligar() {
            this.estado = true;
        }
    
        public void desligar() {
            this.estado = false;
        }
        
        public double soma(double num1, double num2) {
            if(this.estado == true){
                return num1 + num2;
            }else{
                 System.out.println("Não foi possível executar a operação, a calculadora está desligada");
                 return 0;
            }
            
        }

        public double subtracao(double num1, double num2) {
            if(this.estado == true){
                return num1 - num2;
            }else{
                 System.out.println("Não foi possível executar a operação, a calculadora está desligada");
                 return 0;
            }
            
        }

        public double multiplicacao(double num1, double num2) {
            if(this.estado == true){
                return num1 * num2;
            }else{
                 System.out.println("Não foi possível executar a operação, a calculadora está desligada");
                 return 0;
            }
        }

        public double divisao(double num1, double num2) {
            if(this.estado == true){
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Divisão por zero não permitida.");
                }
                return num1 * num2;
            }else{
                 System.out.println("Não foi possível executar a operação, a calculadora está desligada");
                 return 0;
            }
        }
            
    }
    
    
    public static void main(String[] args) {
        
        ex01 ex = new ex01();
        Calculadora calculadora1 = ex.new Calculadora("Casio", "FX-82MS", false);
        
        calculadora1.ligar();
        System.out.println("Estado da calculadora: " + calculadora1.getEstado());
        System.out.println("5 + 3 = " + calculadora1.soma(5, 3));
        calculadora1.desligar();
        System.out.println("Estado da calculadora: " + calculadora1.getEstado());
        System.out.println("5 + 3 = " + calculadora1.soma(5, 3));
    }
}

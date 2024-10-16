package listas;

public class ex03 {
    
    public class notebook{
        String marca;
        String modelo;
        double polegadas;
        String processador;
        boolean estado;
        String est;

        public notebook (String marca, String modelo, double polegadas,String processador, boolean estado)
        {
            this.marca = marca;
            this.modelo = modelo;
            this.polegadas = polegadas;
            this.processador = processador;
            this.estado = false;
        }
        public boolean getEstado()
        {
            return estado;
        }

        public void ligar()
        {
            this.estado = true;
            System.out.println("O notebook foi ligado");
        }

        public void desligar()
        {
            this.estado = false;
            System.out.println("O notebook foi desligado");
        }

        public void print()
        {
            if(estado == true)
                est = "O notebook está ligado";
                else{
                    est = "O notebook está desligado";
                }
            System.out.println("Marca: " + marca + " Modelo " + modelo + " Polegadas: " + polegadas + " Processador " + processador + " Estado " + est);
        }
    }

    public static void main(String[] args) {
        ex03 ex = new ex03();
        notebook note1 = ex.new notebook ("DELL", "A322-DDS", 17.9, "RYZEN2223", false);
        note1.print();
        note1.ligar();
        note1.print();

    }
}

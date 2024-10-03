package projetos;

public class EX05 {
    public static class caneta{
        private String marca;
        private String cor;
        private double tamanho;

        public caneta(String marca, String cor, double tamanho)
        {
            this.marca = marca;
            this.cor = cor;
            this.tamanho = tamanho;
        }

        public String getMarca()
        {
            return marca;
        }

        public void setMarca(String marca)
        {
            this.marca = marca;
        }

        public String getCor ()
        {
            return cor;
        }

        public void setCor (String cor)
        {
            this.cor = cor;
        }

        public double getTamanho()
        {
            return tamanho;
        }

        public void setTamanho(double tamanho)
        {
            if (tamanho>=0)
                this.tamanho = tamanho;
        }

        public String toString()
        {
            return "Marca: " + marca + "| Cor: " + cor + "| Tamanho: " + tamanho;
        }

    }
    public static void main(String[] args){

        caneta c1 = new caneta("BIC", "Azul", 5.0);
        System.out.println(c1);


    }
}

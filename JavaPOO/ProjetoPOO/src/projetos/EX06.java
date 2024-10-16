package projetos;

public class EX06 {

    public class lampada{
        private String cor;
        private double voltagem;
        private boolean estado;

        public lampada (String cor, double voltagem, boolean estado)
        {
            this.cor = cor;
            this.voltagem = voltagem;
            this.estado = estado;
        }

        public String getCor() 
        {
            return cor;
        }

        public double getVoltagem()
        {
            return voltagem;
        }

        public boolean getEstado()
        {
            return estado;
        }

        public void setEstado()
        {
            this.estado=estado;
        }

        public void ligar()
        {
            this.estado = true;
        }

        public void desligar()
        {
            this.estado = false;
        }

        


    }

    public static void main(String[] args) {
        
    }
    
}

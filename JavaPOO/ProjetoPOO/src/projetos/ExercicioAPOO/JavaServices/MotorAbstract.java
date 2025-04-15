package projetos.ExercicioAPOO.JavaServices;

public abstract class MotorAbstract {
    protected int rpm;
    protected String fabricante;
    protected String voltagem;
    protected boolean status;

    public MotorAbstract(String fabricante, String voltagem) {
        this.fabricante = fabricante;
        this.voltagem = voltagem;
        this.rpm = 0;
        this.status = false;
    }

    public void ligar() {
        status = true;
        rpm = 1000;
    }

    public void desligar() {
        status = false;
        rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    public boolean isStatus() {
        return status;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public abstract void aumentarVelocidade();
    public abstract void reduzirVelocidade();
}

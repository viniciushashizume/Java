package projetos.ExercicioAPOO.JavaServices;

public class MotorExtendido extends MotorAbstract {
    private static final int RPM_MAX = 7000;
    private static final int RPM_STEP = 500;

    public MotorExtendido(String fabricante, String voltagem) {
        super(fabricante, voltagem);
    }

    @Override
    public void aumentarVelocidade() {
        if (status && rpm + RPM_STEP <= RPM_MAX) {
            rpm += RPM_STEP;
        }
    }

    @Override
    public void reduzirVelocidade() {
        if (status && rpm - RPM_STEP >= 0) {
            rpm -= RPM_STEP;
        }
    }
}
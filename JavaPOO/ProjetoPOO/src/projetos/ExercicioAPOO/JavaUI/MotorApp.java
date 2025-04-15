package projetos.ExercicioAPOO.JavaUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import JavaServices.MotorExtendido;
 
public class MotorApp extends Application {

    private MotorExtendido motor = new MotorExtendido("Yamaha", "220V");
    private Label statusLabel = new Label("Status: Desligado");
    private Label rpmLabel = new Label("RPM: 0");

    @Override
    public void start(Stage primaryStage) {
        Button ligarBtn = new Button("Ligar Motor");
        Button desligarBtn = new Button("Desligar Motor");
        Button aumentarBtn = new Button("Aumentar Velocidade");
        Button reduzirBtn = new Button("Reduzir Velocidade");

        ligarBtn.setOnAction(e -> {
            motor.ligar();
            atualizarStatus();
        });

        desligarBtn.setOnAction(e -> {
            motor.desligar();
            atualizarStatus();
        });

        aumentarBtn.setOnAction(e -> {
            motor.aumentarVelocidade();
            atualizarStatus();
        });

        reduzirBtn.setOnAction(e -> {
            motor.reduzirVelocidade();
            atualizarStatus();
        });

        VBox layout = new VBox(10, statusLabel, rpmLabel, ligarBtn, desligarBtn, aumentarBtn, reduzirBtn);
        layout.setStyle("-fx-padding: 20px; -fx-alignment: center;");

        Scene scene = new Scene(layout, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Simulador de Motor");
        primaryStage.show();
    }

    private void atualizarStatus() {
        statusLabel.setText("Status: " + (motor.isLigado() ? "Ligado" : "Desligado"));
        rpmLabel.setText("RPM: " + motor.getRpm());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
package SD.Exercicio1_2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {
public static void main(String[] args) {
        // Garante que a interface gráfica seja executada na thread de eventos da AWT
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                criarEExibirGUI();
            }
        });
    }

    private static void criarEExibirGUI() {
        // --- CONFIGURAÇÃO DA JANELA PRINCIPAL (JFrame) ---
        JFrame frame = new JFrame("Simulação Cliente/Servidor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null); // Centralizar na tela

        // --- PAINEL PARA ORGANIZAR COMPONENTES ---
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        // --- COMPONENTES DA INTERFACE ---
        JLabel labelInstrucao = new JLabel("Digite a mensagem para o servidor:");
        JTextField campoInput = new JTextField(20); // Caixa de texto para o cliente digitar
        JButton botaoEnviar = new JButton("Enviar Mensagem");
        JLabel labelResultado = new JLabel("Resposta do Servidor: "); // Rótulo para exibir o resultado

        // Adiciona um pouco de estilo ao rótulo de resultado
        labelResultado.setFont(new Font("Arial", Font.BOLD, 14));

        // --- LÓGICA DA APLICAÇÃO ---

        // 1. Instância do nosso servidor. Ele fica "esperando" a chamada.
        Servidor servidor = new Servidor();

        // 2. Adiciona a ação que será executada quando o botão for clicado.
        botaoEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 3. Pega a mensagem digitada pelo usuário no campo de input.
                String textoEntrada = campoInput.getText();

                // 4. Cria uma instância do Cliente com a mensagem.
                Cliente cliente = new Cliente(textoEntrada);

                // 5. Envia a mensagem do cliente para o servidor e recebe a resposta.
                // Esta linha executa a mesma lógica do seu arquivo Teste.java
                String respostaServidor = servidor.receberMensagem(cliente.getMensagem());

                // 6. Atualiza o rótulo de resultado com a resposta.
                labelResultado.setText("Resposta do Servidor: " + respostaServidor);
            }
        });


        // --- ADICIONA OS COMPONENTES AO PAINEL ---
        panel.add(labelInstrucao);
        panel.add(campoInput);
        panel.add(botaoEnviar);
        panel.add(labelResultado);

        // Adiciona o painel à janela
        frame.add(panel);

        // Torna a janela visível
        frame.setVisible(true);
    }
}

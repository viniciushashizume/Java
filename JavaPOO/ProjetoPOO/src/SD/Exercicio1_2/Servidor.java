package SD.Exercicio1_2;

public class Servidor {

	public Servidor() {
		super();
	}
	
	public String receberMensagem(String mensagem) {
		
		String novaMensagem = mensagem.toUpperCase();
		//System.out.println(mensagem);
		return novaMensagem;
	}
}

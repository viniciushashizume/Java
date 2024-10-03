package projetos;

public class EX04 {
    public static class pessoa{
        String nome;
        int idade;
        double peso;

        public void print()
        {
            System.out.println("Nome: " + nome + " Idade: " + idade + " Peso: " + peso);
        }

    }
   public static void main(String[] args)
   {
      pessoa obj = new pessoa();
      obj.nome = "AAAAAA";
      obj.idade = 15;
      obj.peso = 11.3;
      obj.print();
   } 
}
package execoes;

public class Exemplo2 {

	public static void main(String[] args) {
		
		try {
			
			int idade = 20;
			if(idade < 18) {
				throw new Exception("Idade inválida!");
			}
			
		}catch(Exception e) {
			System.out.println("Erro: "+e.getMessage());
			
			
		}

		System.out.println("o sistema continua");
		
	}

}

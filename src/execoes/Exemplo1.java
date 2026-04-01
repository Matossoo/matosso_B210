package execoes;

public class Exemplo1 {

	public static void main(String[] args) {
		
		try {
			
			int resultado = 223 / 0;
			System.out.println(resultado);
			
		}catch(Exception e) {
			
			System.out.println("Ocorreu um erro: ");
			System.out.println("Mensagem: "+ e.getMessage());
			System.out.println("Detalhes do erro: ");
			e.printStackTrace();
			
		}finally {
			
			System.out.println("Bloco finally executado!");
			
		}
	}
}

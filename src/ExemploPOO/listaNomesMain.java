package ExemploPOO;

public class listaNomesMain {

	public static void main(String[] args) {
		
		listaNomes ln = new listaNomes();
		
		ln.adicionarNome("martins gay");
		ln.adicionarNome("martins bixa");
		ln.adicionarNome("martins hetero");
		
		ln.listarNome();
		
		ln.removerNome("martins hetero");
		
		ln.listarNome();

	}

}

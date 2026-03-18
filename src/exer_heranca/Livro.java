package exer_heranca;

public class Livro extends Produto {
	
	private String autor;

	public Livro(String nome, double preco, int quantidade, String autor) {
		super(nome, preco, quantidade);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Autor: "+autor);
	}

}

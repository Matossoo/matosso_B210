package ExemploPOO;

public class Pessoa {

	//atributos
	private String nome;
	private int idade;
	
	
	//construtor completo
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void apresentar() {
		System.out.println("ola, meu nome é "+nome+" e tenho "+idade+" anos");
	}


	
	//criando métodos de acesso  Getters e Setters
	//Getters > chama o atributo	.get
	//Setters > modifica o atributo	.set
}

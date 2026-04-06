package banco_dados;

public class Pessoas {

	private int id;
	private String nome;
	private int idade;
	private String cpf;
	
	
		
		
	
	public Pessoas(String nome, int idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}



	public Pessoas(int id, String nome, int idade, String cpf) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	
	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	//Getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	//Método toString
	@Override
	public String toString() {
		return "Pessoas [id: " + id + ", nome: " + nome + ", idade: " + idade + ", cpf: "+cpf+"] ";
	}
	
}

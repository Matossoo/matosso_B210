package POO_arraylist;

public class Aluno {

	
	private String nome;
	private double nota2;
	private double nota1;
	private double media;
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public double calcularMedia() {
		media = (nota1+nota2) / 2;
		return media;
	}
	
	public String obterSituacao() {
		if(media >= 7) {
			return "APROVADO";
		}else {
			return "REPROVADO";
		}
	}
	
	public void exibirDados() {
		System.out.println("Nome: "+nome+"\nNota 1:"+nota1+"\nNota 2: "+nota2+"\nMédia: "+media+"\nSituação: "+ obterSituacao() );
	}
	
}

package ExemploPOO;

public class Aluno {

	private String nome;
	private double nota1;
	private double nota2;
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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double media() {
		media = (nota1 + nota2) / 2;
		return media;
	}
	public void mostrarSituacao() {
		if(media>=7) {
			System.out.println("voce foi aprovado!\nmédia: "+media);
		}else {
			System.out.println("média: "+media+"\nreprovado!");
		}
	}
	
}

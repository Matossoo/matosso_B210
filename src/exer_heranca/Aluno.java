package exer_heranca;



public class Aluno extends Pessoa {

	private int matricula;
	private String curso;
	public Aluno(String nome, String cpf, int idade, int matricula, String curso) {
		super(nome, cpf, idade);
		this.matricula = matricula;
		this.curso = curso;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Matricula: "+matricula);
		System.out.println("Curso: "+curso);
	}
	
}

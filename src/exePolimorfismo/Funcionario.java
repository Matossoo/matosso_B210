package exePolimorfismo;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirContracheque() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Salário Total: R$ " + calcularSalario());
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
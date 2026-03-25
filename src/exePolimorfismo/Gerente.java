package exePolimorfismo;

public class Gerente extends Funcionario {
    private double bonusFixo;

    public Gerente(String nome, double salarioBase, double bonusFixo) {
        super(nome, salarioBase);
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonusFixo;
    }

    @Override
    public void exibirContracheque() {
        System.out.println("═══ GERENTE ═══");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário Base: R$ " + getSalarioBase());
        System.out.println("Bônus: R$ " + bonusFixo);
        System.out.println("SALÁRIO TOTAL: R$ " + calcularSalario());
    }

    // GET/SET
    public double getBonusFixo() {
        return bonusFixo;
    }

    public void setBonusFixo(double bonusFixo) {
        this.bonusFixo = bonusFixo;
    }
}
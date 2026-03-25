package exePolimorfismo;

public class Programador extends Funcionario {
    private int horasExtras;
    private double valorHoraExtra;

    public Programador(String nome, double salarioBase, int horasExtras, double valorHoraExtra) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtras * valorHoraExtra);
    }

    @Override
    public void exibirContracheque() {
        System.out.println("═══ PROGRAMADOR ═══");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário Base: R$ " + getSalarioBase());
        System.out.println("Horas Extras: " + horasExtras);
        System.out.println("Valor Hora Extra: R$ " + valorHoraExtra);
        System.out.println("SALÁRIO TOTAL: R$ " + calcularSalario());
    }

    // GET/SET
    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }
}
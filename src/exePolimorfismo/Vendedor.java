package exePolimorfismo;

public class Vendedor extends Funcionario {
    private double totalVendas;
    private double comissao;

    public Vendedor(String nome, double salarioBase, double totalVendas, double comissao) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (totalVendas * comissao);
    }

    @Override
    public void exibirContracheque() {
        System.out.println("═══ VENDEDOR ═══");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário Base: R$ " + getSalarioBase());
        System.out.println("Total Vendas: R$ " + totalVendas);
        System.out.println("Comissão: " + (comissao * 100) + "%");
        System.out.println("SALÁRIO TOTAL: R$ " + calcularSalario());
    }

    // GET/SET
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
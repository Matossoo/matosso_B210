package exePolimorfismo;

public class Carro extends Transporte {
    private String tipoCombustivel;

    public Carro(double distancia, int passageiros, String tipoCombustivel) {
        super(distancia, passageiros);
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public double calcularCusto() {
        return getDistancia() * 1.50;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("═══ CARRO ═══");
        super.exibirDetalhes();
        System.out.println("Combustível: " + tipoCombustivel);
        System.out.println("Custo: R$ " + calcularCusto());
    }

    // GETTER
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    // SETTER
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
package exePolimorfismo;

public class Onibus extends Transporte {
    private int numeroLinhas;

    public Onibus(double distancia, int passageiros, int numeroLinhas) {
        super(distancia, passageiros);
        this.numeroLinhas = numeroLinhas;
    }

    @Override
    public double calcularCusto() {
        return getDistancia() * 0.80;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("═══ ÔNIBUS ═══");
        super.exibirDetalhes();
        System.out.println("Linhas: " + numeroLinhas);
        System.out.println("Custo: R$ " + calcularCusto());
    }

    // GETTER
    public int getNumeroLinhas() {
        return numeroLinhas;
    }

    // SETTER
    public void setNumeroLinhas(int numeroLinhas) {
        this.numeroLinhas = numeroLinhas;
    }
}
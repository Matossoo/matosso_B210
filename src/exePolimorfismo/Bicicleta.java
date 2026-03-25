package exePolimorfismo;

public class Bicicleta extends Transporte {
    private String tipoFreio;

    public Bicicleta(double distancia, int passageiros, String tipoFreio) {
        super(distancia, passageiros);
        this.tipoFreio = tipoFreio;
    }

    @Override
    public double calcularCusto() {
        return 0;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("═══ BICICLETA ═══");
        super.exibirDetalhes();
        System.out.println("Freio: " + tipoFreio);
        System.out.println("Custo: R$ 0,00");
    }

    // GETTER
    public String getTipoFreio() {
        return tipoFreio;
    }

    // SETTER
    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }
}
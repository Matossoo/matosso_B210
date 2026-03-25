package exePolimorfismo;

public class Elefante extends Animal {
    private double comprimentoTromba;

    public Elefante(String nome, int idade, double peso, double comprimentoTromba) {
        super(nome, idade, peso);
        this.comprimentoTromba = comprimentoTromba;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: PRRRUUUUU!");
    }

    @Override
    public String getTipoAlimento() {
        return "Herbívoro - Folhas e frutas";
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Comprimento da tromba: " + comprimentoTromba);
    }
}
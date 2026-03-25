package exePolimorfismo;

public class Papagaio extends Animal {
    private String corPenas;

    public Papagaio(String nome, int idade, double peso, String corPenas) {
        super(nome, idade, peso);
        this.corPenas = corPenas;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Olá! Quero biscoito!");
    }

    @Override
    public String getTipoAlimento() {
        return "Onívoro - Sementes e frutas";
    }

    public void falar(String frase) {
        System.out.println(getNome() + " fala: " + frase);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor das penas: " + corPenas);
    }
}
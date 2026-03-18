package exer_heranca;

public class Eletronico extends Produto {

	private int garantia;

	public Eletronico(String nome, double preco, int quantidade, int garantia) {
		super(nome, preco, quantidade);
		this.garantia = garantia;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Garantia: "+garantia);
	}
}

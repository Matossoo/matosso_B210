package henranca;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto(String marca, String modelo, int ano, int cilindradas) {
		super(marca, modelo, ano);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override //indica que o método está sendo sobrescrito
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Cilindradas: "+cilindradas);
	}
	
}

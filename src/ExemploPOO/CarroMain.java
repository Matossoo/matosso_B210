package ExemploPOO;

public class CarroMain {

	public static void main(String[] args) {
		Carro c1 = new Carro("carro do alberto", 2077, 67);
		
		c1.acelerar(67);
		c1.freiar(67);
		
		c1.mostrarVelocidade();

	}

}

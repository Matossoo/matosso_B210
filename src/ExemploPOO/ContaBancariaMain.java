package ExemploPOO;

public class ContaBancariaMain {

	public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Rafael", 1000);

        conta.depositar(500);
        conta.sacar(300);

        conta.mostrarSaldo();
    }
}
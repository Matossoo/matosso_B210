package henranca;

import java.util.*;

public class VeiculoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==CADASTRO DE CARRO==");
		System.out.println("Marca: ");
		String marca = sc.nextLine();
		
		System.out.println("Modelo: ");
		String modelo = sc.nextLine();
		
		System.out.println("Ano: ");
		int ano =sc.nextInt();
		
		System.out.println("QUantidade de portas: ");
		int portas = sc.nextInt();
		sc.nextLine();
		
		Carro car = new Carro(marca,modelo,ano,portas);
		
		System.out.println("==CADASTRO MOTO");
		System.out.println("Marca: ");
		marca = sc.nextLine();
		
		System.out.println("Modelo: ");
		modelo = sc.nextLine();
		
		System.out.println("Ano: ");
		ano =sc.nextInt();
		 
		System.out.println("Cilindradas: ");
		int cilindradas = sc.nextInt();
		 
		Moto m = new Moto(marca,modelo,ano,cilindradas);
		 
		System.out.println("\n");
		car.exibirDados();
		System.out.println("\n");
		m.exibirDados();
		 
		sc.close();
		

	}

}

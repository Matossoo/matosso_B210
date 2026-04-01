package execoes;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Digite o primeiro numero: ");
			int n1 = sc.nextInt();
			
			System.out.println("digite o segundo numero: ");
			int n2 = sc.nextInt();
			
			int soma = n1 + n2;
			
			System.out.println("A soma é: "+ soma);
			
		}catch(Exception e) {
			
			System.out.println("Erro! digite apenas números Int.");
			
		}
		
		System.out.println("Programa finalizado.");

	}

}

package AtiviadeExcesoes;

import java.util.*;

public class ex1 {

	public static void main(String[] args) {


		        Scanner sc = new Scanner(System.in);

		        try {

		            System.out.print("Digite o primeiro número: ");
		            int a = sc.nextInt();

		            System.out.print("Digite o segundo número: ");
		            int b = sc.nextInt();

		            int resultado = a / b;

		            System.out.println("Resultado: " + resultado);

		        } catch (ArithmeticException e) {
		            System.out.println("Erro: divisão por zero!");
		        }

		        System.out.println("O sistema continua");
		    }
		}

	



package AtiviadeExcesoes;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();

            if (num <= 0) {
                throw new Exception("Número deve ser maior que zero!");
            }

            System.out.println("Número válido!");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("O sistema continua");
    }
}
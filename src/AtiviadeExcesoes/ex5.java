package AtiviadeExcesoes;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();

            if (idade < 18) {
                throw new Exception("Acesso negado! Menor de idade.");
            }

            System.out.println("Acesso permitido");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("O sistema continua");
    }
}
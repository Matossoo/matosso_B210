package AtiviadeExcesoes;

import java.util.*;

public class ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();

            System.out.println("Número digitado: " + num);

        } catch (InputMismatchException e) {
            System.out.println("Erro: você não digitou um número inteiro!");
        }

        System.out.println("O sistema continua");
    }
}
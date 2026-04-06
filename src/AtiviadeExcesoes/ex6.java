package AtiviadeExcesoes;

import java.util.Scanner;

public class ex6 {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Digite uma senha: ");
            String senha = sc.next();

            if (senha.length() < 6) {
                throw new Exception("Senha muito curta! Mínimo 6 caracteres.");
            }

            System.out.println("Senha válida");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("O sistema continua");
        
        
        sc.close();
    }
}
package POO_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaContatosMain {

    public static void main(String[] args) {

        ArrayList<Contato> contatos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n=== AGENDA DE CONTATOS ===");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Buscar por nome");
            System.out.println("4. Remover contato");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();

                    Contato novo = new Contato(nome, telefone);
                    contatos.add(novo);

                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:

                    if(contatos.isEmpty()) {
                        System.out.println("Agenda vazia.");
                    } else {

                        int i = 1;

                        for(Contato c : contatos) {
                            System.out.println("\nContato " + i);
                            c.exibirDados();
                            i++;
                        }

                        System.out.println("\nTotal de contatos: " + contatos.size());
                    }

                    break;

                case 3:

                    if(contatos.isEmpty()) {
                        System.out.println("Agenda vazia.");
                    } else {

                        System.out.print("Digite o nome para buscar: ");
                        String busca = sc.nextLine();

                        boolean encontrado = false;

                        for(Contato c : contatos) {

                            if(c.getNome().contains(busca)) {
                                c.exibirDados();
                                encontrado = true;
                            }

                        }

                        if(!encontrado) {
                            System.out.println("Nenhum contato encontrado.");
                        }
                    }

                    break;

                case 4:

                    if(contatos.isEmpty()) {
                        System.out.println("Agenda vazia.");
                    } else {

                        for(int i = 0; i < contatos.size(); i++) {
                            System.out.println((i+1) + " - " + contatos.get(i).getNome());
                        }

                        System.out.print("Número do contato para remover: ");
                        int num = sc.nextInt();

                        if(num >= 1 && num <= contatos.size()) {

                            contatos.remove(num - 1);
                            System.out.println("Contato removido com sucesso!");

                        } else {

                            System.out.println("Número inválido.");
                        }
                    }

                    break;

            }

        } while(opcao != 0);

        System.out.println("Programa encerrado.");
 sc.close();
    }
}
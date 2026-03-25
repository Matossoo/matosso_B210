package exePolimorfismo;

import java.util.*;

public class MainAnimais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> lista = new ArrayList<>();

        int op;

        do {
            System.out.println("\n1-Leão 2-Elefante 3-Papagaio 4-Listar 5-Sons 6-Dieta 0-Sair");
            op = sc.nextInt();
            sc.nextLine();

            switch(op) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();

                    lista.add(new Leao(nome, idade, peso));
                    break;

                case 2:
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Idade: ");
                    idade = sc.nextInt();
                    System.out.print("Peso: ");
                    peso = sc.nextDouble();
                    System.out.print("Comprimento da tromba: ");
                    double tromba = sc.nextDouble();

                    lista.add(new Elefante(nome, idade, peso, tromba));
                    break;

                case 3:
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Idade: ");
                    idade = sc.nextInt();
                    System.out.print("Peso: ");
                    peso = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Cor das penas: ");
                    String cor = sc.nextLine();

                    lista.add(new Papagaio(nome, idade, peso, cor));
                    break;

                case 4:
                    for (Animal a : lista) {
                        a.exibirInfo();
                        System.out.println("-----------------");
                    }
                    break;

                case 5:
                    for (Animal a : lista) {
                        a.emitirSom();
                    }
                    break;

                case 6:
                    for (Animal a : lista) {
                        System.out.println(a.getNome() + ": " + a.getTipoAlimento());
                    }
                    break;
            }

        } while(op != 0);
        sc.close();
    }
   
}
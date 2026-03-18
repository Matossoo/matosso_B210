package POO_arraylist;

import java.util.*;

public class SistemaAlunosMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        int opcao;

        do {

            System.out.print(
                     "\n=== CADASTRO DE ALUNOS ===\n"
                    + "1. Adicionar aluno\n"
                    + "2. Listar alunos\n"
                    + "3. Buscar aluno por nome\n"
                    + "4. Mostrar aprovados\n"
                    + "5. Mostrar reprovados\n"
                    + "6. Calcular média da turma\n"
                    + "0. Sair\n"
                    + "Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Nota 1: ");
                    double nota1 = sc.nextDouble();

                    System.out.print("Nota 2: ");
                    double nota2 = sc.nextDouble();

                    alunos.add(new Aluno(nome, nota1, nota2));
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    if(alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for(Aluno a : alunos) {
                            a.exibirDados();
                        }
                    }
                    break;

                case 3:
                    if(alunos.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {
                        System.out.print("Digite o nome: ");
                        String busca = sc.nextLine();

                        boolean encontrado = false;

                        for(Aluno a : alunos) {
                            if(a.getNome().toLowerCase().contains(busca.toLowerCase())) {
                                a.exibirDados();
                                encontrado = true;
                            }
                        }

                        if(!encontrado) {
                            System.out.println("Aluno não encontrado.");
                        }
                    }
                    break;

                case 4:
                    if(alunos.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {
                        System.out.println("=== APROVADOS ===");
                        for(Aluno a : alunos) {
                            if(a.calcularMedia() >= 7) {
                                a.exibirDados();
                            }
                        }
                    }
                    break;

                case 5:
                    if(alunos.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {
                        System.out.println("=== REPROVADOS ===");
                        for(Aluno a : alunos) {
                            if(a.calcularMedia() < 7) {
                                a.exibirDados();
                            }
                        }
                    }
                    break;

                case 6:
                    if(alunos.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {
                        double soma = 0;

                        for(Aluno a : alunos) {
                            soma += a.calcularMedia();
                        }

                        double mediaTurma = soma / alunos.size();

                        System.out.printf("Média da turma: %.2f\n", mediaTurma);
                    }
                    break;
            }

        } while(opcao != 0);

    
        System.out.println("Programa encerrado.");
        sc.close();
    }
    
}
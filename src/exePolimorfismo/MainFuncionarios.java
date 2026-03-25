package exePolimorfismo;

import java.util.*;

public class MainFuncionarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<>();

        int op;

        do {
            System.out.println("\n1-Gerente 2-Vendedor 3-Programador 4-Listar 5-Folha Total 6-Buscar 0-Sair");
            op = sc.nextInt();
            sc.nextLine();

            switch(op) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Salário base: ");
                    double salario = sc.nextDouble();
                    System.out.print("Bônus: ");
                    double bonus = sc.nextDouble();

                    lista.add(new Gerente(nome, salario, bonus));
                    break;

                case 2:
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Salário base: ");
                    salario = sc.nextDouble();
                    System.out.print("Total vendas: ");
                    double vendas = sc.nextDouble();
                    System.out.print("Comissão (ex: 0.05): ");
                    double comissao = sc.nextDouble();

                    lista.add(new Vendedor(nome, salario, vendas, comissao));
                    break;

                case 3:
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Salário base: ");
                    salario = sc.nextDouble();
                    System.out.print("Horas extras: ");
                    int horas = sc.nextInt();
                    System.out.print("Valor hora extra: ");
                    double valor = sc.nextDouble();

                    lista.add(new Programador(nome, salario, horas, valor));
                    break;

                case 4:
                    for (Funcionario f : lista) {
                        f.exibirContracheque(); // POLIMORFISMO
                        System.out.println("-----------------");
                    }
                    break;

                case 5:
                    double total = 0;
                    for (Funcionario f : lista) {
                        total += f.calcularSalario(); // POLIMORFISMO
                    }
                    System.out.println("Folha total: R$ " + total);
                    break;

                case 6:
                    System.out.print("Digite o nome: ");
                    String busca = sc.nextLine();

                    for (Funcionario f : lista) {
                        if (f.getNome().equalsIgnoreCase(busca)) {
                            f.exibirContracheque();
                        }
                    }
                    break;
            }

        } while(op != 0);
        sc.close();
    }
}
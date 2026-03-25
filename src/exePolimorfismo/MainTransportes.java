package exePolimorfismo;

import java.util.*;

public class MainTransportes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Transporte> lista = new ArrayList<>();

        int op;
        do {
            System.out.println("\n1-Carro 2-Ônibus 3-Bicicleta 4-Listar 5-Custo Total 0-Sair");
            op = sc.nextInt();

            switch(op) {
                case 1:
                    System.out.print("Distância: ");
                    double d = sc.nextDouble();
                    System.out.print("Passageiros: ");
                    int p = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Combustível: ");
                    String c = sc.nextLine();

                    lista.add(new Carro(d, p, c));
                    break;

                case 2:
                    System.out.print("Distância: ");
                    d = sc.nextDouble();
                    System.out.print("Passageiros: ");
                    p = sc.nextInt();
                    System.out.print("Linhas: ");
                    int l = sc.nextInt();

                    lista.add(new Onibus(d, p, l));
                    break;

                case 3:
                    System.out.print("Distância: ");
                    d = sc.nextDouble();
                    System.out.print("Passageiros: ");
                    p = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Freio: ");
                    String f = sc.nextLine();

                    lista.add(new Bicicleta(d, p, f));
                    break;

                case 4:
                    for (Transporte t : lista) {
                        t.exibirDetalhes(); // POLIMORFISMO
                    }
                    break;

                case 5:
                    double total = 0;
                    for (Transporte t : lista) {
                        total += t.calcularCusto();
                    }
                    System.out.println("Total: R$ " + total);
                    break;
            }
        } while(op != 0);
        
        sc.close();
    }
}
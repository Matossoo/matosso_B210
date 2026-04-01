package AtiviadeExcesoes;

public class ex3 {

    public static void main(String[] args) {

        try {

            int a = 10;
            int b = 0;

            int resultado = a / b;

            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero!");
        } finally {
            System.out.println("Finalizando o programa (finally executado)");
        }

        System.out.println("O sistema continua");
    }
}
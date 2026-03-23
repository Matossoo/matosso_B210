package exemploPolimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class PagamentoMain {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        
		 ArrayList<Pagamento> pagamentos = new ArrayList<>();
	               
	        System.out.println("SISTEMA DE PAGAMENTOS - POO\n");
	
	        
	        int opcao;
	        
	        do {
	            System.out.println("MENU PRINCIPAL");
	            
	            System.out.println("1. Pagar com Cartão de Crédito");
	            System.out.println("2. Pagar com PIX");
	            System.out.println("3. Pagar com Boleto");
	            System.out.println("4. Listar todos os pagamentos");
	            System.out.println("5. Calcular total de taxas");
	            System.out.println("0. Sair");

	            System.out.print("Escolha uma opção: ");
	            
	            opcao = sc.nextInt();
	            sc.nextLine(); // Limpar buffer
	            
	            switch (opcao) {
	                case 1: // Cartão de Crédito
	                    System.out.println("\n--- PAGAMENTO COM CARTÃO ---");
	                    System.out.print("Nome do titular: ");
	                    String titularCartao = sc.nextLine();
	                    
	                    System.out.print("Valor: R$ ");
	                    double valorCartao = sc.nextDouble();
	                    sc.nextLine();
	                    
	                    System.out.print("Número do cartão (16 dígitos): ");
	                    String numeroCartao = sc.nextLine();
	                    
	                    // POLIMORFISMO: Tipo Pagamento, objeto CartaoCredito
	                    Pagamento pagCartao = new CartaoCredito(titularCartao, valorCartao, numeroCartao);
	                    pagCartao.processarPagamento(); // ← Chama método de CartaoCredito!
	                    pagamentos.add(pagCartao);
	                    break;
	                
	                case 2: // PIX
	                    System.out.println("\n--- PAGAMENTO COM PIX ---");
	                    System.out.print("Nome do titular: ");
	                    String titularPix = sc.nextLine();
	                    
	                    System.out.print("Valor: R$ ");
	                    double valorPix = sc.nextDouble();
	                    sc.nextLine();
	                    
	                    System.out.print("Chave PIX (CPF/email/telefone): ");
	                    String chavePix = sc.nextLine();
	                    
	                    // POLIMORFISMO: Tipo Pagamento, objeto Pix
	                    Pagamento pagPix = new Pix(titularPix, valorPix, chavePix);
	                    pagPix.processarPagamento(); // ← Chama método de Pix!
	                    pagamentos.add(pagPix);
	                    break;
	                
	                case 3: // Boleto
	                    System.out.println("\n--- PAGAMENTO COM BOLETO ---");
	                    System.out.print("Nome do titular: ");
	                    String titularBoleto = sc.nextLine();
	                    
	                    System.out.print("Valor: R$ ");
	                    double valorBoleto = sc.nextDouble();
	                    sc.nextLine();
	                    
	                    System.out.print("Código de barras: ");
	                    String codigoBarras = sc.nextLine();
	                    
	                    // POLIMORFISMO: Tipo Pagamento, objeto Boleto
	                    Pagamento pagBoleto =  new Boleto(titularBoleto, valorBoleto, codigoBarras);
	                    pagBoleto.processarPagamento(); // ← Chama método de Boleto!
	                    pagamentos.add(pagBoleto);
	                    break;
	                
	                case 4: // Listar todos
	                    if (pagamentos.isEmpty()) {
	                        System.out.println("\nNenhum pagamento realizado ainda!");
	                    } else {
	                        System.out.println("\n═══ TODOS OS PAGAMENTOS ═══");
	                        for (int i = 0; i < pagamentos.size(); i++) {
	                            System.out.println("\n--- Pagamento #" + (i + 1) + " ---");
	                            // POLIMORFISMO EM AÇÃO!
	                            // Cada objeto chama SUA versão do método!
	                            pagamentos.get(i).processarPagamento();
	                        }
	                    }
	                    break;
	                
	                case 5: // Total de taxas
	                    if (pagamentos.isEmpty()) {
	                        System.out.println("\nNenhum pagamento realizado ainda!");
	                    } else {
	                        double totalTaxas = 0;
	                        System.out.println("\n═══ TAXAS POR PAGAMENTO ═══");
	                        for (int i = 0; i < pagamentos.size(); i++) {
	                            // POLIMORFISMO EM AÇÃO!
	                            // Cada classe calcula sua taxa de forma diferente!
	                            double taxa = pagamentos.get(i).calcularTaxa();
	                            totalTaxas += taxa;
	                            System.out.println("Pagamento #" + (i + 1) + ": R$ " + 
	                                             String.format("%.2f", taxa));
	                        }
	                        System.out.println("\nTOTAL DE TAXAS: R$ " + 
	                                         String.format("%.2f", totalTaxas));
	                    }
	                    break;
	                
	                case 0:
	                   
	                    System.out.println("Sistema encerrado!");
	                    break;
	                
	                default:
	                    System.out.println("\nOpção inválida! Tente novamente.");
	            }
	            
	        } while (opcao != 0);
	        
	        sc.close();

	}

}

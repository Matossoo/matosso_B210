package ExemploPOO;

import java.util.*;

public class listaNomes {
    
    private ArrayList<String> listaNomes = new ArrayList<>();
    
    public void adicionarNome(String nome) {
        listaNomes.add(nome);
        System.out.println("Adicionando...");
    }
    
    public void listarNome() {
        
        if(listaNomes.isEmpty()) {
            System.out.println("Lista vazia!");
            
        } else {
            
        System.out.println("===Nomes Cadastrados===");
        for(String listar : listaNomes) {
            System.out.println(listar);
        }
      }
    }
    
    public void buscarNome(String nome) {
        if(listaNomes.contains(nome)) {
            System.out.println("O nome " + nome + " existe na lista!");
        } else {
            System.out.println("O nome " + nome + " não existe na lista!");
        
        }
        
    }
    
    public void removerNome(String nome) {
    	listaNomes.remove(nome);
    	System.out.println("removendo...");
    }
    

}
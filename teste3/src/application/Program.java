package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	        
	    
	    String vetor[] = {"SP", "RJ", "MG", "ES", "OUTROS"};
	    
	    List<Integer> list = new ArrayList<>();
	    
	    int i = 0;
	    
	    for (i=0; i < vetor.length; i++) {
	    	System.out.printf("\nDigite o faturamento mensal de %s: ", vetor[i]);
	    	double valor = sc.nextDouble();
	    	list.add((int) valor);
		}
	    
	    int sum = list.stream().mapToInt(Integer::intValue).sum();
	    
	    		int cont = 0;
	    		int percentual = 0;
	    		for(double c : list){	
	    			cont += 1;
			        percentual = (int) ((c /sum)*100);
	    		    System.out.printf("O percentual de faturamento de %s: %d%% \n", vetor[cont - 1], percentual);
	    		}
	    		
	    		
	   sc.close();
	}   	
}   	
	    	/*double menor = vetor[0];
	    	double maior = vetor[0];
	    	
	         for(double valor: vetor){
	            if(valor < menor && valor != 0)
	                menor = valor;
	            if(valor > maior)
	                maior = valor;
	         }
	         
	         double soma = 0;
	         for (i=0; i < vetor.length; i++) {
	        	 soma = soma + vetor[i];
	 		}
	         
	         int contagemDias = 0;
	         double media = soma / 30;
	          
	                 
	         for(double c : vetor){
		        if(media < c)
		        contagemDias++;
		    }	
	         
	         	                
	         
	         
	         System.out.println(menor);
	         
	         System.out.println("\n\nO maior valor de faturamento ocorrido em um dia do mês:");
	         
	         System.out.println(maior);
	         
	         System.out.println("\n\nNúmero de dias no mês em que o valor de faturamento diário foi superior à média mensal:");
	         
	         System.out.println(contagemDias);
	         */
	         
	         

	



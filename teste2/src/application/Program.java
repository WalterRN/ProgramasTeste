package application;


import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Foram Armazenados 30 dias com seus valores.");
	   
	    
	    
	    double vetor[] = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722
	    		, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667
	    		, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};
	    
	    int i = 0;
	    
	    for (i=0; i < vetor.length; i++) {
	    	System.out.printf("\nDia %d \nValor:%s", (i+1), vetor[i]);
		}
	    	System.out.println("\n\nO menor valor de faturamento ocorrido em um dia do mês:");
	    	
	    	
	    	double menor = vetor[0];
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
	         
	         
	         sc.close();

	}
	
}

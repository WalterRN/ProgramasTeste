package application;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Termo1 = 0;
	    int Termo2 = 1;
	    int Termo3 = 0;    
	
	
	System.out.println("Consulta da Sequência de Fibonacci");
	
	System.out.print("Digite um número: ");
	int n = sc.nextInt();
	
	while (n > Termo3) {
        Termo3 = Termo1 + Termo2;
        Termo1 = Termo2;
        Termo2 = Termo3;
	}
	
	if (n == 0 | n == 1) {
		System.out.print("O número faz parte da sequência de Fibonacci.");
	}else if(n == Termo3){
		System.out.print("O número faz parte da sequência de Fibonacci.");
	}else {
		System.out.print("O número digitado não faz parte da sequência de Fibonacci.");
	}
	
	sc.close();

	}

}

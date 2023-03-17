package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		         
		    Scanner sc= new Scanner(System.in);
		    System.out.println("Digite uma String para ser invertida: ");
		    String x =sc.next();		    
		    String invertido="";

		    for(int i=0; i < x.length(); i++) {
		        invertido = x.charAt(i) + invertido;
		    }

		    System.out.println(invertido);
		
		    sc.close();
	}

}

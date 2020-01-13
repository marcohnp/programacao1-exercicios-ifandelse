import java.util.Scanner;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// Construa um programa para ler três valores e os mostrar em ordem decrescente.
		
		// Declarações
		Scanner teclado = new Scanner(System.in);
		int val1, val2, val3;
		
		// Entrada
		System.out.print("Digite 1º número: ");
		val1 = teclado.nextInt();
		System.out.print("Digite 2º número: ");
		val2 = teclado.nextInt();
		System.out.print("Digite 3º número: ");
		val3 = teclado.nextInt();
		
		// Saída
		System.out.print("\nOs número digitados foram: "+val1+", "+val2+" e "+val3);
		
		if ((val1 < val2) && (val2 < val3)) {
			System.out.println("\nNúmeros em ordem crescente: "+val3+", "+val2+" e "+val1);	
		}
		
		else if ((val1 < val3) && (val3 < val2)) {
			System.out.println("\nNúmeros em ordem crescente: "+val2+", "+val3+" e "+val1);
		}
		else if ((val2 < val1) && (val1 < val3)) {
			System.out.println("\nNúmeros em ordem crescente: "+val3+", "+val1+" e "+val2);	
		}
		else if ((val2 < val3) && (val3 < val1)) {
			System.out.println("\nNúmeros em ordem crescente: "+val1+", "+val3+" e "+val2);
		}			
		else if ((val3 < val2) && (val2 < val1)) {
			System.out.println("\nNúmeros em ordem crescente: "+val1+", "+val2+" e "+val3);
		}				
		else if ((val3 < val1) && (val1 < val2)) {
			System.out.println("\nNúmeros em ordem crescente: "+val2+", "+val1+" e "+val3);
		}	
	
	}

}

		
	
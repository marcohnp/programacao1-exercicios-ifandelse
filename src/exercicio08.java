import java.util.Scanner;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// Construa um programa para ler tr�s valores e os mostrar em ordem decrescente.
		
		// Declara��es
		Scanner teclado = new Scanner(System.in);
		int val1, val2, val3;
		
		// Entrada
		System.out.print("Digite 1� n�mero: ");
		val1 = teclado.nextInt();
		System.out.print("Digite 2� n�mero: ");
		val2 = teclado.nextInt();
		System.out.print("Digite 3� n�mero: ");
		val3 = teclado.nextInt();
		
		// Sa�da
		System.out.print("\nOs n�mero digitados foram: "+val1+", "+val2+" e "+val3);
		
		if ((val1 < val2) && (val2 < val3)) {
			System.out.println("\nN�meros em ordem crescente: "+val3+", "+val2+" e "+val1);	
		}
		
		else if ((val1 < val3) && (val3 < val2)) {
			System.out.println("\nN�meros em ordem crescente: "+val2+", "+val3+" e "+val1);
		}
		else if ((val2 < val1) && (val1 < val3)) {
			System.out.println("\nN�meros em ordem crescente: "+val3+", "+val1+" e "+val2);	
		}
		else if ((val2 < val3) && (val3 < val1)) {
			System.out.println("\nN�meros em ordem crescente: "+val1+", "+val3+" e "+val2);
		}			
		else if ((val3 < val2) && (val2 < val1)) {
			System.out.println("\nN�meros em ordem crescente: "+val1+", "+val2+" e "+val3);
		}				
		else if ((val3 < val1) && (val1 < val2)) {
			System.out.println("\nN�meros em ordem crescente: "+val2+", "+val1+" e "+val3);
		}	
	
	}

}

		
	
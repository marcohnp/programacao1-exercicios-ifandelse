import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// Construa um programa que lê um valor positivo, que corresponde a um ano. Verifica se é um "ano bissexto" e mostra a informação. 
		// Ano bissexto é divisível por 4, sem ser divisível por 100, exceto os divisíveis por 400.
		
		// Declarações
		Scanner teclado = new Scanner(System.in);
		int ano, anoRes, anoRes2, anoRes3;
		
		// Entrada
		System.out.print("Digite um ano: ");
		ano = teclado.nextInt();
		
		//Processamento
		anoRes = ano % 4;
		anoRes2 = ano % 100;
		anoRes3 = ano % 400;
		
		
		// Saída
		
		if (anoRes == 0 && anoRes2 != 0) {
			System.out.println(ano + " é bissexto.");
		} else if (anoRes == 0 && anoRes2 == 0 && anoRes3 == 0) { 
				System.out.println(ano + " é bissexto");
		} else {
			System.out.println(ano + " não é bissexto.");
		}

	}

}

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// Construa um programa para ler dois valores e mostrar o maior deles.
		
		// Declarações
		Scanner teclado = new Scanner(System.in);
		int val1, val2;
		
		// Entrada
		System.out.print("Digite um número: ");
		val1 = teclado.nextInt();
		System.out.print("Digite outro número: ");
		val2 = teclado.nextInt();
		
		// Saída
		if(val1 > val2) {
			System.out.print("Maior número digitado é: "+val1);
		} else if (val1 < val2) {
			System.out.print("Maior número digitado é: "+val2);
		} else if (val1 == val2) {
			System.out.print("Os números são iguais.");
		}
	}

}

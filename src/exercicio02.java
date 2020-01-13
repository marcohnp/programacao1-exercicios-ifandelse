import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// Construa um programa para ler um valor, verificar se é par ou ímpar e mostrar essa informação.
		
		// Declarações
		Scanner teclado = new Scanner(System.in);
		int val1, res;
		
		// Entrada
		System.out.print("Digite um número: ");
		val1 = teclado.nextInt();
		
		// Processamento
		res = val1 % 2;
		
		
		// Saída
		System.out.println("Você digitou "+val1+".");
		if(res == 1) {
			System.out.println(val1+" é um número ímpar.");
		}else {
			System.out.println(val1+" é um número par.");
		}
		
	}

}

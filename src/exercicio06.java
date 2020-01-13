import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// Construa um programa para ler três valores que representam três segmentos de reta. 
		// Verificar se com esses segmentos é possível compor um triângulo e mostrar uma mensagem dizendo se é ou não possível.
		
		// Declarações
		Scanner teclado = new Scanner(System.in);
		int val1, val2, val3, soma1, soma2, soma3, sub1 = 0, sub2 = 0, sub3 = 0;
		
		// Entrada
		System.out.print("Digite o 1º segmento de reta: ");
		val1 = teclado.nextInt();
		System.out.print("Digite o 2º segmento de reta: ");
		val2 = teclado.nextInt();
		System.out.print("Digite o 3º segmento de reta: ");
		val3 = teclado.nextInt();
		
		// Processamento
		soma1 = val2 + val3;
		soma2 = val1 + val3;
		soma3 = val1 + val2;

		if (val2 > val3) {
			sub1 = val2 - val3;
		} else if (val2 < val3) {
			sub1 = val3 - val2;
		}
		
		if (val1 > val3) {
			sub2 = val1 - val3;
		} else if (val1 < val3) {
			sub2 = val3 - val1;
		}
		
		if (val1 > val2) {
			sub3 = val1 - val2;
		} else if (val1 < val2) {
			sub3 = val2 - val1;
		}
		
		// Saída
		
		if (soma1 > val1 && sub1 < val1) {
			System.out.print("É possível formar um triângulo.");
		} else if (soma2 > val2 && sub2 < val2) {
			System.out.print("É possível formar um triângulo.");
		} else if (soma3 > val3 && sub3 < val3) {
			System.out.print("É possível formar um triângulo.");
		} else {
			System.out.print("Não é possível formar um triângulo.");
		}
		
		
		
	}

}

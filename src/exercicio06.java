import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// Construa um programa para ler tr�s valores que representam tr�s segmentos de reta. 
		// Verificar se com esses segmentos � poss�vel compor um tri�ngulo e mostrar uma mensagem dizendo se � ou n�o poss�vel.
		
		// Declara��es
		Scanner teclado = new Scanner(System.in);
		int val1, val2, val3, soma1, soma2, soma3, sub1 = 0, sub2 = 0, sub3 = 0;
		
		// Entrada
		System.out.print("Digite o 1� segmento de reta: ");
		val1 = teclado.nextInt();
		System.out.print("Digite o 2� segmento de reta: ");
		val2 = teclado.nextInt();
		System.out.print("Digite o 3� segmento de reta: ");
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
		
		// Sa�da
		
		if (soma1 > val1 && sub1 < val1) {
			System.out.print("� poss�vel formar um tri�ngulo.");
		} else if (soma2 > val2 && sub2 < val2) {
			System.out.print("� poss�vel formar um tri�ngulo.");
		} else if (soma3 > val3 && sub3 < val3) {
			System.out.print("� poss�vel formar um tri�ngulo.");
		} else {
			System.out.print("N�o � poss�vel formar um tri�ngulo.");
		}
		
		
		
	}

}

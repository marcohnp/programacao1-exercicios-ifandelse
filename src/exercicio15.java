import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		// 15)	Construa um programa que l� 10 valores, calcule a m�dia aritm�tica entre todos,
		// verifique quantos valores se encontram acima da m�dia e mostre essa informa��o.
		
		//Declara��es
		Scanner teclado = new Scanner(System.in);
		double val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, media;
		
		
		// Entrada
		System.out.print("Digite valor 01: ");
		val1 = teclado.nextDouble();
		System.out.print("Digite valor 02: ");
		val2 = teclado.nextDouble();
		System.out.print("Digite valor 03: ");
		val3 = teclado.nextDouble();
		System.out.print("Digite valor 04: ");
		val4 = teclado.nextDouble();
		System.out.print("Digite valor 05: ");
		val5 = teclado.nextDouble();
		System.out.print("Digite valor 06: ");
		val6 = teclado.nextDouble();
		System.out.print("Digite valor 07: ");
		val7 = teclado.nextDouble();
		System.out.print("Digite valor 08: ");
		val8 = teclado.nextDouble();
		System.out.print("Digite valor 09: ");
		val9 = teclado.nextDouble();
		System.out.print("Digite valor 10: ");
		val10 = teclado.nextDouble();

		// Processamento
		media = (val1 + val2 + val3 + val4 + val5 + val6 + val7 + val8 + val9 + val10) / 10;
		
		// Sa�da
		System.out.println("M�dia dos valores digitados �: "+media);
		System.out.println("Valores acima da m�dia: ");
		if (val1 > media) {
			System.out.println("Valor 01: "+val1);
		} 
		
		if (val2 > media) {
			System.out.println("Valor 02: "+val2);
		} 
		
		if (val3 > media) {
				System.out.println("Valor 03: "+val3);
		}
		
		if (val4 > media) {
			System.out.println("Valor 04: "+val4);
		}
		
		if (val5 > media) {
			System.out.println("Valor 05: "+val5);
		}
		
		if (val6 > media) {
			System.out.println("Valor 06: "+val6);
		}
		
		if (val7 > media) {
			System.out.println("Valor 07: "+val7);
		}
		
		if (val8 > media) {
			System.out.println("Valor 08: "+val8);
		}
		
		if (val9 > media) {
			System.out.println("Valor 09: "+val9);
		}
		
		if (val10 > media) {
			System.out.println("Valor 10: "+val10);
		}
	}

}

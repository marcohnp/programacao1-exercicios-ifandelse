import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// Construa um programa para ler dois valores e mostrar o maior deles.
		
		// Declara��es
		Scanner teclado = new Scanner(System.in);
		int val1, val2;
		
		// Entrada
		System.out.print("Digite um n�mero: ");
		val1 = teclado.nextInt();
		System.out.print("Digite outro n�mero: ");
		val2 = teclado.nextInt();
		
		// Sa�da
		if(val1 > val2) {
			System.out.print("Maior n�mero digitado �: "+val1);
		} else if (val1 < val2) {
			System.out.print("Maior n�mero digitado �: "+val2);
		} else if (val1 == val2) {
			System.out.print("Os n�meros s�o iguais.");
		}
	}

}

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// Construa um programa que l� um valor positivo, que corresponde a um ano. Verifica se � um "ano bissexto" e mostra a informa��o. 
		// Ano bissexto � divis�vel por 4, sem ser divis�vel por 100, exceto os divis�veis por 400.
		
		// Declara��es
		Scanner teclado = new Scanner(System.in);
		int ano, anoRes, anoRes2, anoRes3;
		
		// Entrada
		System.out.print("Digite um ano: ");
		ano = teclado.nextInt();
		
		//Processamento
		anoRes = ano % 4;
		anoRes2 = ano % 100;
		anoRes3 = ano % 400;
		
		
		// Sa�da
		
		if (anoRes == 0 && anoRes2 != 0) {
			System.out.println(ano + " � bissexto.");
		} else if (anoRes == 0 && anoRes2 == 0 && anoRes3 == 0) { 
				System.out.println(ano + " � bissexto");
		} else {
			System.out.println(ano + " n�o � bissexto.");
		}

	}

}

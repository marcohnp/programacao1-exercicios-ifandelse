import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// Construa um algoritmo para ler um valor, verificar se está no intervalo (100, 200) e mostrar essa informação.
		
		// Declarações
		Scanner teclado = new Scanner(System.in);
		int val1;
		
		// Entrada
		System.out.print("Digite um número: ");
		val1 = teclado.nextInt();
		
		// Saída
		if((val1 >= 100) && (val1 <= 200)) {
			System.out.print(val1+" está entre 100 e 200.");
		}else {
			System.out.print(val1+" não está entre 100 e 200");
		}
	
	

	}

}

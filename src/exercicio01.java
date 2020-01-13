import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// Construa um programa para ler um valor, verificar se é maior do que 100 e mostrar essa informação.
		
		// Declarações
		Scanner teclado = new Scanner(System.in);
		int val1;
		
		
		// Entrada
		System.out.print("Digite um valor: ");
		val1 = teclado.nextInt();
		
		
		// Saida
		System.out.println("Você digitou "+val1+".");
		
		if(val1 > 100) {
			System.out.println(val1+" é maior que 100.");
		}else if (val1 < 100) {
			System.out.println(val1+" é menor que 100.");
		}else if (val1 == 100) {
			System.out.println(val1+" é igual a 100.");
		}

	}

}

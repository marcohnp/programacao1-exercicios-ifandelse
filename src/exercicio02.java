import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// Construa um programa para ler um valor, verificar se � par ou �mpar e mostrar essa informa��o.
		
		// Declara��es
		Scanner teclado = new Scanner(System.in);
		int val1, res;
		
		// Entrada
		System.out.print("Digite um n�mero: ");
		val1 = teclado.nextInt();
		
		// Processamento
		res = val1 % 2;
		
		
		// Sa�da
		System.out.println("Voc� digitou "+val1+".");
		if(res == 1) {
			System.out.println(val1+" � um n�mero �mpar.");
		}else {
			System.out.println(val1+" � um n�mero par.");
		}
		
	}

}

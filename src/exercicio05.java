import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// Construa um algoritmo para ler um valor, verificar se est� no intervalo (100, 200) e mostrar essa informa��o.
		
		// Declara��es
		Scanner teclado = new Scanner(System.in);
		int val1;
		
		// Entrada
		System.out.print("Digite um n�mero: ");
		val1 = teclado.nextInt();
		
		// Sa�da
		if((val1 >= 100) && (val1 <= 200)) {
			System.out.print(val1+" est� entre 100 e 200.");
		}else {
			System.out.print(val1+" n�o est� entre 100 e 200");
		}
	
	

	}

}

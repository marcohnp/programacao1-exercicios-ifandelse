import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// Construa um programa para ler um valor, verificar se � maior do que 100 e mostrar essa informa��o.
		
		// Declara��es
		Scanner teclado = new Scanner(System.in);
		int val1;
		
		
		// Entrada
		System.out.print("Digite um valor: ");
		val1 = teclado.nextInt();
		
		
		// Saida
		System.out.println("Voc� digitou "+val1+".");
		
		if(val1 > 100) {
			System.out.println(val1+" � maior que 100.");
		}else if (val1 < 100) {
			System.out.println(val1+" � menor que 100.");
		}else if (val1 == 100) {
			System.out.println(val1+" � igual a 100.");
		}

	}

}

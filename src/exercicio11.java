import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// Construa um programa para ler quatro valores e os mostrar em ordem crescente.
		
		// Declarações
		Scanner teclado = new Scanner(System.in);
		int val1, val2, val3, val4;
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		// int cnt = 0;
		
		// Entrada
		System.out.print("Digite 1º número: ");
		val1 = teclado.nextInt();
		System.out.print("Digite 2º número: ");
		val2 = teclado.nextInt();
		System.out.print("Digite 3º número: ");
		val3 = teclado.nextInt();
		System.out.print("Digite 4º número: ");
		val4 = teclado.nextInt();
		
		// Saída
		System.out.println("\nOs número digitados foram: "+val1+", "+val2+", "+val3+" e "+val4);
		
		
		if ((val1 < val2) && (val1 < val3) && (val1 < val4)) {
			num1 = val1;
		} else if ((val1 > val2) && (val1 < val3) && (val1 < val4)) {
			num2 = val1;
		} else if ((val1 > val3) && (val1 < val2) && (val1 < val4)) {
			num2 = val1;			
		} else if ((val1 > val4) && (val1 < val2) && (val1 < val3)) {
			num2 = val1;	
		} else if ((val1 > val2) && (val1 > val3) && (val1 < val4)) {
			num3 = val1;
		} else if ((val1 > val2) && (val1 > val4) && (val1 < val3)) {
			num3 = val1;
		} else if ((val1 > val3) && (val1 > val4) && (val1 < val2)) {
			num3 = val1;
		} else if ((val1 > val2) && (val1 > val3) && (val1 > val4)) {
			num4 = val1;
		}
		
		if ((val2 < val1) && (val2 < val3) && (val2 < val4)) {
			num1 = val2;
		} else if ((val2 > val1) && (val2 < val3) && (val2 < val4)) {
			num2 = val2;
		} else if ((val2 > val3) && (val2 < val1) && (val2 < val4)) {
			num2 = val2;			
		} else if ((val2 > val4) && (val2 < val1) && (val2 < val3)) {
			num2 = val2;	
		} else if ((val2 > val1) && (val2 > val3) && (val2 < val4)) {
			num3 = val2;
		} else if ((val2 > val1) && (val2 > val4) && (val2 < val3)) {
			num3 = val2;
		} else if ((val2 > val3) && (val2 > val4) && (val2 < val1)) {
			num3 = val2;
		} else if ((val2 > val1) && (val2 > val3) && (val2 > val4)) {
			num4 = val2;
		}
		
		if ((val3 < val2) && (val3 < val1) && (val3 < val4)) {
			num1 = val3;
		} else if ((val3 > val2) && (val3 < val1) && (val3 < val4)) {
			num2 = val3;
		} else if ((val3 > val1) && (val3 < val2) && (val3 < val4)) {
			num2 = val3;			
		} else if ((val3 > val4) && (val3 < val2) && (val3 < val1)) {
			num2 = val3;	
		} else if ((val3 > val2) && (val3 > val1) && (val3 < val4)) {
			num3 = val3;
		} else if ((val3 > val2) && (val3 > val4) && (val3 < val1)) {
			num3 = val3;
		} else if ((val3 > val1) && (val3 > val4) && (val3 < val2)) {
			num3 = val3;
		} else if ((val3 > val2) && (val3 > val1) && (val3 > val4)) {
			num4 = val3;
		}
		
		if ((val4 < val2) && (val4 < val3) && (val4 < val1)) {
			num1 = val4;
		} else if ((val4 > val2) && (val4 < val3) && (val4 < val1)) {
			num2 = val4;
		} else if ((val4 > val3) && (val4 < val2) && (val4 < val1)) {
			num2 = val4;			
		} else if ((val4 > val1) && (val4 < val2) && (val4 < val3)) {
			num2 = val4;	
		} else if ((val4 > val2) && (val4 > val3) && (val4 < val1)) {
			num3 = val4;
		} else if ((val4 > val2) && (val4 > val1) && (val4 < val3)) {
			num3 = val4;
		} else if ((val4 > val3) && (val4 > val1) && (val4 < val2)) {
			num3 = val4;
		} else if ((val4 > val2) && (val4 > val3) && (val4 > val1)) {
			num4 = val4;
		}
		
		System.out.println("\nNumeros digitados em ordem crescente: "+num1+", "+num2+", "+num3+" e "+num4);
		
		
	}

}

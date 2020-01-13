import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		// Construa um programa que lê uma data, composta de dia, mês e ano. Calcule e mostre o total de dias transcorridos no ano. 
		// (Os meses tem 28, 30 e 31 dias!)
		
		// janeiro (31), fevereiro (28),  março (31), abril (30) maio (31), junho (30),  
		// julho (31), agosto (31), setembro (30), outubro (31), novembro (30), dezembro (31)
		

		// Declarações
		int ano, mes, dia, totalDias;
		
		
		// Entrada
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o dia: ");
		dia = teclado.nextInt();
		System.out.print("Digite o mês: ");
		mes = teclado.nextInt();
		System.out.print("Digite o ano: ");
		ano = teclado.nextInt();
		
		// Processamento
		if (dia > 31) {
			System.out.print("Data inválida!");
		}else if (mes == 1) {
			System.out.print("Passaram-se "+dia+" dias no ano.");
		} else if (mes == 2 && dia <= 28) {
			totalDias = 31 + dia;
			System.out.print("Passaram-se "+totalDias+" dias no ano.");
		} else if (mes == 3 && dia <= 31) {
			totalDias = 59 + dia;
			System.out.print("Passaram-se "+totalDias+" dias no ano.");
		} else if (mes == 4 && dia <= 30) {
			totalDias = 90 + dia;
			System.out.print("Passaram-se "+totalDias+" dias no ano.");
		} else if (mes == 5 && dia <= 31) {
			totalDias = 120 + dia;
			System.out.print("Passaram-se "+totalDias+" dias no ano.");
		} else if ( mes == 6  && dia <= 30) {
			totalDias = 151 + dia;
			System.out.print("Passaram-se "+totalDias+" dias no ano.");
		} else if (mes == 7  && dia <= 31) { 
			totalDias = 181 + dia;
			System.out.print("Passaram-se "+totalDias+" dias no ano.");
		} else if (mes == 8  && dia <= 31) {
			totalDias = 212 + dia;
			System.out.print("Passaram-se "+totalDias+" dias no ano.");
		} else if (mes == 9  && dia <= 30) {
			totalDias = 243 + dia;
			System.out.print("Passaram-se "+totalDias+" dias no ano.");
		} else if (mes == 10  && dia <= 31) {
			totalDias = 273 + dia;
			System.out.print("Passaram-se "+totalDias+" dias no ano.");
		} else if (mes == 11  && dia <= 30) {
			totalDias = 304 + dia;
			System.out.print("Passaram-se "+totalDias+" dias no ano.");
		} else if (mes == 12  && dia <= 31) {
			totalDias = 334 + dia;
			System.out.print("Passaram-se "+totalDias+" dias no ano.");
		} else {
			System.out.print("Data inválida!");
		}
		
				
		


	}

}

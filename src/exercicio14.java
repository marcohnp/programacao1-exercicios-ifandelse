import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		// Construa um programa que lê a data de início e a data de finalização de um curso, compostas por dia e mês. 
		// Calcule o número de dias de duração do respectivo curso, considerando que o curso pode ter durado no máximo um ano.(Os meses tem 28, 30 e 31 dias!)

		//	Declarações
		Scanner teclado = new Scanner(System.in);
		int diaInicio, mesInicio, diaFim, mesFim, totalDiasInicio = 0, totalDiasFim = 0, totalDias = 0;
		
		
		System.out.print("Digite o dia que começou o curso: ");
		diaInicio = teclado.nextInt();
		System.out.print("Digite o mês que começou o curso: ");
		mesInicio = teclado.nextInt();
		System.out.print("\nDigite o dia que terminou o curso: ");
		diaFim = teclado.nextInt();
		System.out.print("Digite o mês que terminou o curso: ");
		mesFim = teclado.nextInt();	
		
		// Processamento
		if ((diaInicio > 31) && (diaFim > 31) && (mesInicio >= 12) && (mesFim >= 12)){
			System.out.print("Data inválida!");
		} else if (mesInicio == 1) {
			totalDiasInicio = diaInicio;
		} else if (mesInicio == 2 && diaInicio <= 28) {
			totalDiasInicio = 31 + diaInicio;
		} else if (mesInicio == 3 && diaInicio <= 31) {
			totalDiasInicio = 59 + diaInicio;
		} else if (mesInicio == 4 && diaInicio <= 30) {
			totalDiasInicio = 90 + diaInicio;
		} else if (mesInicio == 5 && diaInicio <= 31) {
			totalDiasInicio = 120 + diaInicio;
		} else if ( mesInicio == 6  && diaInicio <= 30) {
			totalDiasInicio = 151 + diaInicio;
		} else if (mesInicio == 7  && diaInicio <= 31) { 
			totalDiasInicio = 181 + diaInicio;
		} else if (mesInicio == 8  && diaInicio <= 31) {
			totalDiasInicio = 212 + diaInicio;
		} else if (mesInicio == 9  && diaInicio <= 30) {
			totalDiasInicio = 243 + diaInicio;
		} else if (mesInicio == 10  && diaInicio <= 31) {
			totalDiasInicio = 273 + diaInicio;
		} else if (mesInicio == 11  && diaInicio <= 30) {
			totalDiasInicio = 304 + diaInicio;
		} else if (mesInicio == 12  && diaInicio <= 31) {
			totalDiasInicio = 334 + diaInicio;
		} else {
			System.out.print("Data inválida!");
			
		} if (mesFim == 1) {
			totalDiasFim = diaFim;
		} else if (mesFim == 2 && diaFim <= 28) {
			totalDiasFim = 31 + diaFim;
		} else if (mesFim == 3 && diaFim <= 31) {
			totalDiasFim = 59 + diaFim;
		} else if (mesFim == 4 && diaFim <= 30) {
			totalDiasFim = 90 + diaFim;
		} else if (mesFim == 5 && diaFim <= 31) {
			totalDiasFim = 120 + diaFim;
		} else if (mesFim == 6  && diaFim <= 30) {
			totalDiasFim = 151 + diaFim;
		} else if (mesFim == 7  && diaFim <= 31) { 
			totalDiasFim = 181 + diaFim;
		} else if (mesFim == 8  && diaFim <= 31) {
			totalDiasFim = 212 + diaFim;
		} else if (mesFim == 9  && diaFim <= 30) {
			totalDiasInicio = 243 + diaFim;
		} else if (mesFim == 10  && diaInicio <= 31) {
			totalDiasFim = 273 + diaFim;
		} else if (mesFim == 11  && diaFim <= 30) {
			totalDiasFim = 304 + diaFim;
		} else if (mesFim == 12  && diaFim <= 31) {
			totalDiasFim = 334 + diaFim;
		} if (mesInicio > mesFim) {
			totalDiasInicio = 365 - totalDiasInicio;
			totalDias = totalDiasFim + totalDiasInicio;
			System.out.print("\nO curso durou "+totalDias+" dias.");
		} else if (mesInicio < mesFim) {
			totalDiasInicio = 365 - totalDiasInicio;
			totalDiasFim = 365 - totalDiasFim;
			totalDias = totalDiasInicio - totalDiasFim;
			System.out.print("\nO curso durou "+totalDias+" dias.");
		} else {
			System.out.print("Data inválida!");
			
		}

		
	}	
}

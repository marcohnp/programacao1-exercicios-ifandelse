import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		/* Construa um programa que lê a hora de início e a hora de término de um jogo, ambas subdivididas em 2 valores distintos, 
		 * a saber: horas e minutos. Calcular e escrever a duração do jogo, também em horas e minutos, considerando que o tempo máximo de 
		 * duração de um jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
		 */
		
			// Declarações
			Scanner teclado = new Scanner(System.in);
			int horaInicio, minInicio, horaFim, minFim, resHoraInicio, resHoraFim, duracao1, duracao2, resMin, minExc;
			
			
			// Entrada
			System.out.print("Digite a hora que o jogo começou: ");
			horaInicio = teclado.nextInt();
			System.out.print("Digite com quantos minutos começou a hora: ");
			minInicio = teclado.nextInt();
			System.out.print("Digite a hora que o jogo terminou: ");
			horaFim = teclado.nextInt();
			System.out.print("Digite com quantos minutos terminou a hora: ");
			minFim = teclado.nextInt();
			
			// Processamento
			if (horaInicio > 24 || horaFim > 24) {
				System.out.print("Horário digitado não corresponde à 24h.");
			} else {
			resHoraInicio = 24 - horaInicio;
			resHoraFim = 24 - horaFim;
			resMin = minInicio + minFim;
			minExc = resMin - 60;
			
			// Saida
			if (resHoraInicio > resHoraFim) {
				duracao1 = resHoraInicio - resHoraFim;
				if (resMin < 60) {
					System.out.print("O tempo de duração do jogo foi: "+duracao1+"h e "+resMin+" minutos.");
				} else if (resMin == 60) {
					duracao1 = duracao1 + 1;
					System.out.print("O tempo de duração do jogo foi: "+duracao1+"h.");
				} else if (resMin > 60) {
					duracao1 = duracao1 + 1;
					System.out.print("O tempo de duração do jogo foi: "+duracao1+"h e "+minExc+" minutos.");
				}
				
			} 	else {
					duracao2 = resHoraInicio + horaFim;
					if (resMin < 60) {
						System.out.print("O tempo de duração do jogo foi: "+duracao2+"h e "+resMin+" minutos.");
					} else if (resMin == 60) {
						duracao2 = duracao2 + 1;
						System.out.print("O tempo de duração do jogo foi: "+duracao2+"h.");
					} else if (resMin > 60) {
						duracao2 = duracao2 + 1;
						System.out.print("O tempo de duração do jogo foi: "+duracao2+"h e "+minExc+" minutos.");
					}
				}
			
			}	
	}

}

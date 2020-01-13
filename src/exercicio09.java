import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		/* Construa um programa que lê a hora de início de um jogo e a hora do final do jogo (considerando apenas horas inteiras)
		 * e calcula a duração do jogo em horas, sabendo que o  tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia
		 * e terminar no dia seguinte.
		 */
		
		// Declarações
		Scanner teclado = new Scanner(System.in);
		int horaInicio, horaFim, duracao1, duracao2, resHoraInicio, resHoraFim;
		
		
		// Entrada
		System.out.print("Digite a hora que o jogo começou: ");
		horaInicio = teclado.nextInt();
		System.out.print("Digite a hora que o jogo terminou: ");
		horaFim = teclado.nextInt();
		
		// Processamento
		if (horaInicio > 24 || horaFim > 24) {
			System.out.print("Horário digitado não corresponde à 24h.");
		} else {
		resHoraInicio = 24 - horaInicio;
		resHoraFim = 24 - horaFim;
		
		// Saida
		if (resHoraInicio > resHoraFim) {
			duracao1 = resHoraInicio - resHoraFim;
			System.out.print("O tempo de duração do jogo foi: "+duracao1+"h.");
		} else {
			duracao2 = resHoraInicio + horaFim;
			System.out.print("O tempo de duração do jogo foi: "+duracao2+"h.");
		}
		
		}

	}

}

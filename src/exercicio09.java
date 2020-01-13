import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		/* Construa um programa que l� a hora de in�cio de um jogo e a hora do final do jogo (considerando apenas horas inteiras)
		 * e calcula a dura��o do jogo em horas, sabendo que o  tempo m�ximo de dura��o do jogo � de 24 horas e que o jogo pode iniciar em um dia
		 * e terminar no dia seguinte.
		 */
		
		// Declara��es
		Scanner teclado = new Scanner(System.in);
		int horaInicio, horaFim, duracao1, duracao2, resHoraInicio, resHoraFim;
		
		
		// Entrada
		System.out.print("Digite a hora que o jogo come�ou: ");
		horaInicio = teclado.nextInt();
		System.out.print("Digite a hora que o jogo terminou: ");
		horaFim = teclado.nextInt();
		
		// Processamento
		if (horaInicio > 24 || horaFim > 24) {
			System.out.print("Hor�rio digitado n�o corresponde � 24h.");
		} else {
		resHoraInicio = 24 - horaInicio;
		resHoraFim = 24 - horaFim;
		
		// Saida
		if (resHoraInicio > resHoraFim) {
			duracao1 = resHoraInicio - resHoraFim;
			System.out.print("O tempo de dura��o do jogo foi: "+duracao1+"h.");
		} else {
			duracao2 = resHoraInicio + horaFim;
			System.out.print("O tempo de dura��o do jogo foi: "+duracao2+"h.");
		}
		
		}

	}

}

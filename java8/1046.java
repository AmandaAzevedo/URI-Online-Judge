import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		Scanner leitor = new Scanner (System.in);
		String [] dados = leitor.nextLine().split(" ");
		int horaInicio = Integer.parseInt(dados[0]);
		int horaFim = Integer.parseInt(dados[1]);
		
		if (horaFim < horaInicio) {
			int saida = (24 - horaInicio) + horaFim;
			if (saida == 0) {
				System.out.println("O JOGO DUROU 24 HORA(S)");
			} else {
				System.out.printf("O JOGO DUROU %d HORA(S)\n", saida);
			}
			
		} else {	
			int saida = horaFim - horaInicio;
			if (saida == 0) {
				System.out.println("O JOGO DUROU 24 HORA(S)");
			} else {
				System.out.printf("O JOGO DUROU %d HORA(S)\n", saida);
			}
		}
	
		
		
		
		
		leitor.close();
		
	}

}
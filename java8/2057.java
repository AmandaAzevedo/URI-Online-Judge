import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		String [] dados = leitor.nextLine().split(" ");
		int horaDeSaida = Integer.parseInt(dados[0]);
		int tempoDeViagem = Integer.parseInt(dados[1]);
		int fusoHorario = Integer.parseInt(dados[2]);
		
		if (horaDeSaida == 0) {
			horaDeSaida = 24;
		} if (tempoDeViagem == 0) {
			tempoDeViagem = 24;
		}
		
		
		int saida = (horaDeSaida + tempoDeViagem + fusoHorario)%24;
			
			if (saida < 0) {
				saida = saida + 24;
			}
			
			System.out.println(saida);
		
		
		leitor.close();
	}

}
import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		Scanner leitor = new Scanner (System.in);
		
		int n = Integer.parseInt(leitor.nextLine());
		
		String [] numLidos = leitor.nextLine().split(" ");		
		
		int [] array = new int [n];
		
		
		for (int k = 0; k < n; k++) {
			array[k] = Integer.parseInt(numLidos[k]);
		}
		
		int menor = 0, posicao = 0;
		
		for (int k = 0; k < n; k++) {
		if (k == 0) {
			menor = array[0];
			posicao = k;
		} else {
			if (array[k] < menor) {
				menor = array[k];
				posicao = k;
			}
		}	
		
		}
		
		System.out.printf("Menor valor: %d\n", menor);
		System.out.printf("Posicao: %d\n", posicao);
		leitor.close();
	}

}
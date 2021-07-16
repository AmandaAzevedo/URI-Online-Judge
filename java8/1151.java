import java.util.Scanner;
public class Main {
	public static void main (String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int entrada = leitor.nextInt();
		
		if(entrada == 1) {
			System.out.println("0");
		} else if(entrada == 2) {
			System.out.println("0 1");
		} else {
			System.out.print("0 1");
			int anteanterior = 0;
			int anterior = 1;
			
			for (int k = 3; k <= entrada; k++) {
				int atual = anteanterior + anterior;
				System.out.printf(" %d", atual);
				anteanterior = anterior ;
				anterior = atual ;
			}
		}
		System.out.print("\n");

		
		
		leitor.close();
	}

}

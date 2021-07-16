import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		String [] numeros = new String [10];
		
		for (int k = 0; k<10; k++) {
			numeros [k] = leitor.nextLine();
		}
		for (int k = 0; k<10; k++) {
			int x = Integer.parseInt(numeros[k]);
			if (x <= 0) {
				System.out.printf("X["+k+"] = 1\n");

			}
			else {
			System.out.printf("X["+k+"] = "+numeros[k]+"\n");
			}
		}
		
		
		
		
		leitor.close();
		
	}

}
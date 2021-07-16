import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {
		Scanner leitor = new Scanner (System.in);
		int a = Integer.parseInt(leitor.nextLine());
		for (int k = 0; k<a; k++) {
			if (k == a-1) {
				System.out.print("Ho!\n");
			} else {
				System.out.print("Ho ");
	
			}
		}
		
		leitor.close();
		
	}
}

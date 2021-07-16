import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		int x = Integer.parseInt(leitor.nextLine());
		double y = Double.parseDouble(leitor.nextLine());
		double z = (x/y);
		System.out.printf("%.3f km/l\n", z);
		
		leitor.close();
	}

}
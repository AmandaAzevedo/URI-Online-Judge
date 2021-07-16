import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		Scanner leitor = new Scanner (System.in);
		String a = leitor.nextLine ();
		String b = leitor.nextLine();
		String c = leitor.nextLine ();
		leitor.close();

		double d = Double.parseDouble(a);
		double e = Double.parseDouble(b);
		double f = Double.parseDouble(c);
		
		double g = ((2*d + 3*e + 5*f)/10);
		
		System.out.printf("MEDIA = %.1f\n", g);
	}
}
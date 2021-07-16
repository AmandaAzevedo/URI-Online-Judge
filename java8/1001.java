import java.util.Scanner;
public class Main{
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String a = leitor.nextLine ();
		String b= leitor.nextLine ();
		leitor.close();
		
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		int e = c + d;
		
		System.out.println("X = " + e);
		
		
		
	}
	
}
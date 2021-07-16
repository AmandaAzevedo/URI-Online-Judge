import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner readOnTheKeyboard = new Scanner (System.in);

		String q = readOnTheKeyboard.nextLine();
		
		int w = Integer.parseInt(q);
		
		while(w > 0) {
		
		String a = readOnTheKeyboard.nextLine();
		int A = Integer.parseInt(a);
		
		if (A == 0) {
			System.out.println("NULL");}
		
		else if (A < 0) {
			if (A % 2 == 0) {
				System.out.println("EVEN NEGATIVE");}
			else {
				System.out.println("ODD NEGATIVE");}
		}
		
		else if (A > 0) {
			if (A % 2 == 0) {
				System.out.println("EVEN POSITIVE");}
			else {
				System.out.println("ODD POSITIVE");}
		}
		
		w--;
		}
		
		readOnTheKeyboard.close();
//Precisa de lista
	}
}
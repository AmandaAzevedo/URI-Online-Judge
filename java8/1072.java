import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner leitor = new Scanner (System.in);
		int in = 0;
		int out = 0;
		int num = Integer.parseInt(leitor.nextLine());
		
		for (int k = 0; k < num; k++) {
			int inter = Integer.parseInt(leitor.nextLine());
			if (inter >= 10 && inter <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);
		
		
		leitor.close();
	}

}
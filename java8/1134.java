import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner opcoes = new Scanner (System.in);
		
		int x = 0;
		
		
		int gasolina = 0;
		int alcool = 0;
		int disel = 0;
		
		while(x != 4) {
			String n = opcoes.nextLine();
			int no = Integer.parseInt(n);
			
			if (no == 1) {
				alcool++;
			}
			else if(no == 2) {
				gasolina++;
			}
			else if (no == 3) {
				disel++;
			}
			else if (no == 4) {
				x = 4;
			}
		}
	
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", disel);
	
		opcoes.close();

	}
}
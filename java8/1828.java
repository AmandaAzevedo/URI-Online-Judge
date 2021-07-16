import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		Scanner leitor = new Scanner (System.in);
		int n = Integer.parseInt(leitor.nextLine());
		for (int k = 1; k <= n; k++) {
			String [] a = leitor.nextLine().split(" ");
			switch (a[0]) {
			case "pedra":
				switch (a[1]) {
				case "pedra":
					System.out.println("Caso #"+k+": De novo!");
					break;
				case "papel":
					System.out.println("Caso #"+k+": Raj trapaceou!");
					break;
				case "tesoura":
					System.out.println("Caso #"+k+": Bazinga!");
					break;
				case "lagarto":
					System.out.println("Caso #"+k+": Bazinga!");
					break;
				case "Spock":
					System.out.println("Caso #"+k+": Raj trapaceou!");
					break;
				}
				break;
			case "papel":
				switch (a[1]) {
				case "pedra":
					System.out.println("Caso #"+k+": Bazinga!");
					break;	
				case "papel":
					System.out.println("Caso #"+k+": De novo!");
					break;
				case "tesoura":
					System.out.println("Caso #"+k+": Raj trapaceou!");
					break;
				case "lagarto":
					System.out.println("Caso #"+k+": Raj trapaceou!");
					break;
				case "Spock":
					System.out.println("Caso #"+k+": Bazinga!");
					break;
				}
				break;
				
			case "tesoura":
				switch (a[1]) {
				case "pedra":
					System.out.println("Caso #"+k+": Raj trapaceou!");
					break;	
				case "papel":
					System.out.println("Caso #"+k+": Bazinga!");
					break;
				case "tesoura":
					System.out.println("Caso #"+k+": De novo!");
					break;
				case "lagarto":
					System.out.println("Caso #"+k+": Bazinga!");
					break;
				case "Spock":
					System.out.println("Caso #"+k+": Raj trapaceou!");
					break;
				}
				break;
				
			case "lagarto":
				switch (a[1]) {
				case "pedra":
					System.out.println("Caso #"+k+": Raj trapaceou!");
					break;	
				case "papel":
					System.out.println("Caso #"+k+": Bazinga!");
					break;
				case "tesoura":
					System.out.println("Caso #"+k+": Raj trapaceou!");
					break;
				case "lagarto":
					System.out.println("Caso #"+k+": De novo!");
					break;
				case "Spock":
					System.out.println("Caso #"+k+": Bazinga!");
					break;
				}
				break;
				
			case "Spock":
				switch (a[1]) {
				case "pedra":
					System.out.println("Caso #"+k+": Bazinga!");
					break;	
				case "papel":
					System.out.println("Caso #"+k+": Raj trapaceou!");
					break;
				case "tesoura":
					System.out.println("Caso #"+k+": Bazinga!");
					break;
				case "lagarto":
					System.out.println("Caso #"+k+": Raj trapaceou!");
					break;
				case "Spock":
					System.out.println("Caso #"+k+": De novo!");
					break;
				}
				break;
			}
			
		}
		
		
		
		
		leitor.close();
		
		
	}

}
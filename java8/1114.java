import java.util.Scanner;
public class Main {
	public static void main (String args[]) {
		Scanner entrada = new Scanner (System.in);
		
		int senha = 0;
		while(senha != 2002) {
			senha = entrada.nextInt();
			if (senha == 2002) {
				System.out.println("Acesso Permitido");
				senha = 2002;
			} else {
				System.out.println("Senha Invalida");
			}
		}
		
		entrada.close();
		
		
	}

}
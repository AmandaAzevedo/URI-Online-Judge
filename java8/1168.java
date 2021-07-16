import java.util.Scanner;
public class Main {

	
	public static void main (String [] args) {
		Scanner leitor = new Scanner (System.in);
		int numeroDeCasosTeste = Integer.parseInt(leitor.nextLine());
		String [] casosTeste = new String [numeroDeCasosTeste];
		
		
		for (int k = 0; k < numeroDeCasosTeste;  k++) {
			String numero = leitor.nextLine();
			casosTeste[k] = numero;
		}
		
		
		
		for (int k = 0; k < casosTeste.length; k++) {
			
			int numeroDeLeds = 0;
			
			String numero = casosTeste[k]; 
			
			
			for (int q = 0; q < numero.length(); q++) {
				if (numero.charAt(q) == '1') {
					numeroDeLeds += 2;
				}
				else if (numero.charAt(q) == '2' || numero.charAt(q) == '3' || numero.charAt(q) == '5') {
					numeroDeLeds += 5;
				}
				else if (numero.charAt(q) == '4') {
					numeroDeLeds += 4;
				}
				else if (numero.charAt(q) == '6' || numero.charAt(q) == '9' || numero.charAt(q) == '0') {
					numeroDeLeds += 6;
				}
				else if (numero.charAt(q) == '7') {
					numeroDeLeds += 3;
				}
				else if (numero.charAt(q) == '8') {
					numeroDeLeds += 7;
				}
			}
			
			System.out.print(numeroDeLeds + " leds\n");
		}
		
		
		
		
		
		leitor.close();
		
		
		
		
		
		
		
	}

}
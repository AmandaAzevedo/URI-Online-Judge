import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double [] coordenadas = new double [2];
		String [] coodenadasString = new String [2];
		
		String entradasStr = leitor.nextLine();
		coodenadasString = entradasStr.split(" ");
		for (int k = 0; k < 2; k++) {
			coordenadas [k] = Double.parseDouble(coodenadasString[k]);
		}
				
		if (coordenadas[0] == 0 && coordenadas[1] == 0) {
			System.out.println("Origem");
		} else if (coordenadas [0] == 0) {
			System.out.println("Eixo Y");
		} else if (coordenadas[1] == 0){
			System.out.println("Eixo X");
		} else { 
			if(coordenadas[0] > 0 && coordenadas[1] > 0) {
				System.out.println("Q1");
			} else if(coordenadas[0] < 0 && coordenadas[1] > 0) {
				System.out.println("Q2");
			} else if (coordenadas[0] < 0 && coordenadas[1] < 0) {
				System.out.println("Q3");	
			} else if (coordenadas[0] > 0 && coordenadas[1] < 0) {
				System.out.println("Q4");
			}
		}
		
		leitor.close();
	}
}
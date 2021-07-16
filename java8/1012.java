import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		double [] array = new double [3];
		
		String [] num = leitor.nextLine().split(" ");
		
		for (int k = 0; k < 3; k++) {
			array[k] = Double.parseDouble(num[k]);
		}
		double A = array[0], B = array[1], C = array [2];
		
		double areaTR = ((A*C)/2);
		double pi = 3.14159;
		double areaC = (pi*(Math.pow(C, 2)));
		double areaTra = (((A+B)*C)/2);
		double areaQ = Math.pow(B,2);
		double areaR = A*B;
		
		System.out.printf("TRIANGULO: %.3f\n", areaTR);
		System.out.printf("CIRCULO: %.3f\n", areaC);
		System.out.printf("TRAPEZIO: %.3f\n", areaTra);
		System.out.printf("QUADRADO: %.3f\n", areaQ);
		System.out.printf("RETANGULO: %.3f\n", areaR);
		
		leitor.close();
	
	}
}
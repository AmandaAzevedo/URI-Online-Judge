import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
	 Scanner leitor = new Scanner (System.in);
	 
	 String nome = leitor.nextLine();
	 String salario = leitor.nextLine();
	 String vendas = leitor.nextLine();
	
	 leitor.close();
	
	 Double sf = Double.parseDouble(salario);
	 Double v = Double.parseDouble(vendas);
	 
	 double s = (sf + ((v*15)/100));
	 
	 System.out.printf("TOTAL = R$ %.2f\n", s);
	 
	}

}
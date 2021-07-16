import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		double salario = leitor.nextDouble();
		
		double reajuste = 0;
		
		int percentual = 0;
		
		
		
		if(salario >= 0 && salario <= 400) {
			percentual = 15;
			reajuste = (salario * percentual)/100; 
		} else if (salario > 400 &&  salario <= 800) {
			percentual = 12;
			reajuste = (salario * percentual)/100;
		} else if (salario > 800 && salario <= 1200) {
			percentual = 10;
			reajuste = (salario * percentual)/100;
		} else if (salario > 1200 && salario <= 2000) {
			percentual = 7;
			reajuste = (salario * percentual)/100;
		} else if (salario > 2000) {
			percentual = 4;
			reajuste = (salario * percentual)/100;
		}		
		
		double total = salario + reajuste;
		
		System.out.printf("Novo salario: %.2f\n", total);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.println("Em percentual: "+ percentual + " %");
		leitor.close();

	}

}
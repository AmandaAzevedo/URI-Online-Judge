import java.util.Scanner;
public class Main{
	public static void main (String[] args){
		Scanner leitor = new Scanner (System.in);
		int idadeDias = Integer.parseInt(leitor.nextLine());
		int ano = idadeDias/365;
		int mes = (idadeDias%365)/30;
		int dias = (idadeDias%365)%30;
		
		
		System.out.printf("%d ano(s)\n", ano);
		System.out.printf("%d mes(es)\n", mes);
		System.out.printf("%d dia(s)\n",dias);
		
		
		
		
		leitor.close();
	}
}
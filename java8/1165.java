import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int a = leitor.nextInt();
        boolean primo = true ;
        
        for (int k = 1;k <= a;k++){
        int b = leitor.nextInt();
        
        for (int q = 2;q<=b-1;q++){
        if (b%q == 0){
        primo = false;}
        }
        
        if(primo == true){
        System.out.printf("%d eh primo\n", b);}
        else{
        System.out.printf("%d nao eh primo\n",b);}
        primo = true;
        }
    leitor.close();
    }
}
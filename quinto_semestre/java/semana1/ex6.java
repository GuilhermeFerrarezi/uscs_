package ex6;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		int n3 = entrada.nextInt();
		entrada.close();
		System.out.printf("%.2f", media(n1, n2, n3));
	}
	
	static double media(int n1, int n2, int n3) {
		return (n1 + n2 + n3) / 3.0;
	}
}

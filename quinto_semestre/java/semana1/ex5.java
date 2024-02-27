package ex5;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1 = entrada.nextInt();
		entrada.close();
		if(n1 % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Ímpar");
		}
	}
}

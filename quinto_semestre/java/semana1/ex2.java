package ex2;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1 = entrada.nextInt();
		entrada.close();
		if (n1 == 0) {
			System.out.println("Zero");
		}else if (n1 < 0) {
			System.out.println("Negativo");
		}else {
			System.out.println("Positivo");
		}
	}
}

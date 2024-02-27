package ex10;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		int n1 = entrada.nextInt();
		entrada.close();
		for(int i = 1; i <= 10; i++) {
			System.out.println(i * n1);
		}
	}
}

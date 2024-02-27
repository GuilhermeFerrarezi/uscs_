package ex3;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1 = entrada.nextInt();
		entrada.close();
		if(n1 > 0) {
			for(int i = 1; i <= n1; i++) {
			System.out.println(i);
			}
		}else{
			for(int i = 1; i >= n1; i--) {
				System.out.println(i);
			}
		}
	}
}

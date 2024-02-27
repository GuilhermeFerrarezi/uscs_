package ex7;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1 = entrada.nextInt();
		entrada.close();
		System.out.println(fibonacci(n1));
	}
	
	static int fibonacci(int n1) {
		if(n1 == 0){
			return 0;
		}else if(n1 == 1){
			return 1;
		}
		return fibonacci(n1-1) + fibonacci(n1-2);
	}
}

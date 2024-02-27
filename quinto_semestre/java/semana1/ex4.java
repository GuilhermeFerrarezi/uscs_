package ex4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		int n3 = entrada.nextInt();
		entrada.close();
		System.out.println(maior_entre_tres(n1, n2, n3));
	}
	
	static int maior_entre_tres(int n1, int n2, int n3) {
		int maior = n1;
		if(n2 > maior){
			maior = n2;
		}
		if(n3 > maior){
			maior = n3;
		}
		return maior;
	}
}
